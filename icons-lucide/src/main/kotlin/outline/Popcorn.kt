package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Popcorn: ImageVector
    get() {
        if (_popcorn != null) return _popcorn!!
        _popcorn = lucideOutlineIcon(
            name = "Popcorn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.000 8.000 C 19.105 8.000 20.000 7.105 20.000 6.000 C 20.000 4.895 19.105 4.000 18.000 4.000 C 18.000 2.895 17.105 2.000 16.000 2.000 C 14.895 2.000 14.000 2.895 14.000 4.000 C 14.000 2.895 13.105 2.000 12.000 2.000 C 10.895 2.000 10.000 2.895 10.000 4.000 C 10.000 2.895 9.105 2.000 8.000 2.000 C 6.895 2.000 6.000 2.895 6.000 4.000 C 4.895 4.000 4.000 4.895 4.000 6.000 C 4.000 7.105 4.895 8.000 6.000 8.000"),
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
                pathData = parseSvgPathData("M 10.000 22.000 L 9.000 8.000"),
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
                pathData = parseSvgPathData("M 14.000 22.000 L 15.000 8.000"),
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
                pathData = parseSvgPathData("M 20.000 8.000 C 20.500 8.000 20.900 8.400 20.800 9.000 L 18.200 21.000 C 18.100 21.500 17.500 22.000 17.000 22.000 L 7.000 22.000 C 6.400 22.000 5.900 21.600 5.800 21.000 L 3.200 9.000 C 3.100 8.400 3.500 8.000 4.000 8.000 Z"),
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
        return _popcorn!!
    }

private var _popcorn: ImageVector? = null
