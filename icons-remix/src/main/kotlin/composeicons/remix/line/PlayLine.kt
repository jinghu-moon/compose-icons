package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PlayLine: ImageVector
    get() {
        if (_playLine != null) return _playLine!!
        _playLine = remixIcon(
            name = "PlayLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16.394 12 10 7.737v8.526l6.394-4.263ZM19.376 12.416 8.777 19.482c-.23 .153-.54 .091-.693-.139C8.029 19.261 8 19.164 8 19.066v-14.131c0-.276 .224-.5 .5-.5 .099 0 .195 .029 .277 .084l10.599 7.066c.23 .153 .292 .464 .139 .693-.037 .055-.084 .102-.139 .139Z"),
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
        return _playLine!!
    }

private var _playLine: ImageVector? = null
