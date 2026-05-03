package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.EarthLine: ImageVector
    get() {
        if (_earthLine != null) return _earthLine!!
        _earthLine = remixIcon(
            name = "EarthLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.235 6.453 C 4.851 7.891 4.000 9.846 4.000 12.000 C 4.000 16.418 7.582 20.000 12.000 20.000 C 13.081 20.000 14.112 19.786 15.052 19.397 C 15.167 18.647 14.915 17.927 14.812 17.675 C 14.582 17.115 13.824 16.158 12.559 14.831 C 12.221 14.476 12.243 14.203 12.364 13.394 L 12.377 13.303 C 12.460 12.749 12.597 12.421 14.462 12.125 C 15.410 11.975 15.659 12.353 16.004 12.878 C 16.042 12.936 16.081 12.993 16.120 13.050 C 16.448 13.530 16.691 13.639 17.058 13.806 C 17.223 13.881 17.428 13.975 17.703 14.131 C 18.355 14.504 18.355 14.925 18.355 15.847 L 18.355 15.952 C 18.355 16.343 18.317 16.687 18.257 16.986 C 19.348 15.618 20.000 13.885 20.000 12.000 C 20.000 8.701 18.003 5.868 15.152 4.645 C 14.599 5.018 13.840 5.547 13.575 5.910 C 13.440 6.095 13.248 7.042 12.626 7.120 C 12.463 7.140 12.244 7.126 12.012 7.111 C 11.391 7.071 10.540 7.016 10.268 7.755 C 10.095 8.223 10.065 9.494 10.624 10.154 C 10.713 10.260 10.731 10.455 10.670 10.674 C 10.590 10.961 10.429 11.136 10.378 11.172 C 10.282 11.116 10.090 10.893 9.959 10.741 C 9.646 10.377 9.254 9.922 8.748 9.782 C 8.564 9.731 8.362 9.689 8.165 9.647 C 7.616 9.532 6.994 9.401 6.850 9.093 C 6.744 8.867 6.745 8.556 6.745 8.228 C 6.745 7.811 6.745 7.340 6.541 6.883 C 6.462 6.705 6.357 6.564 6.235 6.453 ZM 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 Z"),
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
        return _earthLine!!
    }

private var _earthLine: ImageVector? = null
