package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ChatQuoteFill: ImageVector
    get() {
        if (_chatQuoteFill != null) return _chatQuoteFill!!
        _chatQuoteFill = remixIcon(
            name = "ChatQuoteFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 3c.552 0 1 .448 1 1v14c0 .552-.448 1-1 1h-14.545L2 22.5v-18.5C2 3.448 2.448 3 3 3h18ZM10.515 7.412C8.728 8.187 7.5 9.755 7.5 11.505c0 .995 .277 1.608 .792 2.155 .324 .344 .837 .59 1.374 .59 .967 0 1.75-.783 1.75-1.75 0-.92-.711-1.661-1.613-1.745-.161-.015-.324-.012-.479 .009l0-.092c.005-.441 .099-1.74 1.638-2.573l-.446-.689ZM15.515 7.412c-1.787 .775-3.015 2.344-3.015 4.094 0 .995 .277 1.608 .792 2.155 .324 .344 .837 .59 1.374 .59 .967 0 1.75-.783 1.75-1.75 0-.92-.711-1.661-1.613-1.745-.161-.015-.324-.012-.479 .009l0-.092c.005-.441 .099-1.74 1.638-2.573l-.446-.689Z"),
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
        return _chatQuoteFill!!
    }

private var _chatQuoteFill: ImageVector? = null
