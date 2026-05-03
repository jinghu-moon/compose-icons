package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CloudSlash: ImageVector
    get() {
        if (_cloudSlash != null) return _cloudSlash!!
        _cloudSlash = phosphorRegularIcon(
            name = "CloudSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 53.920 34.620 C 52.008 32.465 49.085 31.504 46.267 32.105 C 43.450 32.706 41.173 34.775 40.306 37.522 C 39.439 40.270 40.117 43.271 42.080 45.380 L 81.320 88.550 L 81.260 88.670 C 78.193 88.226 75.099 88.002 72.000 88.000 C 36.654 88.000 8.000 116.654 8.000 152.000 C 8.000 187.346 36.654 216.000 72.000 216.000 L 160.000 216.000 C 170.877 216.021 181.662 214.010 191.800 210.070 L 202.080 221.380 C 203.992 223.535 206.915 224.496 209.733 223.895 C 212.550 223.294 214.827 221.225 215.694 218.478 C 216.561 215.730 215.883 212.729 213.920 210.620 ZM 160.000 200.000 L 72.000 200.000 C 45.490 200.000 24.000 178.510 24.000 152.000 C 24.000 125.490 45.490 104.000 72.000 104.000 C 73.100 104.000 74.200 104.000 75.300 104.120 C 73.115 111.892 72.004 119.927 72.000 128.000 C 72.000 132.418 75.582 136.000 80.000 136.000 C 84.418 136.000 88.000 132.418 88.000 128.000 C 88.003 118.914 89.720 109.910 93.060 101.460 L 180.060 197.160 C 173.542 199.052 166.787 200.008 160.000 200.000 ZM 248.000 128.000 C 248.013 149.621 240.055 170.487 225.650 186.610 C 222.656 189.609 217.843 189.753 214.675 186.938 C 211.507 184.123 211.084 179.326 213.710 176.000 C 238.326 148.507 238.171 106.855 213.351 79.546 C 188.531 52.238 147.083 48.115 117.370 70.000 C 113.811 72.618 108.803 71.854 106.185 68.295 C 103.567 64.736 104.331 59.728 107.890 57.110 C 134.622 37.466 170.129 34.524 199.729 49.501 C 229.329 64.477 247.992 94.827 248.000 128.000 Z"),
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
        return _cloudSlash!!
    }

private var _cloudSlash: ImageVector? = null
