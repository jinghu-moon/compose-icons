package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandWish: ImageVector
    get() {
        if (_brandWish != null) return _brandWish!!
        _brandWish = tablerOutlineIcon(
            name = "BrandWish",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 6 7.981 8.392l-.639 6.037c-.18 .893 .06 1.819 .65 2.514 .591 .697 1.468 1.086 2.381 1.057 2.049-.061 3.774-1.552 4.132-3.57-.18 .893 .06 1.819 .65 2.514 .591 .696 1.467 1.085 2.38 1.056 2.049-.061 3.774-1.552 4.132-3.57L22 9.797")
            addPathData("M14.504 14.429l.334-3")
        }
        return _brandWish!!
    }

private var _brandWish: ImageVector? = null
