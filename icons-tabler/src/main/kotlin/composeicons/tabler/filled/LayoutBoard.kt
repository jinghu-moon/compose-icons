package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.LayoutBoard: ImageVector
    get() {
        if (_layoutBoard != null) return _layoutBoard!!
        _layoutBoard = tablerFilledIcon(
            name = "LayoutBoard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 3h5c.552 0 1 .448 1 1v3c0 .552-.448 1-1 1h-6C3.448 8 3 7.552 3 7v-2C3 3.895 3.895 3 5 3")
            addPathData("M14 3h5c1.105 0 2 .895 2 2v8c0 .552-.448 1-1 1h-6c-.552 0-1-.448-1-1v-9c0-.552 .448-1 1-1")
            addPathData("M14 16h6c.552 0 1 .448 1 1v2c0 1.105-.895 2-2 2h-5c-.552 0-1-.448-1-1v-3c0-.552 .448-1 1-1")
            addPathData("M4 10h6c.552 0 1 .448 1 1v9c0 .552-.448 1-1 1h-5C3.895 21 3 20.105 3 19v-8c0-.552 .448-1 1-1")
        }
        return _layoutBoard!!
    }

private var _layoutBoard: ImageVector? = null
