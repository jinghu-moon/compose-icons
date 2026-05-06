package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BilibiliLine: ImageVector
    get() {
        if (_bilibiliLine != null) return _bilibiliLine!!
        _bilibiliLine = remixIcon(
            name = "BilibiliLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.172 2.757l3.242 3.242h3.171L16.828 2.757c.391-.391 1.024-.391 1.414 0 .391 .391 .391 1.024 0 1.414L16.414 5.999l2.086 .001C20.433 6 22 7.567 22 9.5v8C22 19.433 20.433 21 18.5 21h-13C3.567 21 2 19.433 2 17.5v-8C2 7.567 3.567 6 5.5 6L7.585 5.999 5.757 4.172c-.391-.391-.391-1.024 0-1.414 .391-.391 1.024-.391 1.414 0ZM18.5 8h-13c-.78 0-1.42 .595-1.493 1.356L4 9.5v8c0 .78 .595 1.42 1.356 1.493L5.5 19h13c.78 0 1.42-.595 1.493-1.355L20 17.5v-8C20 8.672 19.328 8 18.5 8ZM8 11c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1C7.448 15 7 14.552 7 14v-2c0-.552 .448-1 1-1ZM16 11c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-2c0-.552 .448-1 1-1Z"),
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
        return _bilibiliLine!!
    }

private var _bilibiliLine: ImageVector? = null
