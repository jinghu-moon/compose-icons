package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Flower2: ImageVector
    get() {
        if (_flower2 != null) return _flower2!!
        _flower2 = lucideOutlineIcon(
            name = "Flower2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 5.000 C 12.000 3.343 13.343 2.000 15.000 2.000 C 16.657 2.000 18.000 3.343 18.000 5.000 C 18.000 6.657 16.657 8.000 15.000 8.000M 12.000 5.000 C 12.000 3.343 10.657 2.000 9.000 2.000 C 7.343 2.000 6.000 3.343 6.000 5.000 C 6.000 6.657 7.343 8.000 9.000 8.000M 12.000 5.000 L 12.000 6.000M 9.000 8.000 C 7.343 8.000 6.000 9.343 6.000 11.000 C 6.000 12.657 7.343 14.000 9.000 14.000 C 10.657 14.000 12.000 12.657 12.000 11.000M 9.000 8.000 L 10.000 8.000M 15.000 8.000 C 16.657 8.000 18.000 9.343 18.000 11.000 C 18.000 12.657 16.657 14.000 15.000 14.000 C 13.343 14.000 12.000 12.657 12.000 11.000M 15.000 8.000 L 14.000 8.000M 12.000 11.000 L 12.000 10.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 14.000 8.000 C 14.000 9.105 13.105 10.000 12.000 10.000 C 10.895 10.000 10.000 9.105 10.000 8.000 C 10.000 6.895 10.895 6.000 12.000 6.000 C 13.105 6.000 14.000 6.895 14.000 8.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 12.000 10.000 L 12.000 22.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 12.000 22.000 C 16.200 22.000 19.000 20.333 19.000 17.000 C 14.800 17.000 12.000 18.667 12.000 22.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 12.000 22.000 C 7.800 22.000 5.000 20.333 5.000 17.000 C 9.200 17.000 12.000 18.667 12.000 22.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _flower2!!
    }

private var _flower2: ImageVector? = null
