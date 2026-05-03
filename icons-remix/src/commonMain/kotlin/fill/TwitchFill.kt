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
                pathData = parseSvgPathData("M 21.001 3.000 L 21.001 14.739 L 16.305 19.435 L 12.392 19.435 L 9.955 21.783 L 6.914 21.783 L 6.914 19.435 L 3.001 19.435 L 3.001 6.130 L 4.228 3.000 L 21.001 3.000 ZM 19.436 4.565 L 6.131 4.565 L 6.131 16.304 L 9.262 16.304 L 9.262 18.652 L 11.610 16.304 L 16.305 16.304 L 19.436 13.174 L 19.436 4.565 ZM 16.305 7.696 L 16.305 12.391 L 14.740 12.391 L 14.740 7.696 L 16.305 7.696 ZM 12.392 7.696 L 12.392 12.391 L 10.827 12.391 L 10.827 7.696 L 12.392 7.696 Z"),
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
