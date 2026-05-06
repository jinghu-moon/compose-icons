package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.WeightTilde: ImageVector
    get() {
        if (_weightTilde != null) return _weightTilde!!
        _weightTilde = lucideOutlineIcon(
            name = "WeightTilde",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6.5 8C5.611 8.009 4.834 8.604 4.594 9.46L2.1 18.5c-.153 .593-.026 1.223 .344 1.71 .37 .487 .944 .778 1.556 .79h16c.626-0 1.215-.293 1.593-.792 .378-.499 .501-1.146 .332-1.748L19.4 9.5C19.174 8.623 18.386 8.007 17.48 8Z")
            addPathData("M7.999 15c.472-.63 1.213-1 2-1 .787 0 1.528 .37 2 1 .472 .63 1.213 1 2 1 .787 0 1.528-.37 2-1")
            addPathData("M15 5c0 1.657-1.343 3-3 3C10.343 8 9 6.657 9 5 9 3.343 10.343 2 12 2c1.657 0 3 1.343 3 3Z")
        }
        return _weightTilde!!
    }

private var _weightTilde: ImageVector? = null
