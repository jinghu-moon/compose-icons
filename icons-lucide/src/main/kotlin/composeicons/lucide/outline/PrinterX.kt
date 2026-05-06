package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.PrinterX: ImageVector
    get() {
        if (_printerX != null) return _printerX!!
        _printerX = lucideOutlineIcon(
            name = "PrinterX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.531 22h-5.531C6.448 22 6 21.552 6 21v-6c0-.552 .448-1 1-1h6.377")
            addPathData("M16.5 16.5l5 5")
            addPathData("M16.5 21.5l5-5")
            addPathData("M6 18h-2C2.895 18 2 17.105 2 16v-5C2 9.895 2.895 9 4 9h16c1.105 0 2 .895 2 2v1.5")
            addPathData("M6 9v-6C6 2.448 6.448 2 7 2h10c.552 0 1 .448 1 1v6")
        }
        return _printerX!!
    }

private var _printerX: ImageVector? = null
