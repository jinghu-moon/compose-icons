package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Refund2Fill: ImageVector
    get() {
        if (_refund2Fill != null) return _refund2Fill!!
        _refund2Fill = remixIcon(
            name = "Refund2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.005 2.000 C 17.528 2.000 22.005 6.477 22.005 12.000 C 22.005 17.523 17.528 22.000 12.005 22.000 C 9.578 22.000 7.354 21.136 5.622 19.698 L 5.378 19.489 L 6.279 17.587 C 7.732 19.076 9.761 20.000 12.005 20.000 C 16.423 20.000 20.005 16.418 20.005 12.000 C 20.005 7.582 16.423 4.000 12.005 4.000 C 7.670 4.000 4.140 7.448 4.009 11.751 L 4.005 12.000 L 6.505 12.000 L 3.799 17.716 C 2.668 16.096 2.005 14.125 2.005 12.000 C 2.005 6.477 6.482 2.000 12.005 2.000 ZM 13.005 6.000 L 13.005 8.000 L 15.505 8.000 L 15.505 10.000 L 10.005 10.000 C 9.729 10.000 9.505 10.224 9.505 10.500 C 9.505 10.745 9.682 10.950 9.915 10.992 L 10.005 11.000 L 14.005 11.000 C 15.386 11.000 16.505 12.119 16.505 13.500 C 16.505 14.881 15.386 16.000 14.005 16.000 L 13.005 16.000 L 13.005 18.000 L 11.005 18.000 L 11.005 16.000 L 8.505 16.000 L 8.505 14.000 L 14.005 14.000 C 14.281 14.000 14.505 13.776 14.505 13.500 C 14.505 13.255 14.328 13.050 14.095 13.008 L 14.005 13.000 L 10.005 13.000 C 8.624 13.000 7.505 11.881 7.505 10.500 C 7.505 9.119 8.624 8.000 10.005 8.000 L 11.005 8.000 L 11.005 6.000 L 13.005 6.000 Z"),
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
        return _refund2Fill!!
    }

private var _refund2Fill: ImageVector? = null
