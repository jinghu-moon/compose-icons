package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.LayoutAlignTop: ImageVector
    get() {
        if (_layoutAlignTop != null) return _layoutAlignTop!!
        _layoutAlignTop = tablerFilledIcon(
            name = "LayoutAlignTop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 3c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-16C3.448 5 3 4.552 3 4 3 3.448 3.448 3 4 3Z")
            addPathData("M13 7c1.657 0 3 1.343 3 3v8c0 1.657-1.343 3-3 3h-2C9.343 21 8 19.657 8 18v-8C8 8.343 9.343 7 11 7Z")
        }
        return _layoutAlignTop!!
    }

private var _layoutAlignTop: ImageVector? = null
