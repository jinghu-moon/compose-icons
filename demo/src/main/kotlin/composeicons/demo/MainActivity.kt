package composeicons.demo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuAnchorType
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.serialization.json.Json
import composeicons.tabler.TablerIcons
import composeicons.tabler.outline.BrightnessAuto
import composeicons.tabler.outline.Moon
import composeicons.tabler.outline.Sun

private val DarkScheme = darkColorScheme(
    background = Color(0xFF121212),
    surface = Color(0xFF1E1E1E),
    onBackground = Color(0xFFE0E0E0),
    onSurface = Color(0xFFE0E0E0),
    onSurfaceVariant = Color(0xFF9E9E9E),
)

private val LightScheme = lightColorScheme(
    background = Color(0xFFFAFAFA),
    surface = Color(0xFFFFFFFF),
    onBackground = Color(0xFF212121),
    onSurface = Color(0xFF212121),
    onSurfaceVariant = Color(0xFF757575),
)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent { AppRoot() }
    }
}

private enum class ThemeMode { Auto, Light, Dark }

@Composable
private fun AppRoot() {
    val systemDark = isSystemInDarkTheme()
    var themeMode by remember { mutableStateOf(ThemeMode.Auto) }
    var iconColor by remember { mutableStateOf(Color.Unspecified) }

    val isDark = when (themeMode) {
        ThemeMode.Auto -> systemDark
        ThemeMode.Light -> false
        ThemeMode.Dark -> true
    }
    val colorScheme = if (isDark) DarkScheme else LightScheme

    MaterialTheme(colorScheme = colorScheme) {
        IconExplorerScreen(
            isDark = isDark,
            themeMode = themeMode,
            iconColor = iconColor,
            onCycleTheme = {
                themeMode = when (themeMode) {
                    ThemeMode.Auto -> ThemeMode.Light
                    ThemeMode.Light -> ThemeMode.Dark
                    ThemeMode.Dark -> ThemeMode.Auto
                }
            },
            onIconColorChange = { iconColor = it },
        )
    }
}

private sealed interface UiState {
    data object Loading : UiState
    data class Ready(val libraries: List<LibraryData>, val registrySize: Int) : UiState
    data class Error(val message: String) : UiState
}

private data class LibraryData(
    val id: String,
    val displayName: String,
    val totalCount: Int,
    val styles: List<String>,
    val icons: List<IconEntry>,
)

private data class DisplayIcon(
    val name: String,
    val style: String,
    val source: String,
    val imageVector: ImageVector?,
)

private val LIBRARY_DISPLAY_NAMES = mapOf(
    "bootstrap" to "Bootstrap", "boxicons" to "Boxicons", "heroicons" to "Heroicons",
    "iconoir" to "Iconoir", "ionicons" to "Ionicons", "lucide" to "Lucide",
    "phosphor" to "Phosphor", "radixicons" to "Radix", "remixicons" to "Remix", "tabler" to "Tabler",
)

