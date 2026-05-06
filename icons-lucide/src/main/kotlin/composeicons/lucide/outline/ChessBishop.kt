package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ChessBishop: ImageVector
    get() {
        if (_chessBishop != null) return _chessBishop!!
        _chessBishop = lucideOutlineIcon(
            name = "ChessBishop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 20c0-1.105 .895-2 2-2h10c1.105 0 2 .895 2 2v1c0 .552-.448 1-1 1h-12C5.448 22 5 21.552 5 21Z")
            addPathData("M15 18c1.5-.615 3-2.461 3-4.923C18 8.769 14.5 4.462 12 2 9.5 4.462 6 8.77 6 13.077 6 15.539 7.5 17.385 9 18")
            addPathData("M16 7 13.5 9.5")
            addPathData("M9 2h6")
        }
        return _chessBishop!!
    }

private var _chessBishop: ImageVector? = null
