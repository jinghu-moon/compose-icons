package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Rss: ImageVector
    get() {
        if (_rss != null) return _rss!!
        _rss = tablerOutlineIcon(
            name = "Rss",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 19c0 .552 .448 1 1 1 .552 0 1-.448 1-1C6 18.448 5.552 18 5 18c-.552 0-1 .448-1 1")
            addPathData("M4 4c8.837 0 16 7.163 16 16")
            addPathData("M4 11c4.971 0 9 4.029 9 9")
        }
        return _rss!!
    }

private var _rss: ImageVector? = null
