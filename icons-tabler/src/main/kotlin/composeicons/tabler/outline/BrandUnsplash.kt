package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandUnsplash: ImageVector
    get() {
        if (_brandUnsplash != null) return _brandUnsplash!!
        _brandUnsplash = tablerOutlineIcon(
            name = "BrandUnsplash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 11h5v4h6v-4h5v9h-16v-9")
            addPathData("M9 4h6v4h-6v-4")
        }
        return _brandUnsplash!!
    }

private var _brandUnsplash: ImageVector? = null
