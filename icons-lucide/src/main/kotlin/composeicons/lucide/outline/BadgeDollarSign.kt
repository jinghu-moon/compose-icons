package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BadgeDollarSign: ImageVector
    get() {
        if (_badgeDollarSign != null) return _badgeDollarSign!!
        _badgeDollarSign = lucideOutlineIcon(
            name = "BadgeDollarSign",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3.85 8.62C3.553 7.284 3.961 5.889 4.929 4.922 5.898 3.955 7.294 3.551 8.63 3.85 9.365 2.7 10.635 2.005 12 2.005c1.365 0 2.635 .696 3.37 1.845 1.338-.301 2.736 .105 3.706 1.074 .97 .97 1.375 2.368 1.074 3.706 1.15 .735 1.845 2.005 1.845 3.37 0 1.365-.696 2.635-1.845 3.37 .299 1.336-.105 2.732-1.072 3.701-.967 .969-2.362 1.376-3.698 1.079-.734 1.154-2.007 1.853-3.375 1.853-1.368 0-2.641-.699-3.375-1.853C7.294 20.449 5.898 20.045 4.929 19.078 3.961 18.111 3.553 16.716 3.85 15.38 2.691 14.647 1.989 13.371 1.989 12c0-1.371 .702-2.647 1.861-3.38Z")
            addPathData("M16 8h-6C8.895 8 8 8.895 8 10c0 1.105 .895 2 2 2h4c1.105 0 2 .895 2 2 0 1.105-.895 2-2 2h-6")
            addPathData("M12 18v-12")
        }
        return _badgeDollarSign!!
    }

private var _badgeDollarSign: ImageVector? = null
