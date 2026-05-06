package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Category: ImageVector
    get() {
        if (_category != null) return _category!!
        _category = tablerFilledIcon(
            name = "Category",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 3h-6C3.448 3 3 3.448 3 4v6c0 .552 .448 1 1 1h6c.552 0 1-.448 1-1v-6C11 3.448 10.552 3 10 3Z")
            addPathData("M20 3h-6c-.552 0-1 .448-1 1v6c0 .552 .448 1 1 1h6c.552 0 1-.448 1-1v-6C21 3.448 20.552 3 20 3Z")
            addPathData("M10 13h-6c-.552 0-1 .448-1 1v6c0 .552 .448 1 1 1h6c.552 0 1-.448 1-1v-6c0-.552-.448-1-1-1Z")
            addPathData("M17 13c2.183 0 3.963 1.75 3.999 3.933 .036 2.183-1.684 3.992-3.866 4.064-2.182 .073-4.019-1.617-4.128-3.798L13 17l.005-.2C13.112 14.671 14.869 13 17 13Z")
        }
        return _category!!
    }

private var _category: ImageVector? = null
