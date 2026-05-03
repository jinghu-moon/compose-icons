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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.005 3.000 L 14.005 21.000 L 3.005 21.000 C 2.453 21.000 2.005 20.552 2.005 20.000 L 2.005 14.500 C 3.386 14.500 4.505 13.380 4.505 12.000 C 4.505 10.619 3.386 9.500 2.005 9.500 L 2.005 4.000 C 2.005 3.447 2.453 3.000 3.005 3.000 L 14.005 3.000 ZM 16.005 3.000 L 21.005 3.000 C 21.557 3.000 22.005 3.447 22.005 4.000 L 22.005 9.500 C 20.624 9.500 19.505 10.619 19.505 12.000 C 19.505 13.380 20.624 14.500 22.005 14.500 L 22.005 20.000 C 22.005 20.552 21.557 21.000 21.005 21.000 L 16.005 21.000 L 16.005 3.000 Z"),
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
        return _coupon2Fill!!
    }

private var _coupon2Fill: ImageVector? = null
