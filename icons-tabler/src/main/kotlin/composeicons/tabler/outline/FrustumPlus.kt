package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FrustumPlus: ImageVector
    get() {
        if (_frustumPlus != null) return _frustumPlus!!
        _frustumPlus = tablerOutlineIcon(
            name = "FrustumPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.841 21.309c-.532 .255-1.15 .255-1.682 0L4.124 17.944C3.274 17.533 2.829 16.582 3.06 15.666L5.598 5.508C5.745 4.918 6.154 4.429 6.708 4.18L11.204 2.17c.506-.226 1.084-.226 1.59 0l4.496 2.01c.554 .246 .963 .736 1.112 1.328l1.67 6.683")
            addPathData("M18 4.82 12.802 7.144c-.51 .228-1.092 .228-1.602 0L6 4.819")
            addPathData("M12 7.32v14.18")
            addPathData("M16 19h6")
            addPathData("M19 16v6")
        }
        return _frustumPlus!!
    }

private var _frustumPlus: ImageVector? = null
