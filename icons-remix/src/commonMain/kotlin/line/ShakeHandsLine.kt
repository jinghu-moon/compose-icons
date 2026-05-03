package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ShakeHandsLine: ImageVector
    get() {
        if (_shakeHandsLine != null) return _shakeHandsLine!!
        _shakeHandsLine = remixIcon(
            name = "ShakeHandsLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.861 2.391 C 12.849 1.732 14.134 1.718 15.136 2.356 L 19.291 5.000 L 21.000 5.000 C 21.552 5.000 22.000 5.448 22.000 6.000 L 22.000 15.000 C 22.000 15.552 21.552 16.000 21.000 16.000 L 19.480 16.000 C 19.540 16.947 19.093 17.910 18.195 18.449 L 13.102 21.505 C 12.459 21.891 11.661 21.882 11.031 21.497 C 10.331 22.117 9.253 22.185 8.471 21.570 L 3.330 17.531 C 2.564 16.929 2.370 15.900 2.766 15.085 C 2.282 14.706 2.000 14.125 2.000 13.511 L 2.000 6.000 C 2.000 5.448 2.448 5.000 3.000 5.000 L 7.947 5.000 L 11.861 2.391 ZM 4.173 13.645 L 4.865 13.040 C 6.095 11.963 7.960 12.070 9.060 13.279 L 11.762 16.252 C 12.632 17.208 12.790 18.614 12.158 19.739 L 17.167 16.734 C 17.448 16.565 17.550 16.228 17.445 15.943 L 13.018 9.746 C 12.769 9.397 12.326 9.246 11.917 9.369 L 9.431 10.115 C 8.374 10.432 7.228 10.143 6.448 9.362 L 6.155 9.070 C 5.587 8.502 5.440 7.693 5.679 7.000 L 4.000 7.000 L 4.000 13.511 L 4.173 13.645 ZM 14.062 4.043 C 13.728 3.830 13.300 3.835 12.970 4.055 L 7.569 7.655 L 7.862 7.948 C 8.122 8.208 8.504 8.305 8.857 8.199 L 11.342 7.453 C 12.571 7.084 13.899 7.539 14.645 8.583 L 18.514 14.000 L 20.000 14.000 L 20.000 7.000 L 19.291 7.000 C 18.911 7.000 18.538 6.891 18.217 6.687 L 14.062 4.043 ZM 6.182 14.545 L 4.566 15.959 L 9.707 19.998 L 10.411 18.766 C 10.626 18.390 10.574 17.918 10.282 17.597 L 7.580 14.625 C 7.214 14.222 6.592 14.186 6.182 14.545 Z"),
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
        return _shakeHandsLine!!
    }

private var _shakeHandsLine: ImageVector? = null
