package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Handshake: ImageVector
    get() {
        if (_handshake != null) return _handshake!!
        _handshake = phosphorRegularIcon(
            name = "Handshake",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 254.300 107.910 L 228.780 56.850 C 226.881 53.055 223.552 50.169 219.526 48.828 C 215.499 47.487 211.105 47.801 207.310 49.700 L 182.440 62.130 L 130.050 48.270 C 128.706 47.920 127.294 47.920 125.950 48.270 L 73.560 62.130 L 48.690 49.700 C 44.895 47.801 40.501 47.487 36.474 48.828 C 32.448 50.169 29.119 53.055 27.220 56.850 L 1.700 107.900 C -0.199 111.695 -0.513 116.089 0.828 120.116 C 2.169 124.142 5.055 127.471 8.850 129.370 L 35.850 142.880 L 91.340 182.510 C 92.158 183.092 93.077 183.516 94.050 183.760 L 158.050 199.760 C 160.776 200.444 163.661 199.646 165.650 197.660 L 220.720 142.580 L 247.140 129.370 C 255.038 125.416 258.238 115.811 254.290 107.910 ZM 199.410 141.280 L 165.000 113.720 C 161.807 111.163 157.201 111.426 154.320 114.330 C 136.510 132.270 116.660 130.000 104.000 122.000 L 147.240 80.000 L 179.050 80.000 L 206.260 134.410 ZM 41.530 64.000 L 62.000 74.220 L 36.430 125.270 L 16.000 115.060 ZM 157.530 183.130 L 99.420 168.610 L 50.220 133.470 L 78.220 77.470 L 128.000 64.280 L 137.800 66.870 L 92.800 110.550 L 92.720 110.640 C 89.289 114.071 87.600 118.874 88.129 123.697 C 88.658 128.521 91.347 132.844 95.440 135.450 C 116.000 148.580 140.810 146.450 160.350 130.450 L 188.000 152.660 ZM 219.530 125.260 L 194.010 74.260 L 214.470 64.000 L 240.000 115.060 ZM 131.780 217.930 C 130.891 221.487 127.697 223.985 124.030 223.990 C 123.373 223.989 122.718 223.909 122.080 223.750 L 80.410 213.330 C 79.435 213.090 78.516 212.665 77.700 212.080 L 51.350 193.260 C 47.984 190.617 47.294 185.794 49.784 182.313 C 52.274 178.833 57.062 177.928 60.650 180.260 L 85.760 198.200 L 126.000 208.240 C 130.285 209.312 132.891 213.654 131.820 217.940 Z"),
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
        return _handshake!!
    }

private var _handshake: ImageVector? = null
