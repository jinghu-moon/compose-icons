package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MusicAiLine: ImageVector
    get() {
        if (_musicAiLine != null) return _musicAiLine!!
        _musicAiLine = remixIcon(
            name = "MusicAiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.713 8.128l-.247 .566c-.18 .414-.753 .414-.934 0l-.247-.566C16.847 7.119 16.056 6.316 15.068 5.877l-.76-.338c-.411-.183-.411-.78 0-.963l.717-.319c1.013-.451 1.819-1.283 2.251-2.326l.253-.611c.176-.426 .765-.426 .941 0l.253 .611c.432 1.043 1.238 1.876 2.251 2.326l.717 .319c.411 .183 .411 .78 0 .963l-.76 .338c-.988 .439-1.779 1.242-2.219 2.251ZM7 3h5v2h-3v12c0 2.209-1.791 4-4 4C2.791 21 1 19.209 1 17 1 14.791 2.791 13 5 13c.729 0 1.412 .195 2 .535v-10.535ZM18 13.535v-2.535h2v6c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4 .729 0 1.412 .195 2 .535ZM5 19c1.105 0 2-.895 2-2C7 15.895 6.105 15 5 15c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2ZM16 19c1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2Z"),
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
        return _musicAiLine!!
    }

private var _musicAiLine: ImageVector? = null
