package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.RectangleGoggles: ImageVector
    get() {
        if (_rectangleGoggles != null) return _rectangleGoggles!!
        _rectangleGoggles = lucideOutlineIcon(
            name = "RectangleGoggles",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.000 6.000 C 21.105 6.000 22.000 6.895 22.000 8.000 L 22.000 16.000 C 22.000 17.105 21.105 18.000 20.000 18.000 L 16.000 18.000 C 15.370 18.000 14.778 17.704 14.400 17.200 L 12.800 15.070 C 12.611 14.818 12.315 14.670 12.000 14.670 C 11.685 14.670 11.389 14.818 11.200 15.070 L 9.600 17.200 C 9.222 17.704 8.630 18.000 8.000 18.000 L 4.000 18.000 C 2.895 18.000 2.000 17.105 2.000 16.000 L 2.000 8.000 C 2.000 6.895 2.895 6.000 4.000 6.000 Z"),
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
        return _rectangleGoggles!!
    }

private var _rectangleGoggles: ImageVector? = null
