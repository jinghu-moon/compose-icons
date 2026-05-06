package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowCurveRight: ImageVector
    get() {
        if (_arrowCurveRight != null) return _arrowCurveRight!!
        _arrowCurveRight = tablerOutlineIcon(
            name = "ArrowCurveRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 7 14 3l4 4")
            addPathData("M14 3v4.394c0 2.253-1.126 4.356-3 5.606C9.126 14.25 8 16.353 8 18.606v2.394")
        }
        return _arrowCurveRight!!
    }

private var _arrowCurveRight: ImageVector? = null
