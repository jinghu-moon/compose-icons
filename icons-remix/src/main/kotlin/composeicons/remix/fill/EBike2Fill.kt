package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.EBike2Fill: ImageVector
    get() {
        if (_eBike2Fill != null) return _eBike2Fill!!
        _eBike2Fill = remixIcon(
            name = "EBike2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16 1c.552 0 1 .448 1 1v1h5v6h-2.019l2.746 7.545c.176 .451 .273 .942 .273 1.455 0 2.209-1.791 4-4 4-1.864 0-3.43-1.275-3.874-3h-4.252C10.43 20.725 8.864 22 7 22 5.056 22 3.435 20.612 3.075 18.774 2.436 18.44 2 17.771 2 17v-10C2 6.448 2.448 6 3 6h7c.552 0 1 .448 1 1v5c0 .552 .448 1 1 1h2c.552 0 1-.448 1-1v-9h-3v-2h4ZM19 16c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-.24-.042-.471-.12-.684l-.016-.043C20.573 16.528 19.848 16 19 16ZM7 16c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C9 16.895 8.105 16 7 16ZM9 8h-5v2h5v-2ZM20 5h-3v2h3v-2Z"),
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
        return _eBike2Fill!!
    }

private var _eBike2Fill: ImageVector? = null
