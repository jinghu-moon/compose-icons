package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Gift: ImageVector
    get() {
        if (_gift != null) return _gift!!
        _gift = lucideOutlineIcon(
            name = "Gift",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 7.000 L 12.000 21.000"),
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
                pathData = parseSvgPathData("M 20.000 11.000 L 20.000 19.000 C 20.000 20.105 19.105 21.000 18.000 21.000 L 6.000 21.000 C 4.895 21.000 4.000 20.105 4.000 19.000 L 4.000 11.000"),
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
                pathData = parseSvgPathData("M 7.500 7.000 C 6.119 7.000 5.000 5.881 5.000 4.500 C 5.000 3.119 6.119 2.000 7.500 2.000 C 9.474 1.966 11.260 3.949 12.000 7.000 C 12.740 3.949 14.526 1.966 16.500 2.000 C 17.881 2.000 19.000 3.119 19.000 4.500 C 19.000 5.881 17.881 7.000 16.500 7.000"),
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
                pathData = parseSvgPathData("M 4.000 7.000 L 20.000 7.000 C 20.552 7.000 21.000 7.448 21.000 8.000 L 21.000 10.000 C 21.000 10.552 20.552 11.000 20.000 11.000 L 4.000 11.000 C 3.448 11.000 3.000 10.552 3.000 10.000 L 3.000 8.000 C 3.000 7.448 3.448 7.000 4.000 7.000 Z"),
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
        return _gift!!
    }

private var _gift: ImageVector? = null
