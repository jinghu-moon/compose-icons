package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Leaf: ImageVector
    get() {
        if (_leaf != null) return _leaf!!
        _leaf = phosphorBoldIcon(
            name = "Leaf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 227.420 39.860 C 227.065 33.783 222.217 28.935 216.140 28.580 C 176.540 26.250 141.550 30.920 112.140 42.450 C 84.000 53.480 62.310 70.580 49.390 91.900 C 31.770 121.010 31.730 156.350 48.940 190.090 L 31.510 207.520 C 26.816 212.214 26.816 219.826 31.510 224.520 C 36.204 229.214 43.816 229.214 48.510 224.520 L 65.940 207.090 C 82.680 215.630 99.820 219.940 116.390 219.940 C 133.225 219.992 149.747 215.390 164.130 206.640 C 185.450 193.720 202.550 172.020 213.580 143.890 C 225.080 114.460 229.750 79.460 227.420 39.860 ZM 151.660 186.080 C 131.570 198.250 108.000 199.170 83.940 189.000 L 168.480 104.460 C 173.174 99.766 173.174 92.154 168.480 87.460 C 163.786 82.766 156.174 82.766 151.480 87.460 L 67.000 172.060 C 56.860 148.060 57.780 124.430 70.000 104.340 C 90.910 69.810 140.540 50.620 204.000 52.090 C 205.380 115.530 186.190 165.170 151.660 186.080 Z"),
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
        return _leaf!!
    }

private var _leaf: ImageVector? = null
