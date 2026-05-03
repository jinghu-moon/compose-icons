package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ChessKnight: ImageVector
    get() {
        if (_chessKnight != null) return _chessKnight!!
        _chessKnight = tablerFilledIcon(
            name = "ChessKnight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 8.959 1.990 L 8.812 2.018 L 8.697 2.047 C 8.442 2.128 8.230 2.308 8.108 2.547 C 7.987 2.786 7.966 3.063 8.051 3.317 L 8.800 5.562 L 5.985 7.297 C 5.045 7.876 4.751 9.107 5.330 10.048 L 5.419 10.181 C 5.796 10.696 6.395 11.000 7.033 11.000 L 8.596 10.999 L 6.982 15.673 C 6.876 15.979 6.925 16.317 7.112 16.580 C 7.300 16.844 7.604 17.000 7.927 17.000 L 15.888 17.000 C 16.432 17.000 16.876 16.566 16.888 16.022 L 17.000 11.022 C 17.000 7.195 15.445 4.144 12.330 3.056 L 9.931 2.226 L 9.556 2.105 L 9.298 2.031 L 9.163 2.000 L 9.062 1.987 L 9.007 1.986 L 8.959 1.989 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
    addPath(
        pathData = parseSvgPathData("M 18.000 18.000 L 6.000 18.000 C 5.448 18.000 5.000 18.448 5.000 19.000 C 5.000 20.105 5.895 21.000 7.000 21.000 L 17.000 21.000 C 18.015 21.000 18.869 20.240 18.987 19.232 L 18.998 19.058 C 19.014 18.783 18.916 18.514 18.727 18.314 C 18.538 18.114 18.275 18.000 18.000 18.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _chessKnight!!
    }

private var _chessKnight: ImageVector? = null
