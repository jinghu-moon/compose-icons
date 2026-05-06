package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Monkeybar: ImageVector
    get() {
        if (_monkeybar != null) return _monkeybar!!
        _monkeybar = tablerOutlineIcon(
            name = "Monkeybar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 21v-15L8 3l5 3v15")
            addPathData("M8 21v-7")
            addPathData("M3 14h10")
            addPathData("M6 10C6 8.895 6.895 8 8 8c1.105 0 2 .895 2 2")
            addPathData("M13 13c6 0 3 8 8 8")
        }
        return _monkeybar!!
    }

private var _monkeybar: ImageVector? = null
