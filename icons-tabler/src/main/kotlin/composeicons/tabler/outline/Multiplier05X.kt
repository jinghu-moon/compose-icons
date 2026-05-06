package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Multiplier05X: ImageVector
    get() {
        if (_multiplier05X != null) return _multiplier05X!!
        _multiplier05X = tablerOutlineIcon(
            name = "Multiplier05X",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 16h2c1.105 0 2-.895 2-2 0-1.105-.895-2-2-2h-2v-4h4")
            addPathData("M5 16v.01")
            addPathData("M15 16l4-4")
            addPathData("M19 16 15 12")
        }
        return _multiplier05X!!
    }

private var _multiplier05X: ImageVector? = null
