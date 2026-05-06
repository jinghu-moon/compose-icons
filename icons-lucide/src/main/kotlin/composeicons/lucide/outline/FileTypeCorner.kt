package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FileTypeCorner: ImageVector
    get() {
        if (_fileTypeCorner != null) return _fileTypeCorner!!
        _fileTypeCorner = lucideOutlineIcon(
            name = "FileTypeCorner",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 22h6c1.105 0 2-.895 2-2v-12c.002-.64-.253-1.254-.706-1.706L15.706 2.706C15.254 2.253 14.64 1.998 14 2h-8C4.895 2 4 2.895 4 4v6")
            addPathData("M14 2v5c0 .552 .448 1 1 1h5")
            addPathData("M3 16v-1.5C3 14.224 3.224 14 3.5 14h7c.276 0 .5 .224 .5 .5v1.5")
            addPathData("M6 22h2")
            addPathData("M7 14v8")
        }
        return _fileTypeCorner!!
    }

private var _fileTypeCorner: ImageVector? = null
