package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Percent: ImageVector
    get() {
        if (_percent != null) return _percent!!
        _percent = lucideOutlineIcon(
            name = "Percent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 5 5 19")
            addPathData("M9 6.5C9 7.881 7.881 9 6.5 9 5.119 9 4 7.881 4 6.5 4 5.119 5.119 4 6.5 4 7.881 4 9 5.119 9 6.5Z")
            addPathData("M20 17.5C20 18.881 18.881 20 17.5 20 16.119 20 15 18.881 15 17.5 15 16.119 16.119 15 17.5 15 18.881 15 20 16.119 20 17.5Z")
        }
        return _percent!!
    }

private var _percent: ImageVector? = null
