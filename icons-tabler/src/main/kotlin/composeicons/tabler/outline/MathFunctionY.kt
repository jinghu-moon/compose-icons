package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MathFunctionY: ImageVector
    get() {
        if (_mathFunctionY != null) return _mathFunctionY!!
        _mathFunctionY = tablerOutlineIcon(
            name = "MathFunctionY",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 19c0 1.105 .895 2 2 2 2 0 2-4 3-9C9 7 9 3 11 3c1.105 0 2 .895 2 2")
            addPathData("M5 12h6")
            addPathData("M15 12l3 5.063")
            addPathData("M21 12l-4.8 9")
        }
        return _mathFunctionY!!
    }

private var _mathFunctionY: ImageVector? = null
