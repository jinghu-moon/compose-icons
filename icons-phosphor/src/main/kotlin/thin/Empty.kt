package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Empty: ImageVector
    get() {
        if (_empty != null) return _empty!!
        _empty = phosphorThinIcon(
            name = "Empty",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 192.760 62.720 L 210.960 42.720 C 212.454 41.074 212.331 38.529 210.685 37.035 C 209.039 35.541 206.494 35.664 205.000 37.310 L 186.800 57.310 C 148.920 26.166 93.270 30.208 60.288 66.498 C 27.306 102.789 28.587 158.571 63.200 193.310 L 45.000 213.310 C 43.514 214.967 43.653 217.514 45.310 219.000 C 46.967 220.486 49.514 220.347 51.000 218.690 L 69.200 198.690 C 107.099 229.523 162.489 225.354 195.346 189.197 C 228.204 153.039 227.068 97.504 192.760 62.720 ZM 44.000 128.000 C 44.016 95.488 62.792 65.905 92.205 52.051 C 121.617 38.196 156.383 42.559 181.460 63.250 L 68.630 187.360 C 52.850 171.638 43.986 150.275 44.000 128.000 ZM 128.000 212.000 C 108.480 212.018 89.568 205.208 74.540 192.750 L 187.370 68.640 C 211.364 92.664 218.536 128.770 205.544 160.140 C 192.553 191.510 161.954 211.974 128.000 212.000 Z"),
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
        return _empty!!
    }

private var _empty: ImageVector? = null
