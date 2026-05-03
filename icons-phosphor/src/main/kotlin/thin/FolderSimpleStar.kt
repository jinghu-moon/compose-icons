package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FolderSimpleStar: ImageVector
    get() {
        if (_folderSimpleStar != null) return _folderSimpleStar!!
        _folderSimpleStar = phosphorThinIcon(
            name = "FolderSimpleStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 84.000 L 128.000 84.000 C 127.135 84.000 126.292 83.719 125.600 83.200 L 95.730 60.800 C 95.038 60.281 94.195 60.000 93.330 60.000 L 40.000 60.000 C 37.791 60.000 36.000 61.791 36.000 64.000 L 36.000 200.000 C 36.000 202.209 37.791 204.000 40.000 204.000 L 120.000 204.000 C 122.209 204.000 124.000 205.791 124.000 208.000 C 124.000 210.209 122.209 212.000 120.000 212.000 L 40.000 212.000 C 33.373 212.000 28.000 206.627 28.000 200.000 L 28.000 64.000 C 28.000 57.373 33.373 52.000 40.000 52.000 L 93.330 52.000 C 95.926 52.004 98.451 52.845 100.530 54.400 L 129.330 76.000 L 216.000 76.000 C 222.627 76.000 228.000 81.373 228.000 88.000 L 228.000 120.000 C 228.000 122.209 226.209 124.000 224.000 124.000 C 221.791 124.000 220.000 122.209 220.000 120.000 L 220.000 88.000 C 220.000 85.791 218.209 84.000 216.000 84.000 ZM 234.550 164.700 L 210.090 184.890 L 217.550 215.000 C 217.938 216.563 217.351 218.207 216.060 219.170 C 215.367 219.681 214.530 219.957 213.670 219.960 C 212.967 219.956 212.277 219.766 211.670 219.410 L 184.000 203.180 L 156.360 219.450 C 154.972 220.266 153.231 220.170 151.940 219.208 C 150.650 218.245 150.063 216.603 150.450 215.040 L 157.910 184.890 L 133.450 164.700 C 132.187 163.663 131.682 161.961 132.175 160.402 C 132.668 158.844 134.060 157.742 135.690 157.620 L 167.930 155.130 L 180.330 126.410 C 180.964 124.947 182.406 124.001 184.000 124.001 C 185.594 124.001 187.036 124.947 187.670 126.410 L 200.070 155.130 L 232.310 157.620 C 233.940 157.742 235.332 158.844 235.825 160.402 C 236.318 161.961 235.813 163.663 234.550 164.700 ZM 221.810 164.840 L 197.000 162.920 C 195.522 162.805 194.229 161.881 193.640 160.520 L 184.000 138.100 L 174.320 160.520 C 173.731 161.881 172.438 162.805 170.960 162.920 L 146.190 164.840 L 165.000 180.320 C 166.186 181.302 166.703 182.877 166.330 184.370 L 160.550 207.730 L 182.000 195.090 C 183.253 194.352 184.807 194.352 186.060 195.090 L 207.530 207.730 L 201.750 184.370 C 201.377 182.877 201.894 181.302 203.080 180.320 Z"),
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
