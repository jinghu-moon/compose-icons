package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FolderSimpleStar: ImageVector
    get() {
        if (_folderSimpleStar != null) return _folderSimpleStar!!
        _folderSimpleStar = phosphorBoldIcon(
            name = "FolderSimpleStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 44.000 68.000 L 44.000 196.000 L 108.000 196.000 C 114.627 196.000 120.000 201.373 120.000 208.000 C 120.000 214.627 114.627 220.000 108.000 220.000 L 40.000 220.000 C 28.954 220.000 20.000 211.046 20.000 200.000 L 20.000 64.000 C 20.000 52.954 28.954 44.000 40.000 44.000 L 93.330 44.000 C 97.656 44.009 101.864 45.411 105.330 48.000 L 132.000 68.000 L 216.000 68.000 C 227.046 68.000 236.000 76.954 236.000 88.000 L 236.000 108.000 C 236.000 114.627 230.627 120.000 224.000 120.000 C 217.373 120.000 212.000 114.627 212.000 108.000 L 212.000 92.000 L 128.000 92.000 C 125.404 92.000 122.877 91.158 120.800 89.600 L 92.000 68.000 ZM 239.640 170.870 L 219.060 187.870 L 225.310 213.130 C 226.466 217.816 224.702 222.739 220.832 225.624 C 216.963 228.509 211.741 228.795 207.580 226.350 L 184.000 212.460 L 160.420 226.340 C 156.259 228.785 151.037 228.499 147.168 225.614 C 143.298 222.729 141.534 217.806 142.690 213.120 L 148.940 187.860 L 128.360 170.860 C 124.585 167.744 123.080 162.648 124.558 157.982 C 126.036 153.316 130.200 150.015 135.080 149.640 L 162.500 147.520 L 173.000 123.240 C 174.908 118.865 179.227 116.036 184.000 116.036 C 188.773 116.036 193.092 118.865 195.000 123.240 L 205.480 147.530 L 232.900 149.650 C 237.780 150.025 241.944 153.326 243.422 157.992 C 244.900 162.658 243.395 167.754 239.620 170.870 ZM 201.440 171.290 L 196.440 170.900 C 191.999 170.555 188.115 167.780 186.350 163.690 L 184.020 158.290 L 181.690 163.690 C 179.924 167.783 176.034 170.559 171.590 170.900 L 166.590 171.290 L 170.070 174.160 C 173.623 177.099 175.178 181.814 174.070 186.290 L 172.860 191.180 L 177.930 188.180 C 181.688 185.966 186.352 185.966 190.110 188.180 L 195.180 191.180 L 194.000 186.290 C 192.892 181.814 194.447 177.099 198.000 174.160 Z"),
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
        return _folderSimpleStar!!
    }

private var _folderSimpleStar: ImageVector? = null
