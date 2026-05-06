package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FileX: ImageVector
    get() {
        if (_fileX != null) return _fileX!!
        _fileX = lucideOutlineIcon(
            name = "FileX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 22C4.895 22 4 21.105 4 20v-16C4 2.895 4.895 2 6 2h8c.639-.001 1.253 .253 1.704 .706l3.588 3.588c.454 .451 .709 1.066 .708 1.706v12c0 1.105-.895 2-2 2Z")
            addPathData("M14 2v5c0 .552 .448 1 1 1h5")
            addPathData("M14.5 12.5l-5 5")
            addPathData("M9.5 12.5l5 5")
        }
        return _fileX!!
    }

private var _fileX: ImageVector? = null
