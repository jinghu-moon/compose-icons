package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Hamburger: ImageVector
    get() {
        if (_hamburger != null) return _hamburger!!
        _hamburger = phosphorThinIcon(
            name = "Hamburger",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 48.070 100.000 L 207.930 100.000 C 211.573 100.022 215.029 98.389 217.324 95.559 C 219.619 92.729 220.504 89.010 219.730 85.450 C 216.340 69.450 205.170 54.770 188.270 44.220 C 171.370 33.670 150.110 28.000 128.000 28.000 C 105.890 28.000 84.490 33.760 67.730 44.220 C 50.970 54.680 39.660 69.410 36.270 85.450 C 35.496 89.010 36.381 92.729 38.676 95.559 C 40.971 98.389 44.427 100.022 48.070 100.000 ZM 44.070 87.110 C 50.260 58.000 86.330 36.000 128.000 36.000 C 169.670 36.000 205.740 58.000 211.910 87.110 C 212.170 88.306 211.868 89.555 211.090 90.500 C 210.323 91.458 209.158 92.011 207.930 92.000 L 48.070 92.000 C 46.842 92.011 45.677 91.458 44.910 90.500 C 44.132 89.555 43.830 88.306 44.090 87.110 ZM 230.610 156.240 L 188.050 171.720 L 149.470 156.290 C 148.508 155.901 147.432 155.901 146.470 156.290 L 108.000 171.690 L 69.490 156.290 C 68.569 155.938 67.551 155.938 66.630 156.290 L 22.630 172.290 C 20.873 172.996 19.851 174.837 20.182 176.702 C 20.514 178.566 22.107 179.943 24.000 180.000 C 24.467 179.999 24.930 179.918 25.370 179.760 L 44.000 173.000 L 44.000 184.000 C 44.000 203.882 60.118 220.000 80.000 220.000 L 176.000 220.000 C 195.882 220.000 212.000 203.882 212.000 184.000 L 212.000 171.530 L 233.370 163.760 C 235.447 163.003 236.517 160.707 235.760 158.630 C 235.003 156.553 232.707 155.483 230.630 156.240 ZM 204.000 184.000 C 204.000 199.464 191.464 212.000 176.000 212.000 L 80.000 212.000 C 64.536 212.000 52.000 199.464 52.000 184.000 L 52.000 170.070 L 67.930 164.280 L 106.510 179.710 C 107.472 180.099 108.548 180.099 109.510 179.710 L 148.000 164.310 L 186.510 179.710 C 187.431 180.062 188.449 180.062 189.370 179.710 L 204.000 174.440 ZM 20.000 128.000 C 20.000 125.791 21.791 124.000 24.000 124.000 L 232.000 124.000 C 234.209 124.000 236.000 125.791 236.000 128.000 C 236.000 130.209 234.209 132.000 232.000 132.000 L 24.000 132.000 C 21.791 132.000 20.000 130.209 20.000 128.000 Z"),
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
        return _hamburger!!
    }

private var _hamburger: ImageVector? = null
