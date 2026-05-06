package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandBitbucket: ImageVector
    get() {
        if (_brandBitbucket != null) return _brandBitbucket!!
        _brandBitbucket = tablerOutlineIcon(
            name = "BrandBitbucket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3.648 4c-.189-.003-.37 .079-.494 .223-.124 .144-.177 .335-.146 .521L6.148 19.272c.07 .417 .43 .724 .852 .728h10c.318 .003 .59-.226 .642-.539L20.992 4.751c.03-.187-.023-.378-.147-.521-.123-.144-.304-.225-.493-.223L3.648 4")
            addPathData("M14 15h-4L9 9h6l-1 6")
        }
        return _brandBitbucket!!
    }

private var _brandBitbucket: ImageVector? = null
