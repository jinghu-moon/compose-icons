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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.301 3h16.7v11.7l-4.7 4.7h-3.9L9.901 21.8h-2.9v-2.4h-4v-13.2L4.301 3ZM5.001 17.4h4v2.4h.095l2.5-2.4h3.876l3.528-3.528v-8.872h-14v12.4ZM15.001 8h2v4.7h-2v-4.7ZM15.001 8h2v4.7h-2v-4.7ZM10.001 8h2v4.7h-2v-4.7Z"),
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
        return _twitchLine!!
    }

private var _twitchLine: ImageVector? = null
