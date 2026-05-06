package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FileSearchCorner: ImageVector
    get() {
        if (_fileSearchCorner != null) return _fileSearchCorner!!
        _fileSearchCorner = lucideOutlineIcon(
            name = "FileSearchCorner",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11.1 22h-5.1C4.895 22 4 21.105 4 20v-16C4 2.895 4.895 2 6 2h8c.64-.002 1.254 .253 1.706 .706l3.589 3.588c.453 .452 .707 1.066 .705 1.706v3.25")
            addPathData("M14 2v5c0 .552 .448 1 1 1h5")
            addPathData("M21 22 18.12 19.12")
            addPathData("M19 17c0 1.657-1.343 3-3 3-1.657 0-3-1.343-3-3 0-1.657 1.343-3 3-3 1.657 0 3 1.343 3 3Z")
        }
        return _fileSearchCorner!!
    }

private var _fileSearchCorner: ImageVector? = null
