package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.PictureInPicture2: ImageVector
    get() {
        if (_pictureInPicture2 != null) return _pictureInPicture2!!
        _pictureInPicture2 = lucideOutlineIcon(
            name = "PictureInPicture2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 9v-3C21 4.895 20.105 4 19 4h-15C2.895 4 2 4.895 2 6v10c0 1.1 .9 2 2 2h4")
            addPathData("M14 13h6c1.105 0 2 .895 2 2v3c0 1.105-.895 2-2 2h-6c-1.105 0-2-.895-2-2v-3c0-1.105 .895-2 2-2Z")
        }
        return _pictureInPicture2!!
    }

private var _pictureInPicture2: ImageVector? = null
