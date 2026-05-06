package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FileDigit: ImageVector
    get() {
        if (_fileDigit != null) return _fileDigit!!
        _fileDigit = lucideOutlineIcon(
            name = "FileDigit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 12v-8C4 2.895 4.895 2 6 2h8c.64-.002 1.254 .253 1.706 .706l3.588 3.588c.453 .452 .708 1.066 .706 1.706v12c0 1.105-.895 2-2 2")
            addPathData("M14 2v5c0 .552 .448 1 1 1h5")
            addPathData("M10 16h2v6")
            addPathData("M10 22h4")
            addPathData("M4 16h0c1.105 0 2 .895 2 2v2c0 1.105-.895 2-2 2h0C2.895 22 2 21.105 2 20v-2c0-1.105 .895-2 2-2Z")
        }
        return _fileDigit!!
    }

private var _fileDigit: ImageVector? = null
