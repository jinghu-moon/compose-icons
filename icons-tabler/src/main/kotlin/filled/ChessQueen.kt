package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
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
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 12.766 2.000 13.464 2.437 13.799 3.126 C 14.133 3.815 14.045 4.634 13.572 5.236 L 14.365 7.219 L 16.067 5.517 C 15.908 4.916 16.036 4.276 16.414 3.783 C 16.793 3.290 17.379 3.001 18.000 3.000 C 18.974 2.999 19.807 3.699 19.973 4.658 C 20.140 5.617 19.591 6.557 18.674 6.884 L 16.984 16.179 C 16.905 16.611 16.555 16.941 16.119 16.993 L 16.000 17.000 L 8.000 17.000 C 7.561 17.000 7.173 16.714 7.044 16.295 L 7.016 16.179 L 5.326 6.884 C 4.307 6.519 3.763 5.408 4.100 4.379 C 4.437 3.350 5.532 2.776 6.570 3.084 C 7.608 3.392 8.212 4.471 7.933 5.517 L 9.634 7.219 L 10.428 5.236 C 9.955 4.634 9.867 3.815 10.201 3.126 C 10.536 2.437 11.234 2.000 12.000 2.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 18.000 18.000 L 6.000 18.000 C 5.448 18.000 5.000 18.448 5.000 19.000 C 5.000 20.105 5.895 21.000 7.000 21.000 L 17.000 21.000 C 18.015 21.000 18.869 20.240 18.987 19.232 L 18.998 19.058 C 19.014 18.783 18.916 18.514 18.727 18.314 C 18.538 18.114 18.275 18.000 18.000 18.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _chessQueen!!
    }

private var _chessQueen: ImageVector? = null
