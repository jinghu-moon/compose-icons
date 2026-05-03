package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Basket: ImageVector
    get() {
        if (_basket != null) return _basket!!
        _basket = phosphorBoldIcon(
            name = "Basket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 140.000 128.000 L 140.000 168.000 C 140.000 174.627 134.627 180.000 128.000 180.000 C 121.373 180.000 116.000 174.627 116.000 168.000 L 116.000 128.000 C 116.000 121.373 121.373 116.000 128.000 116.000 C 134.627 116.000 140.000 121.373 140.000 128.000 ZM 168.060 126.810 L 164.060 166.810 C 163.403 173.404 168.216 179.282 174.810 179.940 C 175.210 179.940 175.620 180.000 176.010 180.000 C 182.172 179.994 187.329 175.322 187.940 169.190 L 191.940 129.190 C 192.514 122.643 187.715 116.853 181.176 116.201 C 174.637 115.549 168.789 120.279 168.060 126.810 ZM 87.940 126.810 C 87.211 120.279 81.363 115.549 74.824 116.201 C 68.285 116.853 63.486 122.643 64.060 129.190 L 68.060 169.190 C 68.671 175.326 73.834 180.000 80.000 180.000 C 80.390 180.000 80.800 180.000 81.200 179.940 C 87.794 179.282 92.607 173.404 91.950 166.810 ZM 243.940 89.590 L 228.870 202.590 C 227.542 212.551 219.049 219.993 209.000 220.000 L 47.000 220.000 C 36.986 219.971 28.528 212.562 27.180 202.640 L 12.110 89.640 C 11.636 86.203 12.672 82.730 14.952 80.115 C 17.231 77.500 20.531 75.999 24.000 76.000 L 66.550 76.000 L 119.000 16.100 C 121.279 13.496 124.570 12.003 128.030 12.003 C 131.490 12.003 134.781 13.496 137.060 16.100 L 189.450 76.000 L 232.000 76.000 C 235.459 76.001 238.749 77.495 241.027 80.098 C 243.305 82.702 244.348 86.161 243.890 89.590 ZM 98.450 76.000 L 157.550 76.000 L 128.000 42.220 ZM 218.290 100.000 L 37.710 100.000 L 50.510 196.000 L 205.510 196.000 Z"),
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
        return _basket!!
    }

private var _basket: ImageVector? = null
