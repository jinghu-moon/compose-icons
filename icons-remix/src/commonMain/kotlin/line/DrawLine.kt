package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DrawLine: ImageVector
    get() {
        if (_drawLine != null) return _drawLine!!
        _drawLine = remixIcon(
            name = "DrawLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.364 1.808 C 18.629 1.808 18.884 1.913 19.071 2.101 L 21.899 4.929 C 22.290 5.319 22.290 5.952 21.899 6.343 L 18.228 10.015 C 19.283 11.387 20.077 12.767 20.511 14.006 C 20.765 14.732 20.913 15.457 20.888 16.128 C 20.862 16.806 20.653 17.490 20.132 18.011 C 19.319 18.824 18.140 18.875 17.091 18.660 C 16.006 18.438 14.789 17.885 13.565 17.110 L 14.634 15.420 C 15.739 16.119 16.727 16.544 17.493 16.701 C 18.295 16.865 18.615 16.700 18.718 16.597 C 18.786 16.529 18.877 16.382 18.890 16.052 C 18.903 15.713 18.827 15.249 18.623 14.667 C 18.295 13.732 17.676 12.616 16.800 11.442 L 14.828 13.414 C 14.641 13.602 14.386 13.707 14.121 13.707 L 11.293 13.707 C 10.741 13.707 10.293 13.259 10.293 12.707 L 10.293 9.879 C 10.293 9.614 10.399 9.359 10.586 9.172 L 12.443 7.313 C 11.236 6.602 10.012 6.192 8.910 6.086 C 7.511 5.952 6.380 6.305 5.636 7.050 C 4.774 7.911 4.432 9.302 4.774 11.011 C 5.114 12.711 6.121 14.605 7.758 16.242 C 9.516 18.000 11.565 19.029 13.353 19.290 L 13.064 21.269 C 10.785 20.935 8.355 19.669 6.343 17.657 C 4.465 15.780 3.240 13.542 2.813 11.403 C 2.387 9.273 2.740 7.117 4.222 5.636 C 5.496 4.361 7.278 3.920 9.102 4.095 C 10.680 4.246 12.342 4.860 13.897 5.860 L 17.657 2.101 L 17.731 2.034 C 17.909 1.888 18.132 1.808 18.364 1.808 ZM 12.293 10.293 L 12.293 11.707 L 13.707 11.707 L 19.778 5.636 L 18.364 4.222 L 12.293 10.293 Z"),
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
        return _drawLine!!
    }

private var _drawLine: ImageVector? = null
