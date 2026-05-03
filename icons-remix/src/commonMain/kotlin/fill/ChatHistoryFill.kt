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
                pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 10.298 22.000 8.695 21.575 7.292 20.825 L 2.000 22.000 L 3.176 16.710 C 2.426 15.306 2.000 13.703 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 ZM 13.000 7.000 L 11.000 7.000 L 11.000 14.000 L 17.000 14.000 L 17.000 12.000 L 13.000 12.000 L 13.000 7.000 Z"),
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