private val LIBRARY_ORDER = listOf(
    "tabler", "lucide", "phosphor", "remixicons", "heroicons",
    "iconoir", "ionicons", "bootstrap", "boxicons", "radixicons",
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun IconExplorerScreen(
    isDark: Boolean,
    themeMode: ThemeMode,
    iconColor: Color,
    onCycleTheme: () -> Unit,
    onIconColorChange: (Color) -> Unit,
) {
    val context = androidx.compose.ui.platform.LocalContext.current
    var state by remember { mutableStateOf<UiState>(UiState.Loading) }
    var query by remember { mutableStateOf("") }
    var selectedLibrary by remember { mutableStateOf<String?>(null) }
    var selectedStyle by remember { mutableStateOf<String?>(null) }
    var showColorPicker by remember { mutableStateOf(false) }

    val resolvedIconColor = if (iconColor == Color.Unspecified) {
        if (isDark) Color.White else Color.Black
    } else {
        iconColor
    }

    val cardColor = MaterialTheme.colorScheme.surface
    val inputColor = if (isDark) Color(0xFF1E1E1E) else Color(0xFFF0F0F0)
    val textColor = MaterialTheme.colorScheme.onBackground
    val subtleColor = MaterialTheme.colorScheme.onSurfaceVariant

    LaunchedEffect(Unit) {
        state = try {
            val libraries = withContext(Dispatchers.IO) { loadAllLibraries(context.assets) }
            UiState.Ready(libraries, IconRegistry.size())
        } catch (e: Exception) {
            UiState.Error(e.message ?: "Unknown error")
        }
    }

    Scaffold(
        containerColor = MaterialTheme.colorScheme.background,
        topBar = {
            TopAppBar(
                title = { Text("Compose Icons", color = textColor) },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.background,
                ),
                actions = {
                    // Color picker toggle
                    IconButton(onClick = { showColorPicker = !showColorPicker }) {
                        Box(
                            modifier = Modifier
                                .size(24.dp)
                                .clip(CircleShape)
                                .background(resolvedIconColor)
                                .border(1.5.dp, subtleColor, CircleShape),
                        )
                    }
                    // Theme toggle: Auto → Light → Dark → Auto
                    IconButton(onClick = onCycleTheme) {
                        Icon(
                            imageVector = when (themeMode) {
                                ThemeMode.Auto -> TablerIcons.Outline.BrightnessAuto
                                ThemeMode.Light -> TablerIcons.Outline.Sun
                                ThemeMode.Dark -> TablerIcons.Outline.Moon
                            },
                            contentDescription = "Theme: ${themeMode.name}",
                            tint = textColor,
                            modifier = Modifier.size(22.dp),
                        )
                    }
                },
            )
        }
    ) { innerPadding ->
        when (val s = state) {
            is UiState.Loading -> Box(
                modifier = Modifier.fillMaxSize().padding(innerPadding),
                contentAlignment = Alignment.Center,
            ) { CircularProgressIndicator(color = textColor) }

            is UiState.Error -> Box(
                modifier = Modifier.fillMaxSize().padding(innerPadding),
                contentAlignment = Alignment.Center,
            ) { Text("Error: ${s.message}", color = Color(0xFFFF6B6B)) }

            is UiState.Ready -> {
                val availableStyles by remember(selectedLibrary, s.libraries) {
                    derivedStateOf {
                        if (selectedLibrary == null) s.libraries.flatMap { it.styles }.distinct().sorted()
                        else s.libraries.find { it.id == selectedLibrary }?.styles ?: emptyList()
                    }
                }

                LaunchedEffect(selectedLibrary) {
                    if (selectedStyle != null && selectedStyle !in availableStyles) selectedStyle = null
                }

                val filteredIcons = remember(s.libraries, query, selectedLibrary, selectedStyle) {
                    filterIcons(s.libraries, query, selectedLibrary, selectedStyle)
                }

                Column(modifier = Modifier.fillMaxSize().padding(innerPadding)) {
                    // Color picker
                    if (showColorPicker) {
                        HsvColorPicker(
                            currentColor = resolvedIconColor,
                            onColorChanged = { onIconColorChange(it) },
                        )
                    }

                    // Search bar
                    TextField(
                        value = query,
                        onValueChange = { query = it },
                        placeholder = { Text("Search...", color = subtleColor) },
                        singleLine = true,
                        modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 4.dp),
                        colors = TextFieldDefaults.colors(
                            focusedContainerColor = inputColor,
                            unfocusedContainerColor = inputColor,
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent,
                            cursorColor = textColor,
                            focusedTextColor = textColor,
                            unfocusedTextColor = textColor,
                        ),
                        shape = RoundedCornerShape(8.dp),
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    // Two dropdowns
                    Row(
                        modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                    ) {
                        DropdownSelector(
                            label = selectedLibrary?.let { LIBRARY_DISPLAY_NAMES[it] ?: it } ?: "All Libraries",
                            options = listOf(null to "All Libraries") + s.libraries.map { it.id to it.displayName },
                            selected = selectedLibrary,
                            onSelect = { selectedLibrary = it },
                            inputColor = inputColor,
                            textColor = textColor,
                            subtleColor = subtleColor,
                            modifier = Modifier.weight(1f),
                        )
                        DropdownSelector(
                            label = selectedStyle ?: "All Styles",
                            options = listOf(null to "All Styles") + availableStyles.map { it to it },
                            selected = selectedStyle,
                            onSelect = { selectedStyle = it },
                            inputColor = inputColor,
                            textColor = textColor,
                            subtleColor = subtleColor,
                            modifier = Modifier.weight(1f),
                        )
                    }

                    Text(
                        text = "${filteredIcons.size} icons",
                        modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
                        fontSize = 12.sp,
                        color = subtleColor,
                    )

                    if (filteredIcons.isEmpty()) {
                        Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                            Text("No icons found", color = subtleColor)
                        }
                    } else {
                        LazyVerticalGrid(
                            columns = GridCells.Fixed(4),
                            contentPadding = PaddingValues(8.dp),
                            horizontalArrangement = Arrangement.spacedBy(4.dp),
                            verticalArrangement = Arrangement.spacedBy(4.dp),
                            modifier = Modifier.fillMaxSize(),
                        ) {
                            items(filteredIcons, key = { "${it.source}/${it.name}/${it.style}" }) { icon ->
                                IconCell(icon, resolvedIconColor, cardColor, subtleColor)
                            }
                        }
                    }
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun DropdownSelector(
    label: String,
    options: List<Pair<String?, String>>,
    selected: String?,
    onSelect: (String?) -> Unit,
    inputColor: Color,
    textColor: Color,
    subtleColor: Color,
    modifier: Modifier = Modifier,
) {
    var expanded by remember { mutableStateOf(false) }
    ExposedDropdownMenuBox(expanded = expanded, onExpandedChange = { expanded = it }, modifier = modifier) {
        TextField(
            value = label,
            onValueChange = {},
            readOnly = true,
            singleLine = true,
            textStyle = MaterialTheme.typography.bodySmall.copy(color = textColor),
            trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded) },
            modifier = Modifier.menuAnchor(ExposedDropdownMenuAnchorType.PrimaryNotEditable).fillMaxWidth(),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = inputColor,
                unfocusedContainerColor = inputColor,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                focusedTrailingIconColor = subtleColor,
                unfocusedTrailingIconColor = subtleColor,
                focusedTextColor = textColor,
                unfocusedTextColor = textColor,
            ),
            shape = RoundedCornerShape(8.dp),
        )
        ExposedDropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
            containerColor = inputColor,
        ) {
            options.forEach { (value, text) ->
                DropdownMenuItem(
                    text = { Text(text, color = if (value == selected) textColor else subtleColor, style = MaterialTheme.typography.bodySmall) },
                    onClick = { onSelect(value); expanded = false },
                )
            }
        }
    }
}

