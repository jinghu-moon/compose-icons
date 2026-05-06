package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceCctv: ImageVector
    get() {
        if (_deviceCctv != null) return _deviceCctv!!
        _deviceCctv = tablerOutlineIcon(
            name = "DeviceCctv",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 4C3 3.448 3.448 3 4 3h16c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-16C3.448 7 3 6.552 3 6v-2")
            addPathData("M8 14c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4C9.791 10 8 11.791 8 14")
            addPathData("M19 7v7c0 3.866-3.134 7-7 7C8.134 21 5 17.866 5 14v-7")
            addPathData("M12 14h.01")
        }
        return _deviceCctv!!
    }

private var _deviceCctv: ImageVector? = null
