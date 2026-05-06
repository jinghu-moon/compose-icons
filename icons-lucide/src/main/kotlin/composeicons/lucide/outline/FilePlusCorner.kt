package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FilePlusCorner: ImageVector
    get() {
        if (_filePlusCorner != null) return _filePlusCorner!!
        _filePlusCorner = lucideOutlineIcon(
            name = "FilePlusCorner",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11.35 22h-5.35C4.895 22 4 21.105 4 20v-16C4 2.895 4.895 2 6 2h8c.64-.002 1.254 .253 1.706 .706l3.588 3.588c.453 .452 .708 1.066 .706 1.706v5.35")
            addPathData("M14 2v5c0 .552 .448 1 1 1h5")
            addPathData("M14 19h6")
            addPathData("M17 16v6")
        }
        return _filePlusCorner!!
    }

private var _filePlusCorner: ImageVector? = null
