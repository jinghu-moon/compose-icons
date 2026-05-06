package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ServerFill: ImageVector
    get() {
        if (_serverFill != null) return _serverFill!!
        _serverFill = remixIcon(
            name = "ServerFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 3h16c.552 0 1 .448 1 1v7h-18v-7C3 3.448 3.448 3 4 3ZM3 13h18v7c0 .552-.448 1-1 1h-16C3.448 21 3 20.552 3 20v-7ZM7 16v2h3v-2h-3ZM7 6v2h3v-2h-3Z"),
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
        return _serverFill!!
    }

private var _serverFill: ImageVector? = null
