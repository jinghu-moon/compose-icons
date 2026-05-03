package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Notches: ImageVector
    get() {
        if (_notches != null) return _notches!!
        _notches = phosphorFillIcon(
            name = "Notches",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 40.000 L 200.000 192.000 C 200.000 196.418 196.418 200.000 192.000 200.000 L 40.000 200.000 C 36.762 200.003 33.842 198.053 32.603 195.062 C 31.364 192.071 32.049 188.628 34.340 186.340 L 186.340 34.340 C 188.628 32.049 192.071 31.364 195.062 32.603 C 198.053 33.842 200.003 36.762 200.000 40.000 Z"),
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
        return _notches!!
    }

private var _notches: ImageVector? = null
