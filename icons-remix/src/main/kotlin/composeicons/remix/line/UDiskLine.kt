package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.UDiskLine: ImageVector
    get() {
        if (_uDiskLine != null) return _uDiskLine!!
        _uDiskLine = remixIcon(
            name = "UDiskLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 12h-14v8h14v-8ZM5 10v-8h14v8h1c.552 0 1 .448 1 1v10c0 .552-.448 1-1 1h-16C3.448 22 3 21.552 3 21v-10c0-.552 .448-1 1-1h1ZM7 10h10v-6h-10v6ZM9 6h2v2h-2v-2ZM13 6h2v2h-2v-2Z"),
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
        return _uDiskLine!!
    }

private var _uDiskLine: ImageVector? = null
