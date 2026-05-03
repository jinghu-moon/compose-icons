package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Ham: ImageVector
    get() {
        if (_ham != null) return _ham!!
        _ham = lucideOutlineIcon(
            name = "Ham",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.144 21.144 C 17.223 17.065 18.227 11.454 15.386 8.614 C 12.546 5.773 6.935 6.777 2.856 10.856"),
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
                pathData = parseSvgPathData("M 13.144 21.144 C 14.849 19.439 13.928 15.754 11.087 12.913 C 8.246 10.072 4.561 9.151 2.856 10.856 C 1.151 12.561 2.072 16.246 4.913 19.087 C 7.754 21.928 11.439 22.849 13.144 21.144"),
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
                pathData = parseSvgPathData("M 16.565 10.435 L 18.600 8.400 C 19.468 8.881 20.539 8.803 21.328 8.202 C 22.118 7.600 22.477 6.588 22.243 5.624 C 22.009 4.659 21.227 3.924 20.250 3.750 C 20.059 2.788 19.323 2.027 18.368 1.803 C 17.413 1.580 16.416 1.935 15.817 2.712 C 15.219 3.489 15.130 4.544 15.590 5.410 L 13.566 7.435"),
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
                pathData = parseSvgPathData("M 8.500 16.500 L 7.500 15.500"),
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
        return _ham!!
    }

private var _ham: ImageVector? = null
