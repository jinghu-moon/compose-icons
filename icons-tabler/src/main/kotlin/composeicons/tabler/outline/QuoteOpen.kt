package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.QuoteOpen: ImageVector
    get() {
        if (_quoteOpen != null) return _quoteOpen!!
        _quoteOpen = tablerOutlineIcon(
            name = "QuoteOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 13h4c.552 0 1 .448 1 1v3c0 .552-.448 1-1 1h-3c-.552 0-1-.448-1-1v-6Q14 7 18 6")
            addPathData("M5 13h4c.552 0 1 .448 1 1v3c0 .552-.448 1-1 1h-3C5.448 18 5 17.552 5 17v-6Q5 7 9 6")
        }
        return _quoteOpen!!
    }

private var _quoteOpen: ImageVector? = null
