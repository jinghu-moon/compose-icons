package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Swatches: ImageVector
    get() {
        if (_swatches != null) return _swatches!!
        _swatches = phosphorBoldIcon(
            name = "Swatches",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 242.790 149.320 L 223.700 97.110 C 219.904 86.777 208.471 81.454 198.120 85.200 L 136.810 107.420 L 147.700 45.180 C 149.628 34.322 142.403 23.953 131.550 22.000 L 76.870 12.310 C 71.651 11.390 66.280 12.586 61.944 15.633 C 57.608 18.680 54.663 23.328 53.760 28.550 L 28.760 171.680 C 24.160 197.681 41.425 222.515 67.400 227.260 C 70.274 227.754 73.184 228.002 76.100 228.000 L 224.000 228.000 C 235.046 228.000 244.000 219.046 244.000 208.000 L 244.000 156.190 C 243.969 153.850 243.561 151.530 242.790 149.320 ZM 99.000 184.180 C 97.931 190.478 94.379 196.084 89.140 199.740 C 84.044 203.337 77.718 204.738 71.580 203.630 C 58.615 201.215 50.028 188.792 52.350 175.810 L 76.710 36.660 L 123.370 45.000 L 99.000 184.180 ZM 122.640 188.310 L 132.030 134.670 L 202.520 109.130 L 218.820 153.720 L 122.590 188.590 C 122.620 188.500 122.650 188.410 122.660 188.310 ZM 220.000 204.000 L 150.520 204.000 L 220.000 178.820 ZM 89.220 174.070 L 87.820 182.070 C 86.815 187.811 81.829 192.000 76.000 192.000 C 75.303 191.999 74.607 191.939 73.920 191.820 C 67.392 190.677 63.027 184.458 64.170 177.930 L 65.570 169.930 C 66.738 163.427 72.943 159.091 79.451 160.231 C 85.959 161.371 90.322 167.557 89.210 174.070 Z"),
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
        return _swatches!!
    }

private var _swatches: ImageVector? = null
