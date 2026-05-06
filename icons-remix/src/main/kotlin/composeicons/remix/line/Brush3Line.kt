package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Brush3Line: ImageVector
    get() {
        if (_brush3Line != null) return _brush3Line!!
        _brush3Line = remixIcon(
            name = "Brush3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8 19.997v-5h2v5h9v-7h-14v7h3ZM4 10.997h16v-3h-6v-4h-4v4h-6v3ZM3 20.997v-8h-1v-6c0-.552 .448-1 1-1h5v-3c0-.552 .448-1 1-1h6c.552 0 1 .448 1 1v3h5c.552 0 1 .448 1 1v6h-1v8c0 .552-.448 1-1 1h-16c-.552 0-1-.448-1-1Z"),
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
        return _brush3Line!!
    }

private var _brush3Line: ImageVector? = null
