package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ChessLine: ImageVector
    get() {
        if (_chessLine != null) return _chessLine!!
        _chessLine = remixIcon(
            name = "ChessLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.500 0.287 C 14.809 0.573 14.141 0.903 13.500 1.275 C 8.419 4.214 5.000 9.708 5.000 16.000 L 4.000 16.000 L 4.000 20.000 L 3.000 20.000 L 3.000 22.000 L 20.000 22.000 L 20.000 20.000 L 19.000 20.000 L 19.000 16.000 L 17.808 16.000 C 17.658 15.316 17.413 14.701 17.049 14.150 C 16.482 13.292 15.627 12.588 14.390 12.019 C 14.259 11.959 14.127 11.902 13.995 11.847 C 13.880 11.800 13.848 11.652 13.936 11.565 C 13.990 11.510 14.057 11.512 14.127 11.526 L 15.880 11.876 L 18.293 12.359 C 18.715 12.443 19.144 12.248 19.358 11.874 L 20.653 9.608 C 20.861 9.243 20.819 8.787 20.548 8.466 L 15.500 2.500 L 15.500 0.287 ZM 17.000 20.000 L 6.000 20.000 L 6.000 18.000 L 17.000 18.000 L 17.000 20.000 ZM 7.000 16.000 C 7.000 10.779 9.668 6.178 13.719 3.491 L 18.569 9.223 L 17.979 10.256 L 14.482 9.557 C 13.770 9.415 13.035 9.637 12.522 10.150 C 11.389 11.283 11.846 13.127 13.234 13.697 C 14.481 14.210 15.094 14.779 15.436 15.339 C 15.553 15.532 15.654 15.750 15.738 16.000 L 7.000 16.000 ZM 14.000 8.000 C 14.552 8.000 15.000 7.552 15.000 7.000 C 15.000 6.448 14.552 6.000 14.000 6.000 C 13.448 6.000 13.000 6.448 13.000 7.000 C 13.000 7.552 13.448 8.000 14.000 8.000 Z"),
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
        return _chessLine!!
    }

private var _chessLine: ImageVector? = null
