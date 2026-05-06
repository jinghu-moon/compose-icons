package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ZoomScan: ImageVector
    get() {
        if (_zoomScan != null) return _zoomScan!!
        _zoomScan = tablerFilledIcon(
            name = "ZoomScan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 15c.552 0 1 .448 1 1v2c0 .552 .448 1 1 1h2c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-2C4.343 21 3 19.657 3 18v-2c0-.552 .448-1 1-1")
            addPathData("M20 15c.552 0 1 .448 1 1v2c0 1.657-1.343 3-3 3h-2c-.552 0-1-.448-1-1 0-.552 .448-1 1-1h2c.552 0 1-.448 1-1v-2c0-.552 .448-1 1-1")
            addPathData("M11 7c1.435 0 2.761 .769 3.473 2.016 .712 1.246 .702 2.779-.027 4.015l2.261 2.262c.379 .392 .374 1.016-.012 1.402-.386 .386-1.009 .391-1.402 .012L13.031 14.447 13 14.464c-1.238 .715-2.762 .715-4 0C7.762 13.75 7 12.429 7 11l.005-.2C7.112 8.671 8.869 7 11 7")
            addPathData("M8 3c.552 0 1 .448 1 1C9 4.552 8.552 5 8 5h-2C5.448 5 5 5.448 5 6v2C5 8.552 4.552 9 4 9 3.448 9 3 8.552 3 8v-2C3 4.343 4.343 3 6 3Z")
            addPathData("M18 3c1.657 0 3 1.343 3 3v2c0 .552-.448 1-1 1C19.448 9 19 8.552 19 8v-2C19 5.448 18.552 5 18 5h-2C15.448 5 15 4.552 15 4c0-.552 .448-1 1-1Z")
        }
        return _zoomScan!!
    }

private var _zoomScan: ImageVector? = null
