package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.WifiX: ImageVector
    get() {
        if (_wifiX != null) return _wifiX!!
        _wifiX = phosphorRegularIcon(
            name = "WifiX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 229.660 98.340 C 232.786 101.466 232.786 106.534 229.660 109.660 C 226.534 112.786 221.466 112.786 218.340 109.660 L 200.000 91.310 L 181.660 109.660 C 178.534 112.786 173.466 112.786 170.340 109.660 C 167.214 106.534 167.214 101.466 170.340 98.340 L 188.690 80.000 L 170.340 61.660 C 167.214 58.534 167.214 53.466 170.340 50.340 C 173.466 47.214 178.534 47.214 181.660 50.340 L 200.000 68.690 L 218.340 50.340 C 221.466 47.214 226.534 47.214 229.660 50.340 C 232.786 53.466 232.786 58.534 229.660 61.660 L 211.310 80.000 ZM 128.000 192.000 C 121.373 192.000 116.000 197.373 116.000 204.000 C 116.000 210.627 121.373 216.000 128.000 216.000 C 134.627 216.000 140.000 210.627 140.000 204.000 C 140.000 197.373 134.627 192.000 128.000 192.000 ZM 172.710 158.530 C 146.052 139.156 109.948 139.156 83.290 158.530 C 79.717 161.131 78.929 166.137 81.530 169.710 C 84.131 173.283 89.137 174.071 92.710 171.470 C 113.749 156.169 142.251 156.169 163.290 171.470 C 166.863 174.071 171.869 173.283 174.470 169.710 C 177.071 166.137 176.283 161.131 172.710 158.530 ZM 135.620 64.180 C 140.038 64.390 143.790 60.978 144.000 56.560 C 144.210 52.142 140.798 48.390 136.380 48.180 C 133.600 48.050 130.780 47.980 128.000 47.980 C 88.227 48.011 49.688 61.797 18.920 87.000 C 15.504 89.806 15.009 94.849 17.815 98.265 C 20.621 101.681 25.664 102.176 29.080 99.370 C 56.983 76.516 91.933 64.020 128.000 64.000 C 130.530 64.000 133.090 64.060 135.620 64.180 ZM 135.460 112.250 C 139.878 112.548 143.702 109.208 144.000 104.790 C 144.298 100.372 140.958 96.548 136.540 96.250 C 133.710 96.060 130.840 95.960 128.000 95.960 C 100.033 95.850 72.867 105.295 51.000 122.730 C 48.327 124.848 47.291 128.427 48.419 131.645 C 49.546 134.864 52.590 137.013 56.000 137.000 C 57.816 137.013 59.581 136.402 61.000 135.270 C 80.033 120.112 103.669 111.903 128.000 112.000 C 130.480 112.000 133.000 112.080 135.460 112.250 Z"),
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
        return _wifiX!!
    }

private var _wifiX: ImageVector? = null
