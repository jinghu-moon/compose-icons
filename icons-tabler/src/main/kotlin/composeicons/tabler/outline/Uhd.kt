package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Uhd: ImageVector
    get() {
        if (_uhd != null) return _uhd!!
        _uhd = tablerOutlineIcon(
            name = "Uhd",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 16v-8")
            addPathData("M10 12h4")
            addPathData("M14 8v8")
            addPathData("M17 8v8h2c1.105 0 2-.895 2-2v-4C21 8.895 20.105 8 19 8h-2")
            addPathData("M3 8v6c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2v-6")
        }
        return _uhd!!
    }

private var _uhd: ImageVector? = null
