package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandWaze: ImageVector
    get() {
        if (_brandWaze != null) return _brandWaze!!
        _brandWaze = tablerOutlineIcon(
            name = "BrandWaze",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6.66 17.52C4.842 16.615 3.507 14.966 3 13c2 0 3-1 3-2.51C6 6.57 8.25 3 13.38 3 18 3 21 6.51 21 11c.013 2.626-1.251 5.095-3.39 6.62")
            addPathData("M10 18.69c1.098 .207 2.213 .308 3.33 .3h.54")
            addPathData("M14 19c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M6 19c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C10 17.895 9.105 17 8 17c-1.105 0-2 .895-2 2")
            addPathData("M16 9h.01")
            addPathData("M11 9h.01")
        }
        return _brandWaze!!
    }

private var _brandWaze: ImageVector? = null
