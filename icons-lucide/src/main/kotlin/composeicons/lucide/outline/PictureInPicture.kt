package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.PictureInPicture: ImageVector
    get() {
        if (_pictureInPicture != null) return _pictureInPicture!!
        _pictureInPicture = lucideOutlineIcon(
            name = "PictureInPicture",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 10h6v-6")
            addPathData("M2 4l6 6")
            addPathData("M21 10v-3C21 5.895 20.105 5 19 5h-7")
            addPathData("M3 14v2c0 1.105 .895 2 2 2h3")
            addPathData("M13 14h8c.552 0 1 .448 1 1v5c0 .552-.448 1-1 1h-8c-.552 0-1-.448-1-1v-5c0-.552 .448-1 1-1Z")
        }
        return _pictureInPicture!!
    }

private var _pictureInPicture: ImageVector? = null
