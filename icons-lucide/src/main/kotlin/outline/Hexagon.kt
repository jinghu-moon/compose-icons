package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Hexagon: ImageVector
    get() {
        if (_hexagon != null) return _hexagon!!
        _hexagon = lucideOutlineIcon(
            name = "Hexagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.000 16.000 L 21.000 8.000 C 20.999 7.286 20.618 6.627 20.000 6.270 L 13.000 2.270 C 12.381 1.913 11.619 1.913 11.000 2.270 L 4.000 6.270 C 3.382 6.627 3.001 7.286 3.000 8.000 L 3.000 16.000 C 3.001 16.714 3.382 17.373 4.000 17.730 L 11.000 21.730 C 11.619 22.087 12.381 22.087 13.000 21.730 L 20.000 17.730 C 20.618 17.373 20.999 16.714 21.000 16.000 Z"),
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
        return _hexagon!!
    }

private var _hexagon: ImageVector? = null
