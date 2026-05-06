package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Undo2: ImageVector
    get() {
        if (_undo2 != null) return _undo2!!
        _undo2 = lucideOutlineIcon(
            name = "Undo2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 14 4 9 9 4")
            addPathData("M4 9h10.5C17.538 9 20 11.462 20 14.5 20 17.538 17.538 20 14.5 20h-3.5")
        }
        return _undo2!!
    }

private var _undo2: ImageVector? = null
