package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Rocket: ImageVector
    get() {
        if (_rocket != null) return _rocket!!
        _rocket = phosphorBoldIcon(
            name = "Rocket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 156.000 228.000 C 156.000 234.627 150.627 240.000 144.000 240.000 L 112.000 240.000 C 105.373 240.000 100.000 234.627 100.000 228.000 C 100.000 221.373 105.373 216.000 112.000 216.000 L 144.000 216.000 C 150.627 216.000 156.000 221.373 156.000 228.000 ZM 128.000 116.000 C 136.837 116.000 144.000 108.837 144.000 100.000 C 144.000 91.163 136.837 84.000 128.000 84.000 C 119.163 84.000 112.000 91.163 112.000 100.000 C 112.000 108.837 119.163 116.000 128.000 116.000 ZM 227.530 156.700 L 215.170 212.330 C 213.691 219.081 208.815 224.582 202.290 226.860 C 200.140 227.615 197.878 228.001 195.600 228.000 C 191.140 227.996 186.811 226.492 183.310 223.730 L 157.170 204.000 L 98.830 204.000 L 72.690 223.740 C 69.187 226.499 64.859 227.999 60.400 228.000 C 58.121 227.998 55.859 227.609 53.710 226.850 C 47.185 224.572 42.309 219.071 40.830 212.320 L 28.470 156.700 C 27.142 150.651 28.677 144.327 32.630 139.560 L 60.460 106.160 C 61.525 93.646 64.440 81.359 69.110 69.700 C 82.380 36.450 106.110 15.600 115.750 8.180 C 122.961 2.593 133.039 2.593 140.250 8.180 C 149.850 15.600 173.620 36.450 186.890 69.700 C 191.560 81.359 194.475 93.646 195.540 106.160 L 223.370 139.560 C 227.323 144.327 228.858 150.651 227.530 156.700 ZM 101.790 180.000 L 154.210 180.000 C 173.720 144.300 177.210 110.220 164.600 78.600 C 154.400 53.000 136.200 35.900 128.000 29.120 C 119.800 35.900 101.600 53.000 91.400 78.600 C 78.780 110.220 82.280 144.300 101.790 180.000 ZM 79.240 188.720 C 71.261 173.890 65.558 157.946 62.320 141.420 L 52.320 153.420 L 62.900 201.060 ZM 203.670 153.410 L 193.670 141.410 C 190.432 157.936 184.729 173.880 176.750 188.710 L 193.080 201.040 Z"),
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
        return _rocket!!
    }

private var _rocket: ImageVector? = null
