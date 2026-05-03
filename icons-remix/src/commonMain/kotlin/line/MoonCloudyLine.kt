package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MoonCloudyLine: ImageVector
    get() {
        if (_moonCloudyLine != null) return _moonCloudyLine!!
        _moonCloudyLine = remixIcon(
            name = "MoonCloudyLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 8.670 5.007 C 9.793 2.638 12.205 1.000 15.000 1.000 C 15.416 1.000 15.824 1.036 16.220 1.106 C 16.077 1.545 16.000 2.013 16.000 2.500 C 16.000 4.985 18.015 7.000 20.500 7.000 C 20.987 7.000 21.455 6.923 21.894 6.780 C 21.964 7.176 22.000 7.584 22.000 8.000 C 22.000 9.223 21.687 10.372 21.135 11.373 C 22.279 12.381 23.000 13.856 23.000 15.500 C 23.000 18.538 20.538 21.000 17.500 21.000 L 9.000 21.000 C 4.582 21.000 1.000 17.418 1.000 13.000 C 1.000 8.692 4.405 5.179 8.670 5.007 ZM 10.847 5.214 C 13.420 5.823 15.514 7.674 16.458 10.099 C 16.795 10.034 17.144 10.000 17.500 10.000 C 18.174 10.000 18.821 10.121 19.418 10.344 C 19.643 9.919 19.809 9.459 19.905 8.973 C 16.790 8.691 14.309 6.210 14.027 3.095 C 12.706 3.355 11.572 4.136 10.847 5.214 ZM 17.500 19.000 C 19.433 19.000 21.000 17.433 21.000 15.500 C 21.000 13.567 19.433 12.000 17.500 12.000 C 16.521 12.000 15.635 12.402 15.000 13.051 C 15.000 13.034 15.000 13.017 15.000 13.000 C 15.000 9.686 12.314 7.000 9.000 7.000 C 5.686 7.000 3.000 9.686 3.000 13.000 C 3.000 16.314 5.686 19.000 9.000 19.000 L 17.500 19.000 Z"),
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
        return _moonCloudyLine!!
    }

private var _moonCloudyLine: ImageVector? = null
