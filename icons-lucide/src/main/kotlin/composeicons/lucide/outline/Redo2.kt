package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Redo2: ImageVector
    get() {
        if (_redo2 != null) return _redo2!!
        _redo2 = lucideOutlineIcon(
            name = "Redo2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 14 20 9 15 4")
            addPathData("M20 9h-10.5C6.462 9 4 11.462 4 14.5 4 17.538 6.462 20 9.5 20h3.5")
        }
        return _redo2!!
    }

private var _redo2: ImageVector? = null
