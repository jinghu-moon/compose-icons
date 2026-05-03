package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Coupon3Fill: ImageVector
    get() {
        if (_coupon3Fill != null) return _coupon3Fill!!
        _coupon3Fill = remixIcon(
            name = "Coupon3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.005 21.000 C 11.005 20.171 10.333 19.500 9.505 19.500 C 8.676 19.500 8.005 20.171 8.005 21.000 L 3.005 21.000 C 2.453 21.000 2.005 20.552 2.005 20.000 L 2.005 4.000 C 2.005 3.447 2.453 3.000 3.005 3.000 L 8.005 3.000 C 8.005 3.828 8.676 4.500 9.505 4.500 C 10.333 4.500 11.005 3.828 11.005 3.000 L 21.005 3.000 C 21.557 3.000 22.005 3.447 22.005 4.000 L 22.005 9.500 C 20.624 9.500 19.505 10.619 19.505 12.000 C 19.505 13.380 20.624 14.500 22.005 14.500 L 22.005 20.000 C 22.005 20.552 21.557 21.000 21.005 21.000 L 11.005 21.000 ZM 9.505 10.500 C 10.333 10.500 11.005 9.828 11.005 9.000 C 11.005 8.171 10.333 7.500 9.505 7.500 C 8.676 7.500 8.005 8.171 8.005 9.000 C 8.005 9.828 8.676 10.500 9.505 10.500 ZM 9.505 16.500 C 10.333 16.500 11.005 15.828 11.005 15.000 C 11.005 14.171 10.333 13.500 9.505 13.500 C 8.676 13.500 8.005 14.171 8.005 15.000 C 8.005 15.828 8.676 16.500 9.505 16.500 Z"),
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
        return _coupon3Fill!!
    }

private var _coupon3Fill: ImageVector? = null
