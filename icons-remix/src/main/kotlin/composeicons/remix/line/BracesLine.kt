package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BracesLine: ImageVector
    get() {
        if (_bracesLine != null) return _bracesLine!!
        _bracesLine = remixIcon(
            name = "BracesLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 18v-3.7C4 13.472 3.328 12.8 2.5 12.8h-.5v-1.6h.5C3.328 11.2 4 10.528 4 9.7v-3.7C4 4.343 5.343 3 7 3h1v2h-1C6.448 5 6 5.448 6 6v4.1C6 10.986 5.424 11.737 4.626 12 5.424 12.263 6 13.014 6 13.9v4.1c0 .552 .448 1 1 1h1v2h-1C5.343 21 4 19.657 4 18ZM20 14.3v3.7c0 1.657-1.343 3-3 3h-1v-2h1c.552 0 1-.448 1-1v-4.1c0-.886 .576-1.637 1.374-1.9C18.576 11.737 18 10.986 18 10.1v-4.1C18 5.448 17.552 5 17 5h-1v-2h1c1.657 0 3 1.343 3 3v3.7c0 .828 .672 1.5 1.5 1.5h.5v1.6h-.5c-.828 0-1.5 .672-1.5 1.5Z"),
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
        return _bracesLine!!
    }

private var _bracesLine: ImageVector? = null
