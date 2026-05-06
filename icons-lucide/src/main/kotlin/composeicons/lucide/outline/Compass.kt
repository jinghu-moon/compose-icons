package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Compass: ImageVector
    get() {
        if (_compass != null) return _compass!!
        _compass = lucideOutlineIcon(
            name = "Compass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M22 12c0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2c5.523 0 10 4.477 10 10Z")
            addPathData("M16.24 7.76l-1.804 5.411c-.199 .597-.668 1.066-1.265 1.265L7.76 16.24 9.564 10.829c.199-.597 .668-1.066 1.265-1.265Z")
        }
        return _compass!!
    }

private var _compass: ImageVector? = null
