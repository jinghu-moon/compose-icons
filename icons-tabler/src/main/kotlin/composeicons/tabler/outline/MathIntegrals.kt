package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MathIntegrals: ImageVector
    get() {
        if (_mathIntegrals != null) return _mathIntegrals!!
        _mathIntegrals = tablerOutlineIcon(
            name = "MathIntegrals",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 19c0 1.105 .895 2 2 2 2 0 2-4 3-9C9 7 9 3 11 3c1.105 0 2 .895 2 2")
            addPathData("M11 19c0 1.105 .895 2 2 2 2 0 2-4 3-9C17 7 17 3 19 3c1.105 0 2 .895 2 2")
        }
        return _mathIntegrals!!
    }

private var _mathIntegrals: ImageVector? = null
