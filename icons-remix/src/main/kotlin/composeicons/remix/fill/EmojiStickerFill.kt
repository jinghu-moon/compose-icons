package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.EmojiStickerFill: ImageVector
    get() {
        if (_emojiStickerFill != null) return _emojiStickerFill!!
        _emojiStickerFill = remixIcon(
            name = "EmojiStickerFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21.902 10.598c-.458-.064-.926-.098-1.402-.098-3.26 0-6.155 1.56-7.979 3.971-.171 .018-.345 .027-.521 .027-1.281 0-2.448-.481-3.333-1.273L7.333 14.715c1.086 .972 2.478 1.61 4.014 1.752-.544 1.234-.847 2.599-.847 4.032 0 .476 .033 .944 .098 1.402C5.739 21.221 2 17.047 2 12 2 6.477 6.477 2 12 2c5.047 0 9.221 3.739 9.902 8.598ZM21.871 12.617c-.445-.077-.903-.117-1.371-.117-2.734 0-5.149 1.371-6.593 3.467-.887 1.288-1.407 2.848-1.407 4.533 0 .467 .04 .925 .117 1.371l9.254-9.254ZM8.5 11.5C9.328 11.5 10 10.828 10 10 10 9.172 9.328 8.5 8.5 8.5 7.672 8.5 7 9.172 7 10c0 .828 .672 1.5 1.5 1.5ZM15.5 11.5C16.328 11.5 17 10.828 17 10 17 9.172 16.328 8.5 15.5 8.5 14.672 8.5 14 9.172 14 10c0 .828 .672 1.5 1.5 1.5Z"),
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
        return _emojiStickerFill!!
    }

private var _emojiStickerFill: ImageVector? = null
