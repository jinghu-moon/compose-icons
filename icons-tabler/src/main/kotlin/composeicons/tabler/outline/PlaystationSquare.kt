package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PlaystationSquare: ImageVector
    get() {
        if (_playstationSquare != null) return _playstationSquare!!
        _playstationSquare = tablerOutlineIcon(
            name = "PlaystationSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 21c4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12c0 4.971 4.029 9 9 9")
            addPathData("M8 9C8 8.448 8.448 8 9 8h6c.552 0 1 .448 1 1v6c0 .552-.448 1-1 1h-6C8.448 16 8 15.552 8 15v-6")
        }
        return _playstationSquare!!
    }

private var _playstationSquare: ImageVector? = null
