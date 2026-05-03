package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Coupon3Line: ImageVector
    get() {
        if (_coupon3Line != null) return _coupon3Line!!
        _coupon3Line = remixIcon(
            name = "Coupon3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 2.005 4.000 C 2.005 3.447 2.453 3.000 3.005 3.000 L 21.005 3.000 C 21.557 3.000 22.005 3.447 22.005 4.000 L 22.005 9.500 C 20.624 9.500 19.505 10.619 19.505 12.000 C 19.505 13.380 20.624 14.500 22.005 14.500 L 22.005 20.000 C 22.005 20.552 21.557 21.000 21.005 21.000 L 3.005 21.000 C 2.453 21.000 2.005 20.552 2.005 20.000 L 2.005 4.000 ZM 8.090 19.000 C 8.296 18.417 8.852 18.000 9.505 18.000 C 10.158 18.000 10.714 18.417 10.920 19.000 L 20.005 19.000 L 20.005 16.032 C 18.523 15.296 17.505 13.767 17.505 12.000 C 17.505 10.233 18.523 8.704 20.005 7.968 L 20.005 5.000 L 10.920 5.000 C 10.714 5.582 10.158 6.000 9.505 6.000 C 8.852 6.000 8.296 5.582 8.090 5.000 L 4.005 5.000 L 4.005 19.000 L 8.090 19.000 ZM 9.505 11.000 C 8.676 11.000 8.005 10.328 8.005 9.500 C 8.005 8.671 8.676 8.000 9.505 8.000 C 10.333 8.000 11.005 8.671 11.005 9.500 C 11.005 10.328 10.333 11.000 9.505 11.000 ZM 9.505 16.000 C 8.676 16.000 8.005 15.328 8.005 14.500 C 8.005 13.671 8.676 13.000 9.505 13.000 C 10.333 13.000 11.005 13.671 11.005 14.500 C 11.005 15.328 10.333 16.000 9.505 16.000 Z"),
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
        return _coupon3Line!!
    }

private var _coupon3Line: ImageVector? = null
