package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowCurveLeft: ImageVector
    get() {
        if (_arrowCurveLeft != null) return _arrowCurveLeft!!
        _arrowCurveLeft = tablerOutlineIcon(
            name = "ArrowCurveLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 7 10 3 6 7")
            addPathData("M10 3v4.394c-0 2.253 1.126 4.356 3 5.606 1.874 1.25 3 3.353 3 5.606v2.394")
        }
        return _arrowCurveLeft!!
    }

private var _arrowCurveLeft: ImageVector? = null
