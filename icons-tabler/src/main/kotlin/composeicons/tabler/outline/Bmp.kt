package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Bmp: ImageVector
    get() {
        if (_bmp != null) return _bmp!!
        _bmp = tablerOutlineIcon(
            name = "Bmp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 16v-8h2c1.105 0 2 .895 2 2 0 1.105-.895 2-2 2h-2")
            addPathData("M6 14c0 1.105-.895 2-2 2h-2v-8h2c1.105 0 2 .895 2 2 0 1.105-.895 2-2 2h-2 2c1.105 0 2 .895 2 2")
            addPathData("M9 16v-8l3 6L15 8v8")
        }
        return _bmp!!
    }

private var _bmp: ImageVector? = null
