package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ZoomScan: ImageVector
    get() {
        if (_zoomScan != null) return _zoomScan!!
        _zoomScan = tablerOutlineIcon(
            name = "ZoomScan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 8v-2C4 4.895 4.895 4 6 4h2")
            addPathData("M4 16v2c0 1.105 .895 2 2 2h2")
            addPathData("M16 4h2c1.105 0 2 .895 2 2v2")
            addPathData("M16 20h2c1.105 0 2-.895 2-2v-2")
            addPathData("M8 11c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C14 9.343 12.657 8 11 8 9.343 8 8 9.343 8 11")
            addPathData("M16 16 13.5 13.5")
        }
        return _zoomScan!!
    }

private var _zoomScan: ImageVector? = null
