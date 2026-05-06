package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Balloon: ImageVector
    get() {
        if (_balloon != null) return _balloon!!
        _balloon = lucideOutlineIcon(
            name = "Balloon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 16v1c0 1.105 .895 2 2 2h1c1.105 0 2 .895 2 2v1")
            addPathData("M12 6c1.105 0 2 .895 2 2")
            addPathData("M18 8c0 4-3.5 8-6 8C9.5 16 6 12 6 8 6 4.686 8.686 2 12 2c3.314 0 6 2.686 6 6")
        }
        return _balloon!!
    }

private var _balloon: ImageVector? = null
