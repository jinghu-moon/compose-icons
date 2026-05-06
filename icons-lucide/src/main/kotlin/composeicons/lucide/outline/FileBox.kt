package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FileBox: ImageVector
    get() {
        if (_fileBox != null) return _fileBox!!
        _fileBox = lucideOutlineIcon(
            name = "FileBox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14.5 22h3.5c1.105 0 2-.895 2-2v-12c.002-.64-.253-1.254-.706-1.706L15.706 2.706C15.254 2.253 14.64 1.998 14 2h-8C4.895 2 4 2.895 4 4v3.8")
            addPathData("M14 2v5c0 .552 .448 1 1 1h5")
            addPathData("M11.7 14.2 7 17 2.3 14.2")
            addPathData("M3 13.1c-.627 .362-1.009 1.036-.999 1.76v3.24c-.024 .725 .347 1.406 .969 1.78L6 21.7c.625 .372 1.402 .376 2.03 .01L11 19.9c.628-.362 1.01-1.036 1-1.76v-3.24c.024-.725-.348-1.407-.97-1.78L8 11.3c-.625-.372-1.402-.376-2.03-.01Z")
            addPathData("M7 17v5")
        }
        return _fileBox!!
    }

private var _fileBox: ImageVector? = null
