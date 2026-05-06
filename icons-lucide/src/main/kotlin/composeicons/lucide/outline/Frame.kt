package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Frame: ImageVector
    get() {
        if (_frame != null) return _frame!!
        _frame = lucideOutlineIcon(
            name = "Frame",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M22 6h-20")
            addPathData("M22 18h-20")
            addPathData("M6 2v20")
            addPathData("M18 2v20")
        }
        return _frame!!
    }

private var _frame: ImageVector? = null
