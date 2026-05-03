package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Screwdriver: ImageVector
    get() {
        if (_screwdriver != null) return _screwdriver!!
        _screwdriver = phosphorBoldIcon(
            name = "Screwdriver",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.490 47.490 C 210.749 49.742 212.019 52.800 212.019 55.990 C 212.019 59.180 210.749 62.238 208.490 64.490 L 156.490 116.490 C 151.796 121.184 144.184 121.184 139.490 116.490 C 134.796 111.796 134.796 104.184 139.490 99.490 L 191.490 47.490 C 193.742 45.231 196.800 43.961 199.990 43.961 C 203.180 43.961 206.238 45.231 208.490 47.490 ZM 252.000 58.410 C 252.039 72.854 246.299 86.713 236.060 96.900 L 182.830 150.130 C 179.091 153.898 173.998 156.012 168.690 156.000 L 156.000 156.000 L 156.000 168.830 C 155.991 173.190 154.566 177.429 151.940 180.910 C 151.610 181.345 151.249 181.756 150.860 182.140 L 142.860 190.140 C 135.050 197.948 122.390 197.948 114.580 190.140 L 98.700 174.260 L 24.490 248.480 C 19.796 253.174 12.184 253.174 7.490 248.480 C 2.796 243.786 2.796 236.174 7.490 231.480 L 81.710 157.260 L 65.860 141.410 L 65.860 141.410 C 62.108 137.659 59.999 132.571 59.999 127.265 C 59.999 121.959 62.108 116.871 65.860 113.120 L 73.860 105.120 C 74.246 104.717 74.660 104.343 75.100 104.000 C 78.584 101.394 82.820 99.991 87.170 100.000 L 100.000 100.000 L 100.000 87.300 C 99.986 81.990 102.096 76.895 105.860 73.150 L 159.090 19.920 C 174.658 4.358 198.066 -0.295 218.402 8.130 C 238.738 16.554 251.998 36.398 252.000 58.410 ZM 228.000 58.410 C 227.998 46.105 220.586 35.012 209.218 30.302 C 197.850 25.592 184.764 28.192 176.060 36.890 L 124.000 89.000 L 124.000 104.000 C 124.000 115.046 115.046 124.000 104.000 124.000 L 88.940 124.000 L 85.660 127.280 L 107.180 148.810 L 107.180 148.810 L 128.710 170.330 L 131.990 167.050 L 131.990 152.000 C 131.990 140.954 140.944 132.000 151.990 132.000 L 166.990 132.000 L 219.050 79.930 C 224.789 74.241 228.012 66.491 228.000 58.410 Z"),
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
        return _screwdriver!!
    }

private var _screwdriver: ImageVector? = null
