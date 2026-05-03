package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TreePalm: ImageVector
    get() {
        if (_treePalm != null) return _treePalm!!
        _treePalm = phosphorThinIcon(
            name = "TreePalm",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 234.900 56.000 C 223.009 43.233 206.347 35.981 188.900 35.981 C 171.453 35.981 154.791 43.233 142.900 56.000 C 136.259 63.000 131.181 71.331 128.000 80.440 C 124.791 71.318 119.678 62.984 113.000 55.990 C 101.110 43.256 84.469 36.028 67.048 36.030 C 49.626 36.032 32.987 43.264 21.100 56.000 C 20.202 56.946 19.821 58.270 20.080 59.548 C 20.339 60.826 21.205 61.898 22.400 62.420 L 90.860 92.200 C 86.654 92.519 82.486 93.226 78.410 94.310 C 61.007 98.875 46.146 110.200 37.130 125.770 C 28.073 141.240 25.623 159.703 30.330 177.000 C 30.675 178.288 31.639 179.319 32.900 179.750 C 33.316 179.889 33.752 179.959 34.190 179.960 C 35.068 179.961 35.922 179.673 36.620 179.140 L 124.000 112.600 L 124.000 224.000 C 124.000 226.209 125.791 228.000 128.000 228.000 C 130.209 228.000 132.000 226.209 132.000 224.000 L 132.000 112.600 L 219.380 179.180 C 220.078 179.713 220.932 180.001 221.810 180.000 C 222.248 179.999 222.684 179.929 223.100 179.790 C 224.361 179.359 225.325 178.328 225.670 177.040 C 230.389 159.731 227.938 141.251 218.870 125.770 C 209.854 110.200 194.993 98.875 177.590 94.310 C 173.514 93.226 169.346 92.519 165.140 92.200 L 233.600 62.410 C 234.791 61.887 235.654 60.817 235.913 59.542 C 236.171 58.267 235.794 56.946 234.900 56.000 ZM 67.080 44.000 C 82.316 44.030 96.860 50.365 107.260 61.500 C 116.652 71.404 122.442 84.179 123.700 97.770 L 31.120 57.480 C 41.086 48.792 53.859 44.004 67.080 44.000 ZM 36.770 169.000 C 34.533 155.487 37.091 141.617 44.000 129.790 C 51.962 116.032 65.092 106.026 80.470 102.000 C 85.572 100.660 90.825 99.988 96.100 100.000 C 104.514 100.001 112.832 101.780 120.510 105.220 ZM 212.000 129.790 C 218.909 141.617 221.467 155.487 219.230 169.000 L 135.490 105.200 C 163.533 92.702 196.489 103.294 212.000 129.790 ZM 132.340 97.790 C 133.582 84.196 139.358 71.415 148.740 61.500 C 168.881 39.835 202.580 38.065 224.880 57.500 Z"),
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
        return _treePalm!!
    }

private var _treePalm: ImageVector? = null
