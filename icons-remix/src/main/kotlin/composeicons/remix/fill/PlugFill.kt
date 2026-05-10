package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PlugFill: ImageVector
    get() {
        if (_plugFill != null) return _plugFill!!
        _plugFill = remixIcon(
            name = "PlugFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13 18v2h6v2h-6c-1.105 0-2-.895-2-2v-2h-3C5.791 18 4 16.209 4 14v-4h16v4c0 2.209-1.791 4-4 4h-3ZM16 6h3c.552 0 1 .448 1 1v2h-16v-2C4 6.448 4.448 6 5 6h3v-4h2v4h4v-4h2v4ZM12 14.5c.552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1 0 .552 .448 1 1 1Z"),
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
        return _plugFill!!
    }

private var _plugFill: ImageVector? = null
