package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FileLock: ImageVector
    get() {
        if (_fileLock != null) return _fileLock!!
        _fileLock = lucideOutlineIcon(
            name = "FileLock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 9.8v-5.8C4 2.895 4.895 2 6 2h8c.64-.002 1.254 .253 1.706 .706l3.588 3.588c.453 .452 .708 1.066 .706 1.706v12c0 1.105-.895 2-2 2h-3")
            addPathData("M14 2v5c0 .552 .448 1 1 1h5")
            addPathData("M9 17v-2C9 13.895 8.105 13 7 13c-1.105 0-2 .895-2 2v2")
            addPathData("M4 17h6c.552 0 1 .448 1 1v3c0 .552-.448 1-1 1h-6C3.448 22 3 21.552 3 21v-3c0-.552 .448-1 1-1Z")
        }
        return _fileLock!!
    }

private var _fileLock: ImageVector? = null
