package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Sparkles: ImageVector
    get() {
        if (_sparkles != null) return _sparkles!!
        _sparkles = tablerFilledIcon(
            name = "Sparkles",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 19c-.552 0-1-.448-1-1 0-.552 .448-1 1-1 .552 0 1-.448 1-1 0-1.333 2-1.333 2 0 0 .552 .448 1 1 1 1.333 0 1.333 2 0 2-.552 0-1 .448-1 1 0 1.333-2 1.333-2 0 0-.552-.448-1-1-1")
            addPathData("M3 11C5.761 11 8 8.761 8 6 8 4.667 10 4.667 10 6c0 2.761 2.239 5 5 5 1.333 0 1.333 2 0 2-2.761 0-5 2.239-5 5 0 .552-.448 1-1 1C8.448 19 8 18.552 8 18 8 15.239 5.761 13 3 13 1.667 13 1.667 11 3 11")
            addPathData("M16 7C15.448 7 15 6.552 15 6c0-.552 .448-1 1-1 .552 0 1-.448 1-1 0-1.333 2-1.333 2 0 0 .552 .448 1 1 1 1.333 0 1.333 2 0 2-.552 0-1 .448-1 1 0 1.333-2 1.333-2 0C17 7.448 16.552 7 16 7")
        }
        return _sparkles!!
    }

private var _sparkles: ImageVector? = null
