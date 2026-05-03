package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ClockClockwise: ImageVector
    get() {
        if (_clockClockwise != null) return _clockClockwise!!
        _clockClockwise = phosphorThinIcon(
            name = "ClockClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 132.000 80.000 L 132.000 125.740 L 170.060 148.570 C 171.954 149.708 172.568 152.166 171.430 154.060 C 170.292 155.954 167.834 156.568 165.940 155.430 L 125.940 131.430 C 124.736 130.707 124.000 129.405 124.000 128.000 L 124.000 80.000 C 124.000 77.791 125.791 76.000 128.000 76.000 C 130.209 76.000 132.000 77.791 132.000 80.000 ZM 224.000 60.000 C 221.791 60.000 220.000 61.791 220.000 64.000 L 220.000 92.850 C 211.330 82.460 203.000 73.000 193.050 63.000 C 157.358 27.335 99.600 27.072 63.585 62.410 C 27.570 97.749 26.739 155.502 61.722 191.863 C 96.705 228.224 154.447 229.623 191.150 195.000 C 192.757 193.481 192.829 190.947 191.310 189.340 C 189.791 187.733 187.257 187.661 185.650 189.180 C 152.142 220.803 99.416 219.534 67.469 186.335 C 35.522 153.136 36.279 100.399 69.166 68.131 C 102.053 35.863 154.794 36.108 187.380 68.680 C 197.700 79.000 206.390 89.000 215.530 100.000 L 184.000 100.000 C 181.791 100.000 180.000 101.791 180.000 104.000 C 180.000 106.209 181.791 108.000 184.000 108.000 L 224.000 108.000 C 226.209 108.000 228.000 106.209 228.000 104.000 L 228.000 64.000 C 228.000 61.791 226.209 60.000 224.000 60.000 Z"),
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
        return _clockClockwise!!
    }

private var _clockClockwise: ImageVector? = null
