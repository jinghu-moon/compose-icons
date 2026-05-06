package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Carrot: ImageVector
    get() {
        if (_carrot != null) return _carrot!!
        _carrot = lucideOutlineIcon(
            name = "Carrot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2.27 21.7c0 0 9.87-3.5 12.73-6.36 1.759-1.756 1.761-4.606 .005-6.365C13.249 7.216 10.399 7.214 8.64 8.97 5.77 11.84 2.27 21.7 2.27 21.7ZM8.64 14 6.59 11.96 15.34 15 12.88 12.54")
            addPathData("M22 9C22 9 20.67 7 18.5 7 16.86 7 15 9 15 9c0 0 1.33 2 3.5 2C20.67 11 22 9 22 9Z")
            addPathData("M15 2c0 0-2 1.33-2 3.5C13 7.67 15 9 15 9c0 0 2-1.84 2-3.5C17 3.33 15 2 15 2Z")
        }
        return _carrot!!
    }

private var _carrot: ImageVector? = null
