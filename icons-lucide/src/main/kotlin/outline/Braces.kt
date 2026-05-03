package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Braces: ImageVector
    get() {
        if (_braces != null) return _braces!!
        _braces = lucideOutlineIcon(
            name = "Braces",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 8.000 3.000 L 7.000 3.000 C 5.895 3.000 5.000 3.895 5.000 5.000 L 5.000 10.000 C 5.000 11.105 4.105 12.000 3.000 12.000 C 4.105 12.000 5.000 12.895 5.000 14.000 L 5.000 19.000 C 5.000 20.100 5.900 21.000 7.000 21.000 L 8.000 21.000"),
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
        pathData = parseSvgPathData("M 16.000 21.000 L 17.000 21.000 C 18.105 21.000 19.000 20.105 19.000 19.000 L 19.000 14.000 C 19.000 12.900 19.900 12.000 21.000 12.000 C 19.895 12.000 19.000 11.105 19.000 10.000 L 19.000 5.000 C 19.000 3.895 18.105 3.000 17.000 3.000 L 16.000 3.000"),
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
        return _braces!!
    }

private var _braces: ImageVector? = null
