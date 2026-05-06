package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PaintBrushLine: ImageVector
    get() {
        if (_paintBrushLine != null) return _paintBrushLine!!
        _paintBrushLine = remixIcon(
            name = "PaintBrushLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5 4.997v3h14v-3h-14ZM4 2.997h16c.552 0 1 .448 1 1v5c0 .552-.448 1-1 1h-16c-.552 0-1-.448-1-1v-5c0-.552 .448-1 1-1ZM6 11.997h6c.552 0 1 .448 1 1v3h1v6h-4v-6h1v-2h-6c-.552 0-1-.448-1-1v-2h2v1ZM17.732 13.729l1.768-1.768 1.768 1.768c.976 .976 .976 2.559 0 3.536-.976 .976-2.559 .976-3.536 0-.976-.976-.976-2.559 0-3.536Z"),
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
        return _paintBrushLine!!
    }

private var _paintBrushLine: ImageVector? = null
