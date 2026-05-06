package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Link2: ImageVector
    get() {
        if (_link2 != null) return _link2!!
        _link2 = lucideOutlineIcon(
            name = "Link2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 17h-2C4.239 17 2 14.761 2 12 2 9.239 4.239 7 7 7h2")
            addPathData("M15 7h2c2.761 0 5 2.239 5 5 0 2.761-2.239 5-5 5h-2")
            addPathData("M8 12h8")
        }
        return _link2!!
    }

private var _link2: ImageVector? = null
