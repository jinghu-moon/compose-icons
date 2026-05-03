package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FolderStar: ImageVector
    get() {
        if (_folderStar != null) return _folderStar!!
        _folderStar = phosphorThinIcon(
            name = "FolderStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 84.000 C 218.209 84.000 220.000 85.791 220.000 88.000 L 220.000 120.000 C 220.000 122.209 221.791 124.000 224.000 124.000 C 226.209 124.000 228.000 122.209 228.000 120.000 L 228.000 88.000 C 228.000 81.373 222.627 76.000 216.000 76.000 L 129.660 76.000 L 101.170 47.510 C 98.924 45.256 95.872 43.992 92.690 44.000 L 40.000 44.000 C 33.373 44.000 28.000 49.373 28.000 56.000 L 28.000 200.610 C 28.006 206.894 33.096 211.989 39.380 212.000 L 120.560 212.000 C 122.769 212.000 124.560 210.209 124.560 208.000 C 124.560 205.791 122.769 204.000 120.560 204.000 L 39.380 204.000 C 37.512 203.994 36.000 202.478 36.000 200.610 L 36.000 84.000 ZM 40.000 52.000 L 92.690 52.000 C 93.748 52.002 94.762 52.422 95.510 53.170 L 118.340 76.000 L 36.000 76.000 L 36.000 56.000 C 36.000 53.791 37.791 52.000 40.000 52.000 ZM 235.810 160.410 C 235.322 158.853 233.937 157.749 232.310 157.620 L 200.070 155.130 L 187.670 126.410 C 187.036 124.947 185.594 124.001 184.000 124.001 C 182.406 124.001 180.964 124.947 180.330 126.410 L 167.930 155.130 L 135.690 157.620 C 134.060 157.742 132.668 158.844 132.175 160.402 C 131.682 161.961 132.187 163.663 133.450 164.700 L 157.910 184.890 L 150.450 215.000 C 150.063 216.563 150.650 218.205 151.940 219.168 C 153.231 220.130 154.972 220.226 156.360 219.410 L 184.000 203.180 L 211.640 219.450 C 212.247 219.806 212.937 219.996 213.640 220.000 C 214.500 219.997 215.337 219.721 216.030 219.210 C 217.321 218.247 217.908 216.603 217.520 215.040 L 210.060 184.890 L 234.520 164.700 C 235.786 163.667 236.296 161.969 235.810 160.410 ZM 203.050 180.320 C 201.864 181.302 201.347 182.877 201.720 184.370 L 207.500 207.730 L 186.000 195.090 C 184.747 194.352 183.193 194.352 181.940 195.090 L 160.500 207.730 L 166.280 184.370 C 166.653 182.877 166.136 181.302 164.950 180.320 L 146.190 164.840 L 171.000 162.920 C 172.478 162.805 173.771 161.881 174.360 160.520 L 184.000 138.100 L 193.680 160.520 C 194.269 161.881 195.562 162.805 197.040 162.920 L 221.810 164.840 Z"),
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
        return _folderStar!!
    }

private var _folderStar: ImageVector? = null
