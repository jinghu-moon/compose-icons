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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 2.000 C 17.552 2.000 18.000 2.448 18.000 3.000 L 18.000 7.000 L 21.000 7.000 C 21.552 7.000 22.000 7.448 22.000 8.000 L 22.000 18.000 C 22.000 18.552 21.552 19.000 21.000 19.000 L 18.000 19.000 L 18.000 21.000 C 18.000 21.552 17.552 22.000 17.000 22.000 L 7.000 22.000 C 6.448 22.000 6.000 21.552 6.000 21.000 L 6.000 19.000 L 3.000 19.000 C 2.448 19.000 2.000 18.552 2.000 18.000 L 2.000 8.000 C 2.000 7.448 2.448 7.000 3.000 7.000 L 6.000 7.000 L 6.000 3.000 C 6.000 2.448 6.448 2.000 7.000 2.000 L 17.000 2.000 ZM 16.000 17.000 L 8.000 17.000 L 8.000 20.000 L 16.000 20.000 L 16.000 17.000 ZM 20.000 9.000 L 4.000 9.000 L 4.000 17.000 L 6.000 17.000 L 6.000 16.000 C 6.000 15.448 6.448 15.000 7.000 15.000 L 17.000 15.000 C 17.552 15.000 18.000 15.448 18.000 16.000 L 18.000 17.000 L 20.000 17.000 L 20.000 9.000 ZM 8.000 10.000 L 8.000 12.000 L 5.000 12.000 L 5.000 10.000 L 8.000 10.000 ZM 16.000 4.000 L 8.000 4.000 L 8.000 7.000 L 16.000 7.000 L 16.000 4.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _printerLine!!
    }

private var _printerLine: ImageVector? = null
