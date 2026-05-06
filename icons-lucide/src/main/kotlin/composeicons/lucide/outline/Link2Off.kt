package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Link2Off: ImageVector
    get() {
        if (_link2Off != null) return _link2Off!!
        _link2Off = lucideOutlineIcon(
            name = "Link2Off",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 17h-2C4.239 17 2 14.761 2 12 2 9.239 4.239 7 7 7")
            addPathData("M15 7h2c1.894 0 3.625 1.07 4.472 2.764 .847 1.694 .664 3.721-.472 5.236")
            addPathData("M8 12h4")
            addPathData("M2 2 22 22")
        }
        return _link2Off!!
    }

private var _link2Off: ImageVector? = null
