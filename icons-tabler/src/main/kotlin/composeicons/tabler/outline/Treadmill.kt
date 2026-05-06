package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Treadmill: ImageVector
    get() {
        if (_treadmill != null) return _treadmill!!
        _treadmill = tablerOutlineIcon(
            name = "Treadmill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 3c0 .552 .448 1 1 1 .552 0 1-.448 1-1C12 2.448 11.552 2 11 2c-.552 0-1 .448-1 1")
            addPathData("M3 14l4 1 .5-.5")
            addPathData("M12 18v-3L9 12.077 9.75 7")
            addPathData("M6 10v-2L10 7l2.5 2.5L15 10")
            addPathData("M21 22c0-.552-.448-1-1-1h-16c-.552 0-1 .448-1 1")
            addPathData("M18 21 19 10 21 9")
        }
        return _treadmill!!
    }

private var _treadmill: ImageVector? = null
