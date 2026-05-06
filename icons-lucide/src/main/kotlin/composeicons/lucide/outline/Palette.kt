package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Palette: ImageVector
    get() {
        if (_palette != null) return _palette!!
        _palette = lucideOutlineIcon(
            name = "Palette",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 22C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2c5.523 0 10 4.029 10 9 0 2.761-2.239 5-5 5h-2.25c-.663 0-1.269 .375-1.565 .967-.296 .593-.232 1.302 .165 1.833l.3 .4c.398 .53 .462 1.24 .165 1.833-.296 .593-.902 .967-1.565 .967Z"),
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
                pathData = parseSvgPathData("M14 6.5C14 6.776 13.776 7 13.5 7 13.224 7 13 6.776 13 6.5 13 6.224 13.224 6 13.5 6c.276 0 .5 .224 .5 .5Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M18 10.5c0 .276-.224 .5-.5 .5C17.224 11 17 10.776 17 10.5c0-.276 .224-.5 .5-.5 .276 0 .5 .224 .5 .5Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M7 12.5C7 12.776 6.776 13 6.5 13 6.224 13 6 12.776 6 12.5 6 12.224 6.224 12 6.5 12c.276 0 .5 .224 .5 .5Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M9 7.5C9 7.776 8.776 8 8.5 8 8.224 8 8 7.776 8 7.5 8 7.224 8.224 7 8.5 7 8.776 7 9 7.224 9 7.5Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _palette!!
    }

private var _palette: ImageVector? = null
