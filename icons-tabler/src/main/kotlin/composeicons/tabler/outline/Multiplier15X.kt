package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Multiplier15X: ImageVector
    get() {
        if (_multiplier15X != null) return _multiplier15X!!
        _multiplier15X = tablerOutlineIcon(
            name = "Multiplier15X",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 16v-8L2 10")
            addPathData("M10 16h2c1.105 0 2-.895 2-2 0-1.105-.895-2-2-2h-2v-4h4")
            addPathData("M7 16v.01")
            addPathData("M17 16l4-4")
            addPathData("M21 16 17 12")
        }
        return _multiplier15X!!
    }

private var _multiplier15X: ImageVector? = null
