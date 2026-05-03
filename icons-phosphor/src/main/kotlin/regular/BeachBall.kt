package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.BeachBall: ImageVector
    get() {
        if (_beachBall != null) return _beachBall!!
        _beachBall = phosphorRegularIcon(
            name = "BeachBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 209.700 95.300 C 196.372 91.192 182.651 88.490 168.760 87.240 C 167.510 73.349 164.808 59.628 160.700 46.300 C 183.010 55.301 200.699 72.990 209.700 95.300 ZM 216.000 128.000 C 216.004 137.208 214.560 146.360 211.720 155.120 C 204.466 137.154 194.644 120.335 182.560 105.190 C 193.575 107.114 204.390 110.043 214.870 113.940 C 215.622 118.589 216.000 123.291 216.000 128.000 ZM 142.060 41.130 C 145.957 51.610 148.886 62.425 150.810 73.440 C 135.665 61.356 118.846 51.534 100.880 44.280 C 114.163 39.980 128.278 38.900 142.060 41.130 ZM 80.440 54.000 C 102.743 60.893 123.530 71.971 141.690 86.640 C 105.583 88.251 70.585 99.606 40.410 119.500 C 43.041 92.696 57.787 68.568 80.440 54.000 ZM 40.670 138.860 C 73.249 114.602 112.937 101.800 153.550 102.450 C 154.200 143.063 141.398 182.751 117.140 215.330 C 77.177 210.297 45.703 178.823 40.670 138.860 ZM 136.500 215.590 C 156.398 185.416 167.756 150.418 169.370 114.310 C 184.036 132.470 195.110 153.257 202.000 175.560 C 187.432 198.213 163.304 212.959 136.500 215.590 Z"),
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
        return _beachBall!!
    }

private var _beachBall: ImageVector? = null
