package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.GalleryVerticalEnd: ImageVector
    get() {
        if (_galleryVerticalEnd != null) return _galleryVerticalEnd!!
        _galleryVerticalEnd = lucideOutlineIcon(
            name = "GalleryVerticalEnd",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 2h10")
            addPathData("M5 6h14")
            addPathData("M5 10h14c1.105 0 2 .895 2 2v8c0 1.105-.895 2-2 2h-14C3.895 22 3 21.105 3 20v-8c0-1.105 .895-2 2-2Z")
        }
        return _galleryVerticalEnd!!
    }

private var _galleryVerticalEnd: ImageVector? = null
