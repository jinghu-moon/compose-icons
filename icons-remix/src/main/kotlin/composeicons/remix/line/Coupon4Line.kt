package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Coupon4Line: ImageVector
    get() {
        if (_coupon4Line != null) return _coupon4Line!!
        _coupon4Line = remixIcon(
            name = "Coupon4Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.005 21h-7c-.552 0-1-.448-1-1v-16c0-.552 .448-1 1-1h7c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2h7c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-7c0-1.105-.895-2-2-2-1.105 0-2 .895-2 2ZM8.54 19c.692-1.196 1.984-2 3.465-2 1.481 0 2.773 .804 3.465 2h4.535v-14h-4.535c-.692 1.196-1.984 2-3.465 2-1.481 0-2.773-.804-3.465-2h-4.535v14h4.535ZM6.005 8h2v8h-2v-8ZM16.005 8h2v8h-2v-8Z"),
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
        return _coupon4Line!!
    }

private var _coupon4Line: ImageVector? = null
