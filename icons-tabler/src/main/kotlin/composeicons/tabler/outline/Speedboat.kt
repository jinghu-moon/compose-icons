package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Speedboat: ImageVector
    get() {
        if (_speedboat != null) return _speedboat!!
        _speedboat = tablerOutlineIcon(
            name = "Speedboat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 17h14.4c1.005 0 1.944-.503 2.5-1.34L22 11h-6.23c-.511 .001-1.016 .099-1.49 .29l-3.56 1.42c-.474 .191-.979 .289-1.49 .29h-5.73L2 17")
            addPathData("M6 13 7.5 8")
            addPathData("M6 8h8l2 3")
        }
        return _speedboat!!
    }

private var _speedboat: ImageVector? = null
