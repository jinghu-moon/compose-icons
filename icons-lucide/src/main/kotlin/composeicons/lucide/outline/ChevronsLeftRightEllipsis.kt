package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ChevronsLeftRightEllipsis: ImageVector
    get() {
        if (_chevronsLeftRightEllipsis != null) return _chevronsLeftRightEllipsis!!
        _chevronsLeftRightEllipsis = lucideOutlineIcon(
            name = "ChevronsLeftRightEllipsis",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 12h.01")
            addPathData("M16 12h.01")
            addPathData("M17 7l5 5-5 5")
            addPathData("M7 7 2 12l5 5")
            addPathData("M8 12h.01")
        }
        return _chevronsLeftRightEllipsis!!
    }

private var _chevronsLeftRightEllipsis: ImageVector? = null
