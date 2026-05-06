package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.LayoutDistributeVertical: ImageVector
    get() {
        if (_layoutDistributeVertical != null) return _layoutDistributeVertical!!
        _layoutDistributeVertical = tablerFilledIcon(
            name = "LayoutDistributeVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 3c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1C3.448 21 3 20.552 3 20v-16C3 3.448 3.448 3 4 3")
            addPathData("M20 3c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-16c0-.552 .448-1 1-1")
            addPathData("M13 5c1.657 0 3 1.343 3 3v8c0 1.657-1.343 3-3 3h-2C9.343 19 8 17.657 8 16v-8C8 6.343 9.343 5 11 5Z")
        }
        return _layoutDistributeVertical!!
    }

private var _layoutDistributeVertical: ImageVector? = null
