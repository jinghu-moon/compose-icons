package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Eraser: ImageVector
    get() {
        if (_eraser != null) return _eraser!!
        _eraser = lucideOutlineIcon(
            name = "Eraser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 21h-13c-.533 .001-1.044-.21-1.42-.587L2.586 16.414c-.781-.781-.781-2.047 0-2.828L12.586 3.586c.375-.375 .884-.586 1.414-.586 .531 0 1.039 .211 1.415 .586l5.999 6c.781 .781 .781 2.047 0 2.828L12.834 21")
            addPathData("M5.082 11.09l8.828 8.828")
        }
        return _eraser!!
    }

private var _eraser: ImageVector? = null
