package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Van: ImageVector
    get() {
        if (_van != null) return _van!!
        _van = lucideOutlineIcon(
            name = "Van",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.000 6.000 L 13.000 11.000 C 13.000 11.552 13.448 12.000 14.000 12.000 L 20.102 12.000 C 20.370 12.000 20.626 12.107 20.814 12.298 L 21.712 13.208 C 21.896 13.395 22.000 13.647 22.000 13.910 L 22.000 17.000 C 22.000 17.552 21.552 18.000 21.000 18.000 L 18.000 18.000"),
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
                pathData = parseSvgPathData("M 5.000 18.000 L 3.000 18.000 C 2.448 18.000 2.000 17.552 2.000 17.000 L 2.000 8.000 C 2.000 6.895 2.895 6.000 4.000 6.000 L 16.000 6.000 C 17.100 6.000 18.100 6.800 18.400 7.800 L 19.576 12.000"),
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
                pathData = parseSvgPathData("M 9.000 18.000 L 14.000 18.000"),
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
                pathData = parseSvgPathData("M 18.000 18.000 C 18.000 19.105 17.105 20.000 16.000 20.000 C 14.895 20.000 14.000 19.105 14.000 18.000 C 14.000 16.895 14.895 16.000 16.000 16.000 C 17.105 16.000 18.000 16.895 18.000 18.000 Z"),
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
                pathData = parseSvgPathData("M 9.000 18.000 C 9.000 19.105 8.105 20.000 7.000 20.000 C 5.895 20.000 5.000 19.105 5.000 18.000 C 5.000 16.895 5.895 16.000 7.000 16.000 C 8.105 16.000 9.000 16.895 9.000 18.000 Z"),
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
        return _van!!
    }

private var _van: ImageVector? = null
