package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FileSymlink: ImageVector
    get() {
        if (_fileSymlink != null) return _fileSymlink!!
        _fileSymlink = lucideOutlineIcon(
            name = "FileSymlink",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 11v-7C4 2.895 4.895 2 6 2h8c.64-.002 1.254 .253 1.706 .706l3.588 3.588c.453 .452 .708 1.066 .706 1.706v12c0 1.105-.895 2-2 2h-12C4.895 22 4 21.105 4 20v-3c0-1.105 .895-2 2-2h7")
            addPathData("M14 2v5c0 .552 .448 1 1 1h5")
            addPathData("M10 18l3-3L10 12")
        }
        return _fileSymlink!!
    }

private var _fileSymlink: ImageVector? = null
