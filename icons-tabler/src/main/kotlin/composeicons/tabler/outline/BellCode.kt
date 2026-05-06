package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BellCode: ImageVector
    get() {
        if (_bellCode != null) return _bellCode!!
        _bellCode = tablerOutlineIcon(
            name = "BellCode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11.5 17h-7.5c1.105-.626 1.847-1.739 2-3v-3C6.121 8.414 7.66 6.107 10 5c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2 2.34 1.107 3.879 3.414 4 6v2")
            addPathData("M9 17v1c-0 1.463 1.055 2.713 2.498 2.958")
            addPathData("M20 21l2-2L20 17")
            addPathData("M17 17l-2 2 2 2")
        }
        return _bellCode!!
    }

private var _bellCode: ImageVector? = null
