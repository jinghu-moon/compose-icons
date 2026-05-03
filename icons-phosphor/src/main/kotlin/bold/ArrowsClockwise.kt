package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowsClockwise: ImageVector
    get() {
        if (_arrowsClockwise != null) return _arrowsClockwise!!
        _arrowsClockwise = phosphorBoldIcon(
            name = "ArrowsClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 228.000 48.000 L 228.000 96.000 C 228.000 102.627 222.627 108.000 216.000 108.000 L 168.000 108.000 C 161.373 108.000 156.000 102.627 156.000 96.000 C 156.000 89.373 161.373 84.000 168.000 84.000 L 187.000 84.000 L 179.200 76.200 C 165.078 62.008 145.901 54.002 125.880 53.940 L 125.450 53.940 C 105.608 53.897 86.547 61.667 72.390 75.570 C 67.651 80.204 60.054 80.119 55.420 75.380 C 50.786 70.641 50.871 63.044 55.610 58.410 C 74.252 40.105 99.353 29.877 125.480 29.940 L 126.000 29.940 C 152.357 30.012 177.608 40.547 196.200 59.230 L 204.000 67.000 L 204.000 48.000 C 204.000 41.373 209.373 36.000 216.000 36.000 C 222.627 36.000 228.000 41.373 228.000 48.000 ZM 183.610 180.430 C 169.446 194.340 150.372 202.111 130.520 202.060 L 130.090 202.060 C 110.069 201.998 90.892 193.992 76.770 179.800 L 69.000 172.000 L 88.000 172.000 C 94.627 172.000 100.000 166.627 100.000 160.000 C 100.000 153.373 94.627 148.000 88.000 148.000 L 40.000 148.000 C 33.373 148.000 28.000 153.373 28.000 160.000 L 28.000 208.000 C 28.000 214.627 33.373 220.000 40.000 220.000 C 46.627 220.000 52.000 214.627 52.000 208.000 L 52.000 189.000 L 59.800 196.800 C 78.397 215.472 103.647 225.996 130.000 226.060 L 130.560 226.060 C 156.687 226.123 181.788 215.895 200.430 197.590 C 205.169 192.956 205.254 185.359 200.620 180.620 C 195.986 175.881 188.389 175.796 183.650 180.430 Z"),
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
        return _arrowsClockwise!!
    }

private var _arrowsClockwise: ImageVector? = null
