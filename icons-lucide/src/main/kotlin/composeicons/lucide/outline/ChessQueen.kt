package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ChessQueen: ImageVector
    get() {
        if (_chessQueen != null) return _chessQueen!!
        _chessQueen = lucideOutlineIcon(
            name = "ChessQueen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 20c0-1.105 .895-2 2-2h12c1.105 0 2 .895 2 2v1c0 .552-.448 1-1 1h-14C4.448 22 4 21.552 4 21Z")
            addPathData("M12.474 5.943l1.567 5.34c.107 .36 .406 .63 .775 .699 .369 .069 .746-.074 .975-.371L18.407 8.209")
            addPathData("M20 9l-3 9")
            addPathData("M5.594 8.209l2.615 3.403c.23 .297 .607 .44 .976 .371 .369-.069 .668-.34 .774-.7L11.526 5.943")
            addPathData("M7 18 4 9")
            addPathData("M14 4c0 1.105-.895 2-2 2C10.895 6 10 5.105 10 4c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
            addPathData("M22 7c0 1.105-.895 2-2 2C18.895 9 18 8.105 18 7c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
            addPathData("M6 7C6 8.105 5.105 9 4 9 2.895 9 2 8.105 2 7 2 5.895 2.895 5 4 5c1.105 0 2 .895 2 2Z")
        }
        return _chessQueen!!
    }

private var _chessQueen: ImageVector? = null
