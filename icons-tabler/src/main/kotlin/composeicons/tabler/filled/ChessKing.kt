package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ChessKing: ImageVector
    get() {
        if (_chessKing != null) return _chessKing!!
        _chessKing = tablerFilledIcon(
            name = "ChessKing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 2c.507 0 .934 .38 .993 .883L13 3v2h2c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052L15 7h-2v1.758c.608-.407 1.306-.659 2.033-.734l.24-.018L15.5 8C17.985 8 20 10.015 20 12.5c-.002 2.315-1.76 4.252-4.064 4.478l-.217 .016L15.5 17h-7C6.572 17 4.858 15.772 4.239 13.946 3.619 12.12 4.231 10.103 5.761 8.929 7.291 7.756 9.398 7.687 11.001 8.759L11 7h-2C8.471 6.999 8.034 6.587 8.003 6.059c-.031-.528 .355-.989 .88-1.052L9 5h2v-2c0-.552 .448-1 1-1Z")
            addPathData("M18 18h-12c-.552 0-1 .448-1 1 0 1.105 .895 2 2 2h10c1.015 0 1.869-.76 1.987-1.768l.011-.174c.016-.275-.082-.544-.271-.744C18.538 18.114 18.275 18 18 18Z")
        }
        return _chessKing!!
    }

private var _chessKing: ImageVector? = null
