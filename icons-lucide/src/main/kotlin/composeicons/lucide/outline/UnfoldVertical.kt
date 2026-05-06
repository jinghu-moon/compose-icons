package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.UnfoldVertical: ImageVector
    get() {
        if (_unfoldVertical != null) return _unfoldVertical!!
        _unfoldVertical = lucideOutlineIcon(
            name = "UnfoldVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 22v-6")
            addPathData("M12 8v-6")
            addPathData("M4 12h-2")
            addPathData("M10 12h-2")
            addPathData("M16 12h-2")
            addPathData("M22 12h-2")
            addPathData("M15 19l-3 3L9 19")
            addPathData("M15 5 12 2 9 5")
        }
        return _unfoldVertical!!
    }

private var _unfoldVertical: ImageVector? = null
