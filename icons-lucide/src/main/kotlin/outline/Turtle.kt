package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Turtle: ImageVector
    get() {
        if (_turtle != null) return _turtle!!
        _turtle = lucideOutlineIcon(
            name = "Turtle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 10.000 L 14.000 14.000 L 14.000 17.000 C 14.000 17.552 14.448 18.000 15.000 18.000 L 17.000 18.000 C 17.552 18.000 18.000 17.552 18.000 17.000 L 18.000 14.000 C 18.000 9.582 14.418 6.000 10.000 6.000 C 5.582 6.000 2.000 9.582 2.000 14.000 L 2.000 17.000 C 2.000 17.552 2.448 18.000 3.000 18.000 L 5.000 18.000 C 5.552 18.000 6.000 17.552 6.000 17.000 L 6.000 14.000 L 8.000 10.000 L 12.000 10.000 Z"),
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
                pathData = parseSvgPathData("M 4.820 7.900 L 8.000 10.000"),
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
                pathData = parseSvgPathData("M 15.180 7.900 L 12.000 10.000"),
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
                pathData = parseSvgPathData("M 16.930 10.000 L 20.000 10.000 C 21.105 10.000 22.000 10.895 22.000 12.000 C 22.000 13.105 21.105 14.000 20.000 14.000 L 2.000 14.000"),
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
        return _turtle!!
    }

private var _turtle: ImageVector? = null
