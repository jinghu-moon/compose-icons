package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FolderStar: ImageVector
    get() {
        if (_folderStar != null) return _folderStar!!
        _folderStar = phosphorBoldIcon(
            name = "FolderStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 112.560 196.000 L 44.000 196.000 L 44.000 92.000 L 212.000 92.000 L 212.000 112.000 C 212.000 118.627 217.373 124.000 224.000 124.000 C 230.627 124.000 236.000 118.627 236.000 112.000 L 236.000 88.000 C 236.000 76.954 227.046 68.000 216.000 68.000 L 133.390 68.000 L 107.390 38.710 L 107.390 38.710 C 103.587 34.433 98.133 31.990 92.410 32.000 L 40.000 32.000 C 28.954 32.000 20.000 40.954 20.000 52.000 L 20.000 200.620 C 20.017 211.316 28.684 219.983 39.380 220.000 L 112.560 220.000 C 119.187 220.000 124.560 214.627 124.560 208.000 C 124.560 201.373 119.187 196.000 112.560 196.000 ZM 44.000 56.000 L 90.610 56.000 L 101.280 68.000 L 44.000 68.000 ZM 243.440 158.000 C 241.962 153.335 237.799 150.035 232.920 149.660 L 205.500 147.540 L 195.000 123.250 C 193.092 118.875 188.773 116.046 184.000 116.046 C 179.227 116.046 174.908 118.875 173.000 123.250 L 162.500 147.530 L 135.080 149.650 C 130.200 150.025 126.036 153.326 124.558 157.992 C 123.080 162.658 124.585 167.754 128.360 170.870 L 148.940 187.870 L 142.690 213.130 C 141.534 217.816 143.298 222.739 147.168 225.624 C 151.037 228.509 156.259 228.795 160.420 226.350 L 184.000 212.460 L 207.580 226.340 C 211.741 228.785 216.963 228.499 220.832 225.614 C 224.702 222.729 226.466 217.806 225.310 213.120 L 219.060 187.860 L 239.640 170.860 C 243.407 167.747 244.910 162.661 243.440 158.000 ZM 198.000 174.160 C 194.447 177.099 192.892 181.814 194.000 186.290 L 195.210 191.180 L 190.140 188.180 C 186.378 185.979 181.722 185.979 177.960 188.180 L 172.890 191.180 L 174.100 186.290 C 175.208 181.814 173.653 177.099 170.100 174.160 L 166.620 171.290 L 171.620 170.900 C 176.064 170.559 179.954 167.783 181.720 163.690 L 184.050 158.290 L 186.380 163.690 C 188.145 167.780 192.029 170.555 196.470 170.900 L 201.470 171.290 Z"),
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
        return _folderStar!!
    }

private var _folderStar: ImageVector? = null
