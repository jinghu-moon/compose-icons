package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Hand: ImageVector
    get() {
        if (_hand != null) return _hand!!
        _hand = phosphorBoldIcon(
            name = "Hand",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 188.000 44.000 C 185.302 43.995 182.614 44.331 180.000 45.000 L 180.000 44.000 C 180.014 29.082 169.719 16.133 155.182 12.785 C 140.644 9.437 125.722 16.579 119.210 30.000 C 109.380 26.323 98.371 27.701 89.750 33.686 C 81.129 39.672 75.991 49.505 76.000 60.000 L 76.000 110.830 C 65.207 98.518 46.862 96.338 33.485 105.779 C 20.108 115.220 16.015 133.236 24.000 147.530 C 55.820 214.600 75.350 244.000 128.000 244.000 C 178.787 243.945 219.945 202.787 220.000 152.000 L 220.000 76.000 C 220.000 58.327 205.673 44.000 188.000 44.000 ZM 196.000 152.000 C 195.956 189.537 165.537 219.956 128.000 220.000 C 92.170 220.000 78.290 206.000 45.520 136.860 C 45.380 136.570 45.230 136.280 45.070 136.000 C 43.001 132.189 44.344 127.424 48.099 125.255 C 51.854 123.086 56.653 124.304 58.920 128.000 L 59.130 128.350 L 77.810 158.350 C 80.641 162.902 86.148 165.024 91.301 163.549 C 96.455 162.075 100.006 157.361 100.000 152.000 L 100.000 60.000 C 100.000 55.582 103.582 52.000 108.000 52.000 C 112.418 52.000 116.000 55.582 116.000 60.000 L 116.000 120.000 C 116.000 126.627 121.373 132.000 128.000 132.000 C 134.627 132.000 140.000 126.627 140.000 120.000 L 140.000 44.000 C 140.000 39.582 143.582 36.000 148.000 36.000 C 152.418 36.000 156.000 39.582 156.000 44.000 L 156.000 120.000 C 156.000 126.627 161.373 132.000 168.000 132.000 C 174.627 132.000 180.000 126.627 180.000 120.000 L 180.000 76.000 C 180.000 71.582 183.582 68.000 188.000 68.000 C 192.418 68.000 196.000 71.582 196.000 76.000 Z"),
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
        return _hand!!
    }

private var _hand: ImageVector? = null
