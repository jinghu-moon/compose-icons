package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Birdhouse: ImageVector
    get() {
        if (_birdhouse != null) return _birdhouse!!
        _birdhouse = lucideOutlineIcon(
            name = "Birdhouse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 18v4")
            addPathData("M17 18 18.956 6.532")
            addPathData("M3 8 10.82 2.385c.703-.514 1.657-.514 2.36 0L21 8")
            addPathData("M4 18h16")
            addPathData("M7 18 5.044 6.532")
            addPathData("M14 10c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
        }
        return _birdhouse!!
    }

private var _birdhouse: ImageVector? = null
