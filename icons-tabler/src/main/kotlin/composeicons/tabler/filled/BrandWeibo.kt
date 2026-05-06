package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandWeibo: ImageVector
    get() {
        if (_brandWeibo != null) return _brandWeibo!!
        _brandWeibo = tablerFilledIcon(
            name = "BrandWeibo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4.972 8.183C7.782 5.196 11.134 3.976 12.978 5.943c.298 .316 .554 .773 .736 1.266l.127-.031c2.064-.469 4 1.287 3.817 3.544l-.005 .036 .15 .057c1.46 .574 2.14 1.355 2.193 3.081l.004 .231C20 17.903 15.893 21 11 21 6.146 21 2 18.28 2 14.435 2 12.395 3.068 10.213 4.972 8.183")
            addPathData("M16 3c3.314 0 6 2.686 6 6v1c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-1C20 6.791 18.209 5 16 5h-1C14.448 5 14 4.552 14 4c0-.552 .448-1 1-1Z")
        }
        return _brandWeibo!!
    }

private var _brandWeibo: ImageVector? = null
