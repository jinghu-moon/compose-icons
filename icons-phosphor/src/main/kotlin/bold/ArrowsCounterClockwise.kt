package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowsCounterClockwise: ImageVector
    get() {
        if (_arrowsCounterClockwise != null) return _arrowsCounterClockwise!!
        _arrowsCounterClockwise = phosphorBoldIcon(
            name = "ArrowsCounterClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 88.000 108.000 L 40.000 108.000 C 33.373 108.000 28.000 102.627 28.000 96.000 L 28.000 48.000 C 28.000 41.373 33.373 36.000 40.000 36.000 C 46.627 36.000 52.000 41.373 52.000 48.000 L 52.000 67.000 L 59.800 59.200 C 78.397 40.528 103.647 30.004 130.000 29.940 L 130.560 29.940 C 156.687 29.877 181.788 40.105 200.430 58.410 C 205.169 63.044 205.254 70.641 200.620 75.380 C 195.986 80.119 188.389 80.204 183.650 75.570 C 153.873 46.488 106.242 46.769 76.810 76.200 L 69.000 84.000 L 88.000 84.000 C 94.627 84.000 100.000 89.373 100.000 96.000 C 100.000 102.627 94.627 108.000 88.000 108.000 ZM 216.000 148.000 L 168.000 148.000 C 161.373 148.000 156.000 153.373 156.000 160.000 C 156.000 166.627 161.373 172.000 168.000 172.000 L 187.000 172.000 L 179.200 179.800 C 165.078 193.992 145.901 201.998 125.880 202.060 L 125.450 202.060 C 105.598 202.111 86.524 194.340 72.360 180.430 C 67.621 175.796 60.024 175.881 55.390 180.620 C 50.756 185.359 50.841 192.956 55.580 197.590 C 74.222 215.895 99.323 226.123 125.450 226.060 L 126.000 226.060 C 152.344 225.978 177.577 215.443 196.160 196.770 L 204.000 189.000 L 204.000 208.000 C 204.000 214.627 209.373 220.000 216.000 220.000 C 222.627 220.000 228.000 214.627 228.000 208.000 L 228.000 160.000 C 228.000 153.373 222.627 148.000 216.000 148.000 Z"),
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
        return _arrowsCounterClockwise!!
    }

private var _arrowsCounterClockwise: ImageVector? = null
