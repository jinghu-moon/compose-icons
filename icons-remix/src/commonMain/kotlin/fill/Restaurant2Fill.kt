package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Restaurant2Fill: ImageVector
    get() {
        if (_restaurant2Fill != null) return _restaurant2Fill!!
        _restaurant2Fill = remixIcon(
            name = "Restaurant2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.222 3.808 L 10.940 10.525 L 8.111 13.354 L 4.222 9.464 C 2.660 7.902 2.660 5.370 4.222 3.808 ZM 14.268 12.146 L 13.415 13.000 L 20.486 20.071 L 19.072 21.485 L 12.000 14.414 L 4.929 21.485 L 3.515 20.071 L 12.854 10.732 C 12.266 9.275 12.874 7.177 14.475 5.575 C 16.428 3.623 19.119 3.148 20.486 4.515 C 21.853 5.881 21.378 8.572 19.425 10.525 C 17.823 12.127 15.725 12.734 14.268 12.146 Z"),
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
        return _restaurant2Fill!!
    }

private var _restaurant2Fill: ImageVector? = null
