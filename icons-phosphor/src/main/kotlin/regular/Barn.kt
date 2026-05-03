package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Barn: ImageVector
    get() {
        if (_barn != null) return _barn!!
        _barn = phosphorRegularIcon(
            name = "Barn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 192.000 L 232.000 192.000 L 232.000 130.570 L 233.490 132.650 C 235.094 135.118 237.924 136.506 240.857 136.263 C 243.790 136.021 246.354 134.187 247.530 131.489 C 248.707 128.791 248.308 125.665 246.490 123.350 L 206.490 67.350 C 205.942 66.591 205.265 65.935 204.490 65.410 L 137.000 18.770 L 136.900 18.700 C 131.523 15.113 124.517 15.113 119.140 18.700 L 119.040 18.770 L 51.450 65.420 C 50.675 65.945 49.998 66.601 49.450 67.360 L 9.450 123.360 C 7.632 125.675 7.233 128.801 8.410 131.499 C 9.586 134.197 12.150 136.031 15.083 136.273 C 18.016 136.516 20.846 135.128 22.450 132.660 L 24.000 130.570 L 24.000 192.000 L 16.000 192.000 C 11.582 192.000 8.000 195.582 8.000 200.000 C 8.000 204.418 11.582 208.000 16.000 208.000 L 240.000 208.000 C 244.418 208.000 248.000 204.418 248.000 200.000 C 248.000 195.582 244.418 192.000 240.000 192.000 ZM 40.000 108.170 L 61.700 77.790 L 128.000 32.000 L 194.300 77.780 L 216.000 108.170 L 216.000 192.000 L 192.000 192.000 L 192.000 120.000 C 192.000 115.582 188.418 112.000 184.000 112.000 L 72.000 112.000 C 67.582 112.000 64.000 115.582 64.000 120.000 L 64.000 192.000 L 40.000 192.000 ZM 128.000 150.170 L 97.000 128.000 L 159.000 128.000 ZM 176.000 135.550 L 176.000 184.460 L 141.760 160.000 ZM 114.240 160.000 L 80.000 184.460 L 80.000 135.550 ZM 128.000 169.830 L 159.000 192.000 L 97.000 192.000 ZM 104.000 88.000 C 104.000 83.582 107.582 80.000 112.000 80.000 L 144.000 80.000 C 148.418 80.000 152.000 83.582 152.000 88.000 C 152.000 92.418 148.418 96.000 144.000 96.000 L 112.000 96.000 C 107.582 96.000 104.000 92.418 104.000 88.000 Z"),
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
        return _barn!!
    }

private var _barn: ImageVector? = null
