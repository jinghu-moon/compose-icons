package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.HqLine: ImageVector
    get() {
        if (_hqLine != null) return _hqLine!!
        _hqLine = remixIcon(
            name = "HqLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 5v14h16v-14h-16ZM3 3h18c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-18C2.448 21 2 20.552 2 20v-16C2 3.448 2.448 3 3 3ZM7.5 11.25h2v-2.25h1.5v6h-1.5v-2.25h-2v2.25h-1.5v-6h1.5v2.25ZM16.25 15v1.5h-1.5v-1.5h-.75c-.552 0-1-.448-1-1v-4c0-.552 .448-1 1-1h3c.552 0 1 .448 1 1v4c0 .552-.448 1-1 1h-.75ZM14.5 10.5v3h2v-3h-2Z"),
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
        return _hqLine!!
    }

private var _hqLine: ImageVector? = null
