package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ChessRook: ImageVector
    get() {
        if (_chessRook != null) return _chessRook!!
        _chessRook = tablerFilledIcon(
            name = "ChessRook",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.000 3.000 C 14.507 3.000 14.934 3.380 14.993 3.883 L 15.000 4.000 L 15.000 6.000 L 16.652 6.000 L 17.014 3.836 C 17.097 3.335 17.541 2.976 18.048 3.000 L 18.164 3.013 C 18.665 3.096 19.025 3.541 19.000 4.048 L 18.987 4.164 L 18.487 7.164 C 18.414 7.602 18.062 7.939 17.622 7.993 L 17.500 8.000 L 16.117 8.000 L 16.994 15.890 C 17.054 16.436 16.663 16.929 16.117 16.993 L 16.000 17.000 L 8.000 17.000 C 7.450 17.000 7.004 16.557 7.000 16.007 L 7.006 15.890 L 7.883 8.000 L 6.500 8.000 C 6.056 8.000 5.665 7.708 5.540 7.282 L 5.514 7.164 L 5.014 4.164 C 4.927 3.642 5.263 3.142 5.779 3.025 C 6.295 2.908 6.814 3.213 6.961 3.722 L 6.986 3.836 L 7.347 6.000 L 9.000 6.000 L 9.000 4.000 C 9.001 3.471 9.413 3.034 9.941 3.003 C 10.470 2.972 10.931 3.358 10.993 3.883 L 11.000 4.000 L 11.000 6.000 L 13.000 6.000 L 13.000 4.000 C 13.000 3.448 13.448 3.000 14.000 3.000 Z"),
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
        return _chessRook!!
    }

private var _chessRook: ImageVector? = null
