package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandKbin: ImageVector
    get() {
        if (_brandKbin != null) return _brandKbin!!
        _brandKbin = tablerOutlineIcon(
            name = "BrandKbin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.586 9.506h-2.43C7.722 8.574 7.456 8 6.56 8L4.156 8.019c-.662 0-1.353 .592-1.103 1.487l2.216 9.436C5.755 20.685 6.08 21 6.414 21h.64")
            addPathData("M14.275 3h5.645c.84 0 1.24 .714 1.02 1.287L16.253 19.396c-.42 1.133-1.159 1.603-2.354 1.603h-7.485c.39 0 .76-.618 1.296-2.061L12.167 4.448C12.493 3.618 12.927 3 14.275 3")
        }
        return _brandKbin!!
    }

private var _brandKbin: ImageVector? = null
