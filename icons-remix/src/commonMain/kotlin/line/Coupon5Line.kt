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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.005 14.000 L 21.005 21.000 C 21.005 21.552 20.557 22.000 20.005 22.000 L 4.005 22.000 C 3.453 22.000 3.005 21.552 3.005 21.000 L 3.005 14.000 C 4.109 14.000 5.005 13.104 5.005 12.000 C 5.005 10.895 4.109 10.000 3.005 10.000 L 3.005 3.000 C 3.005 2.447 3.453 2.000 4.005 2.000 L 20.005 2.000 C 20.557 2.000 21.005 2.447 21.005 3.000 L 21.005 10.000 C 19.900 10.000 19.005 10.895 19.005 12.000 C 19.005 13.104 19.900 14.000 21.005 14.000 ZM 19.005 15.465 C 17.809 14.773 17.005 13.480 17.005 12.000 C 17.005 10.519 17.809 9.227 19.005 8.535 L 19.005 4.000 L 5.005 4.000 L 5.005 8.535 C 6.200 9.227 7.005 10.519 7.005 12.000 C 7.005 13.480 6.200 14.773 5.005 15.465 L 5.005 20.000 L 19.005 20.000 L 19.005 15.465 ZM 9.005 6.000 L 15.005 6.000 L 15.005 8.000 L 9.005 8.000 L 9.005 6.000 ZM 9.005 16.000 L 15.005 16.000 L 15.005 18.000 L 9.005 18.000 L 9.005 16.000 Z"),
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
        return _coupon5Line!!
    }

private var _coupon5Line: ImageVector? = null
