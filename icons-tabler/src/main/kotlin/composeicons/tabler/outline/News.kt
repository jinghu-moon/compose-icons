package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.News: ImageVector
    get() {
        if (_news != null) return _news!!
        _news = tablerOutlineIcon(
            name = "News",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 6h3c.552 0 1 .448 1 1v11c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2v-13C16 4.448 15.552 4 15 4h-10C4.448 4 4 4.448 4 5v12c0 1.657 1.343 3 3 3h11")
            addPathData("M8 8h4")
            addPathData("M8 12h4")
            addPathData("M8 16h4")
        }
        return _news!!
    }

private var _news: ImageVector? = null
