package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Bookmark3Line: ImageVector
    get() {
        if (_bookmark3Line != null) return _bookmark3Line!!
        _bookmark3Line = remixIcon(
            name = "Bookmark3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.000 2.000 L 20.000 2.000 C 20.552 2.000 21.000 2.448 21.000 3.000 L 21.000 22.276 C 21.000 22.552 20.776 22.776 20.500 22.776 C 20.430 22.776 20.360 22.761 20.296 22.733 L 12.000 19.031 L 3.704 22.733 C 3.452 22.846 3.156 22.732 3.043 22.480 C 3.015 22.416 3.000 22.347 3.000 22.276 L 3.000 3.000 C 3.000 2.448 3.448 2.000 4.000 2.000 ZM 19.000 19.965 L 19.000 4.000 L 5.000 4.000 L 5.000 19.965 L 12.000 16.841 L 19.000 19.965 ZM 12.000 13.500 L 9.061 15.045 L 9.622 11.773 L 7.245 9.455 L 10.531 8.977 L 12.000 6.000 L 13.469 8.977 L 16.755 9.455 L 14.378 11.773 L 14.939 15.045 L 12.000 13.500 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _bookmark3Line!!
    }

private var _bookmark3Line: ImageVector? = null
