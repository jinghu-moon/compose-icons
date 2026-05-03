package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.UserCircleCheck: ImageVector
    get() {
        if (_userCircleCheck != null) return _userCircleCheck!!
        _userCircleCheck = phosphorThinIcon(
            name = "UserCircleCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 222.000 108.050 C 220.954 108.226 220.020 108.811 219.405 109.676 C 218.790 110.540 218.543 111.614 218.720 112.660 C 219.568 117.729 219.996 122.860 220.000 128.000 C 220.014 152.326 210.363 175.661 193.170 192.870 C 183.233 176.257 167.302 164.087 148.660 158.870 C 166.495 149.385 175.580 128.975 170.693 109.376 C 165.805 89.776 148.200 76.022 128.000 76.022 C 107.800 76.022 90.195 89.776 85.307 109.376 C 80.420 128.975 89.505 149.385 107.340 158.870 C 88.698 164.087 72.767 176.257 62.830 192.870 C 36.634 166.526 28.854 127.012 43.107 92.704 C 57.360 58.396 90.849 36.027 128.000 36.000 C 133.140 36.001 138.270 36.425 143.340 37.270 C 145.508 37.612 147.546 36.143 147.909 33.979 C 148.271 31.814 146.821 29.762 144.660 29.380 C 103.274 22.387 61.925 41.983 41.133 78.444 C 20.340 114.905 24.529 160.469 51.620 192.528 C 78.712 224.587 122.940 236.316 162.358 221.895 C 201.775 207.474 227.993 169.973 228.000 128.000 C 227.998 122.418 227.536 116.846 226.620 111.340 C 226.446 110.290 225.861 109.352 224.994 108.735 C 224.127 108.117 223.049 107.871 222.000 108.050 ZM 92.000 120.000 C 92.000 100.118 108.118 84.000 128.000 84.000 C 147.882 84.000 164.000 100.118 164.000 120.000 C 164.000 139.882 147.882 156.000 128.000 156.000 C 108.118 156.000 92.000 139.882 92.000 120.000 ZM 68.870 198.420 C 80.952 177.145 103.533 164.000 128.000 164.000 C 152.467 164.000 175.048 177.145 187.130 198.420 C 152.960 227.193 103.040 227.193 68.870 198.420 ZM 234.870 42.830 L 202.870 74.830 C 202.120 75.581 201.102 76.003 200.040 76.003 C 198.978 76.003 197.960 75.581 197.210 74.830 L 181.210 58.830 C 179.647 57.267 179.647 54.733 181.210 53.170 C 182.773 51.607 185.307 51.607 186.870 53.170 L 200.000 66.340 L 229.170 37.170 C 230.733 35.607 233.267 35.607 234.830 37.170 C 236.393 38.733 236.393 41.267 234.830 42.830 Z"),
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
        return _userCircleCheck!!
    }

private var _userCircleCheck: ImageVector? = null
