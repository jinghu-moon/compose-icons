package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Timezone: ImageVector
    get() {
        if (_timezone != null) return _timezone!!
        _timezone = tablerOutlineIcon(
            name = "Timezone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.884 10.554C20.146 6.018 16.109 2.767 11.52 3.013 6.931 3.259 3.264 6.922 3.014 11.511c-.25 4.589 2.998 8.629 7.533 9.371")
            addPathData("M3.6 9h16.8")
            addPathData("M3.6 15h6.9")
            addPathData("M11.5 3C8.703 7.481 8.148 13.007 9.998 17.954")
            addPathData("M12.5 3c1.434 2.297 2.298 4.904 2.52 7.603")
            addPathData("M14 18c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4")
            addPathData("M18 16.5v1.5l.5 .5")
        }
        return _timezone!!
    }

private var _timezone: ImageVector? = null
