package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FootprintFill: ImageVector
    get() {
        if (_footprintFill != null) return _footprintFill!!
        _footprintFill = remixIcon(
            name = "FootprintFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 18h5.5v1.25c0 1.519-1.231 2.75-2.75 2.75C5.231 22 4 20.769 4 19.25v-1.25ZM8 6.121c2 0 3 2.879 3 4.879 0 1-.5 2-1 3.5l-.5 1.5h-5.5c0-1-.5-2.5-.5-5C3.5 8.5 5.498 6.121 8 6.121ZM20.054 14.098l-.217 1.231c-.264 1.496-1.69 2.494-3.186 2.231-1.496-.264-2.494-1.69-2.231-3.186l.217-1.231 5.417 .955ZM18.178 1.705c2.464 .434 4.018 3.125 3.584 5.587-.434 2.462-1.187 3.852-1.361 4.837l-5.417-.955L14.753 9.61C14.521 8.046 14.202 6.974 14.376 5.989c.347-1.97 1.832-4.632 3.802-4.284Z"),
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
        return _footprintFill!!
    }

private var _footprintFill: ImageVector? = null
