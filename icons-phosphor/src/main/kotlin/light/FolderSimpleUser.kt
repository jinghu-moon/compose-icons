package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FolderSimpleUser: ImageVector
    get() {
        if (_folderSimpleUser != null) return _folderSimpleUser!!
        _folderSimpleUser = phosphorLightIcon(
            name = "FolderSimpleUser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 211.280 199.000 C 220.943 190.894 224.504 177.610 220.192 165.757 C 215.879 153.905 204.613 146.016 192.000 146.016 C 179.387 146.016 168.121 153.905 163.808 165.757 C 159.496 177.610 163.057 190.894 172.720 199.000 C 163.600 203.979 156.909 212.468 154.200 222.500 C 153.791 224.038 154.011 225.676 154.809 227.052 C 155.608 228.429 156.922 229.432 158.460 229.840 C 158.963 229.970 159.480 230.038 160.000 230.040 C 162.721 230.040 165.102 228.210 165.800 225.580 C 168.860 214.000 179.630 206.000 192.000 206.000 C 204.370 206.000 215.140 214.000 218.200 225.540 C 219.051 228.743 222.337 230.651 225.540 229.800 C 228.743 228.949 230.651 225.663 229.800 222.460 C 227.081 212.443 220.392 203.970 211.280 199.000 ZM 192.000 158.000 C 201.941 158.000 210.000 166.059 210.000 176.000 C 210.000 185.941 201.941 194.000 192.000 194.000 C 182.059 194.000 174.000 185.941 174.000 176.000 C 174.000 166.059 182.059 158.000 192.000 158.000 ZM 230.000 88.000 L 230.000 120.000 C 230.000 123.314 227.314 126.000 224.000 126.000 C 220.686 126.000 218.000 123.314 218.000 120.000 L 218.000 88.000 C 218.000 86.895 217.105 86.000 216.000 86.000 L 130.670 86.000 C 127.641 86.000 124.693 85.018 122.270 83.200 L 94.530 62.400 C 94.184 62.140 93.763 62.000 93.330 62.000 L 40.000 62.000 C 38.895 62.000 38.000 62.895 38.000 64.000 L 38.000 200.000 C 38.000 201.105 38.895 202.000 40.000 202.000 L 120.000 202.000 C 123.314 202.000 126.000 204.686 126.000 208.000 C 126.000 211.314 123.314 214.000 120.000 214.000 L 40.000 214.000 C 32.268 214.000 26.000 207.732 26.000 200.000 L 26.000 64.000 C 26.000 56.268 32.268 50.000 40.000 50.000 L 93.330 50.000 C 96.359 50.000 99.307 50.982 101.730 52.800 L 129.470 73.600 C 129.816 73.860 130.237 74.000 130.670 74.000 L 216.000 74.000 C 223.732 74.000 230.000 80.268 230.000 88.000 Z"),
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
