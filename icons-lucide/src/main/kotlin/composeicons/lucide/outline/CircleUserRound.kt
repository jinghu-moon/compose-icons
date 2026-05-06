package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CircleUserRound: ImageVector
    get() {
        if (_circleUserRound != null) return _circleUserRound!!
        _circleUserRound = lucideOutlineIcon(
            name = "CircleUserRound",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17.925 20.056c-.464-2.913-2.976-5.057-5.926-5.057-2.95 0-5.462 2.145-5.925 5.058")
            addPathData("M16 11c0 2.209-1.791 4-4 4C9.791 15 8 13.209 8 11 8 8.791 9.791 7 12 7c2.209 0 4 1.791 4 4Z")
            addPathData("M22 12c0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2c5.523 0 10 4.477 10 10Z")
        }
        return _circleUserRound!!
    }

private var _circleUserRound: ImageVector? = null
