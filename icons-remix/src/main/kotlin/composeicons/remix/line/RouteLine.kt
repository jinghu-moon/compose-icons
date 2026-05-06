package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.RouteLine: ImageVector
    get() {
        if (_routeLine != null) return _routeLine!!
        _routeLine = remixIcon(
            name = "RouteLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 15v-6.5C4 6.015 6.015 4 8.5 4 10.985 4 13 6.015 13 8.5v7C13 16.881 14.119 18 15.5 18 16.881 18 18 16.881 18 15.5v-6.671C16.835 8.417 16 7.306 16 6 16 4.343 17.343 3 19 3c1.657 0 3 1.343 3 3 0 1.306-.835 2.417-2 2.829v6.671C20 17.985 17.985 20 15.5 20 13.015 20 11 17.985 11 15.5v-7C11 7.119 9.881 6 8.5 6 7.119 6 6 7.119 6 8.5v6.5h3L5 20 1 15h3ZM19 7c.552 0 1-.448 1-1C20 5.448 19.552 5 19 5c-.552 0-1 .448-1 1 0 .552 .448 1 1 1Z"),
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
        return _routeLine!!
    }

private var _routeLine: ImageVector? = null
