package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.VectorSquare: ImageVector
    get() {
        if (_vectorSquare != null) return _vectorSquare!!
        _vectorSquare = lucideOutlineIcon(
            name = "VectorSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.500 7.000 C 20.202 10.296 20.202 13.704 19.500 17.000"),
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
                pathData = parseSvgPathData("M 4.500 7.000 C 3.798 10.296 3.798 13.704 4.500 17.000"),
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
                pathData = parseSvgPathData("M 7.000 19.500 C 10.296 20.202 13.704 20.202 17.000 19.500"),
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
                pathData = parseSvgPathData("M 7.000 4.500 C 10.296 3.798 13.704 3.798 17.000 4.500"),
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
                pathData = parseSvgPathData("M 18.000 17.000 L 21.000 17.000 C 21.552 17.000 22.000 17.448 22.000 18.000 L 22.000 21.000 C 22.000 21.552 21.552 22.000 21.000 22.000 L 18.000 22.000 C 17.448 22.000 17.000 21.552 17.000 21.000 L 17.000 18.000 C 17.000 17.448 17.448 17.000 18.000 17.000 Z"),
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
                pathData = parseSvgPathData("M 18.000 2.000 L 21.000 2.000 C 21.552 2.000 22.000 2.448 22.000 3.000 L 22.000 6.000 C 22.000 6.552 21.552 7.000 21.000 7.000 L 18.000 7.000 C 17.448 7.000 17.000 6.552 17.000 6.000 L 17.000 3.000 C 17.000 2.448 17.448 2.000 18.000 2.000 Z"),
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
                pathData = parseSvgPathData("M 3.000 17.000 L 6.000 17.000 C 6.552 17.000 7.000 17.448 7.000 18.000 L 7.000 21.000 C 7.000 21.552 6.552 22.000 6.000 22.000 L 3.000 22.000 C 2.448 22.000 2.000 21.552 2.000 21.000 L 2.000 18.000 C 2.000 17.448 2.448 17.000 3.000 17.000 Z"),
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
                pathData = parseSvgPathData("M 3.000 2.000 L 6.000 2.000 C 6.552 2.000 7.000 2.448 7.000 3.000 L 7.000 6.000 C 7.000 6.552 6.552 7.000 6.000 7.000 L 3.000 7.000 C 2.448 7.000 2.000 6.552 2.000 6.000 L 2.000 3.000 C 2.000 2.448 2.448 2.000 3.000 2.000 Z"),
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
        return _vectorSquare!!
    }

private var _vectorSquare: ImageVector? = null
