package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.GalleryThumbnails: ImageVector
    get() {
        if (_galleryThumbnails != null) return _galleryThumbnails!!
        _galleryThumbnails = lucideOutlineIcon(
            name = "GalleryThumbnails",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 3h14c1.105 0 2 .895 2 2v10c0 1.105-.895 2-2 2h-14C3.895 17 3 16.105 3 15v-10C3 3.895 3.895 3 5 3Z")
            addPathData("M4 21h1")
            addPathData("M9 21h1")
            addPathData("M14 21h1")
            addPathData("M19 21h1")
        }
        return _galleryThumbnails!!
    }

private var _galleryThumbnails: ImageVector? = null
