package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.BaseballCap: ImageVector
    get() {
        if (_baseballCap != null) return _baseballCap!!
        _baseballCap = phosphorRegularIcon(
            name = "BaseballCap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 24.000 L 128.000 24.000 C 70.590 24.066 24.066 70.590 24.000 128.000 L 24.000 184.000 C 24.000 197.255 34.745 208.000 48.000 208.000 C 53.098 207.992 58.063 206.367 62.180 203.360 C 74.330 194.530 95.600 184.000 128.000 184.000 C 160.400 184.000 181.670 194.520 193.810 203.350 C 201.103 208.696 210.781 209.490 218.847 205.403 C 226.913 201.316 231.998 193.042 232.000 184.000 L 232.000 128.000 C 231.934 70.590 185.410 24.066 128.000 24.000 ZM 216.000 128.000 L 216.000 136.870 C 203.240 128.974 189.467 122.845 175.060 118.650 C 171.965 91.065 162.042 64.686 146.190 41.900 C 186.853 50.545 215.947 86.428 216.000 128.000 ZM 128.000 44.270 C 143.975 64.781 154.439 89.036 158.400 114.730 C 138.283 111.090 117.677 111.090 97.560 114.730 C 101.568 89.042 112.043 64.796 128.000 44.270 ZM 109.810 41.900 C 93.956 64.689 84.034 91.071 80.940 118.660 C 66.533 122.855 52.760 128.984 40.000 136.880 L 40.000 128.000 C 40.053 86.428 69.147 50.545 109.810 41.900 ZM 211.660 191.110 C 208.946 192.510 205.671 192.242 203.220 190.420 C 189.160 180.200 164.700 168.000 128.000 168.000 C 91.300 168.000 66.840 180.200 52.780 190.420 C 50.329 192.242 47.054 192.510 44.340 191.110 C 41.638 189.781 39.947 187.011 40.000 184.000 L 40.000 156.070 C 92.700 118.651 163.300 118.651 216.000 156.070 L 216.000 184.000 C 216.053 187.011 214.362 189.781 211.660 191.110 Z"),
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
        return _baseballCap!!
    }

private var _baseballCap: ImageVector? = null
