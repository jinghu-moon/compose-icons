package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.LuggageCartFill: ImageVector
    get() {
        if (_luggageCartFill != null) return _luggageCartFill!!
        _luggageCartFill = remixIcon(
            name = "LuggageCartFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.5 20c.828 0 1.5 .671 1.5 1.5C7 22.328 6.329 23 5.5 23 4.672 23 4 22.328 4 21.5 4 20.671 4.672 20 5.5 20ZM18.5 20c.828 0 1.5 .671 1.5 1.5 0 .828-.672 1.5-1.5 1.5-.828 0-1.5-.672-1.5-1.5 0-.829 .672-1.5 1.5-1.5ZM2.172 1.757 6 5.585v11.414L20 17v2h-15c-.552 0-1-.448-1-1L4 6.413 .758 3.172 2.172 1.757ZM16 3c.552 0 1 .448 1 1l-.001 1.999 2.994 .001c.556 0 1.007 .456 1.007 .995v8.009c0 .55-.45 .995-1.007 .995h-11.986c-.556 0-1.007-.456-1.007-.995v-8.009c0-.55 .45-.995 1.007-.995l2.992-.001 .001-1.999c0-.552 .448-1 1-1h4ZM11 8h-1v6h1v-6ZM18 8h-1v6h1v-6ZM15 5h-2v1h2v-1Z"),
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
        return _luggageCartFill!!
    }

private var _luggageCartFill: ImageVector? = null
