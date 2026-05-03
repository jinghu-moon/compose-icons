package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.VirusFill: ImageVector
    get() {
        if (_virusFill != null) return _virusFill!!
        _virusFill = remixIcon(
            name = "VirusFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.716 1.947 L 17.451 3.381 L 16.734 5.248 L 15.800 4.889 L 15.054 6.834 C 15.833 7.296 16.498 7.928 16.999 8.680 L 18.901 7.833 L 18.495 6.919 L 20.322 6.106 L 21.949 9.760 L 20.122 10.573 L 19.715 9.660 L 17.813 10.507 C 17.935 10.984 18.000 11.485 18.000 12.000 C 18.000 12.406 17.959 12.803 17.882 13.187 L 19.826 13.933 L 20.185 13.000 L 22.052 13.717 L 20.619 17.451 L 18.752 16.734 L 19.109 15.801 L 17.165 15.054 C 16.704 15.833 16.071 16.499 15.319 16.999 L 16.167 18.902 L 17.081 18.495 L 17.894 20.322 L 14.240 21.949 L 13.427 20.122 L 14.340 19.715 L 13.493 17.813 C 13.015 17.935 12.515 18.000 12.000 18.000 C 11.593 18.000 11.196 17.959 10.812 17.882 L 10.066 19.827 L 11.000 20.185 L 10.283 22.052 L 6.549 20.619 L 7.266 18.752 L 8.198 19.110 L 8.946 17.166 C 8.167 16.704 7.501 16.072 7.001 15.319 L 5.098 16.167 L 5.505 17.081 L 3.678 17.894 L 2.051 14.240 L 3.878 13.427 L 4.284 14.341 L 6.187 13.493 C 6.065 13.016 6.000 12.515 6.000 12.000 C 6.000 11.594 6.040 11.197 6.117 10.813 L 4.172 10.067 L 3.814 11.000 L 1.947 10.283 L 3.381 6.549 L 5.248 7.266 L 4.889 8.199 L 6.834 8.946 C 7.296 8.167 7.928 7.502 8.680 7.001 L 7.832 5.098 L 6.919 5.505 L 6.105 3.678 L 9.760 2.051 L 10.573 3.878 L 9.659 4.285 L 10.507 6.187 C 10.984 6.065 11.484 6.000 12.000 6.000 C 12.406 6.000 12.803 6.040 13.186 6.117 L 13.932 4.172 L 13.000 3.815 L 13.716 1.947 ZM 10.134 13.232 C 9.858 13.710 10.021 14.322 10.500 14.598 C 10.978 14.874 11.590 14.710 11.866 14.232 C 12.142 13.754 11.978 13.142 11.500 12.866 C 11.021 12.590 10.410 12.754 10.134 13.232 ZM 14.000 11.000 C 13.448 11.000 13.000 11.448 13.000 12.000 C 13.000 12.552 13.448 13.000 14.000 13.000 C 14.552 13.000 15.000 12.552 15.000 12.000 C 15.000 11.448 14.552 11.000 14.000 11.000 ZM 10.500 9.402 C 10.021 9.678 9.858 10.290 10.134 10.768 C 10.410 11.246 11.021 11.410 11.500 11.134 C 11.978 10.858 12.142 10.246 11.866 9.768 C 11.590 9.290 10.978 9.126 10.500 9.402 Z"),
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
        return _virusFill!!
    }

private var _virusFill: ImageVector? = null
