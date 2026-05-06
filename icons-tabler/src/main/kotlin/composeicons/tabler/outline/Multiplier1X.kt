package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Multiplier1X: ImageVector
    get() {
        if (_multiplier1X != null) return _multiplier1X!!
        _multiplier1X = tablerOutlineIcon(
            name = "Multiplier1X",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 16v-8L7 10")
            addPathData("M13 16l4-4")
            addPathData("M17 16 13 12")
        }
        return _multiplier1X!!
    }

private var _multiplier1X: ImageVector? = null
