package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.LayoutBoardSplit: ImageVector
    get() {
        if (_layoutBoardSplit != null) return _layoutBoardSplit!!
        _layoutBoardSplit = tablerFilledIcon(
            name = "LayoutBoardSplit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 3h5c.552 0 1 .448 1 1v6c0 .552-.448 1-1 1h-6C3.448 11 3 10.552 3 10v-5C3 3.895 3.895 3 5 3")
            addPathData("M14 3h5c1.105 0 2 .895 2 2v2c0 .552-.448 1-1 1h-6C13.448 8 13 7.552 13 7v-3c0-.552 .448-1 1-1")
            addPathData("M13 11c0-.552 .448-1 1-1h6c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-6c-.552 0-1-.448-1-1Z")
            addPathData("M14 16h6c.552 0 1 .448 1 1v2c0 1.105-.895 2-2 2h-5c-.552 0-1-.448-1-1v-3c0-.552 .448-1 1-1")
            addPathData("M4 13h6c.552 0 1 .448 1 1v6c0 .552-.448 1-1 1h-5C3.895 21 3 20.105 3 19v-5c0-.552 .448-1 1-1")
        }
        return _layoutBoardSplit!!
    }

private var _layoutBoardSplit: ImageVector? = null
