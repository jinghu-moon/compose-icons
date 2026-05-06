package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ClockCheck: ImageVector
    get() {
        if (_clockCheck != null) return _clockCheck!!
        _clockCheck = tablerOutlineIcon(
            name = "ClockCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.942 13.021C21.361 9.354 19.498 5.803 16.243 4.063 12.988 2.323 9 2.747 6.184 5.132 3.367 7.518 2.292 11.381 3.473 14.878c1.18 3.497 4.376 5.919 8.062 6.11")
            addPathData("M12 7v5l3 3")
            addPathData("M15 19l2 2 4-4")
        }
        return _clockCheck!!
    }

private var _clockCheck: ImageVector? = null
