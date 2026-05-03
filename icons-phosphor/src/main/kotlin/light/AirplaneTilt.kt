package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AirplaneTilt: ImageVector
    get() {
        if (_airplaneTilt != null) return _airplaneTilt!!
        _airplaneTilt = phosphorLightIcon(
            name = "AirplaneTilt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 183.000 113.650 L 213.100 85.330 L 213.230 85.200 C 224.947 73.483 224.947 54.487 213.230 42.770 C 201.513 31.053 182.517 31.053 170.800 42.770 L 170.670 42.900 L 142.350 73.000 L 58.050 42.350 C 55.861 41.553 53.409 42.095 51.760 43.740 L 27.760 67.740 C 26.479 69.011 25.838 70.791 26.015 72.586 C 26.191 74.382 27.166 76.003 28.670 77.000 L 94.590 120.940 L 77.520 138.000 L 56.000 138.000 C 54.409 138.001 52.884 138.634 51.760 139.760 L 27.760 163.760 C 26.330 165.184 25.712 167.231 26.115 169.209 C 26.517 171.186 27.887 172.829 29.760 173.580 L 67.380 188.580 L 82.380 226.140 L 82.380 226.260 C 83.639 229.314 87.130 230.776 90.190 229.530 C 90.972 229.212 91.678 228.732 92.260 228.120 L 116.170 204.210 C 117.314 203.105 117.972 201.590 118.000 200.000 L 118.000 178.480 L 135.070 161.410 L 179.000 227.330 C 179.998 228.823 181.612 229.791 183.400 229.967 C 185.187 230.143 186.960 229.510 188.230 228.240 L 212.230 204.240 C 213.875 202.591 214.417 200.139 213.620 197.950 ZM 184.940 214.580 L 141.000 148.660 C 140.003 147.166 138.388 146.197 136.600 146.020 L 136.010 146.020 C 134.419 146.021 132.894 146.654 131.770 147.780 L 107.770 171.780 C 106.646 172.898 106.009 174.415 106.000 176.000 L 106.000 197.520 L 90.200 213.320 L 77.570 181.770 C 76.962 180.243 75.755 179.032 74.230 178.420 L 42.680 165.800 L 58.490 150.000 L 80.000 150.000 C 81.594 150.001 83.123 149.368 84.250 148.240 L 108.250 124.240 C 109.519 122.968 110.151 121.195 109.973 119.407 C 109.794 117.620 108.825 116.006 107.330 115.010 L 41.420 71.060 L 57.540 54.930 L 142.000 85.630 C 144.253 86.448 146.778 85.847 148.420 84.100 L 179.420 51.200 C 186.547 44.812 197.425 45.118 204.182 51.896 C 210.938 58.674 211.210 69.554 204.800 76.660 L 171.900 107.660 C 170.153 109.302 169.552 111.827 170.370 114.080 L 201.070 198.490 Z"),
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
        return _airplaneTilt!!
    }

private var _airplaneTilt: ImageVector? = null
