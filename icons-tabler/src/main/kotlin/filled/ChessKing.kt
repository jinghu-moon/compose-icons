package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
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
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 12.507 2.000 12.934 2.380 12.993 2.883 L 13.000 3.000 L 13.000 5.000 L 15.000 5.000 C 15.529 5.001 15.966 5.413 15.997 5.941 C 16.028 6.470 15.642 6.931 15.117 6.993 L 15.000 7.000 L 13.000 7.000 L 13.000 8.758 C 13.608 8.351 14.306 8.099 15.033 8.024 L 15.273 8.006 L 15.500 8.000 C 17.985 8.000 20.000 10.015 20.000 12.500 C 19.998 14.815 18.240 16.752 15.936 16.978 L 15.719 16.994 L 15.500 17.000 L 8.500 17.000 C 6.572 17.000 4.858 15.772 4.239 13.946 C 3.619 12.120 4.231 10.103 5.761 8.929 C 7.291 7.756 9.398 7.687 11.001 8.759 L 11.000 7.000 L 9.000 7.000 C 8.471 6.999 8.034 6.587 8.003 6.059 C 7.972 5.530 8.358 5.069 8.883 5.007 L 9.000 5.000 L 11.000 5.000 L 11.000 3.000 C 11.000 2.448 11.448 2.000 12.000 2.000 Z"),
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
        return _chessKing!!
    }

private var _chessKing: ImageVector? = null
