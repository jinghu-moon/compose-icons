package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.LayoutDistributeHorizontal: ImageVector
    get() {
        if (_layoutDistributeHorizontal != null) return _layoutDistributeHorizontal!!
        _layoutDistributeHorizontal = tablerFilledIcon(
            name = "LayoutDistributeHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 3c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-16C3.448 5 3 4.552 3 4 3 3.448 3.448 3 4 3Z")
            addPathData("M20 19c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-16C3.448 21 3 20.552 3 20c0-.552 .448-1 1-1Z")
            addPathData("M16 8c1.657 0 3 1.343 3 3v2c0 1.657-1.343 3-3 3h-8C6.343 16 5 14.657 5 13v-2C5 9.343 6.343 8 8 8Z")
        }
        return _layoutDistributeHorizontal!!
    }

private var _layoutDistributeHorizontal: ImageVector? = null
