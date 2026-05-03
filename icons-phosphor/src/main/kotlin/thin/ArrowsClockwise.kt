package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowsClockwise: ImageVector
    get() {
        if (_arrowsClockwise != null) return _arrowsClockwise!!
        _arrowsClockwise = phosphorThinIcon(
            name = "ArrowsClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 220.000 48.000 L 220.000 96.000 C 220.000 98.209 218.209 100.000 216.000 100.000 L 168.000 100.000 C 165.791 100.000 164.000 98.209 164.000 96.000 C 164.000 93.791 165.791 92.000 168.000 92.000 L 206.340 92.000 L 184.890 70.540 C 152.357 38.011 99.711 37.703 66.800 69.850 C 65.220 71.396 62.686 71.370 61.140 69.790 C 59.594 68.210 59.620 65.676 61.200 64.130 C 97.246 28.920 154.910 29.259 190.540 64.890 L 212.000 86.340 L 212.000 48.000 C 212.000 45.791 213.791 44.000 216.000 44.000 C 218.209 44.000 220.000 45.791 220.000 48.000 ZM 189.200 186.150 C 173.545 201.526 152.463 210.116 130.520 210.060 L 130.050 210.060 C 107.920 209.992 86.722 201.145 71.110 185.460 L 49.660 164.000 L 88.000 164.000 C 90.209 164.000 92.000 162.209 92.000 160.000 C 92.000 157.791 90.209 156.000 88.000 156.000 L 40.000 156.000 C 37.791 156.000 36.000 157.791 36.000 160.000 L 36.000 208.000 C 36.000 210.209 37.791 212.000 40.000 212.000 C 42.209 212.000 44.000 210.209 44.000 208.000 L 44.000 169.660 L 65.460 191.110 C 82.551 208.292 105.765 217.985 130.000 218.060 L 130.510 218.060 C 154.546 218.117 177.638 208.708 194.790 191.870 C 196.370 190.324 196.396 187.790 194.850 186.210 C 193.304 184.630 190.770 184.604 189.190 186.150 Z"),
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
        return _arrowsClockwise!!
    }

private var _arrowsClockwise: ImageVector? = null
