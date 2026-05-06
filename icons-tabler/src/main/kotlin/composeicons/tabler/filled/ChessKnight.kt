package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ChessKnight: ImageVector
    get() {
        if (_chessKnight != null) return _chessKnight!!
        _chessKnight = tablerFilledIcon(
            name = "ChessKnight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8.959 1.99l-.147 .028-.115 .029c-.255 .081-.467 .261-.589 .5-.121 .239-.142 .516-.057 .77l.749 2.245L5.985 7.297c-.94 .579-1.234 1.81-.655 2.751l.089 .133c.377 .515 .976 .819 1.614 .819l1.563-.001L6.982 15.673c-.106 .306-.057 .644 .13 .907 .188 .263 .491 .42 .815 .42h7.961c.544 0 .988-.434 1-.978L17 11.022C17 7.195 15.445 4.144 12.33 3.056L9.931 2.226 9.556 2.105 9.298 2.031 9.163 2 9.062 1.987 9.007 1.986l-.048 .003Z")
            addPathData("M18 18h-12c-.552 0-1 .448-1 1 0 1.105 .895 2 2 2h10c1.015 0 1.869-.76 1.987-1.768l.011-.174c.016-.275-.082-.544-.271-.744C18.538 18.114 18.275 18 18 18Z")
        }
        return _chessKnight!!
    }

private var _chessKnight: ImageVector? = null
