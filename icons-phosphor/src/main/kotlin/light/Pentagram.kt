package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Pentagram: ImageVector
    get() {
        if (_pentagram != null) return _pentagram!!
        _pentagram = phosphorLightIcon(
            name = "Pentagram",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 237.290 91.670 C 235.472 85.872 230.076 81.946 224.000 82.000 L 161.480 82.000 L 141.330 19.870 C 139.549 14.012 134.151 10.004 128.028 9.992 C 121.906 9.981 116.493 13.969 114.690 19.820 L 94.510 82.000 L 32.000 82.000 C 25.925 81.994 20.539 85.907 18.667 91.686 C 16.795 97.466 18.865 103.793 23.790 107.350 L 74.440 143.790 L 55.050 203.630 C 53.108 209.395 55.177 215.752 60.140 219.270 C 65.017 222.895 71.693 222.895 76.570 219.270 L 128.000 182.270 L 179.410 219.270 C 184.314 222.870 190.981 222.891 195.907 219.322 C 200.834 215.753 202.892 209.412 201.000 203.630 L 181.580 143.780 L 232.250 107.320 C 237.196 103.785 239.244 97.427 237.290 91.670 ZM 126.110 23.490 C 126.305 22.600 127.094 21.965 128.005 21.965 C 128.916 21.965 129.705 22.600 129.900 23.490 L 148.900 81.950 L 107.130 81.950 ZM 30.850 97.610 C 30.109 97.133 29.805 96.202 30.120 95.380 C 30.351 94.540 31.129 93.969 32.000 94.000 L 90.620 94.000 L 78.360 131.800 ZM 69.540 209.610 C 68.838 210.123 67.886 210.124 67.183 209.613 C 66.481 209.102 66.188 208.195 66.460 207.370 L 66.460 207.370 L 84.690 151.170 L 117.690 174.940 ZM 88.540 139.190 L 103.240 94.000 L 152.760 94.000 L 167.410 139.160 L 128.000 167.510 ZM 189.490 207.370 C 189.760 208.199 189.461 209.107 188.753 209.615 C 188.044 210.122 187.088 210.112 186.390 209.590 L 138.270 174.900 L 171.270 151.130 ZM 225.170 97.590 L 177.640 131.790 L 165.380 94.000 L 224.000 94.000 C 224.883 93.953 225.678 94.534 225.900 95.390 C 226.211 96.204 225.906 97.124 225.170 97.590 Z"),
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
        return _pentagram!!
    }

private var _pentagram: ImageVector? = null
