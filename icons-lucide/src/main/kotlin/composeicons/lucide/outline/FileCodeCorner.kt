package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FileCodeCorner: ImageVector
    get() {
        if (_fileCodeCorner != null) return _fileCodeCorner!!
        _fileCodeCorner = lucideOutlineIcon(
            name = "FileCodeCorner",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 12.15v-8.15C4 2.895 4.895 2 6 2h8c.64-.002 1.254 .253 1.706 .706l3.588 3.588c.453 .452 .708 1.066 .706 1.706v12c0 1.105-.895 2-2 2h-3.35")
            addPathData("M14 2v5c0 .552 .448 1 1 1h5")
            addPathData("M5 16 2 19l3 3")
            addPathData("M9 22l3-3L9 16")
        }
        return _fileCodeCorner!!
    }

private var _fileCodeCorner: ImageVector? = null
