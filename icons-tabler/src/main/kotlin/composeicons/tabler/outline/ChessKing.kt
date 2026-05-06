package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChessKing: ImageVector
    get() {
        if (_chessKing != null) return _chessKing!!
        _chessKing = tablerOutlineIcon(
            name = "ChessKing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 16l-1.447 .724c-.339 .169-.553 .515-.553 .894v2.382h12v-2.382c-0-.379-.214-.725-.553-.894L16 16h-8")
            addPathData("M8.5 16C6.766 16 5.294 14.73 5.039 13.014 4.784 11.299 5.823 9.656 7.482 9.151c1.659-.505 3.437 .282 4.181 1.849h.674c.743-1.567 2.522-2.353 4.181-1.849 1.659 .505 2.699 2.148 2.444 3.863-.255 1.715-1.727 2.985-3.461 2.986h-7")
            addPathData("M9 6h6")
            addPathData("M12 3v8")
        }
        return _chessKing!!
    }

private var _chessKing: ImageVector? = null
