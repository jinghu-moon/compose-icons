package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Panorama: ImageVector
    get() {
        if (_panorama != null) return _panorama!!
        _panorama = phosphorRegularIcon(
            name = "Panorama",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 241.750 51.320 C 237.818 48.278 232.689 47.253 227.890 48.550 L 224.410 49.490 C 205.610 54.560 170.610 64.000 128.000 64.000 C 85.390 64.000 50.390 54.560 31.590 49.490 L 28.110 48.550 C 23.310 47.274 18.190 48.300 14.252 51.325 C 10.314 54.351 8.004 59.034 8.000 64.000 L 8.000 192.000 C 8.000 200.837 15.163 208.000 24.000 208.000 C 25.411 207.999 26.817 207.814 28.180 207.450 L 31.360 206.590 C 50.130 201.490 85.170 192.000 128.000 192.000 C 170.830 192.000 205.870 201.490 224.690 206.590 L 227.870 207.450 C 232.672 208.733 237.798 207.711 241.742 204.685 C 245.685 201.658 247.998 196.971 248.000 192.000 L 248.000 64.000 C 248.014 59.029 245.701 54.337 241.750 51.320 ZM 27.420 64.930 C 46.940 70.200 83.270 80.000 128.000 80.000 C 172.730 80.000 209.060 70.200 228.580 64.930 L 232.000 64.000 L 232.000 182.760 L 173.930 124.690 C 170.929 121.689 166.859 120.002 162.615 120.002 C 158.371 120.002 154.301 121.689 151.300 124.690 L 131.300 144.690 L 87.300 100.690 C 81.052 94.447 70.928 94.447 64.680 100.690 L 24.000 141.370 L 24.000 64.000 ZM 213.840 187.210 C 197.714 183.172 181.348 180.166 164.840 178.210 L 142.630 156.000 L 162.630 136.000 ZM 27.130 191.140 L 24.000 192.000 L 24.000 164.000 L 76.000 112.000 L 140.250 176.250 Q 134.250 176.010 128.000 176.000 C 83.000 176.000 45.280 186.230 27.130 191.140 ZM 192.000 108.000 C 192.000 101.373 197.373 96.000 204.000 96.000 C 210.627 96.000 216.000 101.373 216.000 108.000 C 216.000 114.627 210.627 120.000 204.000 120.000 C 197.373 120.000 192.000 114.627 192.000 108.000 Z"),
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
        return _panorama!!
    }

private var _panorama: ImageVector? = null
