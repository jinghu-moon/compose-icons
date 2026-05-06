package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CircleOpenArrowUp: ImageVector
    get() {
        if (_circleOpenArrowUp != null) return _circleOpenArrowUp!!
        _circleOpenArrowUp = tablerOutlineIcon(
            name = "CircleOpenArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15.998 20.066c4.096-2.028 6.023-6.804 4.479-11.106C18.933 4.658 14.409 2.196 9.958 3.236 5.507 4.276 2.542 8.487 3.064 13.028 3.586 17.569 7.429 20.997 12 21v-13")
            addPathData("M16 12 12 8 8 12")
        }
        return _circleOpenArrowUp!!
    }

private var _circleOpenArrowUp: ImageVector? = null
