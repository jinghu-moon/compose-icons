package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Cube: ImageVector
    get() {
        if (_cube != null) return _cube!!
        _cube = tablerOutlineIcon(
            name = "Cube",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 16.008v-8.018C20.999 7.28 20.617 6.625 20 6.273L13 2.265c-.62-.354-1.38-.354-2 0L4 6.273C3.381 6.628 3 7.283 3 7.991v8.018c0 .709 .381 1.363 1 1.717l7 4.008c.62 .354 1.38 .354 2 0l7-4.008c.619-.355 1-1.01 1-1.718")
            addPathData("M12 22v-10")
            addPathData("M12 12 20.73 6.96")
            addPathData("M3.27 6.96 12 12")
        }
        return _cube!!
    }

private var _cube: ImageVector? = null
