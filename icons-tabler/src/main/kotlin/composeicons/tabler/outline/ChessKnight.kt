package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChessKnight: ImageVector
    get() {
        if (_chessKnight != null) return _chessKnight!!
        _chessKnight = tablerOutlineIcon(
            name = "ChessKnight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 16l-1.447 .724c-.339 .169-.553 .515-.553 .894v2.382h12v-2.382c-0-.379-.214-.725-.553-.894L16 16h-8")
            addPathData("M9 3l1 3L6.509 8.148c-.381 .234-.561 .694-.439 1.124 .122 .431 .515 .728 .963 .728h2.967L7.927 16h7.961L16 11C16 8 14.91 5.017 12 4 10.06 3.322 9.06 2.989 9 3")
        }
        return _chessKnight!!
    }

private var _chessKnight: ImageVector? = null
