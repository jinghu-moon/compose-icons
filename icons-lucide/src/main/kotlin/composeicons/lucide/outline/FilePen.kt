package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FilePen: ImageVector
    get() {
        if (_filePen != null) return _filePen!!
        _filePen = lucideOutlineIcon(
            name = "FilePen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.659 22h5.341c1.105 0 2-.895 2-2v-12c.002-.64-.253-1.254-.706-1.706L15.706 2.706C15.254 2.253 14.64 1.998 14 2h-8C4.895 2 4 2.895 4 4v9.34")
            addPathData("M14 2v5c0 .552 .448 1 1 1h5")
            addPathData("M10.378 12.622c.829-.828 2.173-.828 3.002 .002 .828 .829 .828 2.173-.002 3.002L8.36 20.637c-.238 .238-.531 .412-.854 .506l-2.867 .837c-.175 .051-.364 .003-.494-.126-.129-.129-.178-.318-.126-.494l.836-2.869c.094-.322 .268-.616 .506-.853Z")
        }
        return _filePen!!
    }

private var _filePen: ImageVector? = null
