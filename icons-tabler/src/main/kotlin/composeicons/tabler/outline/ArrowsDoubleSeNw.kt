package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowsDoubleSeNw: ImageVector
    get() {
        if (_arrowsDoubleSeNw != null) return _arrowsDoubleSeNw!!
        _arrowsDoubleSeNw = tablerOutlineIcon(
            name = "ArrowsDoubleSeNw",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 10 14 21")
            addPathData("M14 17v4h-4")
            addPathData("M14 3h-4v4")
            addPathData("M21 14 10 3")
        }
        return _arrowsDoubleSeNw!!
    }

private var _arrowsDoubleSeNw: ImageVector? = null
