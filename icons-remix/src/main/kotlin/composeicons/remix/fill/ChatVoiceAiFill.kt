package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ChatVoiceAiFill: ImageVector
    get() {
        if (_chatVoiceAiFill != null) return _chatVoiceAiFill!!
        _chatVoiceAiFill = remixIcon(
            name = "ChatVoiceAiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.713 8.128l-.247 .566c-.18 .414-.753 .414-.934 0l-.247-.566C18.847 7.119 18.056 6.316 17.068 5.877l-.76-.338c-.411-.183-.411-.78 0-.963l.717-.319c1.013-.451 1.819-1.283 2.251-2.326l.253-.611c.176-.426 .765-.426 .941 0l.253 .611c.432 1.043 1.238 1.876 2.251 2.326l.717 .319c.411 .183 .411 .78 0 .963l-.76 .338c-.988 .439-1.779 1.242-2.219 2.251ZM22 12c0-.445-.029-.883-.085-1.312C21.313 10.89 20.67 11 20 11c-1.093 0-2.118-.292-3-.803v4.803h-2v-6h.528C14.578 7.938 14 6.537 14 5c0-.953 .222-1.854 .617-2.654C13.783 2.12 12.906 2 12 2 6.477 2 2 6.477 2 12c0 2.761 1.119 5.261 2.929 7.071L2 22h10c5.523 0 10-4.477 10-10ZM11 6h2v12h-2v-12ZM7 15v-6h2v6h-2Z"),
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
        return _chatVoiceAiFill!!
    }

private var _chatVoiceAiFill: ImageVector? = null
