package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CornerLeftDown: ImageVector
    get() {
        if (_cornerLeftDown != null) return _cornerLeftDown!!
        _cornerLeftDown = lucideOutlineIcon(
            name = "CornerLeftDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 15 9 20 4 15")
            addPathData("M20 4h-7C10.791 4 9 5.791 9 8v12")
        }
        return _cornerLeftDown!!
    }

private var _cornerLeftDown: ImageVector? = null
