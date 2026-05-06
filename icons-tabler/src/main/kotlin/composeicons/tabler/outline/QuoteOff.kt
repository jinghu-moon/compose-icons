package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.QuoteOff: ImageVector
    get() {
        if (_quoteOff != null) return _quoteOff!!
        _quoteOff = tablerOutlineIcon(
            name = "QuoteOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 11h-4C5.448 11 5 10.552 5 10v-3C5 6.448 5.448 6 6 6M10 10v3c0 2.667-1.333 4.333-4 5")
            addPathData("M19 11h-4M14 10v-3c0-.552 .448-1 1-1h3c.552 0 1 .448 1 1v6c0 .66-.082 1.26-.245 1.798M17.102 17.088c-.571 .4-1.272 .704-2.102 .912")
            addPathData("M3 3 21 21")
        }
        return _quoteOff!!
    }

private var _quoteOff: ImageVector? = null
