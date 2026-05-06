package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MathEqualLower: ImageVector
    get() {
        if (_mathEqualLower != null) return _mathEqualLower!!
        _mathEqualLower = tablerOutlineIcon(
            name = "MathEqualLower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 18 5 14")
            addPathData("M19 14 5 10 19 6")
        }
        return _mathEqualLower!!
    }

private var _mathEqualLower: ImageVector? = null
