package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.LaptopMinimalCheck: ImageVector
    get() {
        if (_laptopMinimalCheck != null) return _laptopMinimalCheck!!
        _laptopMinimalCheck = lucideOutlineIcon(
            name = "LaptopMinimalCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 20h20")
            addPathData("M9 10l2 2L15 8")
            addPathData("M5 4h14c1.105 0 2 .895 2 2v8c0 1.105-.895 2-2 2h-14C3.895 16 3 15.105 3 14v-8C3 4.895 3.895 4 5 4Z")
        }
        return _laptopMinimalCheck!!
    }

private var _laptopMinimalCheck: ImageVector? = null
