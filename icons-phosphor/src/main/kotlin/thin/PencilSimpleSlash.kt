package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PencilSimpleSlash: ImageVector
    get() {
        if (_pencilSimpleSlash != null) return _pencilSimpleSlash!!
        _pencilSimpleSlash = phosphorThinIcon(
            name = "PencilSimpleSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 51.000 37.310 C 49.514 35.653 46.967 35.514 45.310 37.000 C 43.653 38.486 43.514 41.033 45.000 42.690 L 95.810 98.540 L 39.510 154.830 C 37.263 157.080 36.000 160.130 36.000 163.310 L 36.000 208.000 C 36.000 214.627 41.373 220.000 48.000 220.000 L 92.690 220.000 C 95.872 220.008 98.924 218.744 101.170 216.490 L 154.530 163.130 L 205.000 218.690 C 205.956 219.768 207.417 220.248 208.826 219.948 C 210.235 219.647 211.374 218.613 211.807 217.239 C 212.240 215.865 211.902 214.364 210.920 213.310 ZM 95.520 210.830 C 94.766 211.574 93.750 211.994 92.690 212.000 L 48.000 212.000 C 45.791 212.000 44.000 210.209 44.000 208.000 L 44.000 163.310 C 44.002 162.252 44.422 161.238 45.170 160.490 L 101.170 104.490 L 149.110 157.230 ZM 224.520 76.200 L 179.800 31.520 C 177.548 29.261 174.490 27.991 171.300 27.991 C 168.110 27.991 165.052 29.261 162.800 31.520 L 121.160 73.190 C 119.667 74.764 119.701 77.241 121.236 78.773 C 122.772 80.306 125.249 80.336 126.820 78.840 L 136.000 69.660 L 186.350 120.000 L 174.500 131.850 C 173.445 132.850 173.016 134.344 173.379 135.751 C 173.742 137.159 174.840 138.258 176.247 138.624 C 177.654 138.989 179.148 138.563 180.150 137.510 L 224.490 93.170 C 229.176 88.484 229.176 80.886 224.490 76.200 ZM 218.860 87.510 L 192.000 114.340 L 141.660 64.000 L 168.490 37.170 C 170.074 35.659 172.566 35.659 174.150 37.170 L 218.830 81.860 C 220.388 83.421 220.388 85.949 218.830 87.510 Z"),
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
        return _pencilSimpleSlash!!
    }

private var _pencilSimpleSlash: ImageVector? = null
