package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Coupon5Fill: ImageVector
    get() {
        if (_coupon5Fill != null) return _coupon5Fill!!
        _coupon5Fill = remixIcon(
            name = "Coupon5Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21.005 14v7c0 .552-.448 1-1 1h-16c-.552 0-1-.448-1-1v-7c1.105 0 2-.895 2-2 0-1.105-.895-2-2-2v-7c0-.552 .448-1 1-1h16c.552 0 1 .448 1 1v7c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2ZM9.005 6v2h6v-2h-6ZM9.005 16v2h6v-2h-6Z"),
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
        return _coupon5Fill!!
    }

private var _coupon5Fill: ImageVector? = null
