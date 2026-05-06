package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Exchange2Fill: ImageVector
    get() {
        if (_exchange2Fill != null) return _exchange2Fill!!
        _exchange2Fill = remixIcon(
            name = "Exchange2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7 21.5C4.515 21.5 2.5 19.485 2.5 17 2.5 14.515 4.515 12.5 7 12.5c2.485 0 4.5 2.015 4.5 4.5 0 2.485-2.015 4.5-4.5 4.5ZM17 11.5C14.515 11.5 12.5 9.485 12.5 7 12.5 4.515 14.515 2.5 17 2.5c2.485 0 4.5 2.015 4.5 4.5 0 2.485-2.015 4.5-4.5 4.5ZM3 8C3 5.239 5.239 3 8 3h3v2h-3C6.343 5 5 6.343 5 8v3h-2v-3ZM19 13v3c0 1.657-1.343 3-3 3h-3v2h3c2.761 0 5-2.239 5-5v-3h-2Z"),
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
        return _exchange2Fill!!
    }

private var _exchange2Fill: ImageVector? = null
