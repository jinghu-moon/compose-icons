package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandNytimes: ImageVector
    get() {
        if (_brandNytimes != null) return _brandNytimes!!
        _brandNytimes = tablerOutlineIcon(
            name = "BrandNytimes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11.036 5.058C7.035 5.545 4.02 8.932 4.002 12.963c-.018 4.031 2.965 7.446 6.962 7.969 3.997 .523 7.758-2.009 8.778-5.909")
            addPathData("M12 21v-11L4.5 14")
            addPathData("M17.5 3C18.881 3 20 4.119 20 5.5 20 6.881 18.881 8 17.5 8L6.5 3C5.248 2.997 4.187 3.921 4.018 5.162c-.169 1.241 .605 2.415 1.812 2.748")
            addPathData("M9 12v8")
            addPathData("M16 13h-.01")
        }
        return _brandNytimes!!
    }

private var _brandNytimes: ImageVector? = null
