package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MathXMinusY: ImageVector
    get() {
        if (_mathXMinusY != null) return _mathXMinusY!!
        _mathXMinusY = tablerOutlineIcon(
            name = "MathXMinusY",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 9l6 6")
            addPathData("M2 15 8 9")
            addPathData("M16 9l3 5.063")
            addPathData("M22 9l-4.8 9")
            addPathData("M10 12h4")
        }
        return _mathXMinusY!!
    }

private var _mathXMinusY: ImageVector? = null
