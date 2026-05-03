package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Carrot: ImageVector
    get() {
        if (_carrot != null) return _carrot!!
        _carrot = phosphorBoldIcon(
            name = "Carrot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.000 60.000 L 213.000 60.000 L 232.510 40.490 C 237.204 35.796 237.204 28.184 232.510 23.490 C 227.816 18.796 220.204 18.796 215.510 23.490 L 196.000 43.000 L 196.000 24.000 C 196.000 17.373 190.627 12.000 184.000 12.000 C 177.373 12.000 172.000 17.373 172.000 24.000 L 172.000 50.000 C 146.245 38.386 115.992 43.908 96.000 63.870 L 96.000 63.870 L 96.000 63.870 L 96.000 63.870 C 55.450 103.680 25.180 197.000 21.780 207.770 C 18.986 213.958 19.522 221.141 23.204 226.846 C 26.886 232.550 33.210 235.997 40.000 236.000 C 42.842 235.995 45.650 235.389 48.240 234.220 C 55.880 231.800 105.030 215.880 147.150 192.400 L 147.690 192.100 C 164.790 182.530 180.690 171.710 192.130 160.100 C 212.136 140.090 217.660 109.782 206.000 84.000 L 232.000 84.000 C 238.627 84.000 244.000 78.627 244.000 72.000 C 244.000 65.373 238.627 60.000 232.000 60.000 ZM 175.110 143.120 L 175.020 143.210 C 166.910 151.490 155.910 159.410 143.690 166.730 L 120.480 143.520 C 115.786 138.826 108.174 138.826 103.480 143.520 C 98.786 148.214 98.786 155.826 103.480 160.520 L 121.700 178.740 C 91.410 193.910 59.570 205.160 46.440 209.560 C 53.210 189.340 76.230 124.760 104.780 89.820 L 135.480 120.520 C 140.174 125.214 147.786 125.214 152.480 120.520 C 157.174 115.826 157.174 108.214 152.480 103.520 L 122.540 73.580 C 141.718 62.847 165.875 67.910 179.128 85.442 C 192.382 102.973 190.666 127.596 175.110 143.120 Z"),
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
        return _carrot!!
    }

private var _carrot: ImageVector? = null
