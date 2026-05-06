package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.AlignCenterVertical: ImageVector
    get() {
        if (_alignCenterVertical != null) return _alignCenterVertical!!
        _alignCenterVertical = lucideOutlineIcon(
            name = "AlignCenterVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 2v20")
            addPathData("M8 10h-4C2.895 10 2 9.105 2 8v-2C2 4.9 2.9 4 4 4h4")
            addPathData("M16 10h4c1.105 0 2-.895 2-2v-2C22 4.895 21.105 4 20 4h-4")
            addPathData("M8 20h-1C5.895 20 5 19.105 5 18v-2c0-1.1 .9-2 2-2h1")
            addPathData("M16 14h1c1.105 0 2 .895 2 2v2c0 1.105-.895 2-2 2h-1")
        }
        return _alignCenterVertical!!
    }

private var _alignCenterVertical: ImageVector? = null
