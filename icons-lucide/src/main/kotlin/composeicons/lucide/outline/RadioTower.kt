package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.RadioTower: ImageVector
    get() {
        if (_radioTower != null) return _radioTower!!
        _radioTower = lucideOutlineIcon(
            name = "RadioTower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4.9 16.1C1 12.2 1 5.8 4.9 1.9")
            addPathData("M7.8 4.7C5.848 6.722 5.519 9.812 7 12.2")
            addPathData("M14 9c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
            addPathData("M16.2 4.8c2 2 2.26 5.11 .8 7.47")
            addPathData("M19.1 1.9c1.872 1.868 2.924 4.405 2.924 7.05 0 2.645-1.052 5.182-2.924 7.05")
            addPathData("M9.5 18h5")
            addPathData("M8 22 12 11l4 11")
        }
        return _radioTower!!
    }

private var _radioTower: ImageVector? = null
