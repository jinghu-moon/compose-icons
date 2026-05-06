package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandBlogger: ImageVector
    get() {
        if (_brandBlogger != null) return _brandBlogger!!
        _brandBlogger = tablerOutlineIcon(
            name = "BrandBlogger",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 21h8c2.761 0 5-2.239 5-5v-3c0-1.657-1.343-3-3-3h-1v-2C17 5.239 14.761 3 12 3h-4C5.239 3 3 5.239 3 8v8c0 2.761 2.239 5 5 5")
            addPathData("M7 8.5C7 7.672 7.672 7 8.5 7h3C12.328 7 13 7.672 13 8.5 13 9.328 12.328 10 11.5 10h-3C7.672 10 7 9.328 7 8.5")
            addPathData("M7 15.5C7 14.672 7.672 14 8.5 14h7c.828 0 1.5 .672 1.5 1.5C17 16.328 16.328 17 15.5 17h-7C7.672 17 7 16.328 7 15.5")
        }
        return _brandBlogger!!
    }

private var _brandBlogger: ImageVector? = null
