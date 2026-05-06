package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Redo: ImageVector
    get() {
        if (_redo != null) return _redo!!
        _redo = lucideOutlineIcon(
            name = "Redo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 7v6h-6")
            addPathData("M3 17C3 12.029 7.029 8 12 8c2.215 .002 4.351 .821 6 2.3L21 13")
        }
        return _redo!!
    }

private var _redo: ImageVector? = null
