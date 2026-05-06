package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandSass: ImageVector
    get() {
        if (_brandSass != null) return _brandSass!!
        _brandSass = tablerOutlineIcon(
            name = "BrandSass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M12 10.523c2.46-.826 4-.826 4-2.155C16 7.002 14.653 7.002 13.265 7.002c-1.91 0-3.352 .49-4.537 1.748-.848 .902-1.027 2.449-.153 3.307 .973 .956 3.206 1.789 2.884 3.493-.233 1.235-1.469 1.823-2.617 1.202-.782-.424-.454-1.746 .626-2.512 1.08-.766 2.822-.992 4.1-.24 .98 .575 1.046 1.724 .434 2.193")
        }
        return _brandSass!!
    }

private var _brandSass: ImageVector? = null
