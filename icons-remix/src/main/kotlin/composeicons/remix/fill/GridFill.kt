package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.GridFill: ImageVector
    get() {
        if (_gridFill != null) return _gridFill!!
        _gridFill = remixIcon(
            name = "GridFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14 10v4h-4v-4h4ZM16 10h5v4h-5v-4ZM14 21h-4v-5h4v5ZM16 21v-5h5v4c0 .552-.448 1-1 1h-4ZM14 3v5h-4v-5h4ZM16 3h4c.552 0 1 .448 1 1v4h-5v-5ZM8 10v4h-5v-4h5ZM8 21h-4C3.448 21 3 20.552 3 20v-4h5v5ZM8 3v5h-5v-4C3 3.448 3.448 3 4 3h4Z"),
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
        return _gridFill!!
    }

private var _gridFill: ImageVector? = null
