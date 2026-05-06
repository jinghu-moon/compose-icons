package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.PcCase: ImageVector
    get() {
        if (_pcCase != null) return _pcCase!!
        _pcCase = lucideOutlineIcon(
            name = "PcCase",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 2h10c1.105 0 2 .895 2 2v16c0 1.105-.895 2-2 2h-10C5.895 22 5 21.105 5 20v-16C5 2.895 5.895 2 7 2Z")
            addPathData("M15 14h.01")
            addPathData("M9 6h6")
            addPathData("M9 10h6")
        }
        return _pcCase!!
    }

private var _pcCase: ImageVector? = null
