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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.998 2c0 .513 .49 1 1 1h10c.513 0 1-.49 1-1h2c0 1.657-1.343 3-3 3h-4l.001 2.062c3.946 .493 6.999 3.859 6.999 7.938v6c0 .552-.448 1-1 1h-14C4.446 22 3.998 21.552 3.998 21v-6c0-4.08 3.054-7.446 7-7.938L10.998 5h-4C5.338 5 3.998 3.66 3.998 2h2ZM11.998 11C9.789 11 7.998 12.791 7.998 15c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4 0-.742-.202-1.436-.554-2.032l-2.739 2.739-.094 .083c-.392 .305-.96 .277-1.32-.083-.391-.391-.391-1.024 0-1.414l2.739-2.739C13.434 11.202 12.74 11 11.998 11Z"),
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
        return _scales2Fill!!
    }

private var _scales2Fill: ImageVector? = null
