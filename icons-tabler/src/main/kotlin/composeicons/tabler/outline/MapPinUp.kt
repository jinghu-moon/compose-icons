package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MapPinUp: ImageVector
    get() {
        if (_mapPinUp != null) return _mapPinUp!!
        _mapPinUp = tablerOutlineIcon(
            name = "MapPinUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 11c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C15 9.343 13.657 8 12 8 10.343 8 9 9.343 9 11")
            addPathData("M12.789 21.324c-.752 .322-1.624 .154-2.202-.424L6.343 16.657C3.692 14.006 3.237 9.869 5.25 6.705 7.263 3.542 11.203 2.201 14.727 3.479c3.525 1.278 5.689 4.833 5.206 8.552")
            addPathData("M19 22v-6")
            addPathData("M22 19 19 16l-3 3")
        }
        return _mapPinUp!!
    }

private var _mapPinUp: ImageVector? = null
