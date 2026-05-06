package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Scissors: ImageVector
    get() {
        if (_scissors != null) return _scissors!!
        _scissors = lucideOutlineIcon(
            name = "Scissors",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 6C9 7.657 7.657 9 6 9 4.343 9 3 7.657 3 6 3 4.343 4.343 3 6 3 7.657 3 9 4.343 9 6Z")
            addPathData("M8.12 8.12 12 12")
            addPathData("M20 4 8.12 15.88")
            addPathData("M9 18c0 1.657-1.343 3-3 3C4.343 21 3 19.657 3 18 3 16.343 4.343 15 6 15c1.657 0 3 1.343 3 3Z")
            addPathData("M14.8 14.8 20 20")
        }
        return _scissors!!
    }

private var _scissors: ImageVector? = null
