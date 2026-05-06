package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ChevronsUp: ImageVector
    get() {
        if (_chevronsUp != null) return _chevronsUp!!
        _chevronsUp = lucideOutlineIcon(
            name = "ChevronsUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 11 12 6 7 11")
            addPathData("M17 18 12 13 7 18")
        }
        return _chevronsUp!!
    }

private var _chevronsUp: ImageVector? = null
