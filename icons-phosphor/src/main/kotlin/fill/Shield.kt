package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Shield: ImageVector
    get() {
        if (_shield != null) return _shield!!
        _shield = phosphorFillIcon(
            name = "Shield",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 56.000 L 224.000 112.000 C 224.000 164.720 198.480 196.670 177.070 214.190 C 154.010 233.050 131.070 239.460 130.070 239.720 C 128.695 240.094 127.245 240.094 125.870 239.720 C 124.870 239.460 101.960 233.050 78.870 214.190 C 57.520 196.670 32.000 164.720 32.000 112.000 L 32.000 56.000 C 32.000 47.163 39.163 40.000 48.000 40.000 L 208.000 40.000 C 216.837 40.000 224.000 47.163 224.000 56.000 Z"),
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
        return _shield!!
    }

private var _shield: ImageVector? = null
