package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.LightningSlash: ImageVector
    get() {
        if (_lightningSlash != null) return _lightningSlash!!
        _lightningSlash = phosphorFillIcon(
            name = "LightningSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 105.720 67.810 C 104.309 66.279 104.309 63.921 105.720 62.390 L 154.110 10.540 C 156.546 7.928 160.419 7.247 163.600 8.873 C 166.781 10.498 168.499 14.035 167.810 17.540 L 153.180 90.900 L 210.610 112.430 C 212.360 113.055 213.847 114.253 214.830 115.830 C 216.697 118.900 216.288 122.839 213.830 125.460 L 188.560 152.530 C 187.803 153.351 186.737 153.818 185.620 153.818 C 184.503 153.818 183.437 153.351 182.680 152.530 ZM 133.480 122.130 L 53.920 34.620 C 52.008 32.465 49.085 31.504 46.267 32.105 C 43.450 32.706 41.173 34.775 40.306 37.522 C 39.439 40.270 40.117 43.271 42.080 45.380 L 81.340 88.560 L 42.340 130.390 C 41.019 131.713 40.193 133.450 40.000 135.310 C 39.691 138.885 41.800 142.229 45.160 143.490 L 102.790 165.100 L 88.160 238.430 C 87.478 241.930 89.195 245.459 92.370 247.083 C 95.545 248.706 99.412 248.032 101.850 245.430 L 163.710 179.150 L 202.080 221.350 C 203.992 223.505 206.915 224.466 209.733 223.865 C 212.550 223.264 214.827 221.195 215.694 218.448 C 216.561 215.700 215.883 212.699 213.920 210.590 Z"),
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
        return _lightningSlash!!
    }

private var _lightningSlash: ImageVector? = null
