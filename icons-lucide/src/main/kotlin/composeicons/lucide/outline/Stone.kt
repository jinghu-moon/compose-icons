package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Stone: ImageVector
    get() {
        if (_stone != null) return _stone!!
        _stone = lucideOutlineIcon(
            name = "Stone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11.264 2.205C9.375 1.575 7.31 2.43 6.42 4.211l-4 8c-.902 1.804-.319 3.998 1.359 5.117l6 4c1.344 .896 3.094 .896 4.438 0l6-4c1.5-1 2.146-2.881 1.576-4.592l-2-6C19.395 5.541 18.458 4.604 17.263 4.206Z")
            addPathData("M11.99 22 14 12l7.822 3.184")
            addPathData("M14 12 8.47 2.302")
        }
        return _stone!!
    }

private var _stone: ImageVector? = null
