package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FileSearch: ImageVector
    get() {
        if (_fileSearch != null) return _fileSearch!!
        _fileSearch = lucideOutlineIcon(
            name = "FileSearch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 22C4.895 22 4 21.105 4 20v-16C4 2.895 4.895 2 6 2h8c.639-.001 1.253 .253 1.704 .706l3.588 3.588c.454 .451 .709 1.066 .708 1.706v12c0 1.105-.895 2-2 2Z")
            addPathData("M14 2v5c0 .552 .448 1 1 1h5")
            addPathData("M14 14.5C14 15.881 12.881 17 11.5 17 10.119 17 9 15.881 9 14.5 9 13.119 10.119 12 11.5 12 12.881 12 14 13.119 14 14.5Z")
            addPathData("M13.3 16.3 15 18")
        }
        return _fileSearch!!
    }

private var _fileSearch: ImageVector? = null
