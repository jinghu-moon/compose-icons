package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandDingtalk: ImageVector
    get() {
        if (_brandDingtalk != null) return _brandDingtalk!!
        _brandDingtalk = tablerOutlineIcon(
            name = "BrandDingtalk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 12c0 4.971-4.029 9-9 9C7.029 21 3 16.971 3 12 3 7.029 7.029 3 12 3c4.971 0 9 4.029 9 9")
            addPathData("M8 7.5l7.02 2.632c.256 .096 .461 .293 .568 .544 .107 .251 .107 .535-.001 .786L14.5 14h1.5l-5 4 1-4C8.9 14.03 8.886 10.861 8 7.5")
        }
        return _brandDingtalk!!
    }

private var _brandDingtalk: ImageVector? = null
