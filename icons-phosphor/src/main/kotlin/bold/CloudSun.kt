package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CloudSun: ImageVector
    get() {
        if (_cloudSun != null) return _cloudSun!!
        _cloudSun = phosphorBoldIcon(
            name = "CloudSun",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 164.000 68.000 C 157.784 68.001 151.590 68.722 145.540 70.150 C 143.741 67.521 141.734 65.040 139.540 62.730 L 147.110 51.910 C 150.912 46.481 149.594 38.997 144.165 35.195 C 138.736 31.393 131.252 32.711 127.450 38.140 L 119.870 49.000 C 112.839 45.921 105.282 44.224 97.610 44.000 L 95.310 31.000 C 94.045 24.591 87.885 20.371 81.452 21.506 C 75.018 22.641 70.675 28.715 71.680 35.170 L 73.980 48.170 C 66.849 51.004 60.328 55.179 54.770 60.470 L 43.910 52.860 C 38.481 49.058 30.997 50.376 27.195 55.805 C 23.393 61.234 24.711 68.718 30.140 72.520 L 41.000 80.110 C 37.913 87.135 36.215 94.690 36.000 102.360 L 23.000 104.660 C 16.869 105.734 12.577 111.318 13.116 117.519 C 13.655 123.720 18.846 128.480 25.070 128.480 C 25.774 128.479 26.476 128.419 27.170 128.300 L 40.170 126.000 C 41.152 128.492 42.301 130.914 43.610 133.250 C 28.091 149.441 23.729 173.329 32.523 193.960 C 41.318 214.591 61.573 227.985 84.000 228.000 L 164.000 228.000 C 208.183 228.000 244.000 192.183 244.000 148.000 C 244.000 103.817 208.183 68.000 164.000 68.000 ZM 96.000 68.000 C 106.051 68.008 115.641 72.217 122.450 79.610 C 108.215 88.244 97.012 101.085 90.390 116.360 C 88.269 116.119 86.135 115.999 84.000 116.000 C 77.044 115.999 70.149 117.298 63.670 119.830 C 58.207 108.673 58.883 95.487 65.458 84.947 C 72.033 74.407 83.577 68.001 96.000 68.000 ZM 164.000 204.000 L 84.000 204.000 C 66.327 204.000 52.000 189.673 52.000 172.000 C 52.000 154.327 66.327 140.000 84.000 140.000 L 84.280 140.000 C 84.170 141.100 84.080 142.200 84.020 143.300 C 83.633 149.927 88.693 155.613 95.320 156.000 C 101.947 156.387 107.633 151.327 108.020 144.700 C 108.232 140.984 108.814 137.299 109.760 133.700 L 109.910 133.150 C 117.568 105.150 145.334 87.628 173.904 92.765 C 202.474 97.901 222.397 123.998 219.823 152.912 C 217.249 181.826 193.028 203.992 164.000 204.000 Z"),
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
        return _cloudSun!!
    }

private var _cloudSun: ImageVector? = null
