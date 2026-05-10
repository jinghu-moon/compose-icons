package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ArrowLeftUpBoxFill: ImageVector
    get() {
        if (_arrowLeftUpBoxFill != null) return _arrowLeftUpBoxFill!!
        _arrowLeftUpBoxFill = remixIcon(
            name = "ArrowLeftUpBoxFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 3C3.448 3 3 3.448 3 4v16c0 .552 .448 1 1 1h16c.552 0 1-.448 1-1v-16C21 3.448 20.552 3 20 3h-16ZM8 8h8.414l-3.5 3.5 3.793 3.793-1.414 1.414L11.5 12.914 8 16.414v-8.414Z"),
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
        return _arrowLeftUpBoxFill!!
    }

private var _arrowLeftUpBoxFill: ImageVector? = null
