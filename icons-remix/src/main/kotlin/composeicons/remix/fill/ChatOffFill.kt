package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ChatOffFill: ImageVector
    get() {
        if (_chatOffFill != null) return _chatOffFill!!
        _chatOffFill = remixIcon(
            name = "ChatOffFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2.808 1.393 22.607 21.192l-1.414 1.414L17.585 18.999 6.455 19 2 22.5v-18.5c0-.169 .042-.329 .116-.469L1.394 2.808 2.808 1.393ZM21 3c.552 0 1 .448 1 1v13.785L7.214 3h13.786Z"),
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
        return _chatOffFill!!
    }

private var _chatOffFill: ImageVector? = null
