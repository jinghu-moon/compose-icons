package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MathFunctionOff: ImageVector
    get() {
        if (_mathFunctionOff != null) return _mathFunctionOff!!
        _mathFunctionOff = tablerOutlineIcon(
            name = "MathFunctionOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 10h1c.882 0 .986 .777 1.694 2.692")
            addPathData("M13 17c.864 0 1.727-.663 2.495-1.512M17.212 13.186C18.205 11.736 19.602 10 21 10")
            addPathData("M3 19c0 1.5 .5 2 2 2 1.5 0 2-4 3-9 .237-1.186 .446-2.317 .647-3.35M9.374 5.402C9.797 3.91 10.284 3 11 3c1.5 0 2 .5 2 2")
            addPathData("M5 12h6")
            addPathData("M3 3 21 21")
        }
        return _mathFunctionOff!!
    }

private var _mathFunctionOff: ImageVector? = null
