package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ChevronsRightLeft: ImageVector
    get() {
        if (_chevronsRightLeft != null) return _chevronsRightLeft!!
        _chevronsRightLeft = lucideOutlineIcon(
            name = "ChevronsRightLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 17 15 12 20 7")
            addPathData("M4 17 9 12 4 7")
        }
        return _chevronsRightLeft!!
    }

private var _chevronsRightLeft: ImageVector? = null
