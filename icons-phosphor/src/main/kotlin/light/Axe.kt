package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Axe: ImageVector
    get() {
        if (_axe != null) return _axe!!
        _axe = phosphorLightIcon(
            name = "Axe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 253.250 98.360 C 251.547 93.274 247.089 89.608 241.770 88.920 C 222.392 86.310 203.784 79.630 187.170 69.320 L 199.270 57.210 C 205.603 51.523 208.278 42.803 206.222 34.543 C 204.167 26.283 197.717 19.833 189.457 17.778 C 181.197 15.722 172.477 18.397 166.790 24.730 L 152.000 39.470 C 148.790 35.740 146.810 33.010 146.080 31.970 C 143.708 28.585 139.961 26.421 135.843 26.058 C 131.725 25.696 127.657 27.171 124.730 30.090 L 86.090 68.770 C 83.174 71.702 81.704 75.772 82.072 79.890 C 82.441 84.008 84.610 87.753 88.000 90.120 C 89.000 90.850 91.770 92.830 95.500 96.040 L 8.730 182.790 C 2.189 189.374 0.246 199.243 3.803 207.815 C 7.360 216.387 15.720 221.981 25.000 222.000 C 31.096 222.019 36.945 219.595 41.240 215.270 L 125.350 131.170 C 135.660 147.784 142.340 166.392 144.950 185.770 C 145.638 191.089 149.304 195.547 154.390 197.250 C 159.422 198.977 164.998 197.671 168.740 193.890 L 249.920 112.710 C 253.688 108.960 254.982 103.386 253.250 98.360 ZM 175.250 33.210 C 179.609 29.409 186.167 29.634 190.257 33.723 C 194.346 37.813 194.571 44.371 190.770 48.730 L 177.000 62.490 C 171.080 58.143 165.479 53.378 160.240 48.230 ZM 32.730 206.790 C 28.371 210.591 21.813 210.366 17.723 206.277 C 13.634 202.187 13.409 195.629 17.210 191.270 L 104.210 104.270 C 109.364 109.498 114.136 115.089 118.490 121.000 ZM 241.410 104.220 L 160.220 185.410 C 159.709 185.955 158.923 186.144 158.220 185.890 C 157.460 185.646 156.918 184.974 156.840 184.180 C 148.170 119.400 100.300 84.110 94.870 80.300 C 94.372 79.963 94.053 79.419 94.000 78.820 C 93.943 78.237 94.153 77.661 94.570 77.250 L 133.240 38.580 C 133.610 38.213 134.109 38.005 134.630 38.000 L 134.810 38.000 C 135.407 38.050 135.950 38.366 136.290 38.860 C 140.100 44.290 175.390 92.160 240.170 100.860 C 240.964 100.938 241.636 101.480 241.880 102.240 C 242.133 102.935 241.948 103.713 241.410 104.220 Z"),
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
        return _axe!!
    }

private var _axe: ImageVector? = null
