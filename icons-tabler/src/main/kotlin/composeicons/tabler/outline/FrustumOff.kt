package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FrustumOff: ImageVector
    get() {
        if (_frustumOff != null) return _frustumOff!!
        _frustumOff = tablerOutlineIcon(
            name = "FrustumOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7.72 3.728 11.204 2.17c.506-.226 1.084-.226 1.59 0l4.496 2.01c.554 .246 .963 .736 1.112 1.328l2.538 10.158c.103 .412 .07 .832-.075 1.206M18.566 18.571l-5.725 2.738c-.532 .255-1.15 .255-1.682 0L4.124 17.944C3.274 17.533 2.829 16.582 3.06 15.666L5.58 5.586")
            addPathData("M18 4.82 12.802 7.144c-.51 .228-1.092 .228-1.602 0")
            addPathData("M12 7.32v.68M12 12v9.5")
            addPathData("M3 3 21 21")
        }
        return _frustumOff!!
    }

private var _frustumOff: ImageVector? = null
