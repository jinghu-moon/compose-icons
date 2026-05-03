package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ExchangeCnyLine: ImageVector
    get() {
        if (_exchangeCnyLine != null) return _exchangeCnyLine!!
        _exchangeCnyLine = remixIcon(
            name = "ExchangeCnyLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.379 15.106 C 20.926 11.442 19.537 7.114 16.004 5.075 C 13.451 3.600 10.423 3.694 8.035 5.056 L 7.042 3.319 C 10.028 1.616 13.813 1.500 17.004 3.342 C 21.495 5.935 23.214 11.485 21.122 16.112 L 22.463 16.887 L 18.298 19.101 L 18.133 14.387 L 19.379 15.106 ZM 4.630 8.900 C 3.083 12.563 4.471 16.891 8.004 18.931 C 10.557 20.405 13.585 20.312 15.974 18.950 L 16.966 20.687 C 13.980 22.389 10.196 22.506 7.004 20.663 C 2.514 18.070 0.795 12.521 2.887 7.893 L 1.545 7.119 L 5.710 4.905 L 5.875 9.619 L 4.630 8.900 ZM 13.004 13.538 L 16.004 13.538 L 16.004 15.538 L 13.004 15.538 L 13.004 17.538 L 11.004 17.538 L 11.004 15.538 L 8.004 15.538 L 8.004 13.538 L 11.004 13.538 L 11.004 12.538 L 8.004 12.538 L 8.004 10.538 L 10.590 10.538 L 8.469 8.417 L 9.883 7.003 L 12.004 9.124 L 14.125 7.003 L 15.540 8.417 L 13.418 10.538 L 16.004 10.538 L 16.004 12.538 L 13.004 12.538 L 13.004 13.538 Z"),
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
        return _exchangeCnyLine!!
    }

private var _exchangeCnyLine: ImageVector? = null
