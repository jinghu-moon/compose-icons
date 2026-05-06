package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.LayoutAlignRight: ImageVector
    get() {
        if (_layoutAlignRight != null) return _layoutAlignRight!!
        _layoutAlignRight = tablerFilledIcon(
            name = "LayoutAlignRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 3c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-16c0-.552 .448-1 1-1")
            addPathData("M14 8c1.657 0 3 1.343 3 3v2c0 1.657-1.343 3-3 3h-8C4.343 16 3 14.657 3 13v-2C3 9.343 4.343 8 6 8Z")
        }
        return _layoutAlignRight!!
    }

private var _layoutAlignRight: ImageVector? = null
