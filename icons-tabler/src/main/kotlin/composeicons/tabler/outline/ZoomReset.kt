package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ZoomReset: ImageVector
    get() {
        if (_zoomReset != null) return _zoomReset!!
        _zoomReset = tablerOutlineIcon(
            name = "ZoomReset",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 21 15 15")
            addPathData("M3.268 12.043c.897 2.92 3.579 4.925 6.634 4.957 3.565 .044 6.595-2.594 7.043-6.131C17.385 7.332 15.097 4.028 11.631 3.197 8.164 2.358 4.62 4.252 3.39 7.6")
            addPathData("M3 4v4h4")
        }
        return _zoomReset!!
    }

private var _zoomReset: ImageVector? = null
