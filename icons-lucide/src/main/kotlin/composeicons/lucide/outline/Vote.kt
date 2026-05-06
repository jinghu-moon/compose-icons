package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Vote: ImageVector
    get() {
        if (_vote != null) return _vote!!
        _vote = lucideOutlineIcon(
            name = "Vote",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 12l2 2 4-4")
            addPathData("M5 7C5 5.9 5.9 5 7 5h10c1.105 0 2 .895 2 2v12h-14v-12Z")
            addPathData("M22 19h-20")
        }
        return _vote!!
    }

private var _vote: ImageVector? = null
