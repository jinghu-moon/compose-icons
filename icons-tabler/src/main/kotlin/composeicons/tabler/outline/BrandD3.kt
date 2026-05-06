package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandD3: ImageVector
    get() {
        if (_brandD3 != null) return _brandD3!!
        _brandD3 = tablerOutlineIcon(
            name = "BrandD3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 4h1.8C8.776 4 12 7.582 12 12c0 4.418-3.224 8-7.2 8h-1.8")
            addPathData("M12 4h5.472C19.42 4 21 5.79 21 8c0 2.21-1.58 4-3.528 4")
            addPathData("M17.472 12h-2.472")
            addPathData("M17.472 12h-2.352")
            addPathData("M17.472 12C19.42 12 21 13.79 21 16c0 2.21-1.58 4-3.528 4h-5.472")
        }
        return _brandD3!!
    }

private var _brandD3: ImageVector? = null
