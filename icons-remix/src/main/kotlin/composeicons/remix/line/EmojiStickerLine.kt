package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.EmojiStickerLine: ImageVector
    get() {
        if (_emojiStickerLine != null) return _emojiStickerLine!!
        _emojiStickerLine = remixIcon(
            name = "EmojiStickerLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.52 19.863c.076-1.202 .363-2.346 .826-3.396C9.811 16.325 8.419 15.687 7.333 14.715L8.667 13.225c.885 .792 2.052 1.273 3.333 1.273 .176 0 .35-.009 .521-.027 1.706-2.254 4.345-3.763 7.342-3.951C19.169 6.809 15.913 4 12 4 7.582 4 4 7.582 4 12c0 3.913 2.809 7.169 6.52 7.863ZM19.023 12.636c-3.234 .604-5.784 3.153-6.387 6.387l6.387-6.387ZM22 12c0 .168-.004 .334-.012 .5l-9.488 9.488C12.334 21.996 12.168 22 12 22 6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2c5.523 0 10 4.477 10 10ZM10 10c0 .828-.672 1.5-1.5 1.5C7.672 11.5 7 10.828 7 10 7 9.172 7.672 8.5 8.5 8.5 9.328 8.5 10 9.172 10 10ZM17 10c0 .828-.672 1.5-1.5 1.5C14.672 11.5 14 10.828 14 10c0-.828 .672-1.5 1.5-1.5C16.328 8.5 17 9.172 17 10Z"),
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
        return _emojiStickerLine!!
    }

private var _emojiStickerLine: ImageVector? = null
