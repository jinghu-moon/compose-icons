package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ChessKing: ImageVector
    get() {
        if (_chessKing != null) return _chessKing!!
        _chessKing = lucideOutlineIcon(
            name = "ChessKing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 20c0-1.105 .895-2 2-2h12c1.105 0 2 .895 2 2v1c0 .552-.448 1-1 1h-14C4.448 22 4 21.552 4 21Z")
            addPathData("M6.7 18l-1-1C4.35 15.682 3 14.09 3 12 3 9.258 5.208 7.027 7.95 7 9.534 7 10.65 7.455 12 8.818 13.35 7.455 14.466 7 16.05 7c2.742 .027 4.95 2.258 4.95 5 0 2.082-1.359 3.673-2.7 5l-1 1")
            addPathData("M10 4h4")
            addPathData("M12 2v6.818")
        }
        return _chessKing!!
    }

private var _chessKing: ImageVector? = null
