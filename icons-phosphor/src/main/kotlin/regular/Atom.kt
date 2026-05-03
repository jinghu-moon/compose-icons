package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Atom: ImageVector
    get() {
        if (_atom != null) return _atom!!
        _atom = phosphorRegularIcon(
            name = "Atom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 196.120 128.000 C 220.770 93.390 233.340 57.620 215.860 40.140 C 198.380 22.660 162.610 35.230 128.000 59.880 C 93.390 35.230 57.620 22.660 40.140 40.140 C 22.660 57.620 35.230 93.390 59.880 128.000 C 35.230 162.610 22.660 198.380 40.140 215.860 L 40.140 215.860 C 45.770 221.490 53.290 224.000 62.050 224.000 C 80.530 224.000 104.530 212.830 128.050 196.120 C 151.470 212.830 175.470 224.000 194.000 224.000 C 202.760 224.000 210.290 221.480 215.910 215.860 L 215.910 215.860 C 233.340 198.380 220.770 162.610 196.120 128.000 ZM 204.550 51.450 C 212.190 59.090 207.030 83.850 186.030 114.730 C 179.386 106.506 172.313 98.638 164.840 91.160 C 157.361 83.697 149.493 76.634 141.270 70.000 C 172.150 49.000 196.910 43.800 204.550 51.450 ZM 176.290 128.000 C 169.214 136.952 161.614 145.477 153.530 153.530 C 145.477 161.614 136.952 169.214 128.000 176.290 C 119.048 169.214 110.523 161.614 102.470 153.530 C 94.386 145.477 86.786 136.952 79.710 128.000 C 93.907 110.110 110.110 93.907 128.000 79.710 C 136.952 86.786 145.477 94.386 153.530 102.470 C 161.614 110.523 169.214 119.048 176.290 128.000 ZM 51.450 51.450 C 53.650 49.240 57.280 48.100 62.070 48.100 C 73.890 48.100 92.760 55.000 114.720 70.000 C 106.504 76.639 98.640 83.702 91.160 91.160 C 83.697 98.639 76.634 106.507 70.000 114.730 C 49.000 83.850 43.810 59.090 51.450 51.450 ZM 51.450 204.550 C 43.810 196.910 49.000 172.150 70.000 141.270 C 76.644 149.494 83.717 157.362 91.190 164.840 C 98.664 172.297 106.521 179.360 114.730 186.000 C 83.850 207.000 59.090 212.200 51.450 204.550 ZM 204.550 204.550 C 196.910 212.200 172.150 207.030 141.270 186.030 C 149.490 179.381 157.357 172.308 164.840 164.840 C 172.303 157.361 179.366 149.493 186.000 141.270 C 207.000 172.150 212.190 196.910 204.550 204.550 ZM 140.000 128.000 C 140.000 134.627 134.627 140.000 128.000 140.000 C 121.373 140.000 116.000 134.627 116.000 128.000 C 116.000 121.373 121.373 116.000 128.000 116.000 C 134.627 116.000 140.000 121.373 140.000 128.000 Z"),
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
        return _atom!!
    }

private var _atom: ImageVector? = null
