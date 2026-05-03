package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.EarthFill: ImageVector
    get() {
        if (_earthFill != null) return _earthFill!!
        _earthFill = remixIcon(
            name = "EarthFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 ZM 16.004 12.878 C 15.659 12.353 15.410 11.975 14.462 12.125 C 12.672 12.409 12.473 12.722 12.388 13.238 L 12.364 13.394 L 12.339 13.560 C 12.242 14.243 12.245 14.501 12.559 14.831 C 13.824 16.158 14.582 17.115 14.812 17.675 C 14.924 17.948 15.212 18.775 15.014 19.593 C 16.237 19.107 17.316 18.333 18.165 17.356 C 18.275 16.982 18.355 16.517 18.355 15.952 L 18.355 15.847 C 18.355 14.925 18.355 14.504 17.703 14.131 C 17.428 13.975 17.223 13.881 17.058 13.806 C 16.691 13.639 16.448 13.530 16.120 13.050 C 16.081 12.993 16.042 12.936 16.004 12.878 ZM 12.000 3.833 C 9.683 3.833 7.591 4.799 6.104 6.349 C 6.281 6.472 6.435 6.645 6.541 6.883 C 6.745 7.340 6.745 7.811 6.745 8.228 C 6.745 8.556 6.744 8.867 6.850 9.093 C 6.994 9.401 7.616 9.532 8.165 9.647 C 8.362 9.689 8.564 9.731 8.748 9.782 C 9.254 9.922 9.646 10.377 9.959 10.741 C 10.090 10.893 10.282 11.116 10.378 11.172 C 10.429 11.136 10.590 10.961 10.670 10.674 C 10.731 10.455 10.713 10.260 10.624 10.154 C 10.065 9.494 10.095 8.223 10.268 7.755 C 10.540 7.016 11.391 7.071 12.012 7.111 C 12.244 7.126 12.463 7.140 12.626 7.120 C 13.248 7.042 13.440 6.095 13.575 5.910 C 13.867 5.510 14.761 4.907 15.316 4.535 C 14.302 4.084 13.181 3.833 12.000 3.833 Z"),
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
        return _earthFill!!
    }

private var _earthFill: ImageVector? = null
