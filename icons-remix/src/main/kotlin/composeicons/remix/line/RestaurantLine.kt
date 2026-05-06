package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.RestaurantLine: ImageVector
    get() {
        if (_restaurantLine != null) return _restaurantLine!!
        _restaurantLine = remixIcon(
            name = "RestaurantLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 2v20h-2v-7h-4v-7C15 4.686 17.686 2 21 2ZM19 4.53C18.17 5 17 6.17 17 8v5h2v-8.47ZM9 13.9v8.1h-2v-8.1C4.718 13.437 3 11.419 3 9v-6h2v7h2v-7h2v7h2v-7h2v6c0 2.419-1.718 4.437-4 4.9Z"),
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
        return _restaurantLine!!
    }

private var _restaurantLine: ImageVector? = null
