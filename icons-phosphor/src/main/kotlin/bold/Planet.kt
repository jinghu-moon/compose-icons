package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Planet: ImageVector
    get() {
        if (_planet != null) return _planet!!
        _planet = phosphorBoldIcon(
            name = "Planet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 248.590 58.670 C 242.280 47.800 225.590 37.610 182.430 48.960 C 153.070 28.700 114.894 26.402 83.315 42.994 C 51.737 59.586 31.972 92.328 32.000 128.000 Q 32.000 131.600 32.260 135.140 C 0.560 166.860 1.100 186.400 7.440 197.330 C 13.400 207.610 25.300 212.000 40.680 212.000 C 50.470 212.000 61.680 210.220 73.630 207.090 C 102.996 227.321 141.160 229.596 172.721 212.996 C 204.282 196.396 224.031 163.660 224.000 128.000 C 224.000 125.590 223.910 123.210 223.730 120.840 C 238.040 106.460 247.590 92.630 250.730 80.840 C 253.550 70.420 251.120 63.000 248.590 58.670 ZM 128.000 56.000 C 161.582 56.045 190.687 79.267 198.190 112.000 C 184.000 124.730 165.000 138.590 141.920 151.860 C 120.180 164.350 98.370 174.220 78.830 180.510 C 57.299 160.311 50.280 129.014 61.124 101.554 C 71.968 74.094 98.477 56.038 128.000 56.000 ZM 28.190 185.290 C 27.580 184.220 28.020 177.070 38.860 163.580 C 42.227 171.985 46.769 179.870 52.350 187.000 C 35.120 189.610 28.850 186.410 28.190 185.290 ZM 128.000 200.000 C 120.334 200.001 112.717 198.772 105.440 196.360 C 122.102 189.578 138.280 181.663 153.860 172.670 C 169.382 163.818 184.274 153.904 198.430 143.000 C 191.308 176.216 161.971 199.959 128.000 200.000 ZM 227.570 74.650 C 226.290 79.430 222.760 85.520 217.180 92.450 C 213.813 84.034 209.267 76.138 203.680 69.000 C 219.510 66.630 226.850 69.000 227.830 70.710 C 228.000 71.000 228.210 72.280 227.570 74.650 Z"),
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
        return _planet!!
    }

private var _planet: ImageVector? = null
