package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HeartStraightBreak: ImageVector
    get() {
        if (_heartStraightBreak != null) return _heartStraightBreak!!
        _heartStraightBreak = phosphorLightIcon(
            name = "HeartStraightBreak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 221.620 58.380 C 199.741 36.568 164.339 36.568 142.460 58.380 L 128.000 72.240 L 113.560 58.340 C 91.687 36.470 56.225 36.472 34.355 58.345 C 12.485 80.218 12.487 115.680 34.360 137.550 L 123.730 228.210 C 124.858 229.355 126.398 230.000 128.005 230.000 C 129.612 230.000 131.152 229.355 132.280 228.210 L 221.610 137.580 C 243.452 115.699 243.456 80.266 221.620 58.380 ZM 213.110 129.130 L 128.000 215.450 L 42.890 129.100 C 25.703 111.916 25.701 84.052 42.885 66.865 C 60.069 49.678 87.933 49.676 105.120 66.860 L 105.200 66.940 L 119.360 80.580 L 107.850 91.660 C 106.691 92.777 106.030 94.314 106.015 95.923 C 106.000 97.533 106.632 99.081 107.770 100.220 L 135.530 128.000 L 123.770 139.760 C 122.235 141.272 121.628 143.492 122.182 145.575 C 122.735 147.658 124.363 149.284 126.447 149.835 C 128.530 150.386 130.749 149.777 132.260 148.240 L 148.260 132.240 C 149.387 131.115 150.020 129.587 150.020 127.995 C 150.020 126.403 149.387 124.875 148.260 123.750 L 120.580 96.060 L 150.820 66.940 C 150.852 66.919 150.879 66.892 150.900 66.860 C 168.095 49.681 195.961 49.695 213.140 66.890 C 230.319 84.085 230.305 111.951 213.110 129.130 Z"),
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
