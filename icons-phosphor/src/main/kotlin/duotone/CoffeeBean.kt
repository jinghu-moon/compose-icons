package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CoffeeBean: ImageVector
    get() {
        if (_coffeeBean != null) return _coffeeBean!!
        _coffeeBean = phosphorDuotoneIcon(
            name = "CoffeeBean",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 183.790 183.790 C 140.650 226.930 80.700 236.930 49.890 206.110 C 19.080 175.290 29.070 115.350 72.210 72.210 C 115.350 29.070 175.300 19.070 206.110 49.890 C 236.920 80.710 226.930 140.650 183.790 183.790 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 211.750 44.250 C 195.000 27.470 170.370 20.790 142.460 25.440 C 115.550 29.930 88.590 44.530 66.560 66.560 C 44.530 88.590 29.930 115.560 25.440 142.460 C 20.790 170.370 27.440 194.970 44.250 211.750 C 57.540 225.050 75.750 232.000 96.620 232.000 C 102.290 231.984 107.949 231.502 113.540 230.560 C 140.450 226.070 167.410 211.470 189.440 189.440 C 211.470 167.410 226.070 140.440 230.560 113.540 C 235.210 85.630 228.530 61.000 211.750 44.250 ZM 77.870 77.870 C 102.560 53.190 133.000 39.930 159.150 39.930 C 169.214 39.777 179.165 42.065 188.150 46.600 C 176.943 50.510 166.454 56.233 157.100 63.540 C 137.900 78.700 125.470 99.860 120.160 126.430 C 110.440 175.010 75.460 191.610 52.680 197.270 C 28.710 168.760 39.400 116.350 77.870 77.870 ZM 178.130 178.130 C 143.440 212.810 97.420 224.910 67.810 209.400 C 79.029 205.490 89.532 199.768 98.900 192.460 C 118.100 177.300 130.530 156.140 135.840 129.570 C 145.560 80.990 180.540 64.390 203.320 58.730 C 227.290 87.240 216.600 139.650 178.130 178.130 Z"),
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
