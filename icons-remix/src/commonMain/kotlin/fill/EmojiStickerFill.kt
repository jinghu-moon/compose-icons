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
                pathData = parseSvgPathData("M 21.902 10.598 C 21.444 10.533 20.976 10.500 20.500 10.500 C 17.240 10.500 14.345 12.060 12.521 14.471 C 12.350 14.489 12.176 14.498 12.000 14.498 C 10.719 14.498 9.552 14.017 8.667 13.225 L 7.333 14.715 C 8.419 15.687 9.811 16.325 11.347 16.468 C 10.802 17.702 10.500 19.066 10.500 20.500 C 10.500 20.976 10.533 21.444 10.598 21.902 C 5.739 21.221 2.000 17.047 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 C 17.047 2.000 21.221 5.739 21.902 10.598 ZM 21.871 12.617 C 21.425 12.540 20.967 12.500 20.500 12.500 C 17.766 12.500 15.351 13.871 13.907 15.967 C 13.019 17.256 12.500 18.816 12.500 20.500 C 12.500 20.967 12.540 21.425 12.617 21.871 L 21.871 12.617 ZM 8.500 11.500 C 9.328 11.500 10.000 10.828 10.000 10.000 C 10.000 9.172 9.328 8.500 8.500 8.500 C 7.672 8.500 7.000 9.172 7.000 10.000 C 7.000 10.828 7.672 11.500 8.500 11.500 ZM 15.500 11.500 C 16.328 11.500 17.000 10.828 17.000 10.000 C 17.000 9.172 16.328 8.500 15.500 8.500 C 14.672 8.500 14.000 9.172 14.000 10.000 C 14.000 10.828 14.672 11.500 15.500 11.500 Z"),
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
