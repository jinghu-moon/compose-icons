package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Caravan: ImageVector
    get() {
        if (_caravan != null) return _caravan!!
        _caravan = lucideOutlineIcon(
            name = "Caravan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.000 19.000 L 18.000 9.000 C 18.000 6.791 16.209 5.000 14.000 5.000 L 6.000 5.000 C 3.791 5.000 2.000 6.791 2.000 9.000 L 2.000 17.000 C 2.000 18.105 2.895 19.000 4.000 19.000 L 6.000 19.000"),
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
                pathData = parseSvgPathData("M 2.000 9.000 L 5.000 9.000 C 5.552 9.000 6.000 9.448 6.000 10.000 L 6.000 12.000 C 6.000 12.552 5.552 13.000 5.000 13.000 L 2.000 13.000"),
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
                pathData = parseSvgPathData("M 22.000 17.000 L 22.000 18.000 C 22.000 18.552 21.552 19.000 21.000 19.000 L 10.000 19.000 L 10.000 10.000 C 10.000 9.448 10.448 9.000 11.000 9.000 L 13.000 9.000 C 13.552 9.000 14.000 9.448 14.000 10.000 L 14.000 19.000"),
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
                pathData = parseSvgPathData("M 10.000 19.000 C 10.000 20.105 9.105 21.000 8.000 21.000 C 6.895 21.000 6.000 20.105 6.000 19.000 C 6.000 17.895 6.895 17.000 8.000 17.000 C 9.105 17.000 10.000 17.895 10.000 19.000 Z"),
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
        return _caravan!!
    }

private var _caravan: ImageVector? = null
