package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Yarn: ImageVector
    get() {
        if (_yarn != null) return _yarn!!
        _yarn = phosphorLightIcon(
            name = "Yarn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 218.000 L 176.000 218.000 C 221.453 193.758 241.697 139.431 223.190 91.356 C 204.684 43.282 153.237 16.552 103.261 29.045 C 53.286 41.539 20.470 89.335 26.764 140.463 C 33.058 191.590 76.487 230.000 128.000 230.000 L 232.000 230.000 C 235.314 230.000 238.000 227.314 238.000 224.000 C 238.000 220.686 235.314 218.000 232.000 218.000 ZM 128.000 38.000 C 145.086 37.968 161.825 42.826 176.240 52.000 C 165.053 56.829 154.286 62.579 144.050 69.190 C 128.204 58.985 111.115 50.856 93.200 45.000 C 104.217 40.371 116.049 37.991 128.000 38.000 ZM 78.200 53.070 C 97.602 58.235 116.157 66.173 133.290 76.640 C 125.259 82.512 117.629 88.913 110.450 95.800 C 92.909 86.296 73.910 79.773 54.230 76.500 C 60.698 67.271 68.826 59.326 78.200 53.070 ZM 47.580 87.620 C 66.442 90.220 84.726 96.006 101.650 104.730 C 95.101 111.754 89.012 119.193 83.420 127.000 C 69.386 120.513 54.378 116.387 39.000 114.790 C 40.391 105.333 43.288 96.161 47.580 87.620 ZM 55.110 180.730 C 43.969 165.407 37.978 146.945 38.000 128.000 C 38.000 127.580 38.000 127.170 38.000 126.750 C 51.327 128.160 64.351 131.645 76.600 137.080 C 67.848 150.793 60.641 165.432 55.110 180.730 ZM 64.110 191.370 C 83.650 131.543 128.846 83.542 187.390 60.440 C 194.865 67.024 201.203 74.794 206.150 83.440 C 148.325 102.786 104.044 149.824 88.220 208.710 C 79.297 204.295 71.164 198.436 64.150 191.370 ZM 127.110 217.990 C 117.673 217.909 108.308 216.340 99.360 213.340 C 113.906 157.141 156.145 112.262 211.360 94.340 C 214.911 103.083 217.051 112.335 217.700 121.750 C 173.572 137.063 139.744 173.021 127.150 218.000 ZM 217.730 134.460 C 214.611 176.992 182.115 211.520 139.850 217.210 C 151.832 179.179 180.528 148.705 217.770 134.460 Z"),
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
        return _yarn!!
    }

private var _yarn: ImageVector? = null
