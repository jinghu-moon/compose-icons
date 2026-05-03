package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Snail: ImageVector
    get() {
        if (_snail != null) return _snail!!
        _snail = lucideOutlineIcon(
            name = "Snail",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 2.000 13.000 C 2.000 16.314 4.686 19.000 8.000 19.000 C 11.314 19.000 14.000 16.314 14.000 13.000 C 14.000 10.791 12.209 9.000 10.000 9.000 C 7.791 9.000 6.000 10.791 6.000 13.000 C 6.000 14.105 6.895 15.000 8.000 15.000 C 9.105 15.000 10.000 14.105 10.000 13.000"),
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
                pathData = parseSvgPathData("M 18.000 13.000 C 18.000 17.418 14.418 21.000 10.000 21.000 C 5.582 21.000 2.000 17.418 2.000 13.000 C 2.000 8.582 5.582 5.000 10.000 5.000 C 14.418 5.000 18.000 8.582 18.000 13.000 Z"),
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
                pathData = parseSvgPathData("M 2.000 21.000 L 14.000 21.000 C 18.400 21.000 22.000 17.400 22.000 13.000 L 22.000 7.000 C 22.000 5.895 21.105 5.000 20.000 5.000 C 18.895 5.000 18.000 5.895 18.000 7.000 L 18.000 13.000"),
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
                pathData = parseSvgPathData("M 18.000 3.000 L 19.100 5.200"),
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
                pathData = parseSvgPathData("M 22.000 3.000 L 20.900 5.200"),
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
        return _snail!!
    }

private var _snail: ImageVector? = null
