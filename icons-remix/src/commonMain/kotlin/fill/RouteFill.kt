package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.RouteFill: ImageVector
    get() {
        if (_routeFill != null) return _routeFill!!
        _routeFill = remixIcon(
            name = "RouteFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 15.000 L 4.000 8.500 C 4.000 6.015 6.015 4.000 8.500 4.000 C 10.985 4.000 13.000 6.015 13.000 8.500 L 13.000 15.500 C 13.000 16.881 14.119 18.000 15.500 18.000 C 16.881 18.000 18.000 16.881 18.000 15.500 L 18.000 8.829 C 16.835 8.417 16.000 7.306 16.000 6.000 C 16.000 4.343 17.343 3.000 19.000 3.000 C 20.657 3.000 22.000 4.343 22.000 6.000 C 22.000 7.306 21.165 8.417 20.000 8.829 L 20.000 15.500 C 20.000 17.985 17.985 20.000 15.500 20.000 C 13.015 20.000 11.000 17.985 11.000 15.500 L 11.000 8.500 C 11.000 7.119 9.881 6.000 8.500 6.000 C 7.119 6.000 6.000 7.119 6.000 8.500 L 6.000 15.000 L 9.000 15.000 L 5.000 20.000 L 1.000 15.000 L 4.000 15.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _routeFill!!
    }

private var _routeFill: ImageVector? = null
