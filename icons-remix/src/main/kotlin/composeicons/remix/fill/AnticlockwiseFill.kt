package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.AnticlockwiseFill: ImageVector
    get() {
        if (_anticlockwiseFill != null) return _anticlockwiseFill!!
        _anticlockwiseFill = remixIcon(
            name = "AnticlockwiseFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6 10h3L5 15 1 10h3v-2C4 5.239 6.239 3 9 3h4v2h-4C7.343 5 6 6.343 6 8v2ZM11 9h10c.552 0 1 .448 1 1v10c0 .552-.448 1-1 1h-10c-.552 0-1-.448-1-1v-10c0-.552 .448-1 1-1Z"),
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
        return _anticlockwiseFill!!
    }

private var _anticlockwiseFill: ImageVector? = null
