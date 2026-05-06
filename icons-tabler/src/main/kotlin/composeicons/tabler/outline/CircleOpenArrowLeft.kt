package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CircleOpenArrowLeft: ImageVector
    get() {
        if (_circleOpenArrowLeft != null) return _circleOpenArrowLeft!!
        _circleOpenArrowLeft = tablerOutlineIcon(
            name = "CircleOpenArrowLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.066 8.002C18.038 3.906 13.262 1.979 8.96 3.523 4.658 5.067 2.196 9.591 3.236 14.042c1.04 4.451 5.251 7.416 9.792 6.894C17.569 20.414 20.997 16.571 21 12h-13")
            addPathData("M12 8 8 12l4 4")
        }
        return _circleOpenArrowLeft!!
    }

private var _circleOpenArrowLeft: ImageVector? = null
