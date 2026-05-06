package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.LaptopMinimal: ImageVector
    get() {
        if (_laptopMinimal != null) return _laptopMinimal!!
        _laptopMinimal = lucideOutlineIcon(
            name = "LaptopMinimal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 4h14c1.105 0 2 .895 2 2v8c0 1.105-.895 2-2 2h-14C3.895 16 3 15.105 3 14v-8C3 4.895 3.895 4 5 4Z")
            addPathData("M2 20h20")
        }
        return _laptopMinimal!!
    }

private var _laptopMinimal: ImageVector? = null
