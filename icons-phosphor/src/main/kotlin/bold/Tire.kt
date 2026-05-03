package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Tire: ImageVector
    get() {
        if (_tire != null) return _tire!!
        _tire = phosphorBoldIcon(
            name = "Tire",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 152.000 128.000 C 152.000 105.910 159.160 88.000 168.000 88.000 C 176.840 88.000 184.000 105.910 184.000 128.000 C 184.000 150.090 176.840 168.000 168.000 168.000 C 159.160 168.000 152.000 150.090 152.000 128.000 ZM 244.000 224.000 C 244.000 230.627 238.627 236.000 232.000 236.000 L 92.000 236.000 C 73.500 236.000 56.700 223.780 44.680 201.600 C 33.920 181.740 28.000 155.600 28.000 128.000 C 28.000 100.400 33.920 74.260 44.680 54.400 C 56.700 32.220 73.500 20.000 92.000 20.000 L 164.000 20.000 C 182.500 20.000 199.300 32.220 211.320 54.400 C 222.080 74.260 228.000 100.400 228.000 128.000 C 228.000 155.600 222.080 181.740 211.320 201.600 C 209.376 205.203 207.202 208.677 204.810 212.000 L 232.000 212.000 C 238.627 212.000 244.000 217.373 244.000 224.000 ZM 164.000 44.000 C 145.080 44.000 124.000 78.500 124.000 128.000 C 124.000 177.500 145.080 212.000 164.000 212.000 C 182.920 212.000 204.000 177.500 204.000 128.000 C 204.000 78.500 182.920 44.000 164.000 44.000 ZM 54.330 155.590 L 73.000 142.240 C 77.170 139.264 82.770 139.264 86.940 142.240 L 101.600 152.700 C 100.521 144.511 99.987 136.260 100.000 128.000 C 100.000 124.390 100.110 120.800 100.310 117.250 L 80.000 102.750 L 52.090 122.680 C 52.000 124.440 52.000 126.210 52.000 128.000 C 51.978 137.247 52.758 146.478 54.330 155.590 ZM 56.540 90.000 L 73.000 78.240 C 77.170 75.264 82.770 75.264 86.940 78.240 L 103.850 90.310 C 106.394 77.794 110.704 65.703 116.650 54.400 C 118.603 50.796 120.788 47.322 123.190 44.000 L 92.000 44.000 C 78.440 44.000 63.770 61.730 56.540 90.000 ZM 92.000 212.000 L 123.190 212.000 C 120.798 208.677 118.624 205.203 116.680 201.600 C 114.417 197.424 112.413 193.112 110.680 188.690 L 80.000 166.750 L 61.140 180.220 C 69.000 200.080 80.880 212.000 92.000 212.000 Z"),
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
        return _tire!!
    }

private var _tire: ImageVector? = null
