package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.EllipsisVertical: ImageVector
    get() {
        if (_ellipsisVertical != null) return _ellipsisVertical!!
        _ellipsisVertical = lucideOutlineIcon(
            name = "EllipsisVertical",
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
        pathData = parseSvgPathData("M 13.000 5.000 C 13.000 5.552 12.552 6.000 12.000 6.000 C 11.448 6.000 11.000 5.552 11.000 5.000 C 11.000 4.448 11.448 4.000 12.000 4.000 C 12.552 4.000 13.000 4.448 13.000 5.000 Z"),
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
        pathData = parseSvgPathData("M 13.000 19.000 C 13.000 19.552 12.552 20.000 12.000 20.000 C 11.448 20.000 11.000 19.552 11.000 19.000 C 11.000 18.448 11.448 18.000 12.000 18.000 C 12.552 18.000 13.000 18.448 13.000 19.000 Z"),
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
        return _ellipsisVertical!!
    }

private var _ellipsisVertical: ImageVector? = null
