package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Signal2G: ImageVector
    get() {
        if (_signal2G != null) return _signal2G!!
        _signal2G = tablerOutlineIcon(
            name = "Signal2G",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 8h-3c-1.105 0-2 .895-2 2v4c0 1.105 .895 2 2 2h3v-4h-1")
            addPathData("M5 8h4c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-3c-.552 0-1 .448-1 1v2c0 .552 .448 1 1 1h4")
        }
        return _signal2G!!
    }

private var _signal2G: ImageVector? = null
