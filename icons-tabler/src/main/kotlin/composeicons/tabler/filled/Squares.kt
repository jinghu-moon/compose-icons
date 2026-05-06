package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Squares: ImageVector
    get() {
        if (_squares != null) return _squares!!
        _squares = tablerFilledIcon(
            name = "Squares",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 7c1.657 0 3 1.343 3 3v9c0 1.657-1.343 3-3 3h-9C8.343 22 7 20.657 7 19v-9C7 8.343 8.343 7 10 7Z")
            addPathData("M14 2c1.656-0 2.999 1.343 3 2.999L10 5C7.239 5 5 7.239 5 10l-.001 7-.175-.005C3.238 16.902 2 15.589 2 14v-9C2 3.343 3.343 2 5 2Z")
        }
        return _squares!!
    }

private var _squares: ImageVector? = null
