package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ChromeFill: ImageVector
    get() {
        if (_chromeFill != null) return _chromeFill!!
        _chromeFill = remixIcon(
            name = "ChromeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9.827 21.763C5.349 20.771 2 16.777 2 12 2 10.178 2.487 8.47 3.339 6.998l4.283 7.419C8.474 15.957 10.115 17 12 17c.202 0 .402-.012 .598-.035L9.827 21.763ZM12 22l4.287-7.425C16.74 13.823 17 12.942 17 12c0-1.126-.372-2.164-1-3h5.542c.297 .947 .458 1.955 .458 3 0 5.523-4.477 10-10 10ZM14.572 13.545C14.047 14.417 13.092 15 12 15 10.89 15 9.92 14.397 9.401 13.5l-.028-.05C9.135 13.02 9 12.526 9 12 9 10.343 10.343 9 12 9c1.657 0 3 1.343 3 3 0 .547-.146 1.059-.401 1.5l-.026 .045ZM4.632 5.239C6.46 3.248 9.084 2 12 2c3.701 0 6.933 2.011 8.662 5h-8.662C9.936 7 8.165 8.25 7.401 10.035L4.632 5.239Z"),
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
        return _chromeFill!!
    }

private var _chromeFill: ImageVector? = null
