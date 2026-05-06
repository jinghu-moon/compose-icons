package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FileHeart: ImageVector
    get() {
        if (_fileHeart != null) return _fileHeart!!
        _fileHeart = lucideOutlineIcon(
            name = "FileHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 22h5c1.105 0 2-.895 2-2v-12c.002-.64-.253-1.254-.706-1.706L15.706 2.706C15.254 2.253 14.64 1.998 14 2h-8C4.895 2 4 2.895 4 4v7")
            addPathData("M14 2v5c0 .552 .448 1 1 1h5")
            addPathData("M3.62 18.8c-.573-.597-.772-1.461-.517-2.249 .254-.788 .921-1.372 1.735-1.522 .814-.149 1.645 .16 2.162 .807 .52-.639 1.348-.943 2.158-.792 .81 .151 1.473 .732 1.728 1.516 .255 .784 .061 1.644-.505 2.242L7.754 21.658c-.19 .218-.465 .343-.753 .343-.289 0-.564-.125-.753-.343Z")
        }
        return _fileHeart!!
    }

private var _fileHeart: ImageVector? = null
