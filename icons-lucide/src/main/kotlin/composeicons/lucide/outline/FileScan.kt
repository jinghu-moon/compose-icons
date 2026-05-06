package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FileScan: ImageVector
    get() {
        if (_fileScan != null) return _fileScan!!
        _fileScan = lucideOutlineIcon(
            name = "FileScan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 10v-2c.001-.639-.253-1.253-.706-1.704L15.706 2.708C15.255 2.254 14.64 1.999 14 2h-8C4.895 2 4 2.895 4 4v16c0 1.105 .895 2 2 2h4.35")
            addPathData("M14 2v5c0 .552 .448 1 1 1h5")
            addPathData("M16 14c-1.105 0-2 .895-2 2")
            addPathData("M16 22c-1.105 0-2-.895-2-2")
            addPathData("M20 14c1.105 0 2 .895 2 2")
            addPathData("M20 22c1.105 0 2-.895 2-2")
        }
        return _fileScan!!
    }

private var _fileScan: ImageVector? = null
