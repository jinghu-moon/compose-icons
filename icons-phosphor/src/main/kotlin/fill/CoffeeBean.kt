package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CoffeeBean: ImageVector
    get() {
        if (_coffeeBean != null) return _coffeeBean!!
        _coffeeBean = phosphorFillIcon(
            name = "CoffeeBean",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 71.220 190.470 C 60.509 195.331 49.081 198.425 37.380 199.630 C 35.801 199.794 34.275 199.009 33.490 197.630 C 24.820 182.350 21.970 163.340 25.490 142.480 C 29.980 115.560 44.580 88.610 66.610 66.580 C 88.640 44.550 115.610 29.950 142.510 25.460 C 165.300 21.670 185.880 25.460 201.800 36.060 C 203.131 36.934 203.817 38.515 203.546 40.085 C 203.274 41.654 202.098 42.913 200.550 43.290 C 193.056 45.076 185.749 47.574 178.730 50.750 C 156.960 60.650 129.130 81.810 120.210 126.450 C 114.100 156.730 97.630 178.270 71.220 190.470 ZM 222.510 58.380 C 221.726 57.004 220.205 56.220 218.630 56.380 C 206.925 57.578 195.492 60.671 184.780 65.540 C 158.370 77.740 141.900 99.280 135.840 129.540 C 126.910 174.180 99.090 195.340 77.320 205.240 C 70.301 208.416 62.994 210.914 55.500 212.700 C 53.916 213.057 52.706 214.336 52.436 215.937 C 52.166 217.538 52.891 219.143 54.270 220.000 C 66.140 227.920 80.590 232.000 96.620 232.000 C 102.290 231.984 107.949 231.502 113.540 230.560 C 140.450 226.070 167.410 211.470 189.440 189.440 C 211.470 167.410 226.070 140.440 230.560 113.540 C 234.000 92.680 231.180 73.660 222.510 58.380 Z"),
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
        return _coffeeBean!!
    }

private var _coffeeBean: ImageVector? = null
