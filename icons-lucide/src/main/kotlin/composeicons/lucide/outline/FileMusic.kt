package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FileMusic: ImageVector
    get() {
        if (_fileMusic != null) return _fileMusic!!
        _fileMusic = lucideOutlineIcon(
            name = "FileMusic",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11.65 22h6.35c1.105 0 2-.895 2-2v-12c.002-.64-.253-1.254-.706-1.706L15.706 2.706C15.254 2.253 14.64 1.998 14 2h-8C4.895 2 4 2.895 4 4v10.35")
            addPathData("M14 2v5c0 .552 .448 1 1 1h5")
            addPathData("M8 20v-7l3 1.474")
            addPathData("M8 20c0 1.105-.895 2-2 2C4.895 22 4 21.105 4 20c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
        }
        return _fileMusic!!
    }

private var _fileMusic: ImageVector? = null
