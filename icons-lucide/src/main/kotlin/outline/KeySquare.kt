package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.KeySquare: ImageVector
    get() {
        if (_keySquare != null) return _keySquare!!
        _keySquare = lucideOutlineIcon(
            name = "KeySquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.400 2.700 C 13.359 1.811 14.841 1.811 15.800 2.700 L 21.300 8.200 C 22.189 9.159 22.189 10.641 21.300 11.600 L 17.600 15.300 C 16.641 16.189 15.159 16.189 14.200 15.300 L 8.700 9.800 C 7.811 8.841 7.811 7.359 8.700 6.400 Z"),
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
        pathData = parseSvgPathData("M 14.000 7.000 L 17.000 10.000"),
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
        pathData = parseSvgPathData("M 9.400 10.600 L 2.586 17.414 C 2.211 17.789 2.000 18.298 2.000 18.828 L 2.000 21.000 C 2.000 21.552 2.448 22.000 3.000 22.000 L 6.000 22.000 C 6.552 22.000 7.000 21.552 7.000 21.000 L 7.000 20.000 C 7.000 19.448 7.448 19.000 8.000 19.000 L 9.000 19.000 C 9.552 19.000 10.000 18.552 10.000 18.000 L 10.000 17.000 C 10.000 16.448 10.448 16.000 11.000 16.000 L 11.172 16.000 C 11.702 16.000 12.211 15.789 12.586 15.414 L 13.400 14.600"),
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
        return _keySquare!!
    }

private var _keySquare: ImageVector? = null
