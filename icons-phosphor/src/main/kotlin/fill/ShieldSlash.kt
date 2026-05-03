package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ShieldSlash: ImageVector
    get() {
        if (_shieldSlash != null) return _shieldSlash!!
        _shieldSlash = phosphorFillIcon(
            name = "ShieldSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 56.000 L 224.000 112.000 C 224.000 137.240 218.150 157.720 209.700 174.140 C 209.103 175.313 207.968 176.117 206.664 176.290 C 205.359 176.464 204.053 175.985 203.170 175.010 L 86.520 46.690 C 85.450 45.513 85.180 43.814 85.830 42.363 C 86.481 40.912 87.930 39.984 89.520 40.000 L 208.000 40.000 C 216.837 40.000 224.000 47.163 224.000 56.000 ZM 53.920 34.620 C 51.445 31.905 47.438 31.226 44.206 32.972 C 40.974 34.718 39.346 38.442 40.260 42.000 C 35.165 44.816 32.001 50.178 32.000 56.000 L 32.000 112.000 C 32.000 164.720 57.520 196.670 78.930 214.190 C 101.990 233.050 124.930 239.460 125.930 239.720 C 127.305 240.094 128.755 240.094 130.130 239.720 C 131.130 239.460 154.040 233.050 177.130 214.190 C 180.636 211.302 183.990 208.234 187.180 205.000 L 202.080 221.380 C 203.992 223.535 206.915 224.496 209.733 223.895 C 212.550 223.294 214.827 221.225 215.694 218.478 C 216.561 215.730 215.883 212.729 213.920 210.620 Z"),
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
        return _shieldSlash!!
    }

private var _shieldSlash: ImageVector? = null
