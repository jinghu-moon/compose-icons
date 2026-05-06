package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Coupon5Line: ImageVector
    get() {
        if (_coupon5Line != null) return _coupon5Line!!
        _coupon5Line = remixIcon(
            name = "Coupon5Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21.005 14v7c0 .552-.448 1-1 1h-16c-.552 0-1-.448-1-1v-7c1.105 0 2-.895 2-2 0-1.105-.895-2-2-2v-7c0-.552 .448-1 1-1h16c.552 0 1 .448 1 1v7c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2ZM19.005 15.465c-1.196-.692-2-1.984-2-3.465 0-1.481 .804-2.773 2-3.465v-4.535h-14v4.535c1.196 .692 2 1.984 2 3.465 0 1.481-.804 2.773-2 3.465v4.535h14v-4.535ZM9.005 6h6v2h-6v-2ZM9.005 16h6v2h-6v-2Z"),
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
        return _coupon5Line!!
    }

private var _coupon5Line: ImageVector? = null
