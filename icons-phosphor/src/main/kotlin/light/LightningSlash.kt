package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.LightningSlash: ImageVector
    get() {
        if (_lightningSlash != null) return _lightningSlash!!
        _lightningSlash = phosphorLightIcon(
            name = "LightningSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 52.440 36.000 C 50.163 33.887 46.650 33.861 44.342 35.940 C 42.034 38.019 41.695 41.516 43.560 44.000 L 84.050 88.580 L 43.610 131.910 C 42.244 133.375 41.699 135.424 42.157 137.374 C 42.614 139.324 44.015 140.916 45.890 141.620 L 105.120 163.830 L 90.120 238.830 C 89.591 241.461 90.873 244.123 93.260 245.350 C 94.110 245.778 95.048 246.001 96.000 246.000 C 97.665 246.000 99.255 245.308 100.390 244.090 L 163.730 176.220 L 203.560 220.000 C 205.791 222.452 209.588 222.631 212.040 220.400 C 214.492 218.169 214.671 214.372 212.440 211.920 ZM 106.000 220.460 L 117.850 161.180 C 118.431 158.296 116.834 155.416 114.080 154.380 L 58.480 133.530 L 92.120 97.530 L 155.600 167.360 ZM 110.000 69.550 C 107.578 67.288 107.449 63.492 109.710 61.070 L 155.590 11.910 C 157.420 9.949 160.329 9.441 162.716 10.666 C 165.102 11.890 166.386 14.550 165.860 17.180 L 150.860 92.180 L 210.090 114.390 C 211.965 115.094 213.366 116.686 213.823 118.636 C 214.281 120.586 213.736 122.635 212.370 124.100 L 190.080 148.000 C 188.622 149.589 186.424 150.273 184.322 149.792 C 182.220 149.312 180.538 147.741 179.915 145.677 C 179.292 143.613 179.825 141.373 181.310 139.810 L 197.490 122.480 L 141.890 101.630 C 139.136 100.594 137.539 97.714 138.120 94.830 L 150.000 35.540 L 118.500 69.250 C 117.415 70.420 115.908 71.110 114.312 71.166 C 112.717 71.223 111.165 70.641 110.000 69.550 Z"),
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
        return _lightningSlash!!
    }

private var _lightningSlash: ImageVector? = null
