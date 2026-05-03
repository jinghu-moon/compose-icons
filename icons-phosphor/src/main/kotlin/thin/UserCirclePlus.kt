package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.UserCirclePlus: ImageVector
    get() {
        if (_userCirclePlus != null) return _userCirclePlus!!
        _userCirclePlus = phosphorThinIcon(
            name = "UserCirclePlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 172.000 56.000 C 172.000 53.791 173.791 52.000 176.000 52.000 L 196.000 52.000 L 196.000 32.000 C 196.000 29.791 197.791 28.000 200.000 28.000 C 202.209 28.000 204.000 29.791 204.000 32.000 L 204.000 52.000 L 224.000 52.000 C 226.209 52.000 228.000 53.791 228.000 56.000 C 228.000 58.209 226.209 60.000 224.000 60.000 L 204.000 60.000 L 204.000 80.000 C 204.000 82.209 202.209 84.000 200.000 84.000 C 197.791 84.000 196.000 82.209 196.000 80.000 L 196.000 60.000 L 176.000 60.000 C 173.791 60.000 172.000 58.209 172.000 56.000 ZM 226.620 111.340 C 233.802 154.183 212.472 196.756 173.855 216.653 C 135.238 236.549 88.189 229.206 57.472 198.488 C 26.754 167.771 19.411 120.722 39.307 82.105 C 59.204 43.488 101.777 22.158 144.620 29.340 C 146.781 29.722 148.231 31.774 147.869 33.939 C 147.506 36.103 145.468 37.572 143.300 37.230 C 138.242 36.401 133.125 35.990 128.000 36.000 C 90.849 36.027 57.360 58.396 43.107 92.704 C 28.854 127.012 36.634 166.526 62.830 192.870 C 72.767 176.257 88.698 164.087 107.340 158.870 C 89.505 149.385 80.420 128.975 85.307 109.376 C 90.195 89.776 107.800 76.022 128.000 76.022 C 148.200 76.022 165.805 89.776 170.693 109.376 C 175.580 128.975 166.495 149.385 148.660 158.870 C 167.302 164.087 183.233 176.257 193.170 192.870 C 210.365 175.662 220.016 152.326 220.000 128.000 C 219.999 122.860 219.574 117.730 218.730 112.660 C 218.388 110.492 219.857 108.454 222.021 108.091 C 224.186 107.729 226.238 109.179 226.620 111.340 ZM 128.000 156.000 C 147.882 156.000 164.000 139.882 164.000 120.000 C 164.000 100.118 147.882 84.000 128.000 84.000 C 108.118 84.000 92.000 100.118 92.000 120.000 C 92.000 139.882 108.118 156.000 128.000 156.000 ZM 128.000 220.000 C 149.644 220.019 170.595 212.374 187.140 198.420 C 175.059 177.140 152.476 163.992 128.005 163.992 C 103.534 163.992 80.951 177.140 68.870 198.420 C 85.410 212.375 106.359 220.021 128.000 220.000 Z"),
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
        return _userCirclePlus!!
    }

private var _userCirclePlus: ImageVector? = null
