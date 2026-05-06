package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MathEqualGreater: ImageVector
    get() {
        if (_mathEqualGreater != null) return _mathEqualGreater!!
        _mathEqualGreater = tablerOutlineIcon(
            name = "MathEqualGreater",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 18 19 14")
            addPathData("M5 14 19 10 5 6")
        }
        return _mathEqualGreater!!
    }

private var _mathEqualGreater: ImageVector? = null
