package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MathYMinusY: ImageVector
    get() {
        if (_mathYMinusY != null) return _mathYMinusY!!
        _mathYMinusY = tablerOutlineIcon(
            name = "MathYMinusY",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 9l3 5.063")
            addPathData("M8 9 3.2 18")
            addPathData("M16 9l3 5.063")
            addPathData("M22 9l-4.8 9")
            addPathData("M10 12h4")
        }
        return _mathYMinusY!!
    }

private var _mathYMinusY: ImageVector? = null
