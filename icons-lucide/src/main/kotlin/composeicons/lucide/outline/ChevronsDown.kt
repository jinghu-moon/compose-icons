package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ChevronsDown: ImageVector
    get() {
        if (_chevronsDown != null) return _chevronsDown!!
        _chevronsDown = lucideOutlineIcon(
            name = "ChevronsDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 6l5 5L17 6")
            addPathData("M7 13l5 5 5-5")
        }
        return _chevronsDown!!
    }

private var _chevronsDown: ImageVector? = null
