package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AlertCircleOff: ImageVector
    get() {
        if (_alertCircleOff != null) return _alertCircleOff!!
        _alertCircleOff = tablerOutlineIcon(
            name = "AlertCircleOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5.644 5.629C2.126 9.14 2.12 14.839 5.631 18.357c3.511 3.518 9.21 3.524 12.728 .013M20.052 16.021C21.785 12.554 21.104 8.367 18.361 5.628 15.618 2.889 11.429 2.214 7.965 3.953")
            addPathData("M12 7v1")
            addPathData("M12 16h.01")
            addPathData("M3 3 21 21")
        }
        return _alertCircleOff!!
    }

private var _alertCircleOff: ImageVector? = null
