package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Steering2Line: ImageVector
    get() {
        if (_steering2Line != null) return _steering2Line!!
        _steering2Line = remixIcon(
            name = "Steering2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2ZM8 13l-3.938 .001c.452 3.618 3.32 6.486 6.938 6.937v-3.938C9.343 16 8 14.657 8 13ZM19.938 13.001 16 13c0 1.657-1.343 3-3 3l.001 3.938c3.618-.452 6.485-3.319 6.937-6.937ZM14 12h-4v1c0 .552 .448 1 1 1h2c.552 0 1-.448 1-1v-1ZM12 4C7.92 4 4.554 7.054 4.062 11h3.938c0-.552 .448-1 1-1h6c.552 0 1 .448 1 1h3.938C19.446 7.054 16.08 4 12 4Z"),
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
        return _steering2Line!!
    }

private var _steering2Line: ImageVector? = null
