package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Squirrel: ImageVector
    get() {
        if (_squirrel != null) return _squirrel!!
        _squirrel = lucideOutlineIcon(
            name = "Squirrel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.236 22.000 C 16.020 21.123 16.220 19.869 15.746 18.792 C 15.272 17.715 14.213 17.014 13.036 17.000"),
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
        pathData = parseSvgPathData("M 16.000 20.000 C 16.000 18.343 17.343 17.000 19.000 17.000 L 20.000 17.000 C 21.105 17.000 22.000 16.105 22.000 15.000 L 22.000 13.000 C 22.000 10.791 20.209 9.000 18.000 9.000 L 18.000 4.000"),
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
        pathData = parseSvgPathData("M 18.000 13.000 L 18.010 13.000"),
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
        pathData = parseSvgPathData("M 18.000 6.000 C 15.791 6.000 14.000 7.791 14.000 10.000 C 10.134 10.000 7.000 13.134 7.000 17.000 C 7.000 12.000 11.000 12.000 11.000 6.500 C 11.000 4.015 8.985 2.000 6.500 2.000 C 4.015 2.000 2.000 4.015 2.000 6.500 C 2.000 7.881 3.119 9.000 4.500 9.000 C 5.881 9.000 7.000 7.881 7.000 6.500 C 7.000 10.000 3.000 11.000 3.000 17.000 C 3.000 19.800 5.200 22.000 8.000 22.000 L 18.000 22.000"),
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
        return _squirrel!!
    }

private var _squirrel: ImageVector? = null
