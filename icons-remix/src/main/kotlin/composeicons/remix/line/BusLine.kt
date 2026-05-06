package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BusLine: ImageVector
    get() {
        if (_busLine != null) return _busLine!!
        _busLine = remixIcon(
            name = "BusLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 20h-10v1c0 .552-.448 1-1 1h-1C4.448 22 4 21.552 4 21v-1h-1v-8h-1v-4h1v-3C3 3.895 3.895 3 5 3h14c1.105 0 2 .895 2 2v3h1v4h-1v8h-1v1c0 .552-.448 1-1 1h-1c-.552 0-1-.448-1-1v-1ZM19 12v-7h-14v7h14ZM19 14h-14v4h14v-4ZM6 15h4v2h-4v-2ZM14 15h4v2h-4v-2Z"),
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
        return _busLine!!
    }

private var _busLine: ImageVector? = null
