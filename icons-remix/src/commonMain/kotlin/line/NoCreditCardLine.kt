package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.NoCreditCardLine: ImageVector
    get() {
        if (_noCreditCardLine != null) return _noCreditCardLine!!
        _noCreditCardLine = remixIcon(
            name = "NoCreditCardLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.586 21.000 L 21.192 22.607 L 22.607 21.192 L 2.808 1.393 L 1.394 2.808 L 2.120 3.534 C 2.046 3.673 2.005 3.832 2.005 4.000 L 2.005 20.000 C 2.005 20.552 2.452 21.000 3.005 21.000 L 19.586 21.000 ZM 17.586 19.000 L 4.005 19.000 L 4.005 12.000 L 10.586 12.000 L 17.586 19.000 ZM 6.586 8.000 L 4.005 8.000 L 4.005 5.419 L 6.586 8.000 ZM 22.005 4.000 L 22.005 17.762 L 20.005 15.762 L 20.005 12.000 L 16.243 12.000 L 12.243 8.000 L 20.005 8.000 L 20.005 5.000 L 9.243 5.000 L 7.243 3.000 L 21.005 3.000 C 21.557 3.000 22.005 3.448 22.005 4.000 Z"),
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
        return _noCreditCardLine!!
    }

private var _noCreditCardLine: ImageVector? = null
