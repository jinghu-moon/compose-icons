package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.UserCircleMinus: ImageVector
    get() {
        if (_userCircleMinus != null) return _userCircleMinus!!
        _userCircleMinus = phosphorBoldIcon(
            name = "UserCircleMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 164.000 56.000 C 164.000 49.373 169.373 44.000 176.000 44.000 L 224.000 44.000 C 230.627 44.000 236.000 49.373 236.000 56.000 C 236.000 62.627 230.627 68.000 224.000 68.000 L 176.000 68.000 C 169.373 68.000 164.000 62.627 164.000 56.000 ZM 229.850 92.000 C 245.531 136.351 230.700 185.751 193.184 214.131 C 155.667 242.512 104.096 243.344 65.684 216.189 C 27.271 189.035 10.853 140.139 25.094 95.305 C 39.335 50.471 80.958 20.012 128.000 20.000 C 134.031 19.999 140.051 20.497 146.000 21.490 C 152.536 22.595 156.940 28.789 155.835 35.325 C 154.730 41.861 148.536 46.265 142.000 45.160 C 137.373 44.388 132.691 44.000 128.000 44.000 C 95.824 43.978 66.466 62.352 52.422 91.301 C 38.377 120.251 42.117 154.681 62.050 179.940 C 69.828 170.047 79.742 162.041 91.050 156.520 C 70.931 136.146 71.068 103.340 91.358 83.136 C 111.647 62.931 144.453 62.931 164.742 83.136 C 185.032 103.340 185.169 136.146 165.050 156.520 C 176.361 162.038 186.275 170.044 194.050 179.940 C 211.860 157.316 216.831 127.142 207.220 100.000 C 205.011 93.751 208.286 86.894 214.535 84.685 C 220.784 82.476 227.641 85.751 229.850 92.000 ZM 128.000 148.000 C 143.464 148.000 156.000 135.464 156.000 120.000 C 156.000 104.536 143.464 92.000 128.000 92.000 C 112.536 92.000 100.000 104.536 100.000 120.000 C 100.000 135.464 112.536 148.000 128.000 148.000 ZM 128.000 212.000 C 145.354 212.012 162.281 206.619 176.430 196.570 C 165.131 181.121 147.140 171.989 128.000 171.989 C 108.860 171.989 90.869 181.121 79.570 196.570 C 93.718 206.619 110.646 212.012 128.000 212.000 Z"),
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
