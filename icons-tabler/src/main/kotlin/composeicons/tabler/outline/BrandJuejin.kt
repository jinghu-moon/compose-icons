package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandJuejin: ImageVector
    get() {
        if (_brandJuejin != null) return _brandJuejin!!
        _brandJuejin = tablerOutlineIcon(
            name = "BrandJuejin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 12l10 7.422L22 12")
            addPathData("M7 9l5 4L17 9")
            addPathData("M11 6l1 .8L13 6 12 5.2 11 6")
        }
        return _brandJuejin!!
    }

private var _brandJuejin: ImageVector? = null
