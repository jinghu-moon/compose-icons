package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandGoogleHome: ImageVector
    get() {
        if (_brandGoogleHome != null) return _brandGoogleHome!!
        _brandGoogleHome = tablerOutlineIcon(
            name = "BrandGoogleHome",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19.072 21h-14.144C3.863 21 3 20.137 3 19.072v-6.857c0-.512 .203-1 .566-1.365L10.636 3.787c.362-.362 .852-.565 1.364-.565 .511 0 1.002 .203 1.363 .565l7.071 7.063c.363 .362 .566 .853 .566 1.365v6.857C21 20.137 20.137 21 19.072 21")
            addPathData("M7 13v4h10v-4L12 8")
            addPathData("M14.8 5.2 3 17")
            addPathData("M7 17v4")
            addPathData("M17 17v4")
        }
        return _brandGoogleHome!!
    }

private var _brandGoogleHome: ImageVector? = null
