package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Refund2Line: ImageVector
    get() {
        if (_refund2Line != null) return _refund2Line!!
        _refund2Line = remixIcon(
            name = "Refund2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.676 4.257 C 9.604 1.038 15.409 1.262 19.076 4.929 C 22.981 8.834 22.981 15.166 19.076 19.071 C 15.171 22.976 8.839 22.976 4.934 19.071 C 2.409 16.547 1.517 13.008 2.256 9.767 L 2.333 9.454 L 4.267 9.963 C 3.570 12.623 4.263 15.572 6.348 17.657 C 9.472 20.781 14.538 20.781 17.662 17.657 C 20.786 14.533 20.786 9.467 17.662 6.343 C 14.844 3.526 10.448 3.249 7.320 5.514 L 7.099 5.680 L 8.116 6.697 L 3.520 7.757 L 4.580 3.161 L 5.676 4.257 ZM 13.005 6.000 L 13.005 8.000 L 15.505 8.000 L 15.505 10.000 L 10.005 10.000 C 9.729 10.000 9.505 10.224 9.505 10.500 C 9.505 10.745 9.682 10.950 9.915 10.992 L 10.005 11.000 L 14.005 11.000 C 15.386 11.000 16.505 12.119 16.505 13.500 C 16.505 14.881 15.386 16.000 14.005 16.000 L 13.005 16.000 L 13.005 18.000 L 11.005 18.000 L 11.005 16.000 L 8.505 16.000 L 8.505 14.000 L 14.005 14.000 C 14.281 14.000 14.505 13.776 14.505 13.500 C 14.505 13.255 14.328 13.050 14.095 13.008 L 14.005 13.000 L 10.005 13.000 C 8.624 13.000 7.505 11.881 7.505 10.500 C 7.505 9.119 8.624 8.000 10.005 8.000 L 11.005 8.000 L 11.005 6.000 L 13.005 6.000 Z"),
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
        return _refund2Line!!
    }

private var _refund2Line: ImageVector? = null
