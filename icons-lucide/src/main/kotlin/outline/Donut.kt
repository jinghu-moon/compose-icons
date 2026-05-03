package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Donut: ImageVector
    get() {
        if (_donut != null) return _donut!!
        _donut = lucideOutlineIcon(
            name = "Donut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.500 10.000 C 19.758 9.985 19.061 9.642 18.597 9.062 C 18.134 8.483 17.951 7.727 18.100 7.000 L 18.000 7.000 C 16.946 7.011 15.966 6.459 15.429 5.551 C 14.893 4.643 14.882 3.518 15.400 2.600 C 11.098 1.027 6.278 2.578 3.700 6.364 C 1.123 10.150 1.446 15.203 4.486 18.629 C 7.526 22.055 12.505 22.978 16.571 20.869 C 20.637 18.760 22.750 14.158 21.700 9.700 C 21.400 9.900 20.900 10.000 20.500 10.000"),
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
        pathData = parseSvgPathData("M 15.000 12.000 C 15.000 13.657 13.657 15.000 12.000 15.000 C 10.343 15.000 9.000 13.657 9.000 12.000 C 9.000 10.343 10.343 9.000 12.000 9.000 C 13.657 9.000 15.000 10.343 15.000 12.000 Z"),
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
        return _donut!!
    }

private var _donut: ImageVector? = null
