package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandYahoo: ImageVector
    get() {
        if (_brandYahoo != null) return _brandYahoo!!
        _brandYahoo = tablerOutlineIcon(
            name = "BrandYahoo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 6h5")
            addPathData("M7 18h7")
            addPathData("M4.5 6 10 13v5")
            addPathData("M10 13 16 8")
            addPathData("M12.5 8h5")
            addPathData("M20 11v4")
            addPathData("M20 18v.01")
        }
        return _brandYahoo!!
    }

private var _brandYahoo: ImageVector? = null
