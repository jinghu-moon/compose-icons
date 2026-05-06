package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandOpera: ImageVector
    get() {
        if (_brandOpera != null) return _brandOpera!!
        _brandOpera = tablerOutlineIcon(
            name = "BrandOpera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M9 12c0 2.761 1.343 5 3 5 1.657 0 3-2.239 3-5C15 9.239 13.657 7 12 7 10.343 7 9 9.239 9 12")
        }
        return _brandOpera!!
    }

private var _brandOpera: ImageVector? = null
