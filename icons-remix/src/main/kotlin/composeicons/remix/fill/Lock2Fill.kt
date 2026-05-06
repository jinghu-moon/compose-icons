package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Lock2Fill: ImageVector
    get() {
        if (_lock2Fill != null) return _lock2Fill!!
        _lock2Fill = remixIcon(
            name = "Lock2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18 8h2c.552 0 1 .448 1 1v12c0 .552-.448 1-1 1h-16C3.448 22 3 21.552 3 21v-12C3 8.448 3.448 8 4 8h2v-1C6 3.686 8.686 1 12 1c3.314 0 6 2.686 6 6v1ZM11 15.732v2.268h2v-2.268c.598-.346 1-.992 1-1.732 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2 0 .74 .402 1.387 1 1.732ZM16 8v-1C16 4.791 14.209 3 12 3 9.791 3 8 4.791 8 7v1h8Z"),
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
        return _lock2Fill!!
    }

private var _lock2Fill: ImageVector? = null
