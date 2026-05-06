package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandDouban: ImageVector
    get() {
        if (_brandDouban != null) return _brandDouban!!
        _brandDouban = tablerOutlineIcon(
            name = "BrandDouban",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 20h16")
            addPathData("M5 4h14")
            addPathData("M8 8h8c1.105 0 2 .895 2 2v2c0 1.105-.895 2-2 2h-8C6.895 14 6 13.105 6 12v-2C6 8.895 6.895 8 8 8")
            addPathData("M16 14l-2 6")
            addPathData("M8 17l1 3")
        }
        return _brandDouban!!
    }

private var _brandDouban: ImageVector? = null
