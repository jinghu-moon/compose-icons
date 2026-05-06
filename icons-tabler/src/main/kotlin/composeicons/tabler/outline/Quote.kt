package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Quote: ImageVector
    get() {
        if (_quote != null) return _quote!!
        _quote = tablerOutlineIcon(
            name = "Quote",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 11h-4C5.448 11 5 10.552 5 10v-3C5 6.448 5.448 6 6 6h3c.552 0 1 .448 1 1v6c0 2.667-1.333 4.333-4 5")
            addPathData("M19 11h-4c-.552 0-1-.448-1-1v-3c0-.552 .448-1 1-1h3c.552 0 1 .448 1 1v6c0 2.667-1.333 4.333-4 5")
        }
        return _quote!!
    }

private var _quote: ImageVector? = null
