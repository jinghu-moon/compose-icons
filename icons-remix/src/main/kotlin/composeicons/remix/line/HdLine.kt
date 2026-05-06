package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.HdLine: ImageVector
    get() {
        if (_hdLine != null) return _hdLine!!
        _hdLine = remixIcon(
            name = "HdLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 5v14h16v-14h-16ZM3 3h18c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-18C2.448 21 2 20.552 2 20v-16C2 3.448 2.448 3 3 3ZM7.5 11.25h2v-2.25h1.5v6h-1.5v-2.25h-2v2.25h-1.5v-6h1.5v2.25ZM14.5 10.5v3h1.5c.276 0 .5-.224 .5-.5v-2c0-.276-.224-.5-.5-.5h-1.5ZM13 9h3c1.105 0 2 .895 2 2v2c0 1.105-.895 2-2 2h-3v-6Z"),
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
        return _hdLine!!
    }

private var _hdLine: ImageVector? = null
