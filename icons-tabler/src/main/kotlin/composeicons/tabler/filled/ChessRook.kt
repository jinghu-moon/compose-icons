package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ChessRook: ImageVector
    get() {
        if (_chessRook != null) return _chessRook!!
        _chessRook = tablerFilledIcon(
            name = "ChessRook",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 3c.507 0 .934 .38 .993 .883L15 4v2h1.652l.362-2.164c.083-.501 .527-.86 1.034-.836l.116 .013c.501 .083 .861 .528 .836 1.035l-.013 .116-.5 3c-.073 .438-.425 .775-.865 .829L17.5 8h-1.383l.877 7.89c.06 .546-.331 1.039-.877 1.103L16 17h-8c-.55 0-.996-.443-1-.993l.006-.117L7.883 8h-1.383c-.444 0-.835-.292-.96-.718L5.514 7.164l-.5-3C4.927 3.642 5.263 3.142 5.779 3.025c.516-.117 1.035 .188 1.182 .697l.025 .114L7.347 6h1.653v-2c.001-.529 .413-.966 .941-.997 .528-.031 .989 .355 1.052 .88L11 4v2h2v-2c0-.552 .448-1 1-1Z")
            addPathData("M18 18h-12c-.552 0-1 .448-1 1 0 1.105 .895 2 2 2h10c1.015 0 1.869-.76 1.987-1.768l.011-.174c.016-.275-.082-.544-.271-.744C18.538 18.114 18.275 18 18 18Z")
        }
        return _chessRook!!
    }

private var _chessRook: ImageVector? = null
