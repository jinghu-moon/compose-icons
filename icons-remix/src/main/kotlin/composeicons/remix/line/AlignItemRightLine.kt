package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.AlignItemRightLine: ImageVector
    get() {
        if (_alignItemRightLine != null) return _alignItemRightLine!!
        _alignItemRightLine = remixIcon(
            name = "AlignItemRightLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 21v-18h2v18h-2ZM9 15h6v3h-6v-3ZM8 13c-.552 0-1 .448-1 1v5c0 .552 .448 1 1 1h8c.552 0 1-.448 1-1v-5c0-.552-.448-1-1-1h-8ZM5 9h10v-3h-10v3ZM3 5C3 4.448 3.448 4 4 4h12c.552 0 1 .448 1 1v5c0 .552-.448 1-1 1h-12C3.448 11 3 10.552 3 10v-5Z"),
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
        return _alignItemRightLine!!
    }

private var _alignItemRightLine: ImageVector? = null
