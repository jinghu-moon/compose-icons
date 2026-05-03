package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ChessBishop: ImageVector
    get() {
        if (_chessBishop != null) return _chessBishop!!
        _chessBishop = tablerFilledIcon(
            name = "ChessBishop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 12.816 2.000 13.551 2.496 13.855 3.253 C 14.160 4.010 13.974 4.876 13.386 5.442 C 14.032 5.722 14.612 6.062 15.126 6.459 L 11.293 10.293 L 11.210 10.387 C 10.901 10.785 10.937 11.351 11.293 11.707 C 11.649 12.063 12.215 12.099 12.613 11.790 L 12.707 11.707 L 16.521 7.894 C 17.498 9.244 18.000 10.964 18.000 13.000 C 18.000 14.913 16.822 16.722 14.911 16.973 L 14.711 16.993 L 14.500 17.000 L 9.500 17.000 C 7.374 17.000 6.000 15.076 6.000 13.000 C 6.000 9.320 7.570 6.745 10.613 5.440 C 10.026 4.874 9.841 4.008 10.146 3.252 C 10.451 2.496 11.185 2.000 12.000 2.000 Z"),
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
        pathData = parseSvgPathData("M 12.000 5.000 L 12.000 6.000"),
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
        return _chessBishop!!
    }

private var _chessBishop: ImageVector? = null
