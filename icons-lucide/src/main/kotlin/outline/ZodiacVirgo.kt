package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ZodiacVirgo: ImageVector
    get() {
        if (_zodiacVirgo != null) return _zodiacVirgo!!
        _zodiacVirgo = lucideOutlineIcon(
            name = "ZodiacVirgo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.000 5.500 C 11.000 4.119 12.119 3.000 13.500 3.000 C 14.881 3.000 16.000 4.119 16.000 5.500 L 16.000 16.000 C 16.000 18.761 18.239 21.000 21.000 21.000"),
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
                pathData = parseSvgPathData("M 16.000 11.500 C 16.000 10.119 17.119 9.000 18.500 9.000 C 19.881 9.000 21.000 10.119 21.000 11.500 L 21.000 16.000 C 21.000 18.761 18.761 21.000 16.000 21.000"),
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
                pathData = parseSvgPathData("M 6.000 19.000 L 6.000 6.000 C 6.000 4.343 4.657 3.000 3.000 3.000 L 3.000 3.000"),
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
                pathData = parseSvgPathData("M 6.000 5.500 C 6.000 4.119 7.119 3.000 8.500 3.000 C 9.881 3.000 11.000 4.119 11.000 5.500 L 11.000 19.000"),
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
        return _zodiacVirgo!!
    }

private var _zodiacVirgo: ImageVector? = null
