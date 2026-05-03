package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MoonStars: ImageVector
    get() {
        if (_moonStars != null) return _moonStars!!
        _moonStars = phosphorBoldIcon(
            name = "MoonStars",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 244.000 96.000 C 244.000 102.627 238.627 108.000 232.000 108.000 L 220.000 108.000 L 220.000 120.000 C 220.000 126.627 214.627 132.000 208.000 132.000 C 201.373 132.000 196.000 126.627 196.000 120.000 L 196.000 108.000 L 184.000 108.000 C 177.373 108.000 172.000 102.627 172.000 96.000 C 172.000 89.373 177.373 84.000 184.000 84.000 L 196.000 84.000 L 196.000 72.000 C 196.000 65.373 201.373 60.000 208.000 60.000 C 214.627 60.000 220.000 65.373 220.000 72.000 L 220.000 84.000 L 232.000 84.000 C 238.627 84.000 244.000 89.373 244.000 96.000 ZM 144.000 60.000 L 148.000 60.000 L 148.000 64.000 C 148.000 70.627 153.373 76.000 160.000 76.000 C 166.627 76.000 172.000 70.627 172.000 64.000 L 172.000 60.000 L 176.000 60.000 C 182.627 60.000 188.000 54.627 188.000 48.000 C 188.000 41.373 182.627 36.000 176.000 36.000 L 172.000 36.000 L 172.000 32.000 C 172.000 25.373 166.627 20.000 160.000 20.000 C 153.373 20.000 148.000 25.373 148.000 32.000 L 148.000 36.000 L 144.000 36.000 C 137.373 36.000 132.000 41.373 132.000 48.000 C 132.000 54.627 137.373 60.000 144.000 60.000 ZM 219.810 150.380 C 222.640 153.666 223.477 158.223 222.000 162.300 C 206.074 205.765 162.398 232.618 116.424 227.211 C 70.450 221.804 34.196 185.550 28.789 139.576 C 23.382 93.602 50.235 49.926 93.700 34.000 C 97.771 32.513 102.328 33.336 105.621 36.154 C 108.914 38.973 110.431 43.348 109.590 47.600 C 108.531 53.002 107.998 58.495 108.000 64.000 C 108.050 110.371 145.629 147.950 192.000 148.000 C 197.495 147.999 202.977 147.467 208.370 146.410 C 212.620 145.571 216.993 147.089 219.810 150.380 ZM 190.000 172.000 C 131.934 170.867 85.133 124.066 84.000 66.000 C 59.421 83.519 47.539 113.922 53.725 143.465 C 59.911 173.007 82.993 196.089 112.535 202.275 C 142.078 208.461 172.481 196.579 190.000 172.000 Z"),
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
        return _moonStars!!
    }

private var _moonStars: ImageVector? = null
