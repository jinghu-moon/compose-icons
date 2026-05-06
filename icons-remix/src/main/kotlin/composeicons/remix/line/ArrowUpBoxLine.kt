package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ArrowUpBoxLine: ImageVector
    get() {
        if (_arrowUpBoxLine != null) return _arrowUpBoxLine!!
        _arrowUpBoxLine = remixIcon(
            name = "ArrowUpBoxLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 3h-16C3.448 3 3 3.448 3 4v16c0 .552 .448 1 1 1h16c.552 0 1-.448 1-1v-16C21 3.448 20.552 3 20 3ZM5 19v-14h14v14h-14ZM12 6.343 6.343 12l1.414 1.414L11 10.172v7.485h2v-7.485l3.243 3.243L17.657 12 12 6.343Z"),
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
        return _arrowUpBoxLine!!
    }

private var _arrowUpBoxLine: ImageVector? = null
