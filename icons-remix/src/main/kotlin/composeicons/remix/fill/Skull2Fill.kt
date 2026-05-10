package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Skull2Fill: ImageVector
    get() {
        if (_skull2Fill != null) return _skull2Fill!!
        _skull2Fill = remixIcon(
            name = "Skull2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10v3.764c0 .758-.428 1.45-1.106 1.789L18 19v1c0 1.598-1.249 2.904-2.824 2.995l-.226 .006c.022-.108 .037-.218 .044-.33L15 22.5v-.5c0-1.054-.816-1.918-1.851-1.994L13 20h-2c-1.054 0-1.918 .816-1.995 1.851L9 22v.5c0 .171 .017 .339 .05 .5L9 23C7.343 23 6 21.657 6 20v-1L3.106 17.553C2.428 17.214 2 16.521 2 15.764v-3.764C2 6.477 6.477 2 12 2ZM8 11c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C10 11.895 9.105 11 8 11ZM16 11c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2Z"),
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
        return _skull2Fill!!
    }

private var _skull2Fill: ImageVector? = null
