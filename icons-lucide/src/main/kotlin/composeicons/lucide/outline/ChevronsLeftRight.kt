package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ChevronsLeftRight: ImageVector
    get() {
        if (_chevronsLeftRight != null) return _chevronsLeftRight!!
        _chevronsLeftRight = lucideOutlineIcon(
            name = "ChevronsLeftRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 7 4 12l5 5")
            addPathData("M15 7l5 5-5 5")
        }
        return _chevronsLeftRight!!
    }

private var _chevronsLeftRight: ImageVector? = null
