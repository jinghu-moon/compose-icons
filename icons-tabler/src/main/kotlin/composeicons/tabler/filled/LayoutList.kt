package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.LayoutList: ImageVector
    get() {
        if (_layoutList != null) return _layoutList!!
        _layoutList = tablerFilledIcon(
            name = "LayoutList",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 3c1.657 0 3 1.343 3 3v2c0 1.657-1.343 3-3 3h-12C4.343 11 3 9.657 3 8v-2C3 4.343 4.343 3 6 3Z")
            addPathData("M18 13c1.657 0 3 1.343 3 3v2c0 1.657-1.343 3-3 3h-12C4.343 21 3 19.657 3 18v-2C3 14.343 4.343 13 6 13Z")
        }
        return _layoutList!!
    }

private var _layoutList: ImageVector? = null
