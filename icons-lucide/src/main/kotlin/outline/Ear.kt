package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Ear: ImageVector
    get() {
        if (_ear != null) return _ear!!
        _ear = lucideOutlineIcon(
            name = "Ear",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.000 8.500 C 6.000 4.910 8.910 2.000 12.500 2.000 C 16.090 2.000 19.000 4.910 19.000 8.500 C 19.000 14.500 13.000 14.500 13.000 18.500 C 13.000 20.433 11.433 22.000 9.500 22.000 C 7.567 22.000 6.000 20.433 6.000 18.500"),
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
        pathData = parseSvgPathData("M 15.000 8.500 C 15.000 7.119 13.881 6.000 12.500 6.000 C 11.119 6.000 10.000 7.119 10.000 8.500 L 10.000 9.500 C 11.105 9.500 12.000 10.395 12.000 11.500 C 12.000 12.605 11.105 13.500 10.000 13.500"),
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
        return _ear!!
    }

private var _ear: ImageVector? = null
