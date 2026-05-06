package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.AlignItemBottomLine: ImageVector
    get() {
        if (_alignItemBottomLine != null) return _alignItemBottomLine!!
        _alignItemBottomLine = remixIcon(
            name = "AlignItemBottomLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9 5v10h-3v-10h3ZM5 3C4.448 3 4 3.448 4 4v12c0 .552 .448 1 1 1h5c.552 0 1-.448 1-1v-12C11 3.448 10.552 3 10 3h-5ZM15 9v6h3v-6h-3ZM13 8c0-.552 .448-1 1-1h5c.552 0 1 .448 1 1v8c0 .552-.448 1-1 1h-5c-.552 0-1-.448-1-1v-8ZM21 19h-18v2h18v-2Z"),
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
        return _alignItemBottomLine!!
    }

private var _alignItemBottomLine: ImageVector? = null
