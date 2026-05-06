package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ChatHistoryFill: ImageVector
    get() {
        if (_chatHistoryFill != null) return _chatHistoryFill!!
        _chatHistoryFill = remixIcon(
            name = "ChatHistoryFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C10.298 22 8.695 21.575 7.292 20.825L2 22 3.176 16.71C2.426 15.306 2 13.703 2 12 2 6.477 6.477 2 12 2ZM13 7h-2v7h6v-2h-4v-5Z"),
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
        return _chatHistoryFill!!
    }

private var _chatHistoryFill: ImageVector? = null
