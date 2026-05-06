package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MathIntegralX: ImageVector
    get() {
        if (_mathIntegralX != null) return _mathIntegralX!!
        _mathIntegralX = tablerOutlineIcon(
            name = "MathIntegralX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 19c0 1.105 .895 2 2 2 2 0 2-4 3-9C9 7 9 3 11 3c1.105 0 2 .895 2 2")
            addPathData("M14 12l6 6")
            addPathData("M14 18l6-6")
        }
        return _mathIntegralX!!
    }

private var _mathIntegralX: ImageVector? = null
