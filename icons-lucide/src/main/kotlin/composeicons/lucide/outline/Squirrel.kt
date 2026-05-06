package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Squirrel: ImageVector
    get() {
        if (_squirrel != null) return _squirrel!!
        _squirrel = lucideOutlineIcon(
            name = "Squirrel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15.236 22c.784-.877 .984-2.131 .51-3.208C15.272 17.715 14.213 17.014 13.036 17")
            addPathData("M16 20c0-1.657 1.343-3 3-3h1c1.105 0 2-.895 2-2v-2C22 10.791 20.209 9 18 9v-5")
            addPathData("M18 13h.01")
            addPathData("M18 6c-2.209 0-4 1.791-4 4-3.866 0-7 3.134-7 7C7 12 11 12 11 6.5 11 4.015 8.985 2 6.5 2 4.015 2 2 4.015 2 6.5 2 7.881 3.119 9 4.5 9 5.881 9 7 7.881 7 6.5 7 10 3 11 3 17c0 2.8 2.2 5 5 5h10")
        }
        return _squirrel!!
    }

private var _squirrel: ImageVector? = null
