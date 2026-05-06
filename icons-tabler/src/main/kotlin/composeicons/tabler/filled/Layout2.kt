package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Layout2: ImageVector
    get() {
        if (_layout2 != null) return _layout2!!
        _layout2 = tablerFilledIcon(
            name = "Layout2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 3c1.657 0 3 1.343 3 3v1c0 1.657-1.343 3-3 3h-2C4.343 10 3 8.657 3 7v-1C3 4.343 4.343 3 6 3Z")
            addPathData("M8 12c1.657 0 3 1.343 3 3v3c0 1.657-1.343 3-3 3h-2C4.343 21 3 19.657 3 18v-3C3 13.343 4.343 12 6 12Z")
            addPathData("M18 3c1.657 0 3 1.343 3 3v3c0 1.657-1.343 3-3 3h-2C14.343 12 13 10.657 13 9v-3C13 4.343 14.343 3 16 3Z")
            addPathData("M18 14c1.657 0 3 1.343 3 3v1c0 1.657-1.343 3-3 3h-2c-1.657 0-3-1.343-3-3v-1c0-1.657 1.343-3 3-3Z")
        }
        return _layout2!!
    }

private var _layout2: ImageVector? = null
