package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Files: ImageVector
    get() {
        if (_files != null) return _files!!
        _files = lucideOutlineIcon(
            name = "Files",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 2h-4C9.895 2 9 2.895 9 4v11c0 1.105 .895 2 2 2h8c1.105 0 2-.895 2-2v-7")
            addPathData("M16.706 2.706C16.254 2.253 15.64 1.998 15 2v5c0 .552 .448 1 1 1h5c.002-.64-.253-1.254-.706-1.706Z")
            addPathData("M5 7C3.895 7 3 7.895 3 9v11c0 1.105 .895 2 2 2h8c.715-0 1.375-.381 1.732-1")
        }
        return _files!!
    }

private var _files: ImageVector? = null
