package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.RussianRuble: ImageVector
    get() {
        if (_russianRuble != null) return _russianRuble!!
        _russianRuble = lucideOutlineIcon(
            name = "RussianRuble",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 11h8c2.209 0 4-1.791 4-4C18 4.791 16.209 3 14 3h-5v18")
            addPathData("M6 15h8")
        }
        return _russianRuble!!
    }

private var _russianRuble: ImageVector? = null
