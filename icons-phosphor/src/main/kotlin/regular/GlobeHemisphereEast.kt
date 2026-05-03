package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.GlobeHemisphereEast: ImageVector
    get() {
        if (_globeHemisphereEast != null) return _globeHemisphereEast!!
        _globeHemisphereEast = phosphorRegularIcon(
            name = "GlobeHemisphereEast",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 128.000 40.000 C 145.050 39.982 161.733 44.945 176.000 54.280 L 176.000 74.000 L 153.830 99.740 L 122.360 104.000 L 122.050 103.780 L 102.380 90.920 C 98.857 88.438 94.482 87.483 90.245 88.269 C 86.008 89.056 82.267 91.519 79.870 95.100 L 58.930 126.400 C 57.186 129.008 56.247 132.072 56.230 135.210 L 56.000 171.440 L 52.730 173.590 C 36.271 146.416 35.737 112.481 51.332 84.802 C 66.927 57.124 96.230 40.000 128.000 40.000 ZM 62.290 186.470 L 64.810 184.820 C 69.279 181.872 71.978 176.884 72.000 171.530 L 72.210 135.300 L 93.170 104.000 C 93.273 104.079 93.379 104.152 93.490 104.220 L 113.160 117.090 C 116.456 119.417 120.512 120.406 124.510 119.860 L 156.000 115.590 C 159.883 115.072 163.441 113.147 166.000 110.180 L 188.170 84.420 C 190.649 81.515 192.008 77.819 192.000 74.000 L 192.000 67.670 C 214.040 90.987 221.618 124.464 211.770 155.000 L 195.630 140.240 C 191.049 136.035 184.447 134.865 178.700 137.240 L 148.240 149.890 C 143.060 152.064 139.390 156.784 138.560 162.340 L 136.170 178.530 C 134.981 186.599 140.051 194.271 147.940 196.340 L 169.400 202.000 L 171.760 204.370 C 135.638 225.095 89.929 217.621 62.290 186.470 ZM 185.000 195.000 L 180.700 190.690 C 178.694 188.677 176.188 187.234 173.440 186.510 L 152.000 180.850 L 154.390 164.660 L 184.840 152.000 L 205.000 170.480 C 199.862 179.789 193.087 188.096 185.000 195.000 Z"),
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
        return _globeHemisphereEast!!
    }

private var _globeHemisphereEast: ImageVector? = null
