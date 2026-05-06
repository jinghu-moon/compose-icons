package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ChatPrivateFill: ImageVector
    get() {
        if (_chatPrivateFill != null) return _chatPrivateFill!!
        _chatPrivateFill = remixIcon(
            name = "ChatPrivateFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C10.298 22 8.695 21.575 7.292 20.825L2 22 3.176 16.71C2.426 15.306 2 13.703 2 12 2 6.477 6.477 2 12 2ZM12 7C10.402 7 9 8.34 9 10v1h-1v5h8v-5h-1v-1C15 8.343 13.657 7 12 7ZM14 13v1h-4v-1h4ZM12 9c.476 0 1 .49 1 1v1h-2v-1c0-.51 .487-1 1-1Z"),
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
        return _chatPrivateFill!!
    }

private var _chatPrivateFill: ImageVector? = null
