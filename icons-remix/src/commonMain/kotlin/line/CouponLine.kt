package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CouponLine: ImageVector
    get() {
        if (_couponLine != null) return _couponLine!!
        _couponLine = remixIcon(
            name = "CouponLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 2.005 9.500 L 2.005 4.000 C 2.005 3.447 2.453 3.000 3.005 3.000 L 21.005 3.000 C 21.557 3.000 22.005 3.447 22.005 4.000 L 22.005 9.500 C 20.624 9.500 19.505 10.619 19.505 12.000 C 19.505 13.380 20.624 14.500 22.005 14.500 L 22.005 20.000 C 22.005 20.552 21.557 21.000 21.005 21.000 L 3.005 21.000 C 2.453 21.000 2.005 20.552 2.005 20.000 L 2.005 14.500 C 3.386 14.500 4.505 13.380 4.505 12.000 C 4.505 10.619 3.386 9.500 2.005 9.500 ZM 4.005 7.968 C 5.487 8.704 6.505 10.233 6.505 12.000 C 6.505 13.767 5.487 15.296 4.005 16.032 L 4.005 19.000 L 20.005 19.000 L 20.005 16.032 C 18.523 15.296 17.505 13.767 17.505 12.000 C 17.505 10.233 18.523 8.704 20.005 7.968 L 20.005 5.000 L 4.005 5.000 L 4.005 7.968 ZM 9.005 9.000 L 15.005 9.000 L 15.005 11.000 L 9.005 11.000 L 9.005 9.000 ZM 9.005 13.000 L 15.005 13.000 L 15.005 15.000 L 9.005 15.000 L 9.005 13.000 Z"),
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
        return _couponLine!!
    }

private var _couponLine: ImageVector? = null
