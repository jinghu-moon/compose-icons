package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FileOutput: ImageVector
    get() {
        if (_fileOutput != null) return _fileOutput!!
        _fileOutput = lucideOutlineIcon(
            name = "FileOutput",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4.226 20.925C4.571 21.586 5.255 22 6 22h12c1.105 0 2-.895 2-2v-12c.002-.64-.253-1.254-.706-1.706L15.706 2.706C15.254 2.253 14.64 1.998 14 2h-8C4.895 2 4 2.895 4 4v3.127")
            addPathData("M14 2v5c0 .552 .448 1 1 1h5")
            addPathData("M5 11 2 14")
            addPathData("M5 17 2 14h10")
        }
        return _fileOutput!!
    }

private var _fileOutput: ImageVector? = null
