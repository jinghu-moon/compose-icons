package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandIntercom: ImageVector
    get() {
        if (_brandIntercom != null) return _brandIntercom!!
        _brandIntercom = tablerOutlineIcon(
            name = "BrandIntercom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 6C4 4.895 4.895 4 6 4h12c1.105 0 2 .895 2 2v12c0 1.105-.895 2-2 2h-12C4.895 20 4 19.105 4 18v-12")
            addPathData("M7 8v3")
            addPathData("M10 7v6")
            addPathData("M14 7v6")
            addPathData("M17 8v3")
            addPathData("M7 15c4 2.667 6 2.667 10 0")
        }
        return _brandIntercom!!
    }

private var _brandIntercom: ImageVector? = null
