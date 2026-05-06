package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ExternalLink: ImageVector
    get() {
        if (_externalLink != null) return _externalLink!!
        _externalLink = lucideOutlineIcon(
            name = "ExternalLink",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 3h6v6")
            addPathData("M10 14 21 3")
            addPathData("M18 13v6c0 1.105-.895 2-2 2h-11C3.895 21 3 20.105 3 19v-11C3 6.895 3.895 6 5 6h6")
        }
        return _externalLink!!
    }

private var _externalLink: ImageVector? = null
