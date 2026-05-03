package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Tire: ImageVector
    get() {
        if (_tire != null) return _tire!!
        _tire = phosphorFillIcon(
            name = "Tire",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 184.000 128.000 C 184.000 150.090 176.840 168.000 168.000 168.000 C 159.160 168.000 152.000 150.090 152.000 128.000 C 152.000 105.910 159.160 88.000 168.000 88.000 C 176.840 88.000 184.000 105.910 184.000 128.000 ZM 240.000 224.000 C 240.000 228.418 236.418 232.000 232.000 232.000 L 92.000 232.000 C 58.360 232.000 32.000 186.320 32.000 128.000 C 32.000 69.680 58.360 24.000 92.000 24.000 L 164.000 24.000 C 197.640 24.000 224.000 69.680 224.000 128.000 C 224.000 165.470 213.120 197.730 196.410 216.000 L 232.000 216.000 C 236.418 216.000 240.000 219.582 240.000 224.000 ZM 57.870 111.810 C 59.535 111.813 61.158 111.291 62.510 110.320 L 80.000 97.830 L 93.280 107.320 C 96.868 109.652 101.656 108.747 104.146 105.267 C 106.636 101.786 105.946 96.963 102.580 94.320 L 84.650 81.490 C 81.868 79.503 78.132 79.503 75.350 81.490 L 53.210 97.300 C 50.378 99.322 49.179 102.943 50.243 106.256 C 51.307 109.569 54.390 111.814 57.870 111.810 ZM 104.540 159.700 L 84.650 145.490 C 81.868 143.503 78.132 143.503 75.350 145.490 L 56.000 159.290 C 53.532 160.894 52.144 163.724 52.387 166.657 C 52.629 169.590 54.463 172.154 57.161 173.330 C 59.859 174.507 62.985 174.108 65.300 172.290 L 80.000 161.830 L 95.240 172.710 C 97.555 174.528 100.681 174.927 103.379 173.750 C 106.077 172.574 107.911 170.010 108.153 167.077 C 108.396 164.144 107.008 161.314 104.540 159.710 ZM 193.740 192.070 C 202.930 175.070 208.000 152.330 208.000 128.000 C 208.000 103.670 202.930 80.910 193.740 63.930 C 185.380 48.500 174.820 40.000 164.000 40.000 C 153.180 40.000 142.620 48.500 134.260 63.930 C 125.070 80.910 120.000 103.670 120.000 128.000 C 120.000 152.330 125.070 175.090 134.260 192.070 C 142.620 207.500 153.180 216.000 164.000 216.000 C 174.820 216.000 185.380 207.500 193.740 192.070 Z"),
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
        return _tire!!
    }

private var _tire: ImageVector? = null
