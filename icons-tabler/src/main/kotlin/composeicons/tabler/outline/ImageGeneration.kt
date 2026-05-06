package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ImageGeneration: ImageVector
    get() {
        if (_imageGeneration != null) return _imageGeneration!!
        _imageGeneration = tablerOutlineIcon(
            name = "ImageGeneration",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 21v-4C3 14.791 4.791 13 7 13c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-4")
            addPathData("M21 3C15.186 3.795 10.273 7.71 8.2 13.2")
            addPathData("M21 3C20.205 8.814 16.29 13.727 10.8 15.8")
            addPathData("M10.6 9c1.943 .897 3.503 2.457 4.4 4.4")
            addPathData("M17 19c1.105 0 2 .895 2 2 0-1.105 .895-2 2-2-1.105 0-2-.895-2-2 0 1.105-.895 2-2 2")
            addPathData("M3 5c1.105 0 2 .895 2 2C5 5.895 5.895 5 7 5 5.895 5 5 4.105 5 3 5 4.105 4.105 5 3 5")
        }
        return _imageGeneration!!
    }

private var _imageGeneration: ImageVector? = null
