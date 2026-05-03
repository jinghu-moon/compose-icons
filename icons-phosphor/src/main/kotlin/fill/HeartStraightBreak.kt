package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HeartStraightBreak: ImageVector
    get() {
        if (_heartStraightBreak != null) return _heartStraightBreak!!
        _heartStraightBreak = phosphorFillIcon(
            name = "HeartStraightBreak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 113.290 55.310 C 90.180 33.119 53.456 33.865 31.265 56.975 C 9.074 80.085 9.820 116.809 32.930 139.000 L 122.300 229.660 C 123.804 231.187 125.857 232.047 128.000 232.047 C 130.143 232.047 132.196 231.187 133.700 229.660 L 223.000 139.000 C 245.671 116.356 245.694 79.621 223.050 56.950 C 200.406 34.279 163.671 34.256 141.000 56.900 L 141.000 56.900 L 116.600 79.900 L 143.000 106.320 C 144.502 107.821 145.346 109.857 145.346 111.980 C 145.346 114.103 144.502 116.139 143.000 117.640 L 122.310 138.330 C 119.181 141.453 114.113 141.449 110.990 138.320 C 107.867 135.191 107.871 130.123 111.000 127.000 L 126.000 112.000 L 99.500 85.420 C 97.961 83.882 97.114 81.784 97.156 79.608 C 97.197 77.433 98.123 75.368 99.720 73.890 L 113.270 61.110 C 114.065 60.355 114.515 59.306 114.515 58.210 C 114.515 57.114 114.065 56.065 113.270 55.310 Z"),
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
        return _heartStraightBreak!!
    }

private var _heartStraightBreak: ImageVector? = null
