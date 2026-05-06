package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BellX: ImageVector
    get() {
        if (_bellX != null) return _bellX!!
        _bellX = tablerOutlineIcon(
            name = "BellX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 17h-9c1.105-.626 1.847-1.739 2-3v-3C6.121 8.414 7.66 6.107 10 5c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2 2.34 1.107 3.879 3.414 4 6v2")
            addPathData("M9 17v1c-0 1.011 .509 1.954 1.354 2.509 .845 .555 1.913 .647 2.84 .244")
            addPathData("M22 22 17 17")
            addPathData("M17 22l5-5")
        }
        return _bellX!!
    }

private var _bellX: ImageVector? = null
