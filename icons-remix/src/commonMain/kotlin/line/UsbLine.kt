package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.UsbLine: ImageVector
    get() {
        if (_usbLine != null) return _usbLine!!
        _usbLine = remixIcon(
            name = "UsbLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 1.000 L 15.000 6.000 L 13.000 6.000 L 13.000 13.381 L 16.000 11.882 L 15.999 11.000 L 15.000 11.000 L 15.000 7.000 L 19.000 7.000 L 19.000 11.000 L 17.999 11.000 L 18.000 13.118 L 13.000 15.618 L 13.001 17.171 C 14.166 17.583 15.000 18.694 15.000 20.000 C 15.000 21.657 13.657 23.000 12.000 23.000 C 10.343 23.000 9.000 21.657 9.000 20.000 C 9.000 18.813 9.689 17.787 10.689 17.301 L 6.000 14.000 L 5.999 11.732 C 5.402 11.386 5.000 10.740 5.000 10.000 C 5.000 8.895 5.895 8.000 7.000 8.000 C 8.105 8.000 9.000 8.895 9.000 10.000 C 9.000 10.740 8.598 11.387 8.000 11.732 L 8.000 13.000 L 11.000 15.086 L 11.000 6.000 L 9.000 6.000 L 12.000 1.000 ZM 12.000 19.000 C 11.448 19.000 11.000 19.448 11.000 20.000 C 11.000 20.552 11.448 21.000 12.000 21.000 C 12.552 21.000 13.000 20.552 13.000 20.000 C 13.000 19.448 12.552 19.000 12.000 19.000 Z"),
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
        return _usbLine!!
    }

private var _usbLine: ImageVector? = null
