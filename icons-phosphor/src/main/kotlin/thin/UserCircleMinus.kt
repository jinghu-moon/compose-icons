package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.UserCircleMinus: ImageVector
    get() {
        if (_userCircleMinus != null) return _userCircleMinus!!
        _userCircleMinus = phosphorThinIcon(
            name = "UserCircleMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 172.000 56.000 C 172.000 53.791 173.791 52.000 176.000 52.000 L 224.000 52.000 C 226.209 52.000 228.000 53.791 228.000 56.000 C 228.000 58.209 226.209 60.000 224.000 60.000 L 176.000 60.000 C 173.791 60.000 172.000 58.209 172.000 56.000 ZM 222.310 94.670 C 236.827 135.736 223.094 181.475 188.357 207.752 C 153.620 234.029 105.870 234.800 70.303 209.657 C 34.736 184.514 19.535 139.241 32.720 97.729 C 45.905 56.216 84.444 28.012 128.000 28.000 C 133.582 27.997 139.155 28.459 144.660 29.380 C 146.821 29.762 148.271 31.814 147.909 33.979 C 147.546 36.143 145.508 37.612 143.340 37.270 C 138.270 36.425 133.140 36.001 128.000 36.000 C 90.849 36.027 57.360 58.396 43.107 92.704 C 28.854 127.012 36.634 166.526 62.830 192.870 C 72.767 176.257 88.698 164.087 107.340 158.870 C 89.505 149.385 80.420 128.975 85.307 109.376 C 90.195 89.776 107.800 76.022 128.000 76.022 C 148.200 76.022 165.805 89.776 170.693 109.376 C 175.580 128.975 166.495 149.385 148.660 158.870 C 167.302 164.087 183.233 176.257 193.170 192.870 C 218.134 167.822 226.531 130.681 214.770 97.330 C 214.238 95.969 214.490 94.426 215.428 93.306 C 216.365 92.185 217.840 91.665 219.273 91.949 C 220.706 92.233 221.871 93.276 222.310 94.670 ZM 128.000 156.000 C 147.882 156.000 164.000 139.882 164.000 120.000 C 164.000 100.118 147.882 84.000 128.000 84.000 C 108.118 84.000 92.000 100.118 92.000 120.000 C 92.000 139.882 108.118 156.000 128.000 156.000 ZM 128.000 220.000 C 149.644 220.019 170.595 212.374 187.140 198.420 C 175.059 177.140 152.476 163.992 128.005 163.992 C 103.534 163.992 80.951 177.140 68.870 198.420 C 85.410 212.375 106.359 220.021 128.000 220.000 Z"),
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
        return _userCircleMinus!!
    }

private var _userCircleMinus: ImageVector? = null
