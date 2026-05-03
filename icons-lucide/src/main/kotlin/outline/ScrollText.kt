package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ScrollText: ImageVector
    get() {
        if (_scrollText != null) return _scrollText!!
        _scrollText = lucideOutlineIcon(
            name = "ScrollText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.000 12.000 L 10.000 12.000"),
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
                pathData = parseSvgPathData("M 15.000 8.000 L 10.000 8.000"),
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
                pathData = parseSvgPathData("M 19.000 17.000 L 19.000 5.000 C 19.000 3.895 18.105 3.000 17.000 3.000 L 4.000 3.000"),
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
                pathData = parseSvgPathData("M 8.000 21.000 L 20.000 21.000 C 21.105 21.000 22.000 20.105 22.000 19.000 L 22.000 18.000 C 22.000 17.448 21.552 17.000 21.000 17.000 L 11.000 17.000 C 10.448 17.000 10.000 17.448 10.000 18.000 L 10.000 19.000 C 10.000 20.105 9.105 21.000 8.000 21.000 C 6.895 21.000 6.000 20.105 6.000 19.000 L 6.000 5.000 C 6.000 3.895 5.105 3.000 4.000 3.000 C 2.895 3.000 2.000 3.895 2.000 5.000 L 2.000 7.000 C 2.000 7.552 2.448 8.000 3.000 8.000 L 6.000 8.000"),
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
        return _scrollText!!
    }

private var _scrollText: ImageVector? = null
