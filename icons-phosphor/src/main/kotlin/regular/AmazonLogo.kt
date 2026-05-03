package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.AmazonLogo: ImageVector
    get() {
        if (_amazonLogo != null) return _amazonLogo!!
        _amazonLogo = phosphorRegularIcon(
            name = "AmazonLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 248.000 168.000 L 248.000 200.000 C 248.000 204.418 244.418 208.000 240.000 208.000 C 235.582 208.000 232.000 204.418 232.000 200.000 L 232.000 187.310 L 229.790 189.530 C 226.690 192.900 189.440 232.000 128.000 232.000 C 65.160 232.000 27.620 191.090 26.050 189.350 C 23.095 186.050 23.375 180.980 26.675 178.025 C 29.975 175.070 35.045 175.350 38.000 178.650 C 38.270 179.000 72.500 216.000 128.000 216.000 C 183.500 216.000 217.730 179.000 218.070 178.640 C 218.155 178.535 218.245 178.435 218.340 178.340 L 220.690 176.000 L 208.000 176.000 C 203.582 176.000 200.000 172.418 200.000 168.000 C 200.000 163.582 203.582 160.000 208.000 160.000 L 240.000 160.000 C 244.418 160.000 248.000 163.582 248.000 168.000 ZM 160.000 94.530 L 160.000 84.000 C 160.011 67.349 148.602 52.863 132.412 48.973 C 116.222 45.082 99.476 52.802 91.920 67.640 C 89.910 71.575 85.090 73.135 81.155 71.125 C 77.220 69.115 75.660 64.295 77.670 60.360 C 88.589 38.935 112.774 27.792 136.155 33.413 C 159.536 39.034 176.013 59.953 176.000 84.000 L 176.000 176.000 C 176.000 180.418 172.418 184.000 168.000 184.000 C 163.582 184.000 160.000 180.418 160.000 176.000 L 160.000 169.470 C 139.493 189.203 106.934 188.785 86.940 168.533 C 66.946 148.281 66.946 115.719 86.940 95.467 C 106.934 75.215 139.493 74.797 160.000 94.530 ZM 160.000 132.000 C 160.000 112.118 143.882 96.000 124.000 96.000 C 104.118 96.000 88.000 112.118 88.000 132.000 C 88.000 151.882 104.118 168.000 124.000 168.000 C 143.882 168.000 160.000 151.882 160.000 132.000 Z"),
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
        return _amazonLogo!!
    }

private var _amazonLogo: ImageVector? = null
