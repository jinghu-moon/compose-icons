package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MapPinMinus: ImageVector
    get() {
        if (_mapPinMinus != null) return _mapPinMinus!!
        _mapPinMinus = tablerOutlineIcon(
            name = "MapPinMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 11c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C15 9.343 13.657 8 12 8 10.343 8 9 9.343 9 11")
            addPathData("M12.758 21.337c-.746 .305-1.601 .133-2.171-.437L6.343 16.657C3.411 13.723 3.208 9.034 5.875 5.857 8.543 2.681 13.196 2.07 16.593 4.451c3.397 2.381 4.411 6.963 2.335 10.554")
            addPathData("M16 19h6")
        }
        return _mapPinMinus!!
    }

private var _mapPinMinus: ImageVector? = null
