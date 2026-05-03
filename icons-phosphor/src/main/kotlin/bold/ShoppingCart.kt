package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ShoppingCart: ImageVector
    get() {
        if (_shoppingCart != null) return _shoppingCart!!
        _shoppingCart = phosphorBoldIcon(
            name = "ShoppingCart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 233.210 56.310 C 230.931 53.579 227.557 52.001 224.000 52.000 L 66.000 52.000 L 60.530 21.850 C 59.492 16.148 54.526 12.003 48.730 12.000 L 24.000 12.000 C 17.373 12.000 12.000 17.373 12.000 24.000 C 12.000 30.627 17.373 36.000 24.000 36.000 L 38.710 36.000 L 63.620 173.000 C 64.289 176.639 65.672 180.109 67.690 183.210 C 57.828 194.749 57.430 211.628 66.736 223.619 C 76.042 235.611 92.492 239.415 106.117 232.726 C 119.743 226.037 126.795 210.697 123.000 196.000 L 157.000 196.000 C 153.580 209.246 158.959 223.202 170.385 230.726 C 181.811 238.250 196.756 237.678 207.573 229.303 C 218.391 220.928 222.688 206.603 218.266 193.656 C 213.844 180.710 201.681 172.007 188.000 172.000 L 91.170 172.000 C 89.240 171.998 87.587 170.618 87.240 168.720 L 84.920 156.000 L 196.100 156.000 C 209.635 156.000 221.233 146.318 223.650 133.000 L 235.810 66.140 C 236.443 62.640 235.491 59.039 233.210 56.310 ZM 100.000 204.000 C 100.000 208.418 96.418 212.000 92.000 212.000 C 87.582 212.000 84.000 208.418 84.000 204.000 C 84.000 199.582 87.582 196.000 92.000 196.000 C 96.418 196.000 100.000 199.582 100.000 204.000 ZM 188.000 212.000 C 183.582 212.000 180.000 208.418 180.000 204.000 C 180.000 199.582 183.582 196.000 188.000 196.000 C 192.418 196.000 196.000 199.582 196.000 204.000 C 196.000 208.418 192.418 212.000 188.000 212.000 ZM 200.000 128.720 C 199.655 130.607 198.018 131.983 196.100 132.000 L 80.560 132.000 L 70.380 76.000 L 209.620 76.000 Z"),
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
        return _shoppingCart!!
    }

private var _shoppingCart: ImageVector? = null
