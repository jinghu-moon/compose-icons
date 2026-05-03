package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HeartStraight: ImageVector
    get() {
        if (_heartStraight != null) return _heartStraight!!
        _heartStraight = phosphorThinIcon(
            name = "HeartStraight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 220.180 59.790 C 199.087 38.768 164.963 38.768 143.870 59.790 L 128.000 74.510 L 112.130 59.740 C 91.030 38.662 56.838 38.680 35.760 59.780 C 14.682 80.880 14.700 115.072 35.800 136.150 L 125.150 226.810 C 125.902 227.573 126.929 228.003 128.000 228.003 C 129.071 228.003 130.098 227.573 130.850 226.810 L 220.180 136.170 C 230.311 126.043 236.002 112.305 236.002 97.980 C 236.002 83.655 230.311 69.917 220.180 59.790 ZM 214.510 130.530 L 128.000 218.300 L 41.470 130.510 C 23.504 112.544 23.504 83.416 41.470 65.450 C 59.436 47.484 88.564 47.484 106.530 65.450 L 106.630 65.550 L 125.270 82.910 C 126.807 84.345 129.193 84.345 130.730 82.910 L 149.370 65.550 L 149.470 65.450 C 161.013 53.436 178.149 48.603 194.268 52.814 C 210.387 57.025 222.970 69.623 227.161 85.747 C 231.353 101.872 226.498 119.002 214.470 130.530 Z"),
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
        return _heartStraight!!
    }

private var _heartStraight: ImageVector? = null
