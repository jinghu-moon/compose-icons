package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAlipay: ImageVector
    get() {
        if (_brandAlipay != null) return _brandAlipay!!
        _brandAlipay = tablerOutlineIcon(
            name = "BrandAlipay",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 3h-14C3.895 3 3 3.895 3 5v14c0 1.105 .895 2 2 2h14c1.105 0 2-.895 2-2v-14C21 3.895 20.105 3 19 3")
            addPathData("M7 7h10")
            addPathData("M12 3v7")
            addPathData("M21 17.314C18.029 15.391 6 8.535 6 15.45 6 17.166 7.52 18 8.985 18c3.512 0 6.814-5.425 6.814-8h-6.604")
        }
        return _brandAlipay!!
    }

private var _brandAlipay: ImageVector? = null
