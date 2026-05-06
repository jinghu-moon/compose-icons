package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAppgallery: ImageVector
    get() {
        if (_brandAppgallery != null) return _brandAppgallery!!
        _brandAppgallery = tablerOutlineIcon(
            name = "BrandAppgallery",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 8C4 5.791 5.791 4 8 4h8c2.209 0 4 1.791 4 4v8c0 2.209-1.791 4-4 4h-8C5.791 20 4 18.209 4 16v-8")
            addPathData("M9 8c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3")
        }
        return _brandAppgallery!!
    }

private var _brandAppgallery: ImageVector? = null
