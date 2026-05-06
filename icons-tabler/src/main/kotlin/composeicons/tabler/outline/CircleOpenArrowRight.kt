package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CircleOpenArrowRight: ImageVector
    get() {
        if (_circleOpenArrowRight != null) return _circleOpenArrowRight!!
        _circleOpenArrowRight = tablerOutlineIcon(
            name = "CircleOpenArrowRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3.934 8.002C5.962 3.906 10.738 1.979 15.04 3.523c4.302 1.544 6.764 6.067 5.724 10.518-1.04 4.451-5.251 7.416-9.792 6.894C6.431 20.414 3.003 16.571 3 12h13")
            addPathData("M12 8l4 4-4 4")
        }
        return _circleOpenArrowRight!!
    }

private var _circleOpenArrowRight: ImageVector? = null
