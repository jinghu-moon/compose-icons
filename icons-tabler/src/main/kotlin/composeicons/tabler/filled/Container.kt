package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Container: ImageVector
    get() {
        if (_container != null) return _container!!
        _container = tablerFilledIcon(
            name = "Container",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 3c.552 0 1 .448 1 1v.01c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-.01c0-.552 .448-1 1-1")
            addPathData("M20 19c.552 0 1 .448 1 1v.01c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-.01c0-.552 .448-1 1-1")
            addPathData("M20 15c.552 0 1 .448 1 1v.01c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-.01c0-.552 .448-1 1-1")
            addPathData("M20 11c.552 0 1 .448 1 1v.01c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-.01c0-.552 .448-1 1-1")
            addPathData("M20 7c.552 0 1 .448 1 1v.01c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-.01c0-.552 .448-1 1-1")
            addPathData("M15 3c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2h-6C7.895 21 7 20.105 7 19v-14C7 3.895 7.895 3 9 3Z")
            addPathData("M4 3c.552 0 1 .448 1 1v.01c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-.01C3 3.448 3.448 3 4 3")
            addPathData("M4 19c.552 0 1 .448 1 1v.01c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-.01c0-.552 .448-1 1-1")
            addPathData("M4 15c.552 0 1 .448 1 1v.01c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-.01c0-.552 .448-1 1-1")
            addPathData("M4 11c.552 0 1 .448 1 1v.01c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-.01c0-.552 .448-1 1-1")
            addPathData("M4 7c.552 0 1 .448 1 1v.01c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-.01C3 7.448 3.448 7 4 7")
        }
        return _container!!
    }

private var _container: ImageVector? = null
