package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Coupon4Fill: ImageVector
    get() {
        if (_coupon4Fill != null) return _coupon4Fill!!
        _coupon4Fill = remixIcon(
            name = "Coupon4Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.005 21h-7c-.552 0-1-.448-1-1v-16c0-.552 .448-1 1-1h7c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2h7c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-7c0-1.105-.895-2-2-2-1.105 0-2 .895-2 2ZM6.005 8v8h2v-8h-2ZM16.005 8v8h2v-8h-2Z"),
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
        return _coupon4Fill!!
    }

private var _coupon4Fill: ImageVector? = null
