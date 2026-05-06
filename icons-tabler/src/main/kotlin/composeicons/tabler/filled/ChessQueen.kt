package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ChessQueen: ImageVector
    get() {
        if (_chessQueen != null) return _chessQueen!!
        _chessQueen = tablerFilledIcon(
            name = "ChessQueen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 2c.766 0 1.464 .437 1.799 1.126 .335 .689 .247 1.508-.227 2.11l.793 1.983L16.067 5.517c-.159-.601-.031-1.241 .347-1.734C16.793 3.29 17.379 3.001 18 3c.974-.001 1.807 .699 1.973 1.658 .166 .959-.382 1.899-1.299 2.226l-1.69 9.295c-.079 .432-.429 .762-.865 .814L16 17h-8c-.439 0-.827-.286-.956-.705l-.028-.116L5.326 6.884C4.307 6.519 3.763 5.408 4.1 4.379 4.437 3.35 5.532 2.776 6.57 3.084c1.038 .308 1.642 1.387 1.363 2.433L9.634 7.219l.794-1.983C9.955 4.634 9.867 3.815 10.201 3.126 10.536 2.437 11.234 2 12 2Z")
            addPathData("M18 18h-12c-.552 0-1 .448-1 1 0 1.105 .895 2 2 2h10c1.015 0 1.869-.76 1.987-1.768l.011-.174c.016-.275-.082-.544-.271-.744C18.538 18.114 18.275 18 18 18Z")
        }
        return _chessQueen!!
    }

private var _chessQueen: ImageVector? = null
