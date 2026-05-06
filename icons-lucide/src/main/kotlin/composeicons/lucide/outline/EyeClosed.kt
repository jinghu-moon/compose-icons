package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.EyeClosed: ImageVector
    get() {
        if (_eyeClosed != null) return _eyeClosed!!
        _eyeClosed = lucideOutlineIcon(
            name = "EyeClosed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 18l-.722-3.25")
            addPathData("M2 8c1.533 4.201 5.528 6.996 10 6.996 4.472 0 8.467-2.795 10-6.996")
            addPathData("M20 15 18.274 12.95")
            addPathData("M4 15 5.726 12.95")
            addPathData("M9 18l.722-3.25")
        }
        return _eyeClosed!!
    }

private var _eyeClosed: ImageVector? = null
