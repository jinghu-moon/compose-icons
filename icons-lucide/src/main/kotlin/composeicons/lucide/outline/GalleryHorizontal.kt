package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.GalleryHorizontal: ImageVector
    get() {
        if (_galleryHorizontal != null) return _galleryHorizontal!!
        _galleryHorizontal = lucideOutlineIcon(
            name = "GalleryHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 3v18")
            addPathData("M8 3h8c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2h-8C6.895 21 6 20.105 6 19v-14C6 3.895 6.895 3 8 3Z")
            addPathData("M22 3v18")
        }
        return _galleryHorizontal!!
    }

private var _galleryHorizontal: ImageVector? = null
