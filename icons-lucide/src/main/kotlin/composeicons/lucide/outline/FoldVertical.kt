package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FoldVertical: ImageVector
    get() {
        if (_foldVertical != null) return _foldVertical!!
        _foldVertical = lucideOutlineIcon(
            name = "FoldVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 22v-6")
            addPathData("M12 8v-6")
            addPathData("M4 12h-2")
            addPathData("M10 12h-2")
            addPathData("M16 12h-2")
            addPathData("M22 12h-2")
            addPathData("M15 19 12 16 9 19")
            addPathData("M15 5 12 8 9 5")
        }
        return _foldVertical!!
    }

private var _foldVertical: ImageVector? = null
