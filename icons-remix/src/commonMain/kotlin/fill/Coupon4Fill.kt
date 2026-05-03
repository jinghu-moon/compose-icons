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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.005 21.000 L 3.005 21.000 C 2.453 21.000 2.005 20.552 2.005 20.000 L 2.005 4.000 C 2.005 3.447 2.453 3.000 3.005 3.000 L 10.005 3.000 C 10.005 4.104 10.900 5.000 12.005 5.000 C 13.109 5.000 14.005 4.104 14.005 3.000 L 21.005 3.000 C 21.557 3.000 22.005 3.447 22.005 4.000 L 22.005 20.000 C 22.005 20.552 21.557 21.000 21.005 21.000 L 14.005 21.000 C 14.005 19.895 13.109 19.000 12.005 19.000 C 10.900 19.000 10.005 19.895 10.005 21.000 ZM 6.005 8.000 L 6.005 16.000 L 8.005 16.000 L 8.005 8.000 L 6.005 8.000 ZM 16.005 8.000 L 16.005 16.000 L 18.005 16.000 L 18.005 8.000 L 16.005 8.000 Z"),
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
        return _coupon4Fill!!
    }

private var _coupon4Fill: ImageVector? = null
