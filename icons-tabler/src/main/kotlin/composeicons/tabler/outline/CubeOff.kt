package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CubeOff: ImageVector
    get() {
        if (_cubeOff != null) return _cubeOff!!
        _cubeOff = tablerOutlineIcon(
            name = "CubeOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.83 16.809c.11-.248 .17-.52 .17-.801v-8.018C20.999 7.28 20.617 6.625 20 6.273L13 2.265c-.62-.354-1.38-.354-2 0L7.988 3.99M5.441 5.448 4 6.273C3.381 6.628 3 7.283 3 7.991v8.018c0 .709 .381 1.363 1 1.717l7 4.008c.62 .354 1.38 .354 2 0l5.544-3.174")
            addPathData("M12 22v-10")
            addPathData("M14.532 10.538 20.73 6.96")
            addPathData("M3.27 6.96 12 12")
            addPathData("M3 3 21 21")
        }
        return _cubeOff!!
    }

private var _cubeOff: ImageVector? = null
