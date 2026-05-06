package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RefreshDot: ImageVector
    get() {
        if (_refreshDot != null) return _refreshDot!!
        _refreshDot = tablerOutlineIcon(
            name = "RefreshDot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 11C19.497 7.383 16.636 4.549 13.014 4.082 9.391 3.614 5.905 5.629 4.5 9M4 5v4h4")
            addPathData("M4 13c.503 3.617 3.364 6.451 6.986 6.918 3.622 .467 7.109-1.547 8.514-4.918M20 19v-4h-4")
            addPathData("M11 12c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
        }
        return _refreshDot!!
    }

private var _refreshDot: ImageVector? = null
