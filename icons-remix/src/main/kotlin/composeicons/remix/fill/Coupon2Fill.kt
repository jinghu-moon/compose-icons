package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Coupon2Fill: ImageVector
    get() {
        if (_coupon2Fill != null) return _coupon2Fill!!
        _coupon2Fill = remixIcon(
            name = "Coupon2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14.005 3v18h-11c-.552 0-1-.448-1-1v-5.5c1.381 0 2.5-1.119 2.5-2.5C4.505 10.619 3.386 9.5 2.005 9.5v-5.5c0-.552 .448-1 1-1h11ZM16.005 3h5c.552 0 1 .448 1 1v5.5c-1.381 0-2.5 1.119-2.5 2.5 0 1.381 1.119 2.5 2.5 2.5v5.5c0 .552-.448 1-1 1h-5v-18Z"),
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
        return _coupon2Fill!!
    }

private var _coupon2Fill: ImageVector? = null
