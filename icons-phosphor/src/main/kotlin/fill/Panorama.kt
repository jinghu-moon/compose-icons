package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Panorama: ImageVector
    get() {
        if (_panorama != null) return _panorama!!
        _panorama = phosphorFillIcon(
            name = "Panorama",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 241.750 51.320 C 237.819 48.277 232.689 47.251 227.890 48.550 L 224.410 49.490 C 205.610 54.560 170.610 64.000 128.000 64.000 C 85.390 64.000 50.390 54.560 31.590 49.490 L 28.110 48.550 C 23.310 47.274 18.190 48.300 14.252 51.325 C 10.314 54.351 8.004 59.034 8.000 64.000 L 8.000 192.000 C 8.000 200.837 15.163 208.000 24.000 208.000 C 25.411 207.999 26.817 207.814 28.180 207.450 L 31.360 206.590 C 50.130 201.490 85.170 192.000 128.000 192.000 C 170.830 192.000 205.870 201.490 224.690 206.590 L 227.870 207.450 C 232.672 208.733 237.798 207.711 241.742 204.685 C 245.685 201.658 247.998 196.971 248.000 192.000 L 248.000 64.000 C 248.014 59.029 245.701 54.337 241.750 51.320 ZM 204.000 96.000 C 210.627 96.000 216.000 101.373 216.000 108.000 C 216.000 114.627 210.627 120.000 204.000 120.000 C 197.373 120.000 192.000 114.627 192.000 108.000 C 192.000 101.373 197.373 96.000 204.000 96.000 ZM 128.000 176.000 C 83.000 176.000 45.280 186.230 27.130 191.140 L 24.000 192.000 L 24.000 152.700 L 70.340 106.350 C 71.841 104.848 73.877 104.004 76.000 104.004 C 78.123 104.004 80.159 104.848 81.660 106.350 L 152.280 177.000 C 144.490 176.350 136.370 176.000 128.000 176.000 ZM 228.870 191.140 C 212.102 186.420 195.073 182.680 177.870 179.940 L 142.610 144.680 L 157.000 130.340 C 160.124 127.218 165.186 127.218 168.310 130.340 L 229.200 191.220 Z"),
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
