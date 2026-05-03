package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HandsPraying: ImageVector
    get() {
        if (_handsPraying != null) return _handsPraying!!
        _handsPraying = phosphorBoldIcon(
            name = "HandsPraying",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 238.150 177.180 L 202.620 141.650 L 166.450 22.300 C 164.123 14.590 158.323 8.413 150.775 5.606 C 143.226 2.799 134.799 3.685 128.000 8.000 C 121.201 3.685 112.774 2.799 105.225 5.606 C 97.677 8.413 91.877 14.590 89.550 22.300 L 53.380 141.650 L 17.850 177.180 C 10.042 184.990 10.042 197.650 17.850 205.460 L 50.540 238.150 C 58.350 245.958 71.010 245.958 78.820 238.150 L 127.110 189.870 C 127.420 189.560 127.710 189.250 128.000 188.930 C 128.290 189.250 128.580 189.560 128.890 189.870 L 177.180 238.150 C 184.990 245.958 197.650 245.958 205.460 238.150 L 238.150 205.460 C 245.958 197.650 245.958 184.990 238.150 177.180 ZM 64.680 218.350 L 37.680 191.350 L 48.680 180.350 L 75.680 207.350 ZM 116.000 158.750 C 116.015 164.057 113.905 169.150 110.140 172.890 L 92.680 190.350 L 65.680 163.350 L 72.510 156.520 C 73.908 155.127 74.939 153.409 75.510 151.520 L 112.510 29.290 C 112.770 28.451 113.604 27.927 114.473 28.057 C 115.342 28.187 115.986 28.931 115.990 29.810 ZM 163.500 190.530 L 145.860 172.890 C 142.095 169.150 139.985 164.057 140.000 158.750 L 140.000 29.750 C 140.004 28.871 140.648 28.127 141.517 27.997 C 142.386 27.867 143.220 28.391 143.480 29.230 L 180.480 151.460 C 181.051 153.349 182.082 155.067 183.480 156.460 L 191.080 164.060 ZM 191.320 218.350 L 180.470 207.510 L 208.100 181.070 L 218.350 191.320 Z"),
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
        return _handsPraying!!
    }

private var _handsPraying: ImageVector? = null
