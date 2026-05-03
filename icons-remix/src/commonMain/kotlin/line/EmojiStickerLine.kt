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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.520 19.863 C 10.595 18.662 10.883 17.517 11.346 16.468 C 9.811 16.325 8.419 15.687 7.333 14.715 L 8.667 13.225 C 9.552 14.017 10.719 14.498 12.000 14.498 C 12.176 14.498 12.350 14.489 12.521 14.471 C 14.227 12.217 16.866 10.708 19.863 10.520 C 19.169 6.809 15.913 4.000 12.000 4.000 C 7.582 4.000 4.000 7.582 4.000 12.000 C 4.000 15.913 6.809 19.169 10.520 19.863 ZM 19.023 12.636 C 15.789 13.240 13.240 15.789 12.636 19.023 L 19.023 12.636 ZM 22.000 12.000 C 22.000 12.168 21.996 12.334 21.988 12.500 L 12.500 21.988 C 12.334 21.996 12.168 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 ZM 10.000 10.000 C 10.000 10.828 9.328 11.500 8.500 11.500 C 7.672 11.500 7.000 10.828 7.000 10.000 C 7.000 9.172 7.672 8.500 8.500 8.500 C 9.328 8.500 10.000 9.172 10.000 10.000 ZM 17.000 10.000 C 17.000 10.828 16.328 11.500 15.500 11.500 C 14.672 11.500 14.000 10.828 14.000 10.000 C 14.000 9.172 14.672 8.500 15.500 8.500 C 16.328 8.500 17.000 9.172 17.000 10.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _emojiStickerLine!!
    }

private var _emojiStickerLine: ImageVector? = null
