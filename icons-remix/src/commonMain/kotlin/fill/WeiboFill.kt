package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.WeiboFill: ImageVector
    get() {
        if (_weiboFill != null) return _weiboFill!!
        _weiboFill = remixIcon(
            name = "WeiboFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.278 8.592 C 7.051 5.822 10.282 4.559 11.497 5.776 C 12.034 6.313 12.085 7.240 11.741 8.348 C 11.563 8.905 12.266 8.597 12.266 8.597 C 14.506 7.660 16.462 7.604 17.175 8.625 C 17.554 9.167 17.518 9.931 17.167 10.815 C 17.004 11.222 17.215 11.286 17.526 11.378 C 18.789 11.770 20.194 12.714 20.194 14.382 C 20.194 17.145 16.215 20.621 10.231 20.621 C 5.666 20.621 1.001 18.408 1.001 14.769 C 1.001 12.867 2.205 10.667 4.278 8.592 ZM 16.411 14.334 C 16.174 11.943 13.029 10.295 9.388 10.657 C 5.747 11.016 2.984 13.247 3.221 15.637 C 3.458 18.031 6.603 19.676 10.244 19.317 C 13.885 18.955 16.645 16.725 16.411 14.334 ZM 6.162 14.438 C 6.916 12.910 8.874 12.047 10.608 12.498 C 12.401 12.961 13.315 14.652 12.584 16.297 C 11.840 17.980 9.701 18.876 7.889 18.291 C 6.137 17.725 5.396 15.997 6.162 14.438 ZM 8.877 15.016 C 8.314 14.779 7.586 15.024 7.237 15.569 C 6.883 16.116 7.048 16.771 7.608 17.025 C 8.176 17.282 8.933 17.038 9.284 16.475 C 9.630 15.907 9.447 15.258 8.877 15.016 ZM 10.264 14.438 C 10.048 14.354 9.778 14.456 9.651 14.670 C 9.528 14.884 9.597 15.128 9.814 15.217 C 10.033 15.309 10.315 15.205 10.442 14.986 C 10.565 14.767 10.486 14.520 10.264 14.438 ZM 15.958 2.924 C 17.926 2.506 20.055 3.120 21.501 4.719 C 22.947 6.318 23.334 8.500 22.720 10.423 C 22.580 10.864 22.104 11.108 21.661 10.963 C 21.218 10.817 20.976 10.344 21.119 9.901 C 21.557 8.541 21.281 6.987 20.253 5.850 C 19.224 4.712 17.712 4.276 16.312 4.574 C 15.856 4.671 15.410 4.380 15.311 3.925 C 15.212 3.469 15.502 3.021 15.958 2.924 ZM 16.584 5.850 C 17.541 5.646 18.580 5.944 19.283 6.723 C 19.986 7.502 20.174 8.567 19.874 9.498 C 19.751 9.879 19.341 10.089 18.960 9.964 C 18.578 9.840 18.371 9.432 18.496 9.048 C 18.646 8.592 18.552 8.073 18.208 7.691 C 17.862 7.311 17.355 7.166 16.887 7.265 C 16.495 7.352 16.110 7.100 16.026 6.710 C 15.942 6.318 16.192 5.933 16.584 5.850 Z"),
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
        return _weiboFill!!
    }

private var _weiboFill: ImageVector? = null
