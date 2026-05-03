package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FolderUser: ImageVector
    get() {
        if (_folderUser != null) return _folderUser!!
        _folderUser = phosphorLightIcon(
            name = "FolderUser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 211.280 199.000 C 220.943 190.894 224.504 177.610 220.192 165.757 C 215.879 153.905 204.613 146.016 192.000 146.016 C 179.387 146.016 168.121 153.905 163.808 165.757 C 159.496 177.610 163.057 190.894 172.720 199.000 C 163.600 203.979 156.909 212.468 154.200 222.500 C 153.791 224.038 154.011 225.676 154.809 227.052 C 155.608 228.429 156.922 229.432 158.460 229.840 C 158.963 229.970 159.480 230.038 160.000 230.040 C 162.721 230.040 165.102 228.210 165.800 225.580 C 168.860 214.000 179.630 206.000 192.000 206.000 C 204.370 206.000 215.140 214.000 218.200 225.540 C 219.053 228.743 222.342 230.648 225.545 229.795 C 228.748 228.942 230.653 225.653 229.800 222.450 C 227.078 212.437 220.390 203.968 211.280 199.000 ZM 192.000 158.000 C 201.941 158.000 210.000 166.059 210.000 176.000 C 210.000 185.941 201.941 194.000 192.000 194.000 C 182.059 194.000 174.000 185.941 174.000 176.000 C 174.000 166.059 182.059 158.000 192.000 158.000 ZM 216.000 74.000 L 130.480 74.000 L 102.590 46.100 C 99.968 43.469 96.404 41.993 92.690 42.000 L 40.000 42.000 C 32.268 42.000 26.000 48.268 26.000 56.000 L 26.000 200.610 C 26.006 207.999 31.991 213.989 39.380 214.000 L 120.560 214.000 C 123.874 214.000 126.560 211.314 126.560 208.000 C 126.560 204.686 123.874 202.000 120.560 202.000 L 39.380 202.000 C 38.618 201.989 38.005 201.372 38.000 200.610 L 38.000 86.000 L 216.000 86.000 C 217.105 86.000 218.000 86.895 218.000 88.000 L 218.000 120.000 C 218.000 123.314 220.686 126.000 224.000 126.000 C 227.314 126.000 230.000 123.314 230.000 120.000 L 230.000 88.000 C 230.000 80.268 223.732 74.000 216.000 74.000 ZM 40.000 54.000 L 92.690 54.000 C 93.220 54.002 93.727 54.214 94.100 54.590 L 113.510 74.000 L 38.000 74.000 L 38.000 56.000 C 38.000 54.895 38.895 54.000 40.000 54.000 Z"),
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
        return _folderUser!!
    }

private var _folderUser: ImageVector? = null
