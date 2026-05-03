package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MoonCloudyFill: ImageVector
    get() {
        if (_moonCloudyFill != null) return _moonCloudyFill!!
        _moonCloudyFill = remixIcon(
            name = "MoonCloudyFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.670 5.007 C 9.793 2.638 12.205 1.000 15.000 1.000 C 15.416 1.000 15.824 1.036 16.220 1.106 C 16.077 1.545 16.000 2.013 16.000 2.500 C 16.000 4.985 18.015 7.000 20.500 7.000 C 20.987 7.000 21.455 6.923 21.894 6.780 C 21.964 7.176 22.000 7.584 22.000 8.000 C 22.000 9.223 21.687 10.372 21.135 11.373 C 22.279 12.381 23.000 13.856 23.000 15.500 C 23.000 18.538 20.538 21.000 17.500 21.000 L 9.000 21.000 C 4.582 21.000 1.000 17.418 1.000 13.000 C 1.000 8.692 4.405 5.179 8.670 5.007 ZM 10.847 5.214 C 13.420 5.823 15.514 7.674 16.458 10.099 C 16.795 10.034 17.144 10.000 17.500 10.000 C 18.174 10.000 18.821 10.121 19.418 10.344 C 19.643 9.919 19.809 9.459 19.905 8.973 C 16.790 8.691 14.309 6.210 14.027 3.095 C 12.706 3.355 11.572 4.136 10.847 5.214 Z"),
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
        return _moonCloudyFill!!
    }

private var _moonCloudyFill: ImageVector? = null
