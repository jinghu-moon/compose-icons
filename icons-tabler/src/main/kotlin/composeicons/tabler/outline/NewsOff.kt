package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.NewsOff: ImageVector
    get() {
        if (_newsOff != null) return _newsOff!!
        _newsOff = tablerOutlineIcon(
            name = "NewsOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 6h3c.552 0 1 .448 1 1v9M19.394 19.435c-.576 .56-1.432 .721-2.173 .408C16.481 19.53 16 18.804 16 18v-2M16 12v-7C16 4.448 15.552 4 15 4h-7M4.265 4.321C4.094 4.506 4 4.748 4 5v12c0 1.657 1.343 3 3 3h11")
            addPathData("M8 12h4")
            addPathData("M8 16h4")
            addPathData("M3 3 21 21")
        }
        return _newsOff!!
    }

private var _newsOff: ImageVector? = null
