package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Calculator: ImageVector
    get() {
        if (_calculator != null) return _calculator!!
        _calculator = lucideOutlineIcon(
            name = "Calculator",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 2h12c1.105 0 2 .895 2 2v16c0 1.105-.895 2-2 2h-12C4.895 22 4 21.105 4 20v-16C4 2.895 4.895 2 6 2Z")
            addPathData("M8 6h8")
            addPathData("M16 14v4")
            addPathData("M16 10h.01")
            addPathData("M12 10h.01")
            addPathData("M8 10h.01")
            addPathData("M12 14h.01")
            addPathData("M8 14h.01")
            addPathData("M12 18h.01")
            addPathData("M8 18h.01")
        }
        return _calculator!!
    }

private var _calculator: ImageVector? = null