@Composable
private fun IconCell(icon: DisplayIcon, tint: Color, cardColor: Color, subtleColor: Color) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .clip(RoundedCornerShape(8.dp))
            .background(cardColor)
            .padding(vertical = 12.dp, horizontal = 4.dp),
    ) {
        if (icon.imageVector != null) {
            Icon(imageVector = icon.imageVector, contentDescription = icon.name, modifier = Modifier.size(32.dp), tint = tint)
        } else {
            Box(Modifier.size(32.dp), contentAlignment = Alignment.Center) { Text("?", color = subtleColor) }
        }
        Spacer(modifier = Modifier.height(6.dp))
        Text(
            text = icon.name, fontSize = 9.sp, maxLines = 1,
            overflow = TextOverflow.Ellipsis, textAlign = TextAlign.Center,
            color = subtleColor, modifier = Modifier.fillMaxWidth(),
        )
    }
}

private fun filterIcons(
    libraries: List<LibraryData>, query: String, selectedLibrary: String?, selectedStyle: String?,
): List<DisplayIcon> {
    val targetLibraries = if (selectedLibrary != null) libraries.filter { it.id == selectedLibrary } else libraries
    val entries = targetLibraries.flatMap { lib -> lib.icons.map { it to lib.id } }
    return entries.filter { (entry, _) ->
        (selectedStyle == null || entry.style == selectedStyle) &&
            (query.isBlank() || run {
                val q = query.lowercase()
                entry.name.lowercase().contains(q) ||
                    entry.tags.any { it.lowercase().contains(q) } ||
                    entry.category?.lowercase()?.contains(q) == true
            })
    }.map { (entry, source) ->
        DisplayIcon(name = entry.name, style = entry.style, source = source, imageVector = IconRegistry.get(entry.kotlinPath))
    }
}

private suspend fun loadAllLibraries(assets: android.content.res.AssetManager): List<LibraryData> =
    withContext(Dispatchers.IO) {
        val json = Json { ignoreUnknownKeys = true }
        val files = assets.list("data")?.filter { it.endsWith(".json") && it != "libraries.json" } ?: emptyList()
        files.mapNotNull { fileName ->
            val library = json.decodeFromString<IconLibraryData>(assets.open("data/$fileName").bufferedReader().use { it.readText() })
            if (library.explorerEntries.isEmpty()) return@mapNotNull null
            LibraryData(
                id = library.source,
                displayName = LIBRARY_DISPLAY_NAMES[library.source] ?: library.source,
                totalCount = library.total,
                styles = library.explorerEntries.map { it.style }.distinct().sorted(),
                icons = library.explorerEntries,
            )
        }.sortedBy { lib -> LIBRARY_ORDER.indexOf(lib.id).let { if (it < 0) Int.MAX_VALUE else it } }
    }
