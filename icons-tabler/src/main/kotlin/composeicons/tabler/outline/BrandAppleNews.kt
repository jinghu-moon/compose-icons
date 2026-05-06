package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAppleNews: ImageVector
    get() {
        if (_brandAppleNews != null) return _brandAppleNews!!
        _brandAppleNews = tablerOutlineIcon(
            name = "BrandAppleNews",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 14l6 6h-6v-6")
            addPathData("M20 10 14 4h6v6")
            addPathData("M4 4v4L16 20h4v-4L8 4h-4")
        }
        return _brandAppleNews!!
    }

private var _brandAppleNews: ImageVector? = null
