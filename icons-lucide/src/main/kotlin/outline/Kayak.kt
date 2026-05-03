package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Kayak: ImageVector
    get() {
        if (_kayak != null) return _kayak!!
        _kayak = lucideOutlineIcon(
            name = "Kayak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.000 17.000 C 17.448 17.000 17.000 17.448 17.000 18.000 L 17.000 19.000 C 17.000 20.105 17.895 21.000 19.000 21.000 C 20.105 21.000 21.000 20.105 21.000 19.000 C 21.000 17.895 20.105 17.000 19.000 17.000 Z"),
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
        pathData = parseSvgPathData("M 20.970 3.610 C 21.033 3.445 20.992 3.258 20.867 3.133 C 20.742 3.008 20.555 2.967 20.390 3.030 C 10.200 6.600 6.600 10.200 3.030 20.390 C 2.967 20.555 3.008 20.742 3.133 20.867 C 3.258 20.992 3.445 21.033 3.610 20.970 C 13.800 17.400 17.400 13.800 20.970 3.610"),
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
        pathData = parseSvgPathData("M 6.707 6.707 L 17.293 17.293"),
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
        pathData = parseSvgPathData("M 7.000 5.000 C 7.000 3.895 6.105 3.000 5.000 3.000 C 3.895 3.000 3.000 3.895 3.000 5.000 C 3.000 6.105 3.895 7.000 5.000 7.000 L 6.000 7.000 C 6.552 7.000 7.000 6.552 7.000 6.000 Z"),
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
        return _kayak!!
    }

private var _kayak: ImageVector? = null
