package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Computer: ImageVector
    get() {
        if (_computer != null) return _computer!!
        _computer = lucideOutlineIcon(
            name = "Computer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 2h10c1.105 0 2 .895 2 2v4c0 1.105-.895 2-2 2h-10C5.895 10 5 9.105 5 8v-4C5 2.895 5.895 2 7 2Z")
            addPathData("M4 14h16c1.105 0 2 .895 2 2v4c0 1.105-.895 2-2 2h-16C2.895 22 2 21.105 2 20v-4c0-1.105 .895-2 2-2Z")
            addPathData("M6 18h2")
            addPathData("M12 18h6")
        }
        return _computer!!
    }

private var _computer: ImageVector? = null
