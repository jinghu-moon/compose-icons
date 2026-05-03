package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Basket: ImageVector
    get() {
        if (_basket != null) return _basket!!
        _basket = phosphorFillIcon(
            name = "Basket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 238.000 82.730 C 236.485 81.000 234.299 80.005 232.000 80.000 L 187.630 80.000 L 134.000 18.730 C 132.481 17.008 130.296 16.022 128.000 16.022 C 125.704 16.022 123.519 17.008 122.000 18.730 L 68.370 80.000 L 24.000 80.000 C 21.693 80.000 19.499 80.995 17.980 82.731 C 16.460 84.467 15.764 86.774 16.070 89.060 L 31.140 202.120 C 32.227 210.054 38.992 215.974 47.000 216.000 L 209.000 216.000 C 217.008 215.974 223.773 210.054 224.860 202.120 L 239.930 89.060 C 240.230 86.770 239.527 84.463 238.000 82.730 ZM 81.600 184.000 C 81.330 184.015 81.060 184.015 80.790 184.000 C 76.666 184.021 73.202 180.903 72.790 176.800 L 67.190 120.800 C 66.748 116.404 69.954 112.482 74.350 112.040 C 78.746 111.598 82.668 114.804 83.110 119.200 L 88.710 175.200 C 89.177 179.593 85.993 183.533 81.600 184.000 ZM 136.000 176.000 C 136.000 180.418 132.418 184.000 128.000 184.000 C 123.582 184.000 120.000 180.418 120.000 176.000 L 120.000 120.000 C 120.000 115.582 123.582 112.000 128.000 112.000 C 132.418 112.000 136.000 115.582 136.000 120.000 ZM 89.630 80.000 L 128.000 36.150 L 166.370 80.000 ZM 188.760 120.800 L 183.160 176.800 C 182.750 180.884 179.315 183.995 175.210 184.000 C 174.940 184.015 174.670 184.015 174.400 184.000 C 172.289 183.788 170.348 182.746 169.006 181.103 C 167.663 179.460 167.028 177.351 167.240 175.240 L 172.840 119.240 C 173.282 114.844 177.204 111.638 181.600 112.080 C 185.996 112.522 189.202 116.444 188.760 120.840 Z"),
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
        return _basket!!
    }

private var _basket: ImageVector? = null
