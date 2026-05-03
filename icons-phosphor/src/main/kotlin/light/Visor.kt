package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Visor: ImageVector
    get() {
        if (_visor != null) return _visor!!
        _visor = phosphorLightIcon(
            name = "Visor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 183.050 58.000 L 72.000 58.000 C 52.863 58.001 34.560 65.836 21.351 79.684 C 8.141 93.532 1.178 112.184 2.080 131.300 C 3.720 167.000 33.000 196.240 68.620 197.920 C 83.930 198.630 99.620 192.150 116.620 178.080 C 123.236 172.610 132.804 172.610 139.420 178.080 C 149.750 186.660 165.600 198.000 184.000 198.000 C 202.727 198.002 220.675 190.499 233.829 177.170 C 246.984 163.840 254.249 145.796 254.000 127.070 C 253.500 89.000 221.670 58.000 183.050 58.000 ZM 225.280 168.740 C 214.410 179.824 199.524 186.048 184.000 186.000 C 169.470 186.000 156.000 176.230 147.070 168.870 C 136.016 159.737 120.034 159.737 108.980 168.870 L 108.980 168.870 C 94.400 180.960 81.380 186.540 69.200 185.970 C 39.429 184.357 15.661 160.563 14.080 130.790 C 13.317 114.944 19.078 99.477 30.021 87.991 C 40.965 76.505 56.136 70.004 72.000 70.000 L 183.050 70.000 C 215.140 70.000 241.590 95.670 242.000 127.230 C 242.247 142.754 236.218 157.721 225.280 168.740 ZM 182.000 96.000 C 182.000 99.314 179.314 102.000 176.000 102.000 L 80.000 102.000 C 76.686 102.000 74.000 99.314 74.000 96.000 C 74.000 92.686 76.686 90.000 80.000 90.000 L 176.000 90.000 C 179.314 90.000 182.000 92.686 182.000 96.000 Z"),
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
        return _visor!!
    }

private var _visor: ImageVector? = null
