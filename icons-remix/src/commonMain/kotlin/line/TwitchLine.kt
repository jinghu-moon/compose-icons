package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.TwitchLine: ImageVector
    get() {
        if (_twitchLine != null) return _twitchLine!!
        _twitchLine = remixIcon(
            name = "TwitchLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.301 3.000 L 21.001 3.000 L 21.001 14.700 L 16.301 19.400 L 12.401 19.400 L 9.901 21.800 L 7.001 21.800 L 7.001 19.400 L 3.001 19.400 L 3.001 6.200 L 4.301 3.000 ZM 5.001 17.400 L 9.001 17.400 L 9.001 19.800 L 9.096 19.800 L 11.596 17.400 L 15.472 17.400 L 19.001 13.872 L 19.001 5.000 L 5.001 5.000 L 5.001 17.400 ZM 15.001 8.000 L 17.001 8.000 L 17.001 12.700 L 15.001 12.700 L 15.001 8.000 ZM 15.001 8.000 L 17.001 8.000 L 17.001 12.700 L 15.001 12.700 L 15.001 8.000 ZM 10.001 8.000 L 12.001 8.000 L 12.001 12.700 L 10.001 12.700 L 10.001 8.000 Z"),
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
        return _twitchLine!!
    }

private var _twitchLine: ImageVector? = null
