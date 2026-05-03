package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PixFill: ImageVector
    get() {
        if (_pixFill != null) return _pixFill!!
        _pixFill = remixIcon(
            name = "PixFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.475 1.768 C 13.109 0.401 10.892 0.401 9.526 1.768 L 5.399 5.894 C 6.504 5.826 7.633 6.214 8.478 7.058 L 11.470 10.051 C 11.763 10.344 12.238 10.344 12.531 10.051 L 15.524 7.058 C 16.368 6.214 17.497 5.826 18.602 5.895 L 14.475 1.768 ZM 20.454 7.746 L 22.233 9.525 C 23.594 10.887 23.600 13.091 22.249 14.459 L 20.474 16.233 C 19.302 17.405 17.403 17.405 16.231 16.233 L 13.238 13.240 C 12.555 12.557 11.447 12.557 10.763 13.240 L 7.770 16.234 C 6.598 17.405 4.699 17.405 3.527 16.234 L 1.748 14.454 C 0.401 13.086 0.408 10.885 1.768 9.525 L 3.543 7.751 C 4.716 6.594 6.604 6.599 7.771 7.765 L 10.763 10.758 C 11.447 11.441 12.555 11.441 13.238 10.758 L 16.231 7.765 C 17.396 6.600 19.281 6.594 20.454 7.746 ZM 5.398 18.104 C 6.503 18.173 7.632 17.785 8.477 16.941 L 11.470 13.947 C 11.763 13.654 12.238 13.654 12.531 13.947 L 15.524 16.941 C 16.369 17.785 17.498 18.173 18.603 18.104 L 14.475 22.232 C 13.109 23.599 10.892 23.599 9.526 22.232 L 5.398 18.104 Z"),
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
        return _pixFill!!
    }

private var _pixFill: ImageVector? = null
