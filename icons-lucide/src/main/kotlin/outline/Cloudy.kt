package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Cloudy: ImageVector
    get() {
        if (_cloudy != null) return _cloudy!!
        _cloudy = lucideOutlineIcon(
            name = "Cloudy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.500 12.000 C 19.985 12.000 22.000 14.015 22.000 16.500 C 22.000 18.985 19.985 21.000 17.500 21.000 L 9.006 21.000 C 5.401 21.003 2.383 18.267 2.033 14.679 C 1.683 11.091 4.116 7.824 7.654 7.131 C 11.192 6.437 14.678 8.545 15.708 12.000 Z"),
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
                pathData = parseSvgPathData("M 21.832 9.000 C 21.408 7.800 20.273 6.998 19.000 7.000 L 16.793 7.000 C 16.091 4.520 13.761 2.860 11.188 3.007 C 8.615 3.153 6.489 5.067 6.073 7.610"),
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
        return _cloudy!!
    }

private var _cloudy: ImageVector? = null
