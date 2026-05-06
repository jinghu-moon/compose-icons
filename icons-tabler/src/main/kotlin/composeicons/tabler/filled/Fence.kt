package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Fence: ImageVector
    get() {
        if (_fence != null) return _fence!!
        _fence = tablerFilledIcon(
            name = "Fence",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 17v3c0 .552-.448 1-1 1h-4c-.552 0-1-.448-1-1v-3Z")
            addPathData("M11 17v3c0 .552-.448 1-1 1h-4C5.448 21 5 20.552 5 20v-3Z")
            addPathData("M20 12c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-16C3.448 16 3 15.552 3 15v-2c0-.552 .448-1 1-1Z")
            addPathData("M8.707 3.293l2 2c.188 .187 .293 .442 .293 .707v5h-6v-5c0-.265 .105-.52 .293-.707l2-2c.39-.39 1.023-.39 1.414 0")
            addPathData("M16.707 3.293l2 2c.188 .187 .293 .442 .293 .707v5h-6v-5c0-.265 .105-.52 .293-.707l2-2c.391-.39 1.023-.39 1.414 0")
        }
        return _fence!!
    }

private var _fence: ImageVector? = null
