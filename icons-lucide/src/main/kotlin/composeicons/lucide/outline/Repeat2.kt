package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Repeat2: ImageVector
    get() {
        if (_repeat2 != null) return _repeat2!!
        _repeat2 = lucideOutlineIcon(
            name = "Repeat2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 9 5 6 8 9")
            addPathData("M13 18h-6C5.895 18 5 17.105 5 16v-10")
            addPathData("M22 15l-3 3L16 15")
            addPathData("M11 6h6c1.105 0 2 .895 2 2v10")
        }
        return _repeat2!!
    }

private var _repeat2: ImageVector? = null
