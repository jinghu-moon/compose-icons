package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BanknoteArrowDown: ImageVector
    get() {
        if (_banknoteArrowDown != null) return _banknoteArrowDown!!
        _banknoteArrowDown = lucideOutlineIcon(
            name = "BanknoteArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 18h-8C2.895 18 2 17.105 2 16v-8C2 6.895 2.895 6 4 6h16c1.105 0 2 .895 2 2v5")
            addPathData("M16 19l3 3 3-3")
            addPathData("M18 12h.01")
            addPathData("M19 16v6")
            addPathData("M6 12h.01")
            addPathData("M14 12c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
        }
        return _banknoteArrowDown!!
    }

private var _banknoteArrowDown: ImageVector? = null
