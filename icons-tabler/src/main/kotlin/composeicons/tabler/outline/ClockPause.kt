package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ClockPause: ImageVector
    get() {
        if (_clockPause != null) return _clockPause!!
        _clockPause = tablerOutlineIcon(
            name = "ClockPause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.942 13.018C21.375 9.214 19.355 5.553 15.906 3.892 12.458 2.23 8.335 2.932 5.631 5.641 2.926 8.35 2.231 12.473 3.898 15.919c1.667 3.446 5.332 5.46 9.135 5.021")
            addPathData("M12 7v5l2 2")
            addPathData("M17 17v5")
            addPathData("M21 17v5")
        }
        return _clockPause!!
    }

private var _clockPause: ImageVector? = null
