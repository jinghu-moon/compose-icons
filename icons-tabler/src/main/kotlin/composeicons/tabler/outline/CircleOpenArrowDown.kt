package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CircleOpenArrowDown: ImageVector
    get() {
        if (_circleOpenArrowDown != null) return _circleOpenArrowDown!!
        _circleOpenArrowDown = tablerOutlineIcon(
            name = "CircleOpenArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15.998 3.934c4.096 2.028 6.023 6.804 4.479 11.106-1.544 4.302-6.067 6.764-10.518 5.724C5.507 19.724 2.542 15.513 3.064 10.972 3.586 6.431 7.429 3.003 12 3v13")
            addPathData("M16 12l-4 4L8 12")
        }
        return _circleOpenArrowDown!!
    }

private var _circleOpenArrowDown: ImageVector? = null
