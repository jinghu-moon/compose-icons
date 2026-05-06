package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandCoreos: ImageVector
    get() {
        if (_brandCoreos != null) return _brandCoreos!!
        _brandCoreos = tablerOutlineIcon(
            name = "BrandCoreos",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 12c0 4.971-4.029 9-9 9C7.029 21 3 16.971 3 12 3 7.029 7.029 3 12 3c4.971 0 9 4.029 9 9")
            addPathData("M12 3C8.737 6.212 9 10.654 9 15c4.59 .244 8.814-.282 12-3")
            addPathData("M9.5 9c1.549-.413 3.202 .031 4.335 1.165 1.134 1.134 1.578 2.786 1.165 4.335")
        }
        return _brandCoreos!!
    }

private var _brandCoreos: ImageVector? = null
