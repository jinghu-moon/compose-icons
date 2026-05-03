package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Triangle: ImageVector
    get() {
        if (_triangle != null) return _triangle!!
        _triangle = lucideOutlineIcon(
            name = "Triangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.730 4.000 C 13.372 3.383 12.713 3.004 12.000 3.004 C 11.287 3.004 10.628 3.383 10.270 4.000 L 2.270 18.000 C 1.913 18.618 1.913 19.380 2.269 19.999 C 2.626 20.618 3.286 20.999 4.000 21.000 L 20.000 21.000 C 20.714 20.999 21.374 20.618 21.731 19.999 C 22.087 19.380 22.087 18.618 21.730 18.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _triangle!!
    }

private var _triangle: ImageVector? = null
