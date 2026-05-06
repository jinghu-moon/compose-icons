package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ChevronsRight: ImageVector
    get() {
        if (_chevronsRight != null) return _chevronsRight!!
        _chevronsRight = lucideOutlineIcon(
            name = "ChevronsRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 17l5-5L6 7")
            addPathData("M13 17l5-5L13 7")
        }
        return _chevronsRight!!
    }

private var _chevronsRight: ImageVector? = null
