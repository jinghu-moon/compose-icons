package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CowboyHat: ImageVector
    get() {
        if (_cowboyHat != null) return _cowboyHat!!
        _cowboyHat = phosphorBoldIcon(
            name = "CowboyHat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 212.000 116.000 C 207.861 115.999 204.014 118.130 201.820 121.640 Q 199.340 125.640 196.820 129.210 L 182.250 52.330 C 180.955 45.428 176.135 39.711 169.551 37.267 C 162.967 34.824 155.584 36.013 150.100 40.400 L 149.920 40.550 L 128.000 58.800 L 106.080 40.550 L 105.900 40.400 C 100.420 36.014 93.042 34.821 86.460 37.258 C 79.877 39.694 75.053 45.403 73.750 52.300 L 59.140 129.220 Q 56.650 125.610 54.140 121.650 C 51.956 118.148 48.127 116.015 44.000 116.000 C 19.699 116.000 0.000 135.699 0.000 160.000 C 0.000 184.301 19.699 204.000 44.000 204.000 L 212.000 204.000 C 236.301 204.000 256.000 184.301 256.000 160.000 C 256.000 135.699 236.301 116.000 212.000 116.000 ZM 96.070 63.440 L 115.320 79.440 L 115.510 79.590 C 122.802 85.482 133.218 85.482 140.510 79.590 L 140.700 79.440 L 159.950 63.440 L 171.440 124.000 L 84.560 124.000 ZM 44.000 180.000 C 34.111 180.004 25.704 172.780 24.219 163.004 C 22.734 153.227 28.616 143.833 38.060 140.900 C 49.760 158.280 61.760 170.900 73.060 180.000 ZM 79.000 153.250 L 80.000 148.000 L 176.000 148.000 L 177.000 153.250 C 151.670 178.250 130.290 179.900 128.000 180.000 C 125.710 179.900 104.330 178.290 79.000 153.250 ZM 212.000 180.000 L 183.000 180.000 C 194.280 170.880 206.280 158.280 218.000 140.900 C 227.455 143.836 233.339 153.248 231.837 163.034 C 230.335 172.819 221.900 180.034 212.000 180.000 Z"),
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
        return _cowboyHat!!
    }

private var _cowboyHat: ImageVector? = null
