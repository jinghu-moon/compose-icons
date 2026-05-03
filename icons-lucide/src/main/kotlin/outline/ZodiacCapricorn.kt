package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ZodiacCapricorn: ImageVector
    get() {
        if (_zodiacCapricorn != null) return _zodiacCapricorn!!
        _zodiacCapricorn = lucideOutlineIcon(
            name = "ZodiacCapricorn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.000 21.000 C 12.657 21.000 14.000 19.657 14.000 18.000 L 14.000 6.500 C 14.000 4.567 12.433 3.000 10.500 3.000 C 8.567 3.000 7.000 4.567 7.000 6.500"),
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
                pathData = parseSvgPathData("M 7.000 19.000 L 7.000 6.000 C 7.000 4.343 5.657 3.000 4.000 3.000 L 4.000 3.000"),
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
                pathData = parseSvgPathData("M 20.000 17.000 C 20.000 18.657 18.657 20.000 17.000 20.000 C 15.343 20.000 14.000 18.657 14.000 17.000 C 14.000 15.343 15.343 14.000 17.000 14.000 C 18.657 14.000 20.000 15.343 20.000 17.000 Z"),
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
        return _zodiacCapricorn!!
    }

private var _zodiacCapricorn: ImageVector? = null
