package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FileXCorner: ImageVector
    get() {
        if (_fileXCorner != null) return _fileXCorner!!
        _fileXCorner = lucideOutlineIcon(
            name = "FileXCorner",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 22h-5C4.895 22 4 21.105 4 20v-16C4 2.895 4.895 2 6 2h8c.64-.002 1.254 .253 1.706 .706l3.588 3.588c.453 .452 .708 1.066 .706 1.706v5")
            addPathData("M14 2v5c0 .552 .448 1 1 1h5")
            addPathData("M15 17l5 5")
            addPathData("M20 17l-5 5")
        }
        return _fileXCorner!!
    }

private var _fileXCorner: ImageVector? = null
