package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FunctionAiFill: ImageVector
    get() {
        if (_functionAiFill != null) return _functionAiFill!!
        _functionAiFill = remixIcon(
            name = "FunctionAiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 4C3 3.448 3.448 3 4 3h6c.552 0 1 .448 1 1v6c0 .552-.448 1-1 1h-6C3.448 11 3 10.552 3 10v-6ZM3 14c0-.552 .448-1 1-1h6c.552 0 1 .448 1 1v6c0 .552-.448 1-1 1h-6C3.448 21 3 20.552 3 20v-6ZM13 14c0-.552 .448-1 1-1h6c.552 0 1 .448 1 1v6c0 .552-.448 1-1 1h-6c-.552 0-1-.448-1-1v-6ZM17.713 10.128l-.247 .566c-.18 .414-.753 .414-.934 0l-.247-.566C15.847 9.119 15.056 8.316 14.068 7.877l-.76-.338c-.411-.183-.411-.78 0-.963l.717-.319c1.013-.451 1.819-1.283 2.251-2.326l.253-.611c.176-.426 .765-.426 .941 0l.253 .611c.432 1.043 1.238 1.876 2.251 2.326l.717 .319c.411 .183 .411 .78 0 .963l-.76 .338c-.988 .439-1.779 1.242-2.219 2.251Z"),
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
        return _functionAiFill!!
    }

private var _functionAiFill: ImageVector? = null
