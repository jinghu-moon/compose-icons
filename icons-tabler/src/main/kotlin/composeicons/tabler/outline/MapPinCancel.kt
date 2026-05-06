package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MapPinCancel: ImageVector
    get() {
        if (_mapPinCancel != null) return _mapPinCancel!!
        _mapPinCancel = tablerOutlineIcon(
            name = "MapPinCancel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 11c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C15 9.343 13.657 8 12 8 10.343 8 9 9.343 9 11")
            addPathData("M12.463 21.431c-.675 .161-1.385-.04-1.876-.531L6.343 16.657C3.694 14.008 3.238 9.876 5.245 6.714 7.252 3.551 11.185 2.204 14.709 3.473c3.524 1.269 5.697 4.813 5.228 8.529")
            addPathData("M16 19c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3")
            addPathData("M17 21l4-4")
        }
        return _mapPinCancel!!
    }

private var _mapPinCancel: ImageVector? = null
