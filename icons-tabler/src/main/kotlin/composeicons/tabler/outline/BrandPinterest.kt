package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandPinterest: ImageVector
    get() {
        if (_brandPinterest != null) return _brandPinterest!!
        _brandPinterest = tablerOutlineIcon(
            name = "BrandPinterest",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 20l4-9")
            addPathData("M10.7 14c.437 1.263 1.43 2 2.55 2C15.321 16 17 14.446 17 12 17.002 10.004 15.817 8.198 13.985 7.405 12.153 6.613 10.026 6.986 8.572 8.354 7.119 9.722 6.619 11.824 7.3 13.7")
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
        }
        return _brandPinterest!!
    }

private var _brandPinterest: ImageVector? = null
