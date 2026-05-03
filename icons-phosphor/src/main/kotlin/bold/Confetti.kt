package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Confetti: ImageVector
    get() {
        if (_confetti != null) return _confetti!!
        _confetti = phosphorBoldIcon(
            name = "Confetti",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 114.320 49.800 C 109.542 45.012 102.649 42.997 96.045 44.455 C 89.440 45.914 84.037 50.645 81.720 57.000 L 29.220 201.410 C 27.018 207.470 27.900 214.222 31.587 219.512 C 35.273 224.802 41.302 227.968 47.750 228.000 C 50.084 227.996 52.399 227.583 54.590 226.780 L 199.000 174.280 C 205.361 171.972 210.102 166.573 211.569 159.967 C 213.036 153.361 211.026 146.464 206.240 141.680 ZM 104.190 183.210 L 72.790 151.810 L 82.940 123.900 L 132.100 173.060 ZM 51.770 209.610 ZM 63.770 176.700 L 79.300 192.260 L 54.850 201.150 ZM 157.000 164.000 L 92.000 99.000 L 102.000 71.420 L 184.570 154.000 ZM 128.000 40.000 L 128.000 16.000 C 128.000 9.373 133.373 4.000 140.000 4.000 C 146.627 4.000 152.000 9.373 152.000 16.000 L 152.000 40.000 C 152.000 46.627 146.627 52.000 140.000 52.000 C 133.373 52.000 128.000 46.627 128.000 40.000 ZM 244.480 123.510 C 249.174 128.204 249.174 135.816 244.480 140.510 C 239.786 145.204 232.174 145.204 227.480 140.510 L 211.480 124.510 C 206.786 119.816 206.786 112.204 211.480 107.510 C 216.174 102.816 223.786 102.816 228.480 107.510 ZM 243.790 83.380 L 219.790 91.380 C 213.502 93.476 206.706 90.078 204.610 83.790 C 202.514 77.502 205.912 70.706 212.200 68.610 L 236.200 60.610 C 242.488 58.514 249.284 61.912 251.380 68.200 C 253.476 74.488 250.078 81.284 243.790 83.380 ZM 156.600 65.930 C 159.830 47.470 173.390 36.000 192.000 36.000 C 198.450 36.000 200.690 33.510 202.000 31.080 C 203.166 28.840 203.847 26.380 204.000 23.860 L 204.000 24.000 C 204.000 17.373 209.373 12.000 216.000 12.000 C 222.627 12.000 228.000 17.373 228.000 24.000 C 228.000 38.470 218.410 60.000 192.000 60.000 C 187.060 60.000 181.790 61.190 180.240 70.060 C 179.240 75.802 174.258 79.994 168.430 80.000 C 167.733 79.999 167.037 79.939 166.350 79.820 C 159.822 78.677 155.457 72.458 156.600 65.930 Z"),
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
        return _confetti!!
    }

private var _confetti: ImageVector? = null
