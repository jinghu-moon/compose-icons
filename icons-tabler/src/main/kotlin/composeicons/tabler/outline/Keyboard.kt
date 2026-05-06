package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Keyboard: ImageVector
    get() {
        if (_keyboard != null) return _keyboard!!
        _keyboard = tablerOutlineIcon(
            name = "Keyboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 8C2 6.895 2.895 6 4 6h16c1.105 0 2 .895 2 2v8c0 1.105-.895 2-2 2h-16C2.895 18 2 17.105 2 16v-8")
            addPathData("M6 10v.01")
            addPathData("M10 10v.01")
            addPathData("M14 10v.01")
            addPathData("M18 10v.01")
            addPathData("M6 14v.01")
            addPathData("M18 14v.01")
            addPathData("M10 14l4 .01")
        }
        return _keyboard!!
    }

private var _keyboard: ImageVector? = null
