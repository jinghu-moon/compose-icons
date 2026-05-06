package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FileImage: ImageVector
    get() {
        if (_fileImage != null) return _fileImage!!
        _fileImage = lucideOutlineIcon(
            name = "FileImage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 22C4.895 22 4 21.105 4 20v-16C4 2.895 4.895 2 6 2h8c.639-.001 1.253 .253 1.704 .706l3.588 3.588c.454 .451 .709 1.066 .708 1.706v12c0 1.105-.895 2-2 2Z")
            addPathData("M14 2v5c0 .552 .448 1 1 1h5")
            addPathData("M12 12c0 1.105-.895 2-2 2C8.895 14 8 13.105 8 12c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
            addPathData("M20 17 18.704 15.704c-.941-.941-2.467-.941-3.408 0L9 22")
        }
        return _fileImage!!
    }

private var _fileImage: ImageVector? = null
