package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ZoomPan: ImageVector
    get() {
        if (_zoomPan != null) return _zoomPan!!
        _zoomPan = tablerOutlineIcon(
            name = "ZoomPan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 12c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C15 10.343 13.657 9 12 9 10.343 9 9 10.343 9 12")
            addPathData("M17 17 14.5 14.5")
            addPathData("M10 4 12 2l2 2")
            addPathData("M20 10l2 2-2 2")
            addPathData("M4 10 2 12l2 2")
            addPathData("M10 20l2 2 2-2")
        }
        return _zoomPan!!
    }

private var _zoomPan: ImageVector? = null
