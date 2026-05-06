package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandDribbble: ImageVector
    get() {
        if (_brandDribbble != null) return _brandDribbble!!
        _brandDribbble = tablerOutlineIcon(
            name = "BrandDribbble",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M9 3.6c5 6 7 10.5 7.5 16.2")
            addPathData("M6.4 19c3.5-3.5 6-6.5 14.5-6.4")
            addPathData("M3.1 10.75c5 0 9.814-.38 15.314-5")
        }
        return _brandDribbble!!
    }

private var _brandDribbble: ImageVector? = null
