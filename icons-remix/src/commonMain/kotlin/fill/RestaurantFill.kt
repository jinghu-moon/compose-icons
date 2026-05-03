package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.RestaurantFill: ImageVector
    get() {
        if (_restaurantFill != null) return _restaurantFill!!
        _restaurantFill = remixIcon(
            name = "RestaurantFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 21.000 2.000 L 21.000 22.000 L 19.000 22.000 L 19.000 14.000 L 16.000 14.000 L 16.000 7.000 C 16.000 4.239 18.239 2.000 21.000 2.000 ZM 9.000 13.900 L 9.000 22.000 L 7.000 22.000 L 7.000 13.900 C 4.718 13.437 3.000 11.419 3.000 9.000 L 3.000 3.000 L 5.000 3.000 L 5.000 10.000 L 7.000 10.000 L 7.000 3.000 L 9.000 3.000 L 9.000 10.000 L 11.000 10.000 L 11.000 3.000 L 13.000 3.000 L 13.000 9.000 C 13.000 11.419 11.282 13.437 9.000 13.900 Z"),
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
        return _restaurantFill!!
    }

private var _restaurantFill: ImageVector? = null
