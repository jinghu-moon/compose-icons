package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Bubbles: ImageVector
    get() {
        if (_bubbles != null) return _bubbles!!
        _bubbles = lucideOutlineIcon(
            name = "Bubbles",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.001 15.085 C 7.460 14.923 7.969 14.994 8.367 15.275 C 8.764 15.557 9.000 16.013 9.000 16.500"),
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
        pathData = parseSvgPathData("M 22.000 8.500 C 22.000 10.433 20.433 12.000 18.500 12.000 C 16.567 12.000 15.000 10.433 15.000 8.500 C 15.000 6.567 16.567 5.000 18.500 5.000 C 20.433 5.000 22.000 6.567 22.000 8.500 Z"),
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
        pathData = parseSvgPathData("M 13.000 16.500 C 13.000 19.538 10.538 22.000 7.500 22.000 C 4.462 22.000 2.000 19.538 2.000 16.500 C 2.000 13.462 4.462 11.000 7.500 11.000 C 10.538 11.000 13.000 13.462 13.000 16.500 Z"),
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
        pathData = parseSvgPathData("M 10.000 4.500 C 10.000 5.881 8.881 7.000 7.500 7.000 C 6.119 7.000 5.000 5.881 5.000 4.500 C 5.000 3.119 6.119 2.000 7.500 2.000 C 8.881 2.000 10.000 3.119 10.000 4.500 Z"),
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
        return _bubbles!!
    }

private var _bubbles: ImageVector? = null
