package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PlugLine: ImageVector
    get() {
        if (_plugLine != null) return _plugLine!!
        _plugLine = remixIcon(
            name = "PlugLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13 18v2h6v2h-6c-1.105 0-2-.895-2-2v-2h-3C5.791 18 4 16.209 4 14v-7C4 6.448 4.448 6 5 6h3v-4h2v4h4v-4h2v4h3c.552 0 1 .448 1 1v7c0 2.209-1.791 4-4 4h-3ZM8 16h8c1.105 0 2-.895 2-2v-3h-12v3c0 1.105 .895 2 2 2ZM18 8h-12v1h12v-1ZM12 14.5c-.552 0-1-.448-1-1 0-.552 .448-1 1-1 .552 0 1 .448 1 1 0 .552-.448 1-1 1Z"),
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
        return _plugLine!!
    }

private var _plugLine: ImageVector? = null
