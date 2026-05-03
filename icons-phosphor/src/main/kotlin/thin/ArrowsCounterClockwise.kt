package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowsCounterClockwise: ImageVector
    get() {
        if (_arrowsCounterClockwise != null) return _arrowsCounterClockwise!!
        _arrowsCounterClockwise = phosphorThinIcon(
            name = "ArrowsCounterClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 88.000 100.000 L 40.000 100.000 C 37.791 100.000 36.000 98.209 36.000 96.000 L 36.000 48.000 C 36.000 45.791 37.791 44.000 40.000 44.000 C 42.209 44.000 44.000 45.791 44.000 48.000 L 44.000 86.340 L 65.460 64.890 C 82.549 47.704 105.764 38.010 130.000 37.940 L 130.510 37.940 C 154.550 37.879 177.646 47.288 194.800 64.130 C 196.380 65.676 196.406 68.210 194.860 69.790 C 193.314 71.370 190.780 71.396 189.200 69.850 C 173.545 54.474 152.463 45.884 130.520 45.940 L 130.050 45.940 C 107.920 46.008 86.722 54.855 71.110 70.540 L 49.660 92.000 L 88.000 92.000 C 90.209 92.000 92.000 93.791 92.000 96.000 C 92.000 98.209 90.209 100.000 88.000 100.000 ZM 216.000 156.000 L 168.000 156.000 C 165.791 156.000 164.000 157.791 164.000 160.000 C 164.000 162.209 165.791 164.000 168.000 164.000 L 206.340 164.000 L 184.890 185.460 C 169.291 201.133 148.113 209.979 126.000 210.060 L 125.530 210.060 C 103.570 210.129 82.467 201.538 66.800 186.150 C 65.220 184.604 62.686 184.630 61.140 186.210 C 59.594 187.790 59.620 190.324 61.200 191.870 C 78.351 208.710 101.444 218.119 125.480 218.060 L 126.000 218.060 C 150.239 217.992 173.459 208.298 190.550 191.110 L 212.000 169.660 L 212.000 208.000 C 212.000 210.209 213.791 212.000 216.000 212.000 C 218.209 212.000 220.000 210.209 220.000 208.000 L 220.000 160.000 C 220.000 157.791 218.209 156.000 216.000 156.000 Z"),
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
