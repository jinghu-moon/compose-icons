package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.HdFill: ImageVector
    get() {
        if (_hdFill != null) return _hdFill!!
        _hdFill = remixIcon(
            name = "HdFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 3h18c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-18C2.448 21 2 20.552 2 20v-16C2 3.448 2.448 3 3 3ZM7.5 11.25v-2.25h-1.5v6h1.5v-2.25h2v2.25h1.5v-6h-1.5v2.25h-2ZM14.5 10.5h1.5c.276 0 .5 .224 .5 .5v2c0 .276-.224 .5-.5 .5h-1.5v-3ZM13 9v6h3c1.105 0 2-.895 2-2v-2C18 9.895 17.105 9 16 9h-3Z"),
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
        return _hdFill!!
    }

private var _hdFill: ImageVector? = null
