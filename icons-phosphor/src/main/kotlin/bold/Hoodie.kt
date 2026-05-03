package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Hoodie: ImageVector
    get() {
        if (_hoodie != null) return _hoodie!!
        _hoodie = phosphorBoldIcon(
            name = "Hoodie",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 244.640 118.310 L 190.370 36.910 C 186.662 31.345 180.417 28.001 173.730 28.000 L 82.270 28.000 C 75.583 28.001 69.338 31.345 65.630 36.910 L 11.360 118.310 C 8.152 123.124 7.186 129.090 8.710 134.670 L 30.140 213.260 C 32.512 221.960 40.412 227.997 49.430 228.000 L 76.000 228.000 C 87.046 228.000 96.000 219.046 96.000 208.000 L 96.000 196.000 L 160.000 196.000 L 160.000 208.000 C 160.000 219.046 168.954 228.000 180.000 228.000 L 206.570 228.000 C 215.588 227.997 223.488 221.960 225.860 213.260 L 247.290 134.670 C 248.814 129.090 247.848 123.124 244.640 118.310 ZM 84.000 172.000 L 84.000 70.640 L 96.000 78.140 L 96.000 136.000 C 96.000 142.627 101.373 148.000 108.000 148.000 C 114.627 148.000 120.000 142.627 120.000 136.000 L 120.000 93.150 L 121.640 94.150 C 125.531 96.582 130.469 96.582 134.360 94.150 L 136.000 93.150 L 136.000 128.000 C 136.000 134.627 141.373 140.000 148.000 140.000 C 154.627 140.000 160.000 134.627 160.000 128.000 L 160.000 78.140 L 172.000 70.640 L 172.000 172.000 ZM 128.000 69.850 L 99.460 52.000 L 156.540 52.000 ZM 52.490 204.000 L 32.340 130.110 L 60.000 88.620 L 60.000 176.000 C 60.004 183.949 64.715 191.141 72.000 194.320 L 72.000 204.000 ZM 203.490 204.000 L 184.000 204.000 L 184.000 194.320 C 191.285 191.141 195.996 183.949 196.000 176.000 L 196.000 88.620 L 223.660 130.110 Z"),
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
        return _hoodie!!
    }

private var _hoodie: ImageVector? = null
