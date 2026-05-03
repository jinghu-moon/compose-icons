package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TShirt: ImageVector
    get() {
        if (_tShirt != null) return _tShirt!!
        _tShirt = phosphorBoldIcon(
            name = "TShirt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 246.170 57.900 L 198.090 29.650 L 198.090 29.650 C 196.245 28.562 194.141 27.992 192.000 28.000 L 160.000 28.000 C 153.373 28.000 148.000 33.373 148.000 40.000 C 148.000 51.046 139.046 60.000 128.000 60.000 C 116.954 60.000 108.000 51.046 108.000 40.000 C 108.000 33.373 102.627 28.000 96.000 28.000 L 64.000 28.000 C 61.864 27.999 59.768 28.572 57.930 29.660 L 57.930 29.660 L 9.830 57.900 C 0.853 63.258 -2.545 74.585 2.000 84.000 L 19.900 120.800 C 23.158 127.657 30.079 132.019 37.670 132.000 L 52.000 132.000 L 52.000 208.000 C 52.000 219.046 60.954 228.000 72.000 228.000 L 184.000 228.000 C 195.046 228.000 204.000 219.046 204.000 208.000 L 204.000 132.000 L 218.320 132.000 C 225.896 132.012 232.803 127.665 236.070 120.830 L 254.000 84.000 C 258.545 74.585 255.147 63.258 246.170 57.900 ZM 40.370 108.000 L 25.160 76.730 L 52.000 61.000 L 52.000 108.000 ZM 180.000 204.000 L 76.000 204.000 L 76.000 52.000 L 85.670 52.000 C 91.027 70.947 108.320 84.028 128.010 84.028 C 147.700 84.028 164.993 70.947 170.350 52.000 L 180.000 52.000 ZM 215.620 108.000 L 204.000 108.000 L 204.000 61.000 L 230.830 76.760 Z"),
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
        return _tShirt!!
    }

private var _tShirt: ImageVector? = null
