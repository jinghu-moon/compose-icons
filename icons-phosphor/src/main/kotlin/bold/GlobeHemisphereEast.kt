package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GlobeHemisphereEast: ImageVector
    get() {
        if (_globeHemisphereEast != null) return _globeHemisphereEast!!
        _globeHemisphereEast = phosphorBoldIcon(
            name = "GlobeHemisphereEast",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 128.000 44.000 C 143.542 43.988 158.779 48.310 172.000 56.480 L 172.000 72.480 L 151.790 96.000 L 123.320 99.850 L 104.620 87.600 C 100.214 84.525 94.756 83.352 89.476 84.345 C 84.196 85.338 79.537 88.414 76.550 92.880 L 55.610 124.180 C 53.424 127.434 52.248 131.260 52.230 135.180 L 52.070 163.870 C 39.783 137.853 41.668 107.357 57.065 83.050 C 72.461 58.744 99.227 44.009 128.000 44.000 ZM 68.410 187.140 C 73.178 183.367 75.971 177.630 76.000 171.550 L 76.200 136.550 L 94.270 109.550 L 110.890 120.430 C 115.004 123.312 120.054 124.533 125.030 123.850 L 156.500 119.590 C 161.359 118.932 165.808 116.512 169.000 112.790 L 191.160 87.000 C 193.342 84.446 194.852 81.386 195.550 78.100 C 210.307 98.029 215.478 123.472 209.670 147.580 L 198.330 137.210 C 192.585 131.983 184.340 130.538 177.160 133.500 L 146.710 146.160 C 140.235 148.873 135.644 154.767 134.600 161.710 L 132.210 177.910 C 130.724 187.994 137.061 197.583 146.920 200.170 L 162.920 204.350 C 130.934 219.011 93.195 212.124 68.450 187.110 ZM 185.180 189.460 L 183.550 187.830 C 181.039 185.316 177.906 183.515 174.470 182.610 L 156.470 177.890 L 158.000 167.480 L 184.000 156.670 L 200.000 171.260 C 195.927 177.984 190.939 184.109 185.180 189.460 Z"),
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
        return _globeHemisphereEast!!
    }

private var _globeHemisphereEast: ImageVector? = null
