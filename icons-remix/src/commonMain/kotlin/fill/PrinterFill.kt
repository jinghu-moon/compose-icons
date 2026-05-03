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
                pathData = parseSvgPathData("M 7.000 17.000 L 17.000 17.000 L 17.000 22.000 L 7.000 22.000 L 7.000 17.000 ZM 19.000 20.000 L 19.000 15.000 L 5.000 15.000 L 5.000 20.000 L 3.000 20.000 C 2.448 20.000 2.000 19.552 2.000 19.000 L 2.000 9.000 C 2.000 8.448 2.448 8.000 3.000 8.000 L 21.000 8.000 C 21.552 8.000 22.000 8.448 22.000 9.000 L 22.000 19.000 C 22.000 19.552 21.552 20.000 21.000 20.000 L 19.000 20.000 ZM 5.000 10.000 L 5.000 12.000 L 8.000 12.000 L 8.000 10.000 L 5.000 10.000 ZM 7.000 2.000 L 17.000 2.000 C 17.552 2.000 18.000 2.448 18.000 3.000 L 18.000 6.000 L 6.000 6.000 L 6.000 3.000 C 6.000 2.448 6.448 2.000 7.000 2.000 Z"),
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
