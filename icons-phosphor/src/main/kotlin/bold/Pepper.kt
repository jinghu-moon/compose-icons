package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Pepper: ImageVector
    get() {
        if (_pepper != null) return _pepper!!
        _pepper = phosphorBoldIcon(
            name = "Pepper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 170.560 36.820 C 165.455 17.496 147.987 4.026 128.000 4.000 C 121.373 4.000 116.000 9.373 116.000 16.000 C 116.000 22.627 121.373 28.000 128.000 28.000 C 134.994 28.010 141.474 31.673 145.090 37.660 C 114.078 44.671 92.044 72.206 92.000 104.000 C 92.000 125.740 86.170 144.140 74.680 158.690 C 62.460 174.160 43.500 185.770 18.340 193.180 C 9.402 195.786 3.444 204.214 3.969 213.510 C 4.495 222.805 11.365 230.508 20.540 232.090 C 35.765 234.719 51.189 236.027 66.640 236.000 C 108.250 236.000 154.640 226.620 186.850 199.620 C 214.160 176.720 228.000 144.550 228.000 104.000 L 228.000 104.000 C 227.956 70.537 203.610 42.062 170.560 36.820 ZM 160.000 60.000 C 177.495 60.004 193.326 70.374 200.320 86.410 L 192.000 90.580 L 165.370 77.260 C 161.990 75.569 158.010 75.569 154.630 77.260 L 128.000 90.580 L 119.680 86.410 C 126.674 70.374 142.505 60.004 160.000 60.000 ZM 171.430 181.230 C 154.030 195.820 129.100 205.700 99.330 209.810 C 80.027 212.361 60.492 212.660 41.120 210.700 C 87.800 192.190 113.400 158.160 115.800 111.310 L 122.630 114.730 C 126.013 116.410 129.987 116.410 133.370 114.730 L 160.000 101.410 L 186.630 114.730 C 190.013 116.410 193.987 116.410 197.370 114.730 L 203.800 111.510 C 202.240 141.070 191.380 164.500 171.430 181.230 Z"),
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
        return _pepper!!
    }

private var _pepper: ImageVector? = null
