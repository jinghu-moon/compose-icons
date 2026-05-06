package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FileMinusCorner: ImageVector
    get() {
        if (_fileMinusCorner != null) return _fileMinusCorner!!
        _fileMinusCorner = lucideOutlineIcon(
            name = "FileMinusCorner",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 14v-6c.002-.64-.253-1.254-.706-1.706L15.706 2.706C15.254 2.253 14.64 1.998 14 2h-8C4.895 2 4 2.895 4 4v16c0 1.105 .895 2 2 2h12")
            addPathData("M14 2v5c0 .552 .448 1 1 1h5")
            addPathData("M14 18h6")
        }
        return _fileMinusCorner!!
    }

private var _fileMinusCorner: ImageVector? = null
