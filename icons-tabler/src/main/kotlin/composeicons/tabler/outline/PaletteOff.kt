package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PaletteOff: ImageVector
    get() {
        if (_paletteOff != null) return _paletteOff!!
        _paletteOff = tablerOutlineIcon(
            name = "PaletteOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 15h-1c-.918-.015-1.728 .597-1.965 1.484-.237 .887 .161 1.821 .965 2.266 .409 .378 .533 .974 .306 1.483-.226 .509-.752 .817-1.306 .767C8.362 21 5.082 18.81 3.687 15.449 2.293 12.089 3.059 8.22 5.628 5.644")
            addPathData("M8 4C9.236 3.377 10.569 3 12 3c4.97 0 9 3.582 9 8 0 1.06-.474 2.078-1.318 2.828-.337 .298-.717 .544-1.127 .73")
            addPathData("M7.5 10.5c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M11.5 7.5c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M15.5 10.5c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M3 3 21 21")
        }
        return _paletteOff!!
    }

private var _paletteOff: ImageVector? = null
