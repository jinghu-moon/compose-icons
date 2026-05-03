package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Empty: ImageVector
    get() {
        if (_empty != null) return _empty!!
        _empty = phosphorRegularIcon(
            name = "Empty",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 198.240 62.630 L 213.920 45.380 C 216.827 42.103 216.558 37.097 213.316 34.151 C 210.074 31.204 205.065 31.413 202.080 34.620 L 186.400 51.860 C 146.815 21.458 90.532 26.482 56.958 63.416 C 23.384 100.349 23.732 156.854 57.760 193.370 L 42.080 210.620 C 40.117 212.729 39.439 215.730 40.306 218.478 C 41.173 221.225 43.450 223.294 46.267 223.895 C 49.085 224.496 52.008 223.535 53.920 221.380 L 69.600 204.140 C 109.185 234.542 165.468 229.518 199.042 192.584 C 232.616 155.651 232.268 99.146 198.240 62.630 ZM 48.000 128.000 C 48.018 97.797 65.045 70.178 92.021 56.595 C 118.998 43.012 151.325 45.779 175.600 63.750 L 68.600 181.480 C 55.334 166.828 47.991 147.765 48.000 128.000 ZM 128.000 208.000 C 110.850 208.018 94.154 202.494 80.400 192.250 L 187.400 74.520 C 208.549 97.982 213.902 131.697 201.059 160.555 C 188.217 189.414 159.587 208.006 128.000 208.000 Z"),
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
