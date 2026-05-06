package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PrinterLine: ImageVector
    get() {
        if (_printerLine != null) return _printerLine!!
        _printerLine = remixIcon(
            name = "PrinterLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 2c.552 0 1 .448 1 1v4h3c.552 0 1 .448 1 1v10c0 .552-.448 1-1 1h-3v2c0 .552-.448 1-1 1h-10C6.448 22 6 21.552 6 21v-2h-3C2.448 19 2 18.552 2 18v-10C2 7.448 2.448 7 3 7h3v-4C6 2.448 6.448 2 7 2h10ZM16 17h-8v3h8v-3ZM20 9h-16v8h2v-1c0-.552 .448-1 1-1h10c.552 0 1 .448 1 1v1h2v-8ZM8 10v2h-3v-2h3ZM16 4h-8v3h8v-3Z"),
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
        return _printerLine!!
    }

private var _printerLine: ImageVector? = null
