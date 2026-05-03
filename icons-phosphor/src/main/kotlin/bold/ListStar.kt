package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ListStar: ImageVector
    get() {
        if (_listStar != null) return _listStar!!
        _listStar = phosphorBoldIcon(
            name = "ListStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 28.000 64.000 C 28.000 57.373 33.373 52.000 40.000 52.000 L 216.000 52.000 C 222.627 52.000 228.000 57.373 228.000 64.000 C 228.000 70.627 222.627 76.000 216.000 76.000 L 40.000 76.000 C 33.373 76.000 28.000 70.627 28.000 64.000 ZM 40.000 140.000 L 88.000 140.000 C 94.627 140.000 100.000 134.627 100.000 128.000 C 100.000 121.373 94.627 116.000 88.000 116.000 L 40.000 116.000 C 33.373 116.000 28.000 121.373 28.000 128.000 C 28.000 134.627 33.373 140.000 40.000 140.000 ZM 104.000 180.000 L 40.000 180.000 C 33.373 180.000 28.000 185.373 28.000 192.000 C 28.000 198.627 33.373 204.000 40.000 204.000 L 104.000 204.000 C 110.627 204.000 116.000 198.627 116.000 192.000 C 116.000 185.373 110.627 180.000 104.000 180.000 ZM 239.640 146.870 L 219.060 163.870 L 225.310 189.130 C 226.466 193.816 224.702 198.739 220.832 201.624 C 216.963 204.509 211.741 204.795 207.580 202.350 L 184.000 188.460 L 160.420 202.340 C 156.259 204.785 151.037 204.499 147.168 201.614 C 143.298 198.729 141.534 193.806 142.690 189.120 L 148.940 163.860 L 128.360 146.860 C 124.585 143.744 123.080 138.648 124.558 133.982 C 126.036 129.316 130.200 126.015 135.080 125.640 L 162.500 123.520 L 173.000 99.250 C 174.908 94.875 179.227 92.046 184.000 92.046 C 188.773 92.046 193.092 94.875 195.000 99.250 L 205.480 123.530 L 232.900 125.650 C 237.780 126.025 241.944 129.326 243.422 133.992 C 244.900 138.658 243.395 143.754 239.620 146.870 ZM 201.430 147.290 L 196.430 146.900 C 191.989 146.555 188.105 143.780 186.340 139.690 L 184.010 134.290 L 181.680 139.690 C 179.914 143.783 176.024 146.559 171.580 146.900 L 166.580 147.290 L 170.060 150.160 C 173.613 153.099 175.168 157.814 174.060 162.290 L 172.850 167.180 L 177.920 164.180 C 181.682 161.979 186.338 161.979 190.100 164.180 L 195.170 167.180 L 194.000 162.290 C 192.892 157.814 194.447 153.099 198.000 150.160 Z"),
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
        return _listStar!!
    }

private var _listStar: ImageVector? = null
