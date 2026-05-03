package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Armchair: ImageVector
    get() {
        if (_armchair != null) return _armchair!!
        _armchair = lucideOutlineIcon(
            name = "Armchair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.000 9.000 L 19.000 6.000 C 19.000 4.895 18.105 4.000 17.000 4.000 L 7.000 4.000 C 5.895 4.000 5.000 4.895 5.000 6.000 L 5.000 9.000"),
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
        pathData = parseSvgPathData("M 3.000 16.000 C 3.000 17.105 3.895 18.000 5.000 18.000 L 19.000 18.000 C 20.105 18.000 21.000 17.105 21.000 16.000 L 21.000 11.000 C 21.000 9.895 20.105 9.000 19.000 9.000 C 17.895 9.000 17.000 9.895 17.000 11.000 L 17.000 12.500 C 17.000 12.776 16.776 13.000 16.500 13.000 L 7.500 13.000 C 7.224 13.000 7.000 12.776 7.000 12.500 L 7.000 11.000 C 7.000 9.895 6.105 9.000 5.000 9.000 C 3.895 9.000 3.000 9.895 3.000 11.000 Z"),
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
        pathData = parseSvgPathData("M 5.000 18.000 L 5.000 20.000"),
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
        pathData = parseSvgPathData("M 19.000 18.000 L 19.000 20.000"),
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
        return _armchair!!
    }

private var _armchair: ImageVector? = null
