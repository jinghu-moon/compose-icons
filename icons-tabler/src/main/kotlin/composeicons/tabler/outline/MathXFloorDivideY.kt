package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MathXFloorDivideY: ImageVector
    get() {
        if (_mathXFloorDivideY != null) return _mathXFloorDivideY!!
        _mathXFloorDivideY = tablerOutlineIcon(
            name = "MathXFloorDivideY",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M1.5 19l18-18")
            addPathData("M4.5 22l18-18")
            addPathData("M18 15l3 4")
            addPathData("M23 15l-4.5 8")
            addPathData("M1 1 7 7")
            addPathData("M1 7 7 1")
        }
        return _mathXFloorDivideY!!
    }

private var _mathXFloorDivideY: ImageVector? = null
