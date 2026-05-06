package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RefreshAlert: ImageVector
    get() {
        if (_refreshAlert != null) return _refreshAlert!!
        _refreshAlert = tablerOutlineIcon(
            name = "RefreshAlert",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 11C19.497 7.383 16.636 4.549 13.014 4.082 9.391 3.614 5.905 5.629 4.5 9M4 5v4h4")
            addPathData("M4 13c.503 3.617 3.364 6.451 6.986 6.918 3.622 .467 7.109-1.547 8.514-4.918M20 19v-4h-4")
            addPathData("M12 9v3")
            addPathData("M12 15h.01")
        }
        return _refreshAlert!!
    }

private var _refreshAlert: ImageVector? = null
