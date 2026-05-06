package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Bus2Fill: ImageVector
    get() {
        if (_bus2Fill != null) return _bus2Fill!!
        _bus2Fill = remixIcon(
            name = "Bus2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 20h-10v1c0 .552-.448 1-1 1h-2C3.448 22 3 21.552 3 21v-9h-1v-4h1v-3C3 3.895 3.895 3 5 3h14c1.105 0 2 .895 2 2v3h1v4h-1v9c0 .552-.448 1-1 1h-2c-.552 0-1-.448-1-1v-1ZM5 5v7h14v-7h-14ZM7.5 18C8.328 18 9 17.328 9 16.5 9 15.672 8.328 15 7.5 15 6.672 15 6 15.672 6 16.5 6 17.328 6.672 18 7.5 18ZM16.5 18C17.328 18 18 17.328 18 16.5 18 15.672 17.328 15 16.5 15 15.672 15 15 15.672 15 16.5c0 .828 .672 1.5 1.5 1.5Z"),
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
        return _bus2Fill!!
    }

private var _bus2Fill: ImageVector? = null
