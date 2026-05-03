package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FlagCheckered: ImageVector
    get() {
        if (_flagCheckered != null) return _flagCheckered!!
        _flagCheckered = phosphorThinIcon(
            name = "FlagCheckered",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 225.660 52.440 C 224.237 51.788 222.564 52.027 221.380 53.050 C 191.380 79.050 165.380 66.130 137.770 52.490 C 109.070 38.290 79.390 23.610 45.380 53.050 C 44.509 53.805 44.007 54.898 44.000 56.050 L 44.000 224.000 C 44.000 226.209 45.791 228.000 48.000 228.000 C 50.209 228.000 52.000 226.209 52.000 224.000 L 52.000 177.870 C 81.410 153.480 107.080 166.180 134.230 179.610 C 162.930 193.800 192.610 208.490 226.620 179.050 C 227.491 178.295 227.993 177.202 228.000 176.050 L 228.000 56.050 C 227.989 54.494 227.076 53.086 225.660 52.440 ZM 220.000 64.320 L 220.000 114.200 C 203.090 128.200 187.420 129.990 172.000 126.400 L 172.000 74.670 C 187.240 77.900 203.090 76.370 220.000 64.320 ZM 164.000 72.550 L 164.000 124.090 C 155.300 121.090 146.610 116.840 137.770 112.470 C 128.010 107.630 118.130 102.750 108.000 99.560 L 108.000 48.000 C 116.700 51.000 125.390 55.250 134.230 59.620 C 144.000 64.490 153.870 69.370 164.000 72.550 ZM 100.000 45.730 L 100.000 97.440 C 84.760 94.210 68.910 95.750 52.000 107.810 L 52.000 57.930 C 68.910 43.900 84.580 42.150 100.000 45.730 ZM 52.000 167.780 L 52.000 117.900 C 68.910 103.900 84.580 102.110 100.000 105.700 L 100.000 157.420 C 95.608 156.483 91.131 156.007 86.640 156.000 C 75.520 156.000 64.000 159.200 52.000 167.780 ZM 108.000 159.550 L 108.000 108.000 C 116.710 111.000 125.390 115.250 134.230 119.620 C 143.990 124.450 153.870 129.330 164.000 132.510 L 164.000 184.050 C 155.290 181.050 146.610 176.800 137.770 172.430 C 128.000 167.610 118.130 162.730 108.000 159.550 ZM 172.000 186.370 L 172.000 134.650 C 176.390 135.604 180.868 136.097 185.360 136.120 C 196.480 136.120 207.970 132.850 220.000 124.270 L 220.000 174.170 C 203.090 188.190 187.420 190.000 172.000 186.370 Z"),
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
        return _flagCheckered!!
    }

private var _flagCheckered: ImageVector? = null
