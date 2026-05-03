package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Ellipsis: ImageVector
    get() {
        if (_ellipsis != null) return _ellipsis!!
        _ellipsis = lucideOutlineIcon(
            name = "Ellipsis",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.000 12.000 C 13.000 12.552 12.552 13.000 12.000 13.000 C 11.448 13.000 11.000 12.552 11.000 12.000 C 11.000 11.448 11.448 11.000 12.000 11.000 C 12.552 11.000 13.000 11.448 13.000 12.000 Z"),
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
        pathData = parseSvgPathData("M 20.000 12.000 C 20.000 12.552 19.552 13.000 19.000 13.000 C 18.448 13.000 18.000 12.552 18.000 12.000 C 18.000 11.448 18.448 11.000 19.000 11.000 C 19.552 11.000 20.000 11.448 20.000 12.000 Z"),
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
        pathData = parseSvgPathData("M 6.000 12.000 C 6.000 12.552 5.552 13.000 5.000 13.000 C 4.448 13.000 4.000 12.552 4.000 12.000 C 4.000 11.448 4.448 11.000 5.000 11.000 C 5.552 11.000 6.000 11.448 6.000 12.000 Z"),
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
        return _ellipsis!!
    }

private var _ellipsis: ImageVector? = null
