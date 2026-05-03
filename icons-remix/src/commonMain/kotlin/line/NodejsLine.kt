package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.NodejsLine: ImageVector
    get() {
        if (_nodejsLine != null) return _nodejsLine!!
        _nodejsLine = remixIcon(
            name = "NodejsLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.887 1.362 C 12.340 1.040 11.660 1.040 11.113 1.362 L 3.363 5.921 C 2.828 6.235 2.500 6.809 2.500 7.429 L 2.500 16.571 C 2.500 17.191 2.828 17.765 3.363 18.079 L 5.986 19.622 C 7.319 20.407 9.000 19.445 9.000 17.899 L 9.000 7.747 L 7.000 7.747 L 7.000 17.899 L 4.500 16.428 L 4.500 7.572 L 12.000 3.160 L 19.500 7.572 L 19.500 16.428 L 12.000 20.840 L 10.232 19.800 L 9.218 21.523 L 11.113 22.638 C 11.660 22.960 12.340 22.960 12.887 22.638 L 20.637 18.079 C 21.172 17.765 21.500 17.191 21.500 16.571 L 21.500 7.429 C 21.500 6.809 21.172 6.235 20.637 5.921 L 12.887 1.362 ZM 14.000 7.500 C 12.637 7.500 11.671 7.851 11.050 8.470 C 10.434 9.085 10.314 9.809 10.314 10.231 C 10.314 10.786 10.470 11.289 10.795 11.705 C 11.108 12.105 11.520 12.354 11.915 12.516 C 12.634 12.812 13.536 12.909 14.259 12.986 L 14.346 12.996 C 15.177 13.086 15.800 13.163 16.226 13.341 C 16.419 13.422 16.498 13.495 16.531 13.538 C 16.552 13.566 16.593 13.628 16.593 13.798 C 16.593 14.062 16.503 14.232 16.220 14.393 C 15.873 14.590 15.260 14.740 14.337 14.740 C 13.422 14.740 12.784 14.571 12.419 14.318 C 12.136 14.122 11.927 13.821 11.982 13.168 L 9.989 13.001 C 9.881 14.290 10.348 15.317 11.281 15.962 C 12.132 16.552 13.252 16.740 14.337 16.740 C 15.414 16.740 16.429 16.575 17.210 16.131 C 18.056 15.649 18.593 14.848 18.593 13.798 C 18.593 13.241 18.438 12.737 18.116 12.318 C 17.805 11.914 17.394 11.662 16.998 11.496 C 16.270 11.191 15.358 11.093 14.630 11.015 L 14.630 11.015 L 14.561 11.007 C 13.727 10.917 13.104 10.842 12.675 10.666 C 12.481 10.586 12.403 10.514 12.372 10.474 C 12.353 10.450 12.314 10.394 12.314 10.231 C 12.314 10.154 12.336 10.012 12.462 9.886 C 12.585 9.764 12.962 9.500 14.000 9.500 C 14.990 9.500 15.567 9.605 15.897 9.801 C 16.112 9.928 16.345 10.163 16.376 10.933 L 18.375 10.852 C 18.324 9.607 17.869 8.645 16.917 8.081 C 16.080 7.583 15.009 7.500 14.000 7.500 Z"),
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
        return _nodejsLine!!
    }

private var _nodejsLine: ImageVector? = null
