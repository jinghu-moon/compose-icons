package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FunctionLine: ImageVector
    get() {
        if (_functionLine != null) return _functionLine!!
        _functionLine = remixIcon(
            name = "FunctionLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 4C3 3.448 3.448 3 4 3h6c.552 0 1 .448 1 1v6c0 .552-.448 1-1 1h-6C3.448 11 3 10.552 3 10v-6ZM3 14c0-.552 .448-1 1-1h6c.552 0 1 .448 1 1v6c0 .552-.448 1-1 1h-6C3.448 21 3 20.552 3 20v-6ZM13 4c0-.552 .448-1 1-1h6c.552 0 1 .448 1 1v6c0 .552-.448 1-1 1h-6c-.552 0-1-.448-1-1v-6ZM13 14c0-.552 .448-1 1-1h6c.552 0 1 .448 1 1v6c0 .552-.448 1-1 1h-6c-.552 0-1-.448-1-1v-6ZM15 5v4h4v-4h-4ZM15 15v4h4v-4h-4ZM5 5v4h4v-4h-4ZM5 15v4h4v-4h-4Z"),
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
        return _functionLine!!
    }

private var _functionLine: ImageVector? = null
