package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.GalleryHorizontalEnd: ImageVector
    get() {
        if (_galleryHorizontalEnd != null) return _galleryHorizontalEnd!!
        _galleryHorizontalEnd = lucideOutlineIcon(
            name = "GalleryHorizontalEnd",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 7v10")
            addPathData("M6 5v14")
            addPathData("M12 3h8c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2h-8c-1.105 0-2-.895-2-2v-14c0-1.105 .895-2 2-2Z")
        }
        return _galleryHorizontalEnd!!
    }

private var _galleryHorizontalEnd: ImageVector? = null
