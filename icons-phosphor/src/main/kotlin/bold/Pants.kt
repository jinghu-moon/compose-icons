package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Pants: ImageVector
    get() {
        if (_pants != null) return _pants!!
        _pants = phosphorBoldIcon(
            name = "Pants",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 227.850 213.520 L 205.850 37.520 C 204.599 27.509 196.088 19.998 186.000 20.000 L 70.000 20.000 C 59.912 19.998 51.401 27.509 50.150 37.520 L 28.150 213.520 C 27.439 219.213 29.206 224.937 33.004 229.238 C 36.801 233.539 42.263 236.001 48.000 236.000 L 88.690 236.000 C 97.823 236.028 105.807 229.848 108.070 221.000 L 128.000 144.000 L 147.910 220.940 C 150.170 229.807 158.160 236.009 167.310 236.000 L 208.000 236.000 C 213.737 236.001 219.199 233.539 222.996 229.238 C 226.794 224.937 228.561 219.213 227.850 213.520 ZM 182.470 44.000 L 184.470 60.000 L 71.530 60.000 L 73.530 44.000 ZM 85.600 212.000 L 52.530 212.000 L 63.730 122.400 C 81.351 117.490 94.113 102.214 95.810 84.000 L 116.000 84.000 L 116.000 94.470 ZM 170.410 212.000 L 140.000 94.470 L 140.000 84.000 L 160.190 84.000 C 161.885 102.212 174.649 117.486 192.270 122.390 L 203.470 212.000 Z"),
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
        return _pants!!
    }

private var _pants: ImageVector? = null
