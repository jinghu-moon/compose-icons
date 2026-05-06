package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandDebian: ImageVector
    get() {
        if (_brandDebian != null) return _brandDebian!!
        _brandDebian = tablerOutlineIcon(
            name = "BrandDebian",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 17C9.603 16.057 8 13.847 8 11.365 8 9.175 9.039 8.225 9.604 7.77 12.25 5.637 16 7.5 16 11c0 2.5-2.905 2.121-3.5 1.5C11.905 11.879 11.5 11 12 10")
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
        }
        return _brandDebian!!
    }

private var _brandDebian: ImageVector? = null
