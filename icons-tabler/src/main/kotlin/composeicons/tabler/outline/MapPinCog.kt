package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MapPinCog: ImageVector
    get() {
        if (_mapPinCog != null) return _mapPinCog!!
        _mapPinCog = tablerOutlineIcon(
            name = "MapPinCog",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 11c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C15 9.343 13.657 8 12 8 10.343 8 9 9.343 9 11")
            addPathData("M12.005 21.485c-.532 .002-1.042-.209-1.418-.585L6.343 16.657C3.729 14.043 3.247 9.979 5.175 6.826 7.104 3.673 10.942 2.252 14.459 3.388c3.517 1.136 5.798 4.534 5.518 8.219")
            addPathData("M17.001 19c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M19.001 15.5v1.5")
            addPathData("M19.001 21v1.5")
            addPathData("M22.032 17.25 20.733 18")
            addPathData("M17.27 20l-1.3 .75")
            addPathData("M15.97 17.25 17.27 18")
            addPathData("M20.733 20l1.3 .75")
        }
        return _mapPinCog!!
    }

private var _mapPinCog: ImageVector? = null
