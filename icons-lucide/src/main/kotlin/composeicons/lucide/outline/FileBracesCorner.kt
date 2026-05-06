package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FileBracesCorner: ImageVector
    get() {
        if (_fileBracesCorner != null) return _fileBracesCorner!!
        _fileBracesCorner = lucideOutlineIcon(
            name = "FileBracesCorner",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 22h4c1.105 0 2-.895 2-2v-12c.002-.64-.253-1.254-.706-1.706L15.706 2.706C15.254 2.253 14.64 1.998 14 2h-8C4.895 2 4 2.895 4 4v6")
            addPathData("M14 2v5c0 .552 .448 1 1 1h5")
            addPathData("M5 14c-.552 0-1 .448-1 1v2c0 .552-.448 1-1 1 .552 0 1 .448 1 1v2c0 .552 .448 1 1 1")
            addPathData("M9 22c.552 0 1-.448 1-1v-2c0-.552 .448-1 1-1-.552 0-1-.448-1-1v-2c0-.552-.448-1-1-1")
        }
        return _fileBracesCorner!!
    }

private var _fileBracesCorner: ImageVector? = null
