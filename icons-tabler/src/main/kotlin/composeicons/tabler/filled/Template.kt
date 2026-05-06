package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Template: ImageVector
    get() {
        if (_template != null) return _template!!
        _template = tablerFilledIcon(
            name = "Template",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 3c1.105 0 2 .895 2 2v2c0 1.105-.895 2-2 2h-14C3.895 9 3 8.105 3 7v-2C3 3.895 3.895 3 5 3Z")
            addPathData("M9 11c1.105 0 2 .895 2 2v6c0 1.105-.895 2-2 2h-4C3.895 21 3 20.105 3 19v-6c0-1.105 .895-2 2-2Z")
            addPathData("M20 11c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-6c-.552 0-1-.448-1-1 0-.552 .448-1 1-1Z")
            addPathData("M20 15c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-6c-.552 0-1-.448-1-1 0-.552 .448-1 1-1Z")
            addPathData("M20 19c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-6c-.552 0-1-.448-1-1 0-.552 .448-1 1-1Z")
        }
        return _template!!
    }

private var _template: ImageVector? = null
