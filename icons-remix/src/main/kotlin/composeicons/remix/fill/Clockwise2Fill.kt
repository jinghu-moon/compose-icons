package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Clockwise2Fill: ImageVector
    get() {
        if (_clockwise2Fill != null) return _clockwise2Fill!!
        _clockwise2Fill = remixIcon(
            name = "Clockwise2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10 4v-3l5 4L10 9v-3h-2C6.343 6 5 7.343 5 9v4h-2v-4C3 6.239 5.239 4 8 4h2ZM9 11c0-.552 .448-1 1-1h10c.552 0 1 .448 1 1v10c0 .552-.448 1-1 1h-10C9.448 22 9 21.552 9 21v-10Z"),
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
        return _clockwise2Fill!!
    }

private var _clockwise2Fill: ImageVector? = null
