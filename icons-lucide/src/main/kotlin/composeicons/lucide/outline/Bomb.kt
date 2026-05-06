package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Bomb: ImageVector
    get() {
        if (_bomb != null) return _bomb!!
        _bomb = lucideOutlineIcon(
            name = "Bomb",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 13c0 4.971-4.029 9-9 9C6.029 22 2 17.971 2 13 2 8.029 6.029 4 11 4c4.971 0 9 4.029 9 9Z")
            addPathData("M14.35 4.65 16.3 2.7c.94-.936 2.46-.936 3.4 0l1.6 1.6c.452 .45 .706 1.062 .706 1.7 0 .638-.254 1.25-.706 1.7L19.35 9.65")
            addPathData("M22 2 20.5 3.5")
        }
        return _bomb!!
    }

private var _bomb: ImageVector? = null
