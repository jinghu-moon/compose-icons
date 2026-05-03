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
                pathData = parseSvgPathData("M 10.005 21.000 L 3.005 21.000 C 2.453 21.000 2.005 20.552 2.005 20.000 L 2.005 4.000 C 2.005 3.447 2.453 3.000 3.005 3.000 L 10.005 3.000 C 10.005 4.104 10.900 5.000 12.005 5.000 C 13.109 5.000 14.005 4.104 14.005 3.000 L 21.005 3.000 C 21.557 3.000 22.005 3.447 22.005 4.000 L 22.005 20.000 C 22.005 20.552 21.557 21.000 21.005 21.000 L 14.005 21.000 C 14.005 19.895 13.109 19.000 12.005 19.000 C 10.900 19.000 10.005 19.895 10.005 21.000 ZM 8.540 19.000 C 9.232 17.804 10.524 17.000 12.005 17.000 C 13.485 17.000 14.778 17.804 15.470 19.000 L 20.005 19.000 L 20.005 5.000 L 15.470 5.000 C 14.778 6.195 13.485 7.000 12.005 7.000 C 10.524 7.000 9.232 6.195 8.540 5.000 L 4.005 5.000 L 4.005 19.000 L 8.540 19.000 ZM 6.005 8.000 L 8.005 8.000 L 8.005 16.000 L 6.005 16.000 L 6.005 8.000 ZM 16.005 8.000 L 18.005 8.000 L 18.005 16.000 L 16.005 16.000 L 16.005 8.000 Z"),
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
