package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.LineSegment: ImageVector
    get() {
        if (_lineSegment != null) return _lineSegment!!
        _lineSegment = phosphorBoldIcon(
            name = "LineSegment",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 217.470 38.530 C 205.074 26.091 185.513 24.411 171.178 34.553 C 156.842 44.696 151.916 63.701 159.520 79.530 L 79.520 159.530 C 65.749 152.955 49.330 155.759 38.520 166.530 L 38.520 166.530 C 25.603 179.485 24.456 200.068 35.854 214.378 C 47.252 228.688 67.570 232.174 83.086 222.481 C 98.602 212.788 104.381 193.000 96.520 176.480 L 176.520 96.480 C 192.349 104.084 211.354 99.158 221.497 84.822 C 231.639 70.487 229.959 50.926 217.520 38.530 ZM 72.470 200.530 C 67.779 205.204 60.189 205.196 55.509 200.510 C 50.830 195.825 50.830 188.235 55.509 183.550 C 60.189 178.864 67.779 178.856 72.470 183.530 C 77.159 188.213 77.163 195.811 72.480 200.500 ZM 200.470 72.530 C 198.218 74.789 195.160 76.059 191.970 76.059 C 188.780 76.059 185.722 74.789 183.470 72.530 L 183.470 72.530 C 178.796 67.839 178.804 60.249 183.490 55.569 C 188.175 50.890 195.765 50.890 200.450 55.569 C 205.136 60.249 205.144 67.839 200.470 72.530 Z"),
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
        return _lineSegment!!
    }

private var _lineSegment: ImageVector? = null
