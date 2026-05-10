package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ChargingPile2Fill: ImageVector
    get() {
        if (_chargingPile2Fill != null) return _chargingPile2Fill!!
        _chargingPile2Fill = remixIcon(
            name = "ChargingPile2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 11h-1v-4h1v-3h2v3h1v4h-1v7c0 1.657-1.343 3-3 3-1.657 0-3-1.343-3-3v-4h-2v5h1v2h-13v-2h1v-15C3 3.448 3.448 3 4 3h9c.552 0 1 .448 1 1v8h2c1.105 0 2 .895 2 2v4c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-7ZM9 11v-4L5 13h3v4l4-6h-3Z"),
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
        return _chargingPile2Fill!!
    }

private var _chargingPile2Fill: ImageVector? = null
