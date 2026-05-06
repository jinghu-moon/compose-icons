package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandZhihu: ImageVector
    get() {
        if (_brandZhihu != null) return _brandZhihu!!
        _brandZhihu = tablerOutlineIcon(
            name = "BrandZhihu",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 6h6v12h-2l-2 2L15 18h-1v-12")
            addPathData("M4 12h6.5")
            addPathData("M10.5 6h-5")
            addPathData("M6 4C5.5 6.5 4.5 7.5 3.5 8.5")
            addPathData("M8 6v7c0 4.5-2 5.5-4 7")
            addPathData("M11 18 8 13")
        }
        return _brandZhihu!!
    }

private var _brandZhihu: ImageVector? = null
