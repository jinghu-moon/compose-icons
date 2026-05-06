package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.TwitchFill: ImageVector
    get() {
        if (_twitchFill != null) return _twitchFill!!
        _twitchFill = remixIcon(
            name = "TwitchFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21.001 3v11.739l-4.696 4.696h-3.913L9.955 21.783h-3.041v-2.348h-3.913v-13.304L4.228 3h16.773ZM19.436 4.565h-13.304v11.739h3.13v2.348l2.348-2.348h4.696l3.131-3.13v-8.609ZM16.305 7.696v4.696h-1.565v-4.696h1.565ZM12.392 7.696v4.696h-1.565v-4.696h1.565Z"),
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
        return _twitchFill!!
    }

private var _twitchFill: ImageVector? = null
