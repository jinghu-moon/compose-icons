package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MoveDiagonal2: ImageVector
    get() {
        if (_moveDiagonal2 != null) return _moveDiagonal2!!
        _moveDiagonal2 = lucideOutlineIcon(
            name = "MoveDiagonal2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 13v6h-6")
            addPathData("M5 11v-6h6")
            addPathData("M5 5 19 19")
        }
        return _moveDiagonal2!!
    }

private var _moveDiagonal2: ImageVector? = null
