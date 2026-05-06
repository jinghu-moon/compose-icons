package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandTaobao: ImageVector
    get() {
        if (_brandTaobao != null) return _brandTaobao!!
        _brandTaobao = tablerOutlineIcon(
            name = "BrandTaobao",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 5c.968 .555 1.335 1.104 2 2")
            addPathData("M2 10c5.007 3.674 2.85 6.544 0 10")
            addPathData("M10 4C9.863 8.137 7.742 9.286 6.291 10.684")
            addPathData("M10 6c2.194-.8 3.736-.852 6.056-.993 4.206-.158 5.523 2.264 5.803 5.153 .428 4.396-.077 7.186-2.117 9.298-1.188 1.23-3.238 2.62-7.207 .259")
            addPathData("M11 10h6")
            addPathData("M13 10v6.493")
            addPathData("M8 13h10")
            addPathData("M16 15.512l.853 1.72")
            addPathData("M16.5 17c-1.145 .361-7 3-8.5-.5")
            addPathData("M11.765 8.539 10 11")
        }
        return _brandTaobao!!
    }

private var _brandTaobao: ImageVector? = null
