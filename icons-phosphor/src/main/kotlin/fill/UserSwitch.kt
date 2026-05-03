package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.UserSwitch: ImageVector
    get() {
        if (_userSwitch != null) return _userSwitch!!
        _userSwitch = phosphorFillIcon(
            name = "UserSwitch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 84.000 120.000 C 84.000 95.699 103.699 76.000 128.000 76.000 C 152.301 76.000 172.000 95.699 172.000 120.000 C 172.000 144.301 152.301 164.000 128.000 164.000 C 103.699 164.000 84.000 144.301 84.000 120.000 ZM 210.160 177.180 C 206.464 175.035 201.741 176.083 199.300 179.590 C 197.576 181.965 195.734 184.251 193.780 186.440 C 187.960 177.992 180.565 170.746 172.000 165.100 C 170.499 164.105 168.517 164.236 167.160 165.420 C 144.695 184.859 111.365 184.859 88.900 165.420 C 87.532 164.205 85.514 164.074 84.000 165.100 C 75.434 170.736 68.035 177.971 62.210 186.410 C 49.717 172.381 42.060 154.709 40.370 136.000 L 55.770 136.000 C 58.397 136.041 60.884 134.822 62.460 132.720 C 64.789 129.536 64.449 125.130 61.660 122.340 L 37.660 98.340 C 36.159 96.838 34.123 95.994 32.000 95.994 C 29.877 95.994 27.841 96.838 26.340 98.340 L 2.340 122.340 C -0.449 125.130 -0.789 129.536 1.540 132.720 C 3.116 134.822 5.603 136.041 8.230 136.000 L 24.300 136.000 C 27.652 179.569 57.882 216.396 99.962 228.174 C 142.043 239.952 186.998 224.169 212.480 188.670 C 213.777 186.864 214.264 184.599 213.824 182.419 C 213.384 180.240 212.057 178.341 210.160 177.180 ZM 255.390 124.940 C 254.152 121.950 251.236 120.001 248.000 120.000 L 231.700 120.000 C 228.348 76.431 198.118 39.604 156.038 27.826 C 113.957 16.048 69.002 31.831 43.520 67.330 C 40.941 70.920 41.760 75.921 45.350 78.500 C 48.940 81.079 53.941 80.260 56.520 76.670 C 77.953 46.829 115.669 33.444 151.118 43.098 C 186.567 52.751 212.288 83.412 215.630 120.000 L 200.000 120.000 C 196.762 119.997 193.842 121.947 192.603 124.938 C 191.364 127.929 192.049 131.372 194.340 133.660 L 218.340 157.660 C 219.841 159.162 221.877 160.006 224.000 160.006 C 226.123 160.006 228.159 159.162 229.660 157.660 L 253.660 133.660 C 255.947 131.371 256.630 127.929 255.390 124.940 Z"),
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
        return _userSwitch!!
    }

private var _userSwitch: ImageVector? = null
