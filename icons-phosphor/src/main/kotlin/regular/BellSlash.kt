package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.BellSlash: ImageVector
    get() {
        if (_bellSlash != null) return _bellSlash!!
        _bellSlash = phosphorRegularIcon(
            name = "BellSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 53.920 34.620 C 52.008 32.465 49.085 31.504 46.267 32.105 C 43.450 32.706 41.173 34.775 40.306 37.522 C 39.439 40.270 40.117 43.271 42.080 45.380 L 58.820 63.800 C 51.711 76.003 47.976 89.877 48.000 104.000 C 48.000 139.340 39.740 166.380 34.190 175.940 C 31.305 180.887 31.284 186.998 34.135 191.965 C 36.986 196.932 42.273 199.996 48.000 200.000 L 88.800 200.000 C 92.586 218.643 108.977 232.040 128.000 232.040 C 147.023 232.040 163.414 218.643 167.200 200.000 L 182.640 200.000 L 202.080 221.380 C 203.992 223.535 206.915 224.496 209.733 223.895 C 212.550 223.294 214.827 221.225 215.694 218.478 C 216.561 215.730 215.883 212.729 213.920 210.620 ZM 128.000 216.000 C 117.832 215.997 108.769 209.587 105.380 200.000 L 150.620 200.000 C 147.231 209.587 138.168 215.997 128.000 216.000 ZM 48.000 184.000 C 55.700 170.760 64.000 140.080 64.000 104.000 C 63.986 94.440 66.126 85.000 70.260 76.380 L 168.090 184.000 ZM 214.000 179.270 C 213.066 179.632 212.072 179.819 211.070 179.820 C 207.782 179.817 204.830 177.801 203.630 174.740 C 196.350 156.190 192.000 129.750 192.000 104.000 C 192.007 81.220 179.904 60.154 160.222 48.685 C 140.540 37.216 116.245 37.073 96.430 48.310 C 92.600 50.385 87.814 49.015 85.662 45.227 C 83.511 41.439 84.786 36.626 88.530 34.400 C 113.298 20.351 143.666 20.526 168.270 34.860 C 192.875 49.194 208.005 75.525 208.000 104.000 C 208.000 139.350 216.050 162.590 218.520 168.880 C 220.135 172.992 218.111 177.634 214.000 179.250 Z"),
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
        return _bellSlash!!
    }

private var _bellSlash: ImageVector? = null
