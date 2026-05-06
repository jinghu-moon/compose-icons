package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MapPinPlus: ImageVector
    get() {
        if (_mapPinPlus != null) return _mapPinPlus!!
        _mapPinPlus = tablerOutlineIcon(
            name = "MapPinPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 11c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C15 9.343 13.657 8 12 8 10.343 8 9 9.343 9 11")
            addPathData("M12.794 21.322c-.753 .325-1.627 .158-2.207-.422L6.343 16.657C3.692 14.005 3.239 9.866 5.253 6.703 7.268 3.54 11.21 2.201 14.735 3.483c3.525 1.282 5.686 4.84 5.198 8.558")
            addPathData("M16 19h6")
            addPathData("M19 16v6")
        }
        return _mapPinPlus!!
    }

private var _mapPinPlus: ImageVector? = null
