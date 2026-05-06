package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.GridLine: ImageVector
    get() {
        if (_gridLine != null) return _gridLine!!
        _gridLine = remixIcon(
            name = "GridLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14 10h-4v4h4v-4ZM16 10v4h3v-4h-3ZM14 19v-3h-4v3h4ZM16 19h3v-3h-3v3ZM14 5h-4v3h4v-3ZM16 5v3h3v-3h-3ZM8 10h-3v4h3v-4ZM8 19v-3h-3v3h3ZM8 5h-3v3h3v-3ZM4 3h16c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-16C3.448 21 3 20.552 3 20v-16C3 3.448 3.448 3 4 3Z"),
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
        return _gridLine!!
    }

private var _gridLine: ImageVector? = null
