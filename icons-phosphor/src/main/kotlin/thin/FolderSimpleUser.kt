package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FolderSimpleUser: ImageVector
    get() {
        if (_folderSimpleUser != null) return _folderSimpleUser!!
        _folderSimpleUser = phosphorThinIcon(
            name = "FolderSimpleUser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 207.500 199.300 C 217.782 192.466 222.374 179.704 218.804 167.886 C 215.234 156.067 204.346 147.982 192.000 147.982 C 179.654 147.982 168.766 156.067 165.196 167.886 C 161.626 179.704 166.218 192.466 176.500 199.300 C 166.478 203.716 158.990 212.428 156.130 223.000 C 155.565 225.134 156.836 227.323 158.970 227.890 C 159.295 227.982 159.632 228.029 159.970 228.030 C 161.793 228.029 163.384 226.795 163.840 225.030 C 167.130 212.650 178.690 204.030 191.970 204.030 C 205.250 204.030 216.810 212.680 220.100 225.030 C 220.436 226.445 221.513 227.566 222.913 227.959 C 224.313 228.351 225.816 227.952 226.838 226.918 C 227.860 225.883 228.240 224.375 227.830 222.980 C 224.976 212.422 217.504 203.719 207.500 199.300 ZM 172.000 176.000 C 172.000 164.954 180.954 156.000 192.000 156.000 C 203.046 156.000 212.000 164.954 212.000 176.000 C 212.000 187.046 203.046 196.000 192.000 196.000 C 180.954 196.000 172.000 187.046 172.000 176.000 ZM 228.000 88.000 L 228.000 120.000 C 228.000 122.209 226.209 124.000 224.000 124.000 C 221.791 124.000 220.000 122.209 220.000 120.000 L 220.000 88.000 C 220.000 85.791 218.209 84.000 216.000 84.000 L 130.670 84.000 C 128.074 83.996 125.549 83.155 123.470 81.600 L 95.730 60.800 C 95.038 60.281 94.195 60.000 93.330 60.000 L 40.000 60.000 C 37.791 60.000 36.000 61.791 36.000 64.000 L 36.000 200.000 C 36.000 202.209 37.791 204.000 40.000 204.000 L 120.000 204.000 C 122.209 204.000 124.000 205.791 124.000 208.000 C 124.000 210.209 122.209 212.000 120.000 212.000 L 40.000 212.000 C 33.373 212.000 28.000 206.627 28.000 200.000 L 28.000 64.000 C 28.000 57.373 33.373 52.000 40.000 52.000 L 93.330 52.000 C 95.926 52.004 98.451 52.845 100.530 54.400 L 128.270 75.200 C 128.962 75.719 129.805 76.000 130.670 76.000 L 216.000 76.000 C 222.627 76.000 228.000 81.373 228.000 88.000 Z"),
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
        return _folderSimpleUser!!
    }

private var _folderSimpleUser: ImageVector? = null
