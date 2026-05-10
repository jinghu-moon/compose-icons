package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.UDiskFill: ImageVector
    get() {
        if (_uDiskFill != null) return _uDiskFill!!
        _uDiskFill = remixIcon(
            name = "UDiskFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 12h16c.552 0 1 .448 1 1v8c0 .552-.448 1-1 1h-16C3.448 22 3 21.552 3 21v-8c0-.552 .448-1 1-1ZM5 2h14v8h-14v-8ZM9 5v2h2v-2h-2ZM13 5v2h2v-2h-2Z"),
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
        return _uDiskFill!!
    }

private var _uDiskFill: ImageVector? = null
