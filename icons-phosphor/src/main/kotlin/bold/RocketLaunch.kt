package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.RocketLaunch: ImageVector
    get() {
        if (_rocketLaunch != null) return _rocketLaunch!!
        _rocketLaunch = phosphorBoldIcon(
            name = "RocketLaunch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 227.850 46.890 C 227.232 36.807 219.193 28.768 209.110 28.150 C 195.980 27.380 162.460 28.570 134.630 56.390 L 131.000 60.000 L 74.360 60.000 C 69.052 59.982 63.959 62.093 60.220 65.860 L 25.870 100.190 C 20.506 105.551 18.636 113.485 21.041 120.677 C 23.445 127.869 29.711 133.083 37.220 134.140 L 74.360 139.320 L 116.680 181.640 L 121.870 218.820 C 122.901 226.343 128.128 232.622 135.340 235.000 C 137.396 235.673 139.547 236.011 141.710 236.000 C 147.004 235.997 152.078 233.884 155.810 230.130 L 190.150 195.780 C 193.911 192.038 196.018 186.946 196.000 181.640 L 196.000 125.000 L 199.600 121.410 C 227.430 93.540 228.620 60.000 227.850 46.890 ZM 76.000 84.000 L 107.000 84.000 L 75.750 115.280 L 48.520 111.480 ZM 151.600 73.370 C 165.436 59.420 184.355 51.704 204.000 52.000 C 204.307 71.652 196.586 90.580 182.620 104.410 L 128.000 159.000 L 97.000 128.000 ZM 172.000 180.000 L 144.510 207.490 L 140.710 180.260 L 172.000 149.000 ZM 100.000 202.000 C 91.290 213.850 73.810 228.000 40.000 228.000 C 33.373 228.000 28.000 222.627 28.000 216.000 C 28.000 182.160 42.120 164.680 54.000 156.000 C 57.425 153.122 62.167 152.389 66.302 154.097 C 70.437 155.806 73.278 159.673 73.672 164.129 C 74.067 168.585 71.950 172.891 68.180 175.300 C 62.300 179.630 55.510 187.800 53.000 203.000 C 68.210 200.490 76.370 193.700 80.700 187.820 C 83.109 184.050 87.415 181.933 91.871 182.328 C 96.327 182.722 100.194 185.563 101.903 189.698 C 103.611 193.833 102.878 198.575 100.000 202.000 Z"),
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
        return _rocketLaunch!!
    }

private var _rocketLaunch: ImageVector? = null
