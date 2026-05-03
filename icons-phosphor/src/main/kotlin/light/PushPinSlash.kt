package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PushPinSlash: ImageVector
    get() {
        if (_pushPinSlash != null) return _pushPinSlash!!
        _pushPinSlash = phosphorLightIcon(
            name = "PushPinSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 52.440 36.000 C 50.163 33.887 46.650 33.861 44.342 35.940 C 42.034 38.019 41.695 41.516 43.560 44.000 L 71.270 74.510 C 61.780 76.000 50.600 80.000 39.220 89.180 C 36.119 91.673 34.225 95.367 34.011 99.340 C 33.797 103.313 35.284 107.189 38.100 110.000 L 87.810 159.710 L 43.760 203.710 C 42.155 205.206 41.494 207.458 42.037 209.584 C 42.580 211.710 44.240 213.370 46.366 213.913 C 48.492 214.456 50.744 213.795 52.240 212.190 L 96.290 168.140 L 146.000 217.890 C 148.624 220.519 152.185 221.998 155.900 222.000 Q 156.390 222.000 156.900 222.000 C 160.938 221.713 164.654 219.693 167.090 216.460 C 172.377 209.525 176.572 201.823 179.530 193.620 L 203.530 220.070 C 204.963 221.695 207.161 222.421 209.280 221.969 C 211.399 221.518 213.110 219.959 213.756 217.891 C 214.403 215.824 213.884 213.568 212.400 211.990 ZM 157.490 209.210 C 157.140 209.667 156.610 209.951 156.035 209.989 C 155.461 210.028 154.898 209.817 154.490 209.410 L 46.580 101.510 C 46.171 101.105 45.957 100.544 45.991 99.969 C 46.025 99.395 46.306 98.863 46.760 98.510 C 59.940 87.870 72.600 85.610 81.550 85.810 L 170.000 183.110 C 167.830 193.740 162.110 203.070 157.490 209.210 ZM 233.910 102.590 L 189.260 147.370 C 187.751 148.909 185.533 149.520 183.449 148.971 C 181.365 148.423 179.735 146.799 179.179 144.717 C 178.624 142.635 179.227 140.414 180.760 138.900 L 225.410 94.110 C 225.789 93.734 226.002 93.223 226.002 92.690 C 226.002 92.157 225.789 91.646 225.410 91.270 L 164.730 30.590 C 164.355 30.214 163.846 30.003 163.315 30.003 C 162.784 30.003 162.275 30.214 161.900 30.590 L 120.680 71.940 C 118.336 74.256 114.563 74.247 112.229 71.921 C 109.894 69.595 109.873 65.823 112.180 63.470 L 153.410 22.110 C 156.036 19.481 159.599 18.004 163.315 18.004 C 167.031 18.004 170.594 19.481 173.220 22.110 L 233.910 82.800 C 239.371 88.266 239.371 97.124 233.910 102.590 Z"),
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
        return _pushPinSlash!!
    }

private var _pushPinSlash: ImageVector? = null
