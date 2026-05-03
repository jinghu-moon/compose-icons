package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Palette: ImageVector
    get() {
        if (_palette != null) return _palette!!
        _palette = lucideOutlineIcon(
            name = "Palette",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 C 17.523 2.000 22.000 6.029 22.000 11.000 C 22.000 13.761 19.761 16.000 17.000 16.000 L 14.750 16.000 C 14.087 16.000 13.481 16.375 13.185 16.967 C 12.888 17.560 12.952 18.270 13.350 18.800 L 13.650 19.200 C 14.048 19.730 14.112 20.440 13.815 21.033 C 13.519 21.625 12.913 22.000 12.250 22.000 Z"),
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
        pathData = parseSvgPathData("M 14.000 6.500 C 14.000 6.776 13.776 7.000 13.500 7.000 C 13.224 7.000 13.000 6.776 13.000 6.500 C 13.000 6.224 13.224 6.000 13.500 6.000 C 13.776 6.000 14.000 6.224 14.000 6.500 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 18.000 10.500 C 18.000 10.776 17.776 11.000 17.500 11.000 C 17.224 11.000 17.000 10.776 17.000 10.500 C 17.000 10.224 17.224 10.000 17.500 10.000 C 17.776 10.000 18.000 10.224 18.000 10.500 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 7.000 12.500 C 7.000 12.776 6.776 13.000 6.500 13.000 C 6.224 13.000 6.000 12.776 6.000 12.500 C 6.000 12.224 6.224 12.000 6.500 12.000 C 6.776 12.000 7.000 12.224 7.000 12.500 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 9.000 7.500 C 9.000 7.776 8.776 8.000 8.500 8.000 C 8.224 8.000 8.000 7.776 8.000 7.500 C 8.000 7.224 8.224 7.000 8.500 7.000 C 8.776 7.000 9.000 7.224 9.000 7.500 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _palette!!
    }

private var _palette: ImageVector? = null
