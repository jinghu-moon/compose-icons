package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.IeFill: ImageVector
    get() {
        if (_ieFill != null) return _ieFill!!
        _ieFill = remixIcon(
            name = "IeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 8.613 20.119 C 5.869 21.610 3.500 21.919 2.191 20.611 C 0.847 19.269 1.563 15.759 3.504 12.237 C 4.452 10.517 5.692 8.794 7.128 7.320 C 7.315 7.133 8.253 6.197 8.315 6.197 C 8.315 6.197 7.815 6.509 7.753 6.509 C 5.803 7.604 4.090 9.589 3.716 10.035 C 3.774 9.775 3.843 9.520 3.922 9.270 C 5.079 5.634 8.482 3.000 12.501 3.000 C 12.731 3.000 12.959 3.009 13.184 3.026 C 16.279 1.623 19.158 1.299 20.376 2.515 C 21.501 3.638 21.438 5.510 20.501 7.757 C 20.492 7.778 20.483 7.800 20.474 7.821 C 21.130 9.070 21.501 10.492 21.501 12.000 C 21.501 12.379 21.477 12.753 21.432 13.120 L 20.627 13.120 C 20.576 13.122 20.529 13.123 20.486 13.123 L 8.690 13.123 L 8.690 13.310 C 8.752 15.307 10.502 17.054 12.627 17.054 C 14.127 17.054 15.564 16.243 16.189 15.057 L 20.968 15.057 C 20.961 15.078 20.953 15.099 20.945 15.120 C 19.677 18.553 16.375 21.000 12.501 21.000 C 11.108 21.000 9.790 20.684 8.613 20.119 ZM 8.006 19.799 C 6.180 18.744 4.759 17.067 4.034 15.057 C 2.873 17.339 2.574 19.247 3.565 20.237 C 4.378 21.049 6.003 20.861 8.003 19.801 L 8.006 19.799 ZM 20.173 7.292 C 20.178 7.281 20.183 7.270 20.188 7.258 C 20.938 5.636 21.001 4.264 20.313 3.452 C 19.444 2.585 17.773 2.702 15.791 3.620 C 17.619 4.339 19.156 5.639 20.173 7.292 ZM 16.564 10.753 L 16.564 10.691 C 16.439 8.631 14.814 7.071 12.814 7.071 C 10.689 7.071 8.878 8.756 8.753 10.691 L 8.753 10.753 L 16.564 10.753 Z"),
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
        return _ieFill!!
    }

private var _ieFill: ImageVector? = null
