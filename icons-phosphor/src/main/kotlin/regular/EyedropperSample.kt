package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.EyedropperSample: ImageVector
    get() {
        if (_eyedropperSample != null) return _eyedropperSample!!
        _eyedropperSample = phosphorRegularIcon(
            name = "EyedropperSample",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 67.300 C 223.890 57.572 219.825 48.307 212.740 41.640 C 198.740 28.360 176.020 28.860 162.120 42.770 L 142.800 62.200 C 133.322 53.561 118.727 53.900 109.660 62.970 L 100.660 71.970 C 97.656 74.971 95.967 79.043 95.967 83.290 C 95.967 87.537 97.656 91.609 100.660 94.610 L 102.660 96.670 L 51.660 147.670 C 41.672 157.580 37.667 172.032 41.130 185.670 L 33.130 204.080 C 30.842 209.255 31.983 215.305 36.000 219.290 C 40.637 223.971 47.681 225.308 53.710 222.650 L 71.240 215.000 C 84.617 218.022 98.608 213.962 108.290 204.250 L 159.290 153.250 L 161.350 155.310 C 167.598 161.553 177.722 161.553 183.970 155.310 L 192.970 146.310 C 202.056 137.230 202.382 122.606 193.710 113.130 L 213.460 93.260 C 220.359 86.401 224.165 77.027 224.000 67.300 ZM 97.000 193.000 C 90.726 199.287 81.494 201.595 73.000 199.000 C 71.172 198.437 69.203 198.547 67.450 199.310 L 49.350 207.210 L 57.000 189.410 C 57.794 187.591 57.883 185.541 57.250 183.660 C 55.525 178.567 55.560 173.041 57.350 167.970 L 122.000 167.970 ZM 138.000 152.000 L 70.070 152.000 L 114.070 108.000 L 148.010 142.000 ZM 202.180 82.000 L 176.810 107.520 C 173.688 110.644 173.688 115.706 176.810 118.830 L 181.700 123.710 C 183.202 125.211 184.046 127.247 184.046 129.370 C 184.046 131.493 183.202 133.529 181.700 135.030 L 172.700 144.030 L 112.000 83.260 L 121.000 74.260 C 124.124 71.138 129.186 71.138 132.310 74.260 L 137.200 79.150 C 138.699 80.647 140.731 81.489 142.850 81.490 L 142.850 81.490 C 144.975 81.486 147.012 80.637 148.510 79.130 L 173.450 54.040 C 181.260 46.220 193.950 45.860 201.740 53.230 C 205.671 56.943 207.931 62.090 208.005 67.498 C 208.078 72.905 205.959 78.111 202.130 81.930 Z"),
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
        return _eyedropperSample!!
    }

private var _eyedropperSample: ImageVector? = null
