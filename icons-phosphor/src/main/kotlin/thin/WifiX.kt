package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.WifiX: ImageVector
    get() {
        if (_wifiX != null) return _wifiX!!
        _wifiX = phosphorThinIcon(
            name = "WifiX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 136.000 204.000 C 136.000 208.418 132.418 212.000 128.000 212.000 C 123.582 212.000 120.000 208.418 120.000 204.000 C 120.000 199.582 123.582 196.000 128.000 196.000 C 132.418 196.000 136.000 199.582 136.000 204.000 ZM 205.660 80.000 L 226.830 58.830 C 228.393 57.267 228.393 54.733 226.830 53.170 C 225.267 51.607 222.733 51.607 221.170 53.170 L 200.000 74.340 L 178.830 53.170 C 177.267 51.607 174.733 51.607 173.170 53.170 C 171.607 54.733 171.607 57.267 173.170 58.830 L 194.340 80.000 L 173.170 101.170 C 171.607 102.733 171.607 105.267 173.170 106.830 C 174.733 108.393 177.267 108.393 178.830 106.830 L 200.000 85.660 L 221.170 106.830 C 222.733 108.393 225.267 108.393 226.830 106.830 C 228.393 105.267 228.393 102.733 226.830 101.170 ZM 170.350 161.770 C 145.100 143.402 110.890 143.402 85.640 161.770 C 83.948 163.100 83.612 165.532 84.880 167.271 C 86.148 169.010 88.566 169.434 90.350 168.230 C 112.798 151.923 143.192 151.923 165.640 168.230 C 166.791 169.135 168.344 169.339 169.689 168.762 C 171.034 168.185 171.957 166.919 172.095 165.462 C 172.232 164.005 171.563 162.589 170.350 161.770 ZM 135.810 60.190 C 138.019 60.295 139.895 58.589 140.000 56.380 C 140.105 54.171 138.399 52.295 136.190 52.190 C 133.480 52.060 130.720 51.990 128.000 51.990 C 89.154 52.016 51.513 65.477 21.460 90.090 C 19.751 91.493 19.502 94.016 20.905 95.725 C 22.308 97.434 24.831 97.683 26.540 96.280 C 55.157 72.836 91.006 60.017 128.000 60.000 C 130.590 60.000 133.220 60.060 135.810 60.190 ZM 135.730 108.260 C 137.939 108.409 139.851 106.739 140.000 104.530 C 140.149 102.321 138.479 100.409 136.270 100.260 C 133.530 100.070 130.750 99.980 128.000 99.980 C 100.946 99.878 74.669 109.019 53.520 125.890 C 51.789 127.271 51.504 129.794 52.885 131.525 C 54.266 133.256 56.789 133.541 58.520 132.160 C 78.254 116.432 102.765 107.909 128.000 108.000 C 130.570 108.000 133.170 108.090 135.730 108.260 Z"),
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
        return _wifiX!!
    }

private var _wifiX: ImageVector? = null
