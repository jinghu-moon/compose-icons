package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PatreonLogo: ImageVector
    get() {
        if (_patreonLogo != null) return _patreonLogo!!
        _patreonLogo = phosphorThinIcon(
            name = "PatreonLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 185.850 35.700 C 167.740 28.290 146.170 26.140 125.090 29.640 C 102.500 33.400 83.000 43.100 68.620 57.700 C 58.000 68.500 45.110 89.650 44.060 129.000 C 43.370 154.950 48.350 183.290 57.360 204.790 C 65.800 224.920 76.510 236.000 87.520 236.000 C 108.020 236.000 117.300 217.870 127.130 198.680 C 134.320 184.630 141.760 170.110 153.990 161.810 C 160.240 157.580 168.380 154.440 176.990 151.110 C 199.710 142.350 227.990 131.440 227.990 93.170 C 228.000 67.600 212.640 46.660 185.850 35.700 ZM 174.130 143.640 C 165.070 147.140 156.500 150.440 149.500 155.190 C 135.570 164.640 127.300 180.790 120.010 195.030 C 110.950 212.720 103.130 228.030 87.520 228.030 C 80.160 228.030 71.640 218.200 64.740 201.730 C 56.140 181.220 51.400 154.120 52.060 129.240 C 53.060 92.490 64.700 73.120 74.320 63.340 C 93.180 44.150 119.850 36.110 144.650 36.110 C 158.530 36.110 171.830 38.630 182.820 43.110 C 215.170 56.340 220.000 80.150 220.000 93.170 C 220.000 126.000 196.680 135.000 174.130 143.640 Z"),
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
        return _patreonLogo!!
    }

private var _patreonLogo: ImageVector? = null
