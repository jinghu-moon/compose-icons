package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowsDoubleNeSw: ImageVector
    get() {
        if (_arrowsDoubleNeSw != null) return _arrowsDoubleNeSw!!
        _arrowsDoubleNeSw = tablerOutlineIcon(
            name = "ArrowsDoubleNeSw",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 14 14 3")
            addPathData("M10 3h4v4")
            addPathData("M10 17v4h4")
            addPathData("M21 10 10 21")
        }
        return _arrowsDoubleNeSw!!
    }

private var _arrowsDoubleNeSw: ImageVector? = null
