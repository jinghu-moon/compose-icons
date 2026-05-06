package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandWordpress: ImageVector
    get() {
        if (_brandWordpress != null) return _brandWordpress!!
        _brandWordpress = tablerOutlineIcon(
            name = "BrandWordpress",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9.5 9h3")
            addPathData("M4 9h2.5")
            addPathData("M11 9l3 11 4-9")
            addPathData("M5.5 9 9 20l3-7")
            addPathData("M18 11c.177-.528 1-1.364 1-2.5C19 6.72 18.224 6 17.125 6 16.227 6 16 6.812 16 7.429c0 1.83 2 2.058 2 3.571")
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
        }
        return _brandWordpress!!
    }

private var _brandWordpress: ImageVector? = null
