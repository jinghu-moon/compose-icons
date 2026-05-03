package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SwatchBook: ImageVector
    get() {
        if (_swatchBook != null) return _swatchBook!!
        _swatchBook = lucideOutlineIcon(
            name = "SwatchBook",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.000 17.000 C 11.000 19.209 9.209 21.000 7.000 21.000 C 4.791 21.000 3.000 19.209 3.000 17.000 L 3.000 5.000 C 3.000 3.895 3.895 3.000 5.000 3.000 L 9.000 3.000 C 10.105 3.000 11.000 3.895 11.000 5.000 Z"),
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
                pathData = parseSvgPathData("M 16.700 13.000 L 19.000 13.000 C 20.105 13.000 21.000 13.895 21.000 15.000 L 21.000 19.000 C 21.000 20.105 20.105 21.000 19.000 21.000 L 7.000 21.000"),
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
                pathData = parseSvgPathData("M 7.000 17.000 L 7.010 17.000"),
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
                pathData = parseSvgPathData("M 11.000 8.000 L 13.300 5.700 C 13.751 5.247 14.364 4.993 15.003 4.994 C 15.642 4.995 16.254 5.250 16.704 5.704 L 18.600 7.600 C 19.066 8.048 19.331 8.665 19.336 9.312 C 19.341 9.958 19.085 10.579 18.626 11.034 L 9.900 19.800"),
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
        return _swatchBook!!
    }

private var _swatchBook: ImageVector? = null
