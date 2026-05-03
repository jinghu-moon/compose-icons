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
                pathData = parseSvgPathData("M 21.000 2.000 L 21.000 22.000 L 19.000 22.000 L 19.000 15.000 L 15.000 15.000 L 15.000 8.000 C 15.000 4.686 17.686 2.000 21.000 2.000 ZM 19.000 4.530 C 18.170 5.000 17.000 6.170 17.000 8.000 L 17.000 13.000 L 19.000 13.000 L 19.000 4.530 ZM 9.000 13.900 L 9.000 22.000 L 7.000 22.000 L 7.000 13.900 C 4.718 13.437 3.000 11.419 3.000 9.000 L 3.000 3.000 L 5.000 3.000 L 5.000 10.000 L 7.000 10.000 L 7.000 3.000 L 9.000 3.000 L 9.000 10.000 L 11.000 10.000 L 11.000 3.000 L 13.000 3.000 L 13.000 9.000 C 13.000 11.419 11.282 13.437 9.000 13.900 Z"),
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
