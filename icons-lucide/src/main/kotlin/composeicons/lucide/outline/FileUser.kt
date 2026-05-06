package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FileUser: ImageVector
    get() {
        if (_fileUser != null) return _fileUser!!
        _fileUser = lucideOutlineIcon(
            name = "FileUser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 22C4.895 22 4 21.105 4 20v-16C4 2.895 4.895 2 6 2h8c.639-.001 1.253 .253 1.704 .706l3.588 3.588c.454 .451 .709 1.066 .708 1.706v12c0 1.105-.895 2-2 2Z")
            addPathData("M14 2v5c0 .552 .448 1 1 1h5")
            addPathData("M16 22c0-2.209-1.791-4-4-4C9.791 18 8 19.791 8 22")
            addPathData("M15 15c0 1.657-1.343 3-3 3C10.343 18 9 16.657 9 15c0-1.657 1.343-3 3-3 1.657 0 3 1.343 3 3Z")
        }
        return _fileUser!!
    }

private var _fileUser: ImageVector? = null
