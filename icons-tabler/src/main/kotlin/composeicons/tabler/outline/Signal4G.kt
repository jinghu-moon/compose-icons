package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Signal4G: ImageVector
    get() {
        if (_signal4G != null) return _signal4G!!
        _signal4G = tablerOutlineIcon(
            name = "Signal4G",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 8v3c0 .552 .448 1 1 1h3")
            addPathData("M10 8v8")
            addPathData("M17 8h-2c-1.105 0-2 .895-2 2v4c0 1.105 .895 2 2 2h2v-4h-1")
        }
        return _signal4G!!
    }

private var _signal4G: ImageVector? = null
