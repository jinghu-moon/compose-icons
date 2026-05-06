package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SdCardMiniLine: ImageVector
    get() {
        if (_sdCardMiniLine != null) return _sdCardMiniLine!!
        _sdCardMiniLine = remixIcon(
            name = "SdCardMiniLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8 4v5.793c0 .662-.262 1.296-.729 1.765L6 12.833v7.167h12v-16h-10ZM7 2h12c.552 0 1 .448 1 1v18c0 .552-.448 1-1 1h-14C4.448 22 4 21.552 4 21v-8.58c0-.265 .105-.519 .292-.706L5.854 10.146C5.948 10.053 6 9.926 6 9.793v-6.793C6 2.448 6.448 2 7 2ZM15 5h2v4h-2v-4ZM12 5h2v4h-2v-4ZM9 5h2v4h-2v-4Z"),
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
        return _sdCardMiniLine!!
    }

private var _sdCardMiniLine: ImageVector? = null
