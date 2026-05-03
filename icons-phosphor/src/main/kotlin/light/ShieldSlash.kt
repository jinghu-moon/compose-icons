package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ShieldSlash: ImageVector
    get() {
        if (_shieldSlash != null) return _shieldSlash!!
        _shieldSlash = phosphorLightIcon(
            name = "ShieldSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 52.440 36.000 C 50.370 33.797 46.985 33.478 44.539 35.255 C 42.094 37.033 41.353 40.351 42.810 43.000 C 37.491 45.123 34.001 50.273 34.000 56.000 L 34.000 112.000 C 34.000 163.940 59.120 195.400 80.200 212.640 C 102.930 231.240 125.470 237.530 126.420 237.790 C 127.454 238.072 128.546 238.072 129.580 237.790 C 130.940 237.420 161.490 228.840 187.250 202.090 L 203.560 220.000 C 205.791 222.452 209.588 222.631 212.040 220.400 C 214.492 218.169 214.671 214.372 212.440 211.920 ZM 128.000 225.720 C 113.236 220.647 99.500 212.973 87.440 203.060 C 59.940 180.390 46.000 149.750 46.000 112.000 L 46.000 56.000 C 46.000 54.895 46.895 54.000 48.000 54.000 L 52.600 54.000 L 179.160 193.190 C 164.893 207.894 147.368 219.037 128.000 225.720 ZM 222.000 56.000 L 222.000 112.000 C 222.000 132.290 218.170 151.050 210.620 167.770 C 209.649 169.920 207.509 171.301 205.150 171.300 C 204.297 171.302 203.454 171.118 202.680 170.760 C 199.664 169.397 198.321 165.848 199.680 162.830 C 206.530 147.670 210.000 130.570 210.000 112.000 L 210.000 56.000 C 210.000 54.895 209.105 54.000 208.000 54.000 L 98.520 54.000 C 95.206 54.000 92.520 51.314 92.520 48.000 C 92.520 44.686 95.206 42.000 98.520 42.000 L 208.000 42.000 C 215.732 42.000 222.000 48.268 222.000 56.000 Z"),
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
        return _shieldSlash!!
    }

private var _shieldSlash: ImageVector? = null
