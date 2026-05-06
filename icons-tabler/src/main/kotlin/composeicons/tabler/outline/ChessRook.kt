package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChessRook: ImageVector
    get() {
        if (_chessRook != null) return _chessRook!!
        _chessRook = tablerOutlineIcon(
            name = "ChessRook",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 16l-1.447 .724c-.339 .169-.553 .515-.553 .894v2.382h12v-2.382c-0-.379-.214-.725-.553-.894L16 16h-8")
            addPathData("M8 16 9 7h6l1 9")
            addPathData("M6 4l.5 3h11L18 4")
            addPathData("M10 4v3")
            addPathData("M14 4v3")
        }
        return _chessRook!!
    }

private var _chessRook: ImageVector? = null
