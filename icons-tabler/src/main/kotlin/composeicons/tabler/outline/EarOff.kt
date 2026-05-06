package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.EarOff: ImageVector
    get() {
        if (_earOff != null) return _earOff!!
        _earOff = tablerOutlineIcon(
            name = "EarOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 10C6 8.854 6.277 7.755 6.78 6.781M8.572 4.573c2.635-2.152 6.437-2.098 9.009 .129 2.573 2.227 3.171 5.981 1.419 8.898-.198 .264-.41 .519-.633 .762M16.322 16.322c-.563 .681-1.01 1.451-1.322 2.278-.628 1.187-1.754 2.032-3.07 2.303C10.614 21.174 9.246 20.843 8.2 20")
            addPathData("M11.42 7.414c1.184-.734 2.717-.557 3.702 .428 .985 .985 1.163 2.518 .429 3.702")
            addPathData("M3 3 21 21")
        }
        return _earOff!!
    }

private var _earOff: ImageVector? = null
