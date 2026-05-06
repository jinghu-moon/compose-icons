package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SquareUserRound: ImageVector
    get() {
        if (_squareUserRound != null) return _squareUserRound!!
        _squareUserRound = lucideOutlineIcon(
            name = "SquareUserRound",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 21c0-3.314-2.686-6-6-6C8.686 15 6 17.686 6 21")
            addPathData("M16 11c0 2.209-1.791 4-4 4C9.791 15 8 13.209 8 11 8 8.791 9.791 7 12 7c2.209 0 4 1.791 4 4Z")
            addPathData("M5 3h14c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2h-14C3.895 21 3 20.105 3 19v-14C3 3.895 3.895 3 5 3Z")
        }
        return _squareUserRound!!
    }

private var _squareUserRound: ImageVector? = null
