package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Star: ImageVector
    get() {
        if (_star != null) return _star!!
        _star = phosphorBoldIcon(
            name = "Star",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 243.000 96.000 C 240.464 88.174 233.461 82.647 225.260 82.000 L 168.670 77.430 L 146.830 24.620 C 143.691 16.986 136.254 12.003 128.000 12.003 C 119.746 12.003 112.309 16.986 109.170 24.620 L 87.350 77.440 L 30.760 82.000 C 22.545 82.678 15.540 88.221 12.992 96.060 C 10.444 103.900 12.853 112.503 19.100 117.880 L 62.280 155.120 L 49.080 210.820 C 47.111 218.852 50.193 227.278 56.881 232.143 C 63.569 237.008 72.534 237.346 79.570 233.000 L 128.000 203.190 L 176.430 233.000 C 183.463 237.317 192.404 236.969 199.081 232.119 C 205.757 227.269 208.851 218.873 206.920 210.850 L 193.720 155.150 L 236.900 117.910 C 243.186 112.518 245.596 103.865 243.000 96.000 ZM 172.530 141.700 C 169.136 144.626 167.655 149.200 168.690 153.560 L 181.580 208.000 L 134.290 178.920 C 130.433 176.546 125.567 176.546 121.710 178.920 L 74.420 208.000 L 87.310 153.600 C 88.345 149.240 86.864 144.666 83.470 141.740 L 41.200 105.240 L 96.600 100.770 C 101.095 100.409 105.008 97.558 106.730 93.390 L 128.000 41.890 L 149.270 93.390 C 150.992 97.558 154.905 100.409 159.400 100.770 L 214.800 105.240 Z"),
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
        return _star!!
    }

private var _star: ImageVector? = null
