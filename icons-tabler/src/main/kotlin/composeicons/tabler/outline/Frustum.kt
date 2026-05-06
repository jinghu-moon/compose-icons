package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Frustum: ImageVector
    get() {
        if (_frustum != null) return _frustum!!
        _frustum = tablerOutlineIcon(
            name = "Frustum",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18.402 5.508l2.538 10.158c.231 .916-.214 1.867-1.064 2.278l-7.036 3.366c-.532 .255-1.15 .255-1.682 0L4.123 17.945C3.273 17.534 2.828 16.583 3.059 15.667L5.598 5.508C5.745 4.918 6.154 4.429 6.708 4.18L11.204 2.17c.506-.226 1.084-.226 1.59 0l4.496 2.01c.554 .246 .963 .736 1.112 1.328")
            addPathData("M18 4.82 12.802 7.144c-.51 .228-1.092 .228-1.602 0L6 4.819")
            addPathData("M12 7.32v14.18")
        }
        return _frustum!!
    }

private var _frustum: ImageVector? = null
