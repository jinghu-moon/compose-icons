package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BellMinus: ImageVector
    get() {
        if (_bellMinus != null) return _bellMinus!!
        _bellMinus = tablerOutlineIcon(
            name = "BellMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.5 17h-8.5c1.105-.626 1.847-1.739 2-3v-3C6.121 8.414 7.66 6.107 10 5c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2 2.34 1.107 3.879 3.414 4 6v3c.047 .386 .149 .758 .3 1.107")
            addPathData("M9 17v1c-0 .884 .389 1.723 1.065 2.293 .675 .57 1.568 .813 2.439 .665")
            addPathData("M16 19h6")
        }
        return _bellMinus!!
    }

private var _bellMinus: ImageVector? = null
