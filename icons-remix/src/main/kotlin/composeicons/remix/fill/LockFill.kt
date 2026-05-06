package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.LockFill: ImageVector
    get() {
        if (_lockFill != null) return _lockFill!!
        _lockFill = remixIcon(
            name = "LockFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 10h1c.552 0 1 .448 1 1v10c0 .552-.448 1-1 1h-16C3.448 22 3 21.552 3 21v-10c0-.552 .448-1 1-1h1v-1C5 5.134 8.134 2 12 2c3.866 0 7 3.134 7 7v1ZM17 10v-1C17 6.239 14.761 4 12 4 9.239 4 7 6.239 7 9v1h10ZM11 14v4h2v-4h-2Z"),
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
        return _lockFill!!
    }

private var _lockFill: ImageVector? = null
