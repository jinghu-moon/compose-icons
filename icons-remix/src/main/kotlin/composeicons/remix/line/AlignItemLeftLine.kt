package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.AlignItemLeftLine: ImageVector
    get() {
        if (_alignItemLeftLine != null) return _alignItemLeftLine!!
        _alignItemLeftLine = remixIcon(
            name = "AlignItemLeftLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 21v-18h2v18h-2ZM9 15h6v3h-6v-3ZM8 13c-.552 0-1 .448-1 1v5c0 .552 .448 1 1 1h8c.552 0 1-.448 1-1v-5c0-.552-.448-1-1-1h-8ZM9 9h10v-3h-10v3ZM7 5C7 4.448 7.448 4 8 4h12c.552 0 1 .448 1 1v5c0 .552-.448 1-1 1h-12C7.448 11 7 10.552 7 10v-5Z"),
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
        return _alignItemLeftLine!!
    }

private var _alignItemLeftLine: ImageVector? = null
