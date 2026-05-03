package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.PaintRoller: ImageVector
    get() {
        if (_paintRoller != null) return _paintRoller!!
        _paintRoller = lucideOutlineIcon(
            name = "PaintRoller",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 2.000 L 16.000 2.000 C 17.105 2.000 18.000 2.895 18.000 4.000 L 18.000 6.000 C 18.000 7.105 17.105 8.000 16.000 8.000 L 4.000 8.000 C 2.895 8.000 2.000 7.105 2.000 6.000 L 2.000 4.000 C 2.000 2.895 2.895 2.000 4.000 2.000 Z"),
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
                pathData = parseSvgPathData("M 10.000 16.000 L 10.000 14.000 C 10.000 12.895 10.895 12.000 12.000 12.000 L 20.000 12.000 C 21.105 12.000 22.000 11.105 22.000 10.000 L 22.000 7.000 C 22.000 5.895 21.105 5.000 20.000 5.000 L 18.000 5.000"),
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
                pathData = parseSvgPathData("M 9.000 16.000 L 11.000 16.000 C 11.552 16.000 12.000 16.448 12.000 17.000 L 12.000 21.000 C 12.000 21.552 11.552 22.000 11.000 22.000 L 9.000 22.000 C 8.448 22.000 8.000 21.552 8.000 21.000 L 8.000 17.000 C 8.000 16.448 8.448 16.000 9.000 16.000 Z"),
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
        return _paintRoller!!
    }

private var _paintRoller: ImageVector? = null
