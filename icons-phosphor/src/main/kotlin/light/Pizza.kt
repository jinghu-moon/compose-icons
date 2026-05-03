package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Pizza: ImageVector
    get() {
        if (_pizza != null) return _pizza!!
        _pizza = phosphorLightIcon(
            name = "Pizza",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 237.600 63.470 C 236.730 59.846 234.443 56.723 231.250 54.800 C 167.772 16.400 88.228 16.400 24.750 54.800 C 18.161 58.812 16.059 67.398 20.050 74.000 L 116.050 231.270 C 118.581 235.482 123.136 238.059 128.050 238.059 C 132.964 238.059 137.519 235.482 140.050 231.270 L 236.000 74.000 C 237.920 70.845 238.496 67.053 237.600 63.470 ZM 61.070 118.200 C 68.585 110.201 80.315 107.782 90.381 112.157 C 100.448 116.531 106.683 126.756 105.963 137.708 C 105.243 148.661 97.723 157.981 87.170 161.000 ZM 152.070 188.520 C 141.647 180.398 138.974 165.749 145.857 154.469 C 152.740 143.189 166.990 138.866 178.980 144.420 ZM 185.270 134.120 C 179.924 131.390 174.003 129.977 168.000 130.000 C 151.521 130.003 136.921 140.627 131.850 156.307 C 126.780 171.987 132.393 189.148 145.750 198.800 L 129.750 225.040 C 129.392 225.657 128.733 226.036 128.020 226.036 C 127.307 226.036 126.648 225.657 126.290 225.040 L 93.590 171.490 C 107.833 166.049 117.444 152.621 118.002 137.385 C 118.561 122.149 109.959 108.054 96.153 101.584 C 82.348 95.114 66.012 97.522 54.660 107.700 L 46.050 93.590 C 96.156 62.137 159.844 62.137 209.950 93.590 ZM 225.760 67.770 L 216.200 83.350 C 162.257 49.550 93.743 49.550 39.800 83.350 L 30.290 67.770 L 30.290 67.770 C 30.014 67.332 29.931 66.801 30.060 66.300 C 30.193 65.777 30.532 65.330 31.000 65.060 C 90.639 28.997 165.361 28.997 225.000 65.060 C 225.460 65.334 225.792 65.780 225.920 66.300 C 226.055 66.798 225.979 67.330 225.710 67.770 Z"),
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
        return _pizza!!
    }

private var _pizza: ImageVector? = null
