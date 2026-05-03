package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.LayoutTemplate: ImageVector
    get() {
        if (_layoutTemplate != null) return _layoutTemplate!!
        _layoutTemplate = lucideOutlineIcon(
            name = "LayoutTemplate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 3.000 L 20.000 3.000 C 20.552 3.000 21.000 3.448 21.000 4.000 L 21.000 9.000 C 21.000 9.552 20.552 10.000 20.000 10.000 L 4.000 10.000 C 3.448 10.000 3.000 9.552 3.000 9.000 L 3.000 4.000 C 3.000 3.448 3.448 3.000 4.000 3.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 4.000 14.000 L 11.000 14.000 C 11.552 14.000 12.000 14.448 12.000 15.000 L 12.000 20.000 C 12.000 20.552 11.552 21.000 11.000 21.000 L 4.000 21.000 C 3.448 21.000 3.000 20.552 3.000 20.000 L 3.000 15.000 C 3.000 14.448 3.448 14.000 4.000 14.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 17.000 14.000 L 20.000 14.000 C 20.552 14.000 21.000 14.448 21.000 15.000 L 21.000 20.000 C 21.000 20.552 20.552 21.000 20.000 21.000 L 17.000 21.000 C 16.448 21.000 16.000 20.552 16.000 20.000 L 16.000 15.000 C 16.000 14.448 16.448 14.000 17.000 14.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _layoutTemplate!!
    }

private var _layoutTemplate: ImageVector? = null
