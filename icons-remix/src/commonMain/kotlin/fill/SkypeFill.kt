package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SkypeFill: ImageVector
    get() {
        if (_skypeFill != null) return _skypeFill!!
        _skypeFill = remixIcon(
            name = "SkypeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.311 20.400 C 12.884 20.466 12.446 20.500 12.001 20.500 C 7.307 20.500 3.501 16.694 3.501 12.000 C 3.501 11.554 3.535 11.117 3.601 10.690 C 3.218 9.961 3.001 9.131 3.001 8.250 C 3.001 5.351 5.351 3.000 8.251 3.000 C 9.132 3.000 9.962 3.217 10.691 3.600 C 11.118 3.534 11.556 3.500 12.001 3.500 C 16.695 3.500 20.501 7.306 20.501 12.000 C 20.501 12.446 20.467 12.883 20.401 13.310 C 20.784 14.039 21.001 14.869 21.001 15.750 C 21.001 18.649 18.650 21.000 15.751 21.000 C 14.870 21.000 14.040 20.783 13.311 20.400 ZM 12.053 17.156 L 12.013 17.156 C 14.885 17.156 16.316 15.770 16.316 13.913 C 16.316 12.715 15.764 11.442 13.590 10.955 L 11.607 10.515 C 10.852 10.343 9.985 10.115 9.985 9.400 C 9.985 8.685 10.604 8.187 11.709 8.187 C 13.939 8.187 13.736 9.715 14.840 9.715 C 15.416 9.715 15.933 9.373 15.933 8.785 C 15.933 7.415 13.736 6.385 11.877 6.385 C 9.856 6.385 7.704 7.244 7.704 9.529 C 7.704 10.627 8.098 11.799 10.263 12.342 L 12.953 13.013 C 13.769 13.215 13.971 13.672 13.971 14.085 C 13.971 14.772 13.287 15.443 12.053 15.443 C 9.636 15.443 9.975 13.585 8.679 13.585 C 8.098 13.585 7.676 13.984 7.676 14.557 C 7.676 15.671 9.028 17.156 12.053 17.156 Z"),
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
        return _skypeFill!!
    }

private var _skypeFill: ImageVector? = null
