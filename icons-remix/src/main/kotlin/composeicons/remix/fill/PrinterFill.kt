package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PrinterFill: ImageVector
    get() {
        if (_printerFill != null) return _printerFill!!
        _printerFill = remixIcon(
            name = "PrinterFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7 17h10v5h-10v-5ZM19 20v-5h-14v5h-2C2.448 20 2 19.552 2 19v-10C2 8.448 2.448 8 3 8h18c.552 0 1 .448 1 1v10c0 .552-.448 1-1 1h-2ZM5 10v2h3v-2h-3ZM7 2h10c.552 0 1 .448 1 1v3h-12v-3C6 2.448 6.448 2 7 2Z"),
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
        return _printerFill!!
    }

private var _printerFill: ImageVector? = null
