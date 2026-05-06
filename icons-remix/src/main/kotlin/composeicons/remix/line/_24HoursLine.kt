package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line._24HoursLine: ImageVector
    get() {
        if (__24HoursLine != null) return __24HoursLine!!
        __24HoursLine = remixIcon(
            name = "_24HoursLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.005 13.003c1.657 0 3 1.343 3 3 0 .849-.353 1.616-.92 2.162l-1.91 1.838 2.83 0v2h-6L9.004 20.278l3.694-3.555c.189-.182 .307-.438 .307-.721 0-.552-.448-1-1-1-.552 0-1 .448-1 1h-2c0-1.657 1.343-3 3-3ZM18.005 13.003v4h2v-4h2v9h-2v-3h-4v-6h2ZM4.005 12.003c0 2.527 1.171 4.78 3 6.246l-0 2.417C4.016 18.936 2.005 15.704 2.005 12.003h2ZM12.005 2.003c5.185 0 9.449 3.947 9.951 9l-2.012 0C19.451 7.057 16.084 4.003 12.005 4.003 9.255 4.003 6.829 5.39 5.389 7.503L8.005 7.503v2h-6v-6h2L4.005 6.002C5.829 3.574 8.734 2.003 12.005 2.003Z"),
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
        return __24HoursLine!!
    }

private var __24HoursLine: ImageVector? = null
