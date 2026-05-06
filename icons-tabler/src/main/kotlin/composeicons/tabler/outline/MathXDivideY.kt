package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MathXDivideY: ImageVector
    get() {
        if (_mathXDivideY != null) return _mathXDivideY!!
        _mathXDivideY = tablerOutlineIcon(
            name = "MathXDivideY",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 3l6 6")
            addPathData("M9 9 15 3")
            addPathData("M9 15l3 4.5")
            addPathData("M15 15l-4.5 7")
            addPathData("M5 12h14")
        }
        return _mathXDivideY!!
    }

private var _mathXDivideY: ImageVector? = null
