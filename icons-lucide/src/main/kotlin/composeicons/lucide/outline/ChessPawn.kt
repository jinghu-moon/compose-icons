package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ChessPawn: ImageVector
    get() {
        if (_chessPawn != null) return _chessPawn!!
        _chessPawn = lucideOutlineIcon(
            name = "ChessPawn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 20c0-1.105 .895-2 2-2h10c1.105 0 2 .895 2 2v1c0 .552-.448 1-1 1h-12C5.448 22 5 21.552 5 21Z")
            addPathData("M14.5 10 16 18")
            addPathData("M7 10h10")
            addPathData("M8 18 9.5 10")
            addPathData("M16 6c0 2.209-1.791 4-4 4C9.791 10 8 8.209 8 6 8 3.791 9.791 2 12 2c2.209 0 4 1.791 4 4Z")
        }
        return _chessPawn!!
    }

private var _chessPawn: ImageVector? = null
