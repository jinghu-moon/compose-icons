package composeicons.sample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                var useRedTint by remember { mutableStateOf(false) }
                val iconTint = if (useRedTint) Color.Red else LocalContentColor.current

                Scaffold(
                    topBar = {
                        TopAppBar(
                            title = { Text("Compose Icons Demo") },
                            actions = {
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Text("Red Tint")
                                    Switch(
                                        checked = useRedTint,
                                        onCheckedChange = { useRedTint = it },
                                        modifier = Modifier.padding(horizontal = 8.dp)
                                    )
                                }
                            }
                        )
                    }
                ) { innerPadding ->
                    if (DemoIcons.isEmpty()) {
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(innerPadding),
                            contentAlignment = Alignment.Center
                        ) {
                            Text("No icons in this variant.")
                        }
                    } else {
                        LazyVerticalGrid(
                            columns = GridCells.Adaptive(minSize = 100.dp),
                            contentPadding = innerPadding,
                            modifier = Modifier.fillMaxSize()
                        ) {
                            items(DemoIcons) { (name, icon) ->
                                Column(
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    modifier = Modifier.padding(8.dp)
                                ) {
                                    Icon(
                                        imageVector = icon,
                                        contentDescription = name,
                                        modifier = Modifier.size(48.dp),
                                        tint = iconTint
                                    )
                                    Spacer(modifier = Modifier.height(8.dp))
                                    Text(
                                        text = name,
                                        style = MaterialTheme.typography.bodySmall,
                                        modifier = Modifier.align(Alignment.CenterHorizontally)
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
