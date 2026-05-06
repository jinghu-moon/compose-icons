package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MoveDiagonal: ImageVector
    get() {
        if (_moveDiagonal != null) return _moveDiagonal!!
        _moveDiagonal = lucideOutlineIcon(
            name = "MoveDiagonal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 19h-6v-6")
            addPathData("M13 5h6v6")
            addPathData("M19 5 5 19")
        }
        return _moveDiagonal!!
    }

private var _moveDiagonal: ImageVector? = null
