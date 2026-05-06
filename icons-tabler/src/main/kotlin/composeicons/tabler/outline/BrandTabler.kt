package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandTabler: ImageVector
    get() {
        if (_brandTabler != null) return _brandTabler!!
        _brandTabler = tablerOutlineIcon(
            name = "BrandTabler",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 9l3 3L8 15")
            addPathData("M13 15h3")
            addPathData("M3 7C3 4.791 4.791 3 7 3h10c2.209 0 4 1.791 4 4v10c0 2.209-1.791 4-4 4h-10C4.791 21 3 19.209 3 17v-10")
        }
        return _brandTabler!!
    }

private var _brandTabler: ImageVector? = null
