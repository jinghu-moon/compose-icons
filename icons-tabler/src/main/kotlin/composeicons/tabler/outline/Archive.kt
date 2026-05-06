package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Archive: ImageVector
    get() {
        if (_archive != null) return _archive!!
        _archive = tablerOutlineIcon(
            name = "Archive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 6C3 4.895 3.895 4 5 4h14c1.105 0 2 .895 2 2 0 1.105-.895 2-2 2h-14C3.895 8 3 7.105 3 6")
            addPathData("M5 8v10c0 1.105 .895 2 2 2h10c1.105 0 2-.895 2-2v-10")
            addPathData("M10 12h4")
        }
        return _archive!!
    }

private var _archive: ImageVector? = null
