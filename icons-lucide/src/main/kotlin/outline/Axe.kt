package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Axe: ImageVector
    get() {
        if (_axe != null) return _axe!!
        _axe = lucideOutlineIcon(
            name = "Axe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.000 12.000 L 5.619 20.380 C 4.791 21.209 3.447 21.209 2.618 20.381 C 1.790 19.552 1.790 18.209 2.618 17.380 L 11.000 9.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 15.000 15.500 C 15.000 15.776 15.224 16.000 15.500 16.000 C 19.090 16.000 22.000 13.090 22.000 9.500 C 22.000 9.224 21.776 9.000 21.500 9.000 L 19.828 9.000 C 19.298 9.000 18.789 8.789 18.414 8.414 L 13.352 3.352 C 12.881 2.882 12.119 2.882 11.648 3.352 L 9.352 5.648 C 8.882 6.119 8.882 6.881 9.352 7.352 L 14.414 12.414 C 14.789 12.789 15.000 13.298 15.000 13.828 Z"),
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
        return _axe!!
    }

private var _axe: ImageVector? = null
