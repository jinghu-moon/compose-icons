package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Palette: ImageVector
    get() {
        if (_palette != null) return _palette!!
        _palette = tablerOutlineIcon(
            name = "Palette",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 21C7.029 21 3 16.971 3 12 3 7.029 7.029 3 12 3c4.97 0 9 3.582 9 8 0 1.06-.474 2.078-1.318 2.828C18.838 14.578 17.693 15 16.5 15h-2.5c-.918-.015-1.728 .597-1.965 1.484-.237 .887 .161 1.821 .965 2.266 .409 .378 .533 .974 .306 1.483-.226 .509-.752 .817-1.306 .767")
            addPathData("M7.5 10.5c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M11.5 7.5c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M15.5 10.5c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
        }
        return _palette!!
    }

private var _palette: ImageVector? = null
