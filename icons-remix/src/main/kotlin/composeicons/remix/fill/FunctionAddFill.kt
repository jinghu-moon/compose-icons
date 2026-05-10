package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FunctionAddFill: ImageVector
    get() {
        if (_functionAddFill != null) return _functionAddFill!!
        _functionAddFill = remixIcon(
            name = "FunctionAddFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 3C3.448 3 3 3.448 3 4v6c0 .552 .448 1 1 1h6c.552 0 1-.448 1-1v-6C11 3.448 10.552 3 10 3h-6ZM4 13c-.552 0-1 .448-1 1v6c0 .552 .448 1 1 1h6c.552 0 1-.448 1-1v-6c0-.552-.448-1-1-1h-6ZM14 13c-.552 0-1 .448-1 1v6c0 .552 .448 1 1 1h6c.552 0 1-.448 1-1v-6c0-.552-.448-1-1-1h-6ZM16 11v-3h-3v-2h3v-3h2v3h3v2h-3v3h-2Z"),
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
        return _functionAddFill!!
    }

private var _functionAddFill: ImageVector? = null
