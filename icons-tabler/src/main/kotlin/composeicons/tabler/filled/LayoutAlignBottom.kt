package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.LayoutAlignBottom: ImageVector
    get() {
        if (_layoutAlignBottom != null) return _layoutAlignBottom!!
        _layoutAlignBottom = tablerFilledIcon(
            name = "LayoutAlignBottom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 19c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-16C3.448 21 3 20.552 3 20c0-.552 .448-1 1-1Z")
            addPathData("M13 3c1.657 0 3 1.343 3 3v8c0 1.657-1.343 3-3 3h-2C9.343 17 8 15.657 8 14v-8C8 4.343 9.343 3 11 3Z")
        }
        return _layoutAlignBottom!!
    }

private var _layoutAlignBottom: ImageVector? = null
