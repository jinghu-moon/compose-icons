package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PenNib: ImageVector
    get() {
        if (_penNib != null) return _penNib!!
        _penNib = phosphorBoldIcon(
            name = "PenNib",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 252.000 92.680 C 252.014 87.373 249.904 82.281 246.140 78.540 L 177.460 9.850 C 173.709 6.098 168.621 3.989 163.315 3.989 C 158.009 3.989 152.921 6.098 149.170 9.850 L 121.350 37.670 L 64.110 59.140 C 57.420 61.647 52.575 67.533 51.400 74.580 L 28.160 214.000 C 27.571 217.484 28.548 221.051 30.830 223.749 C 33.111 226.447 36.466 228.002 40.000 228.000 C 40.670 228.003 41.339 227.950 42.000 227.840 L 181.450 204.590 C 188.489 203.404 194.368 198.568 196.890 191.890 L 218.350 134.640 L 246.170 106.820 C 249.924 103.075 252.023 97.983 252.000 92.680 ZM 175.200 181.300 L 75.000 198.000 L 108.000 165.000 C 122.967 171.756 140.624 166.850 149.959 153.341 C 159.295 139.832 157.642 121.581 146.031 109.969 C 134.419 98.358 116.168 96.705 102.659 106.041 C 89.150 115.376 84.244 133.033 91.000 148.000 L 58.000 181.000 L 74.700 80.800 L 125.000 61.940 L 194.050 131.000 ZM 112.000 134.000 C 112.000 128.477 116.477 124.000 122.000 124.000 C 127.523 124.000 132.000 128.477 132.000 134.000 C 132.000 139.523 127.523 144.000 122.000 144.000 C 116.477 144.000 112.000 139.523 112.000 134.000 ZM 208.000 111.000 L 145.000 48.000 L 163.340 29.660 L 226.340 92.660 Z"),
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
        return _penNib!!
    }

private var _penNib: ImageVector? = null
