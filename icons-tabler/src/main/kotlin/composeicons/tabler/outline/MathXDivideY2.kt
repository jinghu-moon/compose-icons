package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MathXDivideY2: ImageVector
    get() {
        if (_mathXDivideY2 != null) return _mathXDivideY2!!
        _mathXDivideY2 = tablerOutlineIcon(
            name = "MathXDivideY2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 21 21 3")
            addPathData("M15 14l3 4.5")
            addPathData("M21 14l-4.5 7")
            addPathData("M3 4l6 6")
            addPathData("M3 10 9 4")
        }
        return _mathXDivideY2!!
    }

private var _mathXDivideY2: ImageVector? = null
