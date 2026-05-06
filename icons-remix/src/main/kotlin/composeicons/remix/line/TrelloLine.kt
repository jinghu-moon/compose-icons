package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.TrelloLine: ImageVector
    get() {
        if (_trelloLine != null) return _trelloLine!!
        _trelloLine = remixIcon(
            name = "TrelloLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.001 5v14h14v-14h-14ZM5.001 3h14c1.104 0 2 .895 2 2v14c0 1.105-.896 2-2 2h-14c-1.105 0-2-.895-2-2v-14c0-1.105 .895-2 2-2ZM8.001 7h2c.552 0 1 .448 1 1v8c0 .552-.448 1-1 1h-2C7.449 17 7.001 16.552 7.001 16v-8c0-.552 .448-1 1-1ZM14.001 7h2c.552 0 1 .448 1 1v4c0 .552-.448 1-1 1h-2c-.552 0-1-.448-1-1v-4c0-.552 .448-1 1-1Z"),
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
        return _trelloLine!!
    }

private var _trelloLine: ImageVector? = null
