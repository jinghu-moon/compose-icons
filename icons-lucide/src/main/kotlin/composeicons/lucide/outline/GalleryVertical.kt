package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.GalleryVertical: ImageVector
    get() {
        if (_galleryVertical != null) return _galleryVertical!!
        _galleryVertical = lucideOutlineIcon(
            name = "GalleryVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 2h18")
            addPathData("M5 6h14c1.105 0 2 .895 2 2v8c0 1.105-.895 2-2 2h-14C3.895 18 3 17.105 3 16v-8C3 6.895 3.895 6 5 6Z")
            addPathData("M3 22h18")
        }
        return _galleryVertical!!
    }

private var _galleryVertical: ImageVector? = null
