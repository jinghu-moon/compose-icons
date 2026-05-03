package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Candy: ImageVector
    get() {
        if (_candy != null) return _candy!!
        _candy = lucideOutlineIcon(
            name = "Candy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.000 7.000 L 10.000 17.900"),
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
                pathData = parseSvgPathData("M 14.000 6.100 L 14.000 17.000"),
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
                pathData = parseSvgPathData("M 16.000 7.000 L 16.000 3.000 C 16.000 2.596 16.244 2.231 16.617 2.076 C 16.991 1.922 17.421 2.007 17.707 2.293 C 18.268 2.862 19.068 3.129 19.859 3.010 C 20.170 2.966 20.485 3.070 20.707 3.293 C 20.930 3.515 21.034 3.830 20.990 4.141 C 20.871 4.932 21.138 5.732 21.707 6.293 C 21.993 6.579 22.078 7.009 21.924 7.383 C 21.769 7.756 21.404 8.000 21.000 8.000 L 17.000 8.000"),
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
                pathData = parseSvgPathData("M 16.536 7.465 C 15.598 6.527 14.326 6.000 13.000 6.000 C 11.674 6.000 10.402 6.527 9.464 7.465 L 7.464 9.465 C 5.512 11.417 5.512 14.583 7.464 16.535 C 8.402 17.473 9.674 18.000 11.000 18.000 C 12.326 18.000 13.598 17.473 14.536 16.535 L 16.536 14.535 C 18.488 12.583 18.488 9.417 16.536 7.465"),
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
                pathData = parseSvgPathData("M 8.000 17.000 L 8.000 21.000 C 8.000 21.404 7.756 21.769 7.383 21.924 C 7.009 22.078 6.579 21.993 6.293 21.707 C 5.732 21.138 4.932 20.871 4.141 20.990 C 3.830 21.034 3.515 20.930 3.293 20.707 C 3.070 20.485 2.966 20.170 3.010 19.859 C 3.129 19.068 2.862 18.268 2.293 17.707 C 2.007 17.421 1.922 16.991 2.076 16.617 C 2.231 16.244 2.596 16.000 3.000 16.000 L 7.000 16.000"),
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
        return _candy!!
    }

private var _candy: ImageVector? = null
