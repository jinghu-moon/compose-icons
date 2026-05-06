package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandXing: ImageVector
    get() {
        if (_brandXing != null) return _brandXing!!
        _brandXing = tablerOutlineIcon(
            name = "BrandXing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 21 12 14 18.5 3")
            addPathData("M7 7l2 3.5L6 15")
        }
        return _brandXing!!
    }

private var _brandXing: ImageVector? = null
