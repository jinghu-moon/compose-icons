package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ChessRook: ImageVector
    get() {
        if (_chessRook != null) return _chessRook!!
        _chessRook = lucideOutlineIcon(
            name = "ChessRook",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 20c0-1.105 .895-2 2-2h10c1.105 0 2 .895 2 2v1c0 .552-.448 1-1 1h-12C5.448 22 5 21.552 5 21Z")
            addPathData("M10 2v2")
            addPathData("M14 2v2")
            addPathData("M17 18 16 9")
            addPathData("M6 2v5c0 1.105 .895 2 2 2h8c1.105 0 2-.895 2-2v-5")
            addPathData("M6 4h12")
            addPathData("M7 18 8 9")
        }
        return _chessRook!!
    }

private var _chessRook: ImageVector? = null
