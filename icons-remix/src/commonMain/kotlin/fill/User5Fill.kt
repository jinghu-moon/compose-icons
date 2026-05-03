package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.User5Fill: ImageVector
    get() {
        if (_user5Fill != null) return _user5Fill!!
        _user5Fill = remixIcon(
            name = "User5Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.389 16.539 C 5.339 15.090 4.000 12.701 4.000 10.000 C 4.000 5.582 7.582 2.000 12.000 2.000 C 16.418 2.000 20.000 5.582 20.000 10.000 C 20.000 12.701 18.661 15.090 16.611 16.539 L 18.694 21.300 C 18.804 21.553 18.689 21.847 18.436 21.958 C 18.373 21.986 18.305 22.000 18.236 22.000 L 5.765 22.000 C 5.488 22.000 5.265 21.776 5.265 21.500 C 5.265 21.431 5.279 21.363 5.306 21.300 L 7.389 16.539 ZM 8.119 10.970 C 8.552 12.711 10.125 14.000 12.000 14.000 C 13.875 14.000 15.448 12.711 15.882 10.970 L 13.941 10.485 C 13.724 11.355 12.937 12.000 12.000 12.000 C 11.063 12.000 10.276 11.355 10.059 10.485 L 8.119 10.970 Z"),
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
        return _user5Fill!!
    }

private var _user5Fill: ImageVector? = null
