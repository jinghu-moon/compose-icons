package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Martini: ImageVector
    get() {
        if (_martini != null) return _martini!!
        _martini = lucideOutlineIcon(
            name = "Martini",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 22h8")
            addPathData("M12 11v11")
            addPathData("M19 3l-7 8L5 3Z")
        }
        return _martini!!
    }

private var _martini: ImageVector? = null
