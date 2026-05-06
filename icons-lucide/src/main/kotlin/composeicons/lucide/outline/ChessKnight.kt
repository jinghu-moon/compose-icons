package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ChessKnight: ImageVector
    get() {
        if (_chessKnight != null) return _chessKnight!!
        _chessKnight = lucideOutlineIcon(
            name = "ChessKnight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 20c0-1.105 .895-2 2-2h10c1.105 0 2 .895 2 2v1c0 .552-.448 1-1 1h-12C5.448 22 5 21.552 5 21Z")
            addPathData("M16.5 18C17.5 16 19 13 19 9 19 5.134 15.866 2 12 2h-5.365c-.388 0-.741 .225-.905 .576-.165 .351-.111 .766 .137 1.064L7 5 4.68 10.802c-.385 .961 .027 2.057 .95 2.526l2.87 1.456")
            addPathData("M15 5 16.425 3.575")
            addPathData("M17 8 18.53 6.47")
            addPathData("M9.713 12.185 7 18")
        }
        return _chessKnight!!
    }

private var _chessKnight: ImageVector? = null
