package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ClockCounterClockwise: ImageVector
    get() {
        if (_clockCounterClockwise != null) return _clockCounterClockwise!!
        _clockCounterClockwise = phosphorThinIcon(
            name = "ClockCounterClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 132.000 80.000 L 132.000 125.740 L 170.060 148.570 C 171.954 149.708 172.568 152.166 171.430 154.060 C 170.292 155.954 167.834 156.568 165.940 155.430 L 125.940 131.430 C 124.736 130.707 124.000 129.405 124.000 128.000 L 124.000 80.000 C 124.000 77.791 125.791 76.000 128.000 76.000 C 130.209 76.000 132.000 77.791 132.000 80.000 ZM 128.000 36.000 C 103.574 35.946 80.142 45.669 62.930 63.000 C 53.050 73.000 44.660 82.470 36.000 92.860 L 36.000 64.000 C 36.000 61.791 34.209 60.000 32.000 60.000 C 29.791 60.000 28.000 61.791 28.000 64.000 L 28.000 104.000 C 28.000 106.209 29.791 108.000 32.000 108.000 L 72.000 108.000 C 74.209 108.000 76.000 106.209 76.000 104.000 C 76.000 101.791 74.209 100.000 72.000 100.000 L 40.470 100.000 C 49.610 89.000 58.300 79.000 68.600 68.600 C 101.179 36.019 153.923 35.762 186.817 68.025 C 219.712 100.288 220.478 153.027 188.534 186.231 C 156.591 219.436 103.862 220.711 70.350 189.090 C 68.743 187.571 66.209 187.643 64.690 189.250 C 63.171 190.857 63.243 193.391 64.850 194.910 C 94.893 223.262 140.151 228.113 175.521 206.773 C 210.890 185.432 227.700 143.133 216.626 103.336 C 205.551 63.540 169.309 36.003 128.000 36.000 Z"),
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
        return _clockCounterClockwise!!
    }

private var _clockCounterClockwise: ImageVector? = null
