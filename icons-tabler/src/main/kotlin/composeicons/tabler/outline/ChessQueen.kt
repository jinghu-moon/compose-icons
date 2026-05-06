package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChessQueen: ImageVector
    get() {
        if (_chessQueen != null) return _chessQueen!!
        _chessQueen = tablerOutlineIcon(
            name = "ChessQueen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 16 18 5 14 9 12 4 10 9 6 5 8 16")
            addPathData("M8 16l-1.447 .724c-.339 .169-.553 .515-.553 .894v2.382h12v-2.382c-0-.379-.214-.725-.553-.894L16 16h-8")
            addPathData("M11 4c0 .552 .448 1 1 1 .552 0 1-.448 1-1C13 3.448 12.552 3 12 3c-.552 0-1 .448-1 1")
            addPathData("M5 5c0 .552 .448 1 1 1C6.552 6 7 5.552 7 5 7 4.448 6.552 4 6 4 5.448 4 5 4.448 5 5")
            addPathData("M17 5c0 .552 .448 1 1 1 .552 0 1-.448 1-1C19 4.448 18.552 4 18 4c-.552 0-1 .448-1 1")
        }
        return _chessQueen!!
    }

private var _chessQueen: ImageVector? = null
