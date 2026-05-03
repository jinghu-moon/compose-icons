package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CloudMoon: ImageVector
    get() {
        if (_cloudMoon != null) return _cloudMoon!!
        _cloudMoon = phosphorBoldIcon(
            name = "CloudMoon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 172.000 68.000 C 170.340 68.000 168.690 68.060 167.050 68.160 C 162.242 37.517 139.279 12.880 109.050 5.930 C 105.024 5.010 100.808 6.225 97.888 9.146 C 94.969 12.067 93.757 16.285 94.680 20.310 C 98.689 37.781 93.426 56.084 80.750 68.758 C 68.075 81.432 49.770 86.691 32.300 82.680 C 28.272 81.759 24.053 82.974 21.133 85.898 C 18.213 88.822 17.003 93.043 17.930 97.070 C 21.962 114.281 31.823 129.569 45.840 140.340 C 34.094 157.477 32.801 179.709 42.481 198.092 C 52.162 216.475 71.224 227.988 92.000 228.000 L 172.000 228.000 C 216.183 228.000 252.000 192.183 252.000 148.000 C 252.000 103.817 216.183 68.000 172.000 68.000 ZM 119.890 36.000 C 132.940 44.231 141.626 57.865 143.570 73.170 C 123.308 80.874 107.016 96.434 98.390 116.320 C 96.268 116.093 94.134 115.986 92.000 116.000 C 82.076 115.992 72.329 118.637 63.770 123.660 C 57.499 119.573 52.171 114.197 48.140 107.890 C 86.887 105.723 117.799 74.751 119.890 36.000 ZM 172.000 204.000 L 92.000 204.000 C 74.327 204.000 60.000 189.673 60.000 172.000 C 60.000 154.327 74.327 140.000 92.000 140.000 L 92.280 140.000 C 92.170 141.100 92.080 142.200 92.020 143.300 C 91.633 149.927 96.693 155.613 103.320 156.000 C 109.947 156.387 115.633 151.327 116.020 144.700 C 116.232 140.984 116.814 137.299 117.760 133.700 L 117.910 133.150 C 125.568 105.150 153.334 87.628 181.904 92.765 C 210.474 97.901 230.397 123.998 227.823 152.912 C 225.249 181.826 201.028 203.992 172.000 204.000 Z"),
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
        return _cloudMoon!!
    }

private var _cloudMoon: ImageVector? = null
