package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Plant: ImageVector
    get() {
        if (_plant != null) return _plant!!
        _plant = phosphorRegularIcon(
            name = "Plant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 247.630 47.890 C 247.393 43.839 244.161 40.607 240.110 40.370 C 188.350 37.370 146.790 53.110 128.930 82.590 C 117.130 102.080 117.150 125.750 128.770 148.330 C 122.156 156.204 117.322 165.414 114.600 175.330 L 98.330 159.000 C 106.150 142.670 105.850 125.650 97.330 111.510 C 84.130 89.720 53.660 78.040 15.830 80.260 C 11.779 80.497 8.547 83.729 8.310 87.780 C 6.080 125.610 17.770 156.080 39.560 169.280 C 46.751 173.673 55.014 175.998 63.440 176.000 C 71.619 175.899 79.671 173.962 87.000 170.330 L 112.000 195.330 L 112.000 224.000 C 112.000 228.418 115.582 232.000 120.000 232.000 C 124.418 232.000 128.000 228.418 128.000 224.000 L 128.000 194.510 C 127.964 181.783 132.295 169.429 140.270 159.510 C 150.559 164.887 161.971 167.765 173.580 167.910 C 184.804 167.946 195.819 164.880 205.410 159.050 C 234.890 141.210 250.670 99.650 247.630 47.890 ZM 47.810 155.600 C 32.470 146.310 23.790 124.320 24.000 96.000 C 52.320 95.760 74.310 104.470 83.600 119.810 C 88.450 127.810 89.240 137.140 86.060 146.750 L 61.650 122.340 C 58.505 119.352 53.551 119.415 50.483 122.483 C 47.415 125.551 47.352 130.505 50.340 133.650 L 74.750 158.060 C 65.140 161.240 55.820 160.450 47.810 155.600 ZM 197.120 145.380 C 183.720 153.490 167.970 154.110 151.970 147.380 L 205.660 93.680 C 208.648 90.535 208.585 85.581 205.517 82.513 C 202.449 79.445 197.495 79.382 194.350 82.370 L 140.650 136.000 C 133.890 120.000 134.500 104.240 142.650 90.850 C 156.590 67.850 189.650 55.030 231.980 56.020 C 232.940 98.340 220.140 131.440 197.120 145.380 Z"),
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
        return _plant!!
    }

private var _plant: ImageVector? = null
