package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Pentagram: ImageVector
    get() {
        if (_pentagram != null) return _pentagram!!
        _pentagram = tablerOutlineIcon(
            name = "Pentagram",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5.636 5.636C9.151 2.121 14.849 2.121 18.364 5.636c3.515 3.515 3.515 9.213 0 12.728-3.515 3.515-9.213 3.515-12.728 0C2.121 14.849 2.121 9.151 5.636 5.636")
            addPathData("M15.236 11l5.264 4h-6.5l-2 6L10 15h-6.5L8.776 11 6.72 4.72 12 8.5 17.28 4.72 15.236 11")
        }
        return _pentagram!!
    }

private var _pentagram: ImageVector? = null
