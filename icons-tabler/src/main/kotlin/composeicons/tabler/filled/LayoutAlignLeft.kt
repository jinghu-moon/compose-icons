package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.LayoutAlignLeft: ImageVector
    get() {
        if (_layoutAlignLeft != null) return _layoutAlignLeft!!
        _layoutAlignLeft = tablerFilledIcon(
            name = "LayoutAlignLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 3c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1C3.448 21 3 20.552 3 20v-16C3 3.448 3.448 3 4 3")
            addPathData("M18 8c1.657 0 3 1.343 3 3v2c0 1.657-1.343 3-3 3h-8C8.343 16 7 14.657 7 13v-2C7 9.343 8.343 8 10 8Z")
        }
        return _layoutAlignLeft!!
    }

private var _layoutAlignLeft: ImageVector? = null
