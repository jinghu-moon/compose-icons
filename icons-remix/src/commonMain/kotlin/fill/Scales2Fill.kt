package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Scales2Fill: ImageVector
    get() {
        if (_scales2Fill != null) return _scales2Fill!!
        _scales2Fill = remixIcon(
            name = "Scales2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.998 2.000 C 5.998 2.513 6.488 3.000 6.998 3.000 L 16.998 3.000 C 17.511 3.000 17.998 2.510 17.998 2.000 L 19.998 2.000 C 19.998 3.657 18.655 5.000 16.998 5.000 L 12.998 5.000 L 12.999 7.062 C 16.945 7.555 19.998 10.921 19.998 15.000 L 19.998 21.000 C 19.998 21.552 19.550 22.000 18.998 22.000 L 4.998 22.000 C 4.446 22.000 3.998 21.552 3.998 21.000 L 3.998 15.000 C 3.998 10.920 7.052 7.554 10.998 7.062 L 10.998 5.000 L 6.998 5.000 C 5.338 5.000 3.998 3.660 3.998 2.000 L 5.998 2.000 ZM 11.998 11.000 C 9.789 11.000 7.998 12.791 7.998 15.000 C 7.998 17.209 9.789 19.000 11.998 19.000 C 14.207 19.000 15.998 17.209 15.998 15.000 C 15.998 14.258 15.796 13.564 15.444 12.968 L 12.705 15.707 L 12.611 15.790 C 12.219 16.095 11.651 16.068 11.291 15.707 C 10.900 15.317 10.900 14.683 11.291 14.293 L 14.030 11.554 C 13.434 11.202 12.740 11.000 11.998 11.000 Z"),
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
        return _scales2Fill!!
    }

private var _scales2Fill: ImageVector? = null
