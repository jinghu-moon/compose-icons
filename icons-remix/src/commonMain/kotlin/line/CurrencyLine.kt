package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CurrencyLine: ImageVector
    get() {
        if (_currencyLine != null) return _currencyLine!!
        _currencyLine = remixIcon(
            name = "CurrencyLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.005 16.003 L 19.005 16.003 L 19.005 4.003 L 9.005 4.003 L 9.005 6.003 L 17.005 6.003 L 17.005 16.003 ZM 17.005 18.003 L 17.005 21.002 C 17.005 21.555 16.555 22.003 15.998 22.003 L 4.012 22.003 C 3.455 22.003 3.005 21.558 3.005 21.002 L 3.007 7.004 C 3.008 6.451 3.458 6.003 4.014 6.003 L 7.005 6.003 L 7.005 3.003 C 7.005 2.451 7.452 2.003 8.005 2.003 L 20.005 2.003 C 20.557 2.003 21.005 2.451 21.005 3.003 L 21.005 17.003 C 21.005 17.555 20.557 18.003 20.005 18.003 L 17.005 18.003 ZM 5.007 8.003 L 5.005 20.003 L 15.005 20.003 L 15.005 8.003 L 5.007 8.003 ZM 7.005 16.003 L 11.505 16.003 C 11.781 16.003 12.005 15.779 12.005 15.503 C 12.005 15.227 11.781 15.003 11.505 15.003 L 8.505 15.003 C 7.124 15.003 6.005 13.884 6.005 12.503 C 6.005 11.122 7.124 10.003 8.505 10.003 L 9.005 10.003 L 9.005 9.003 L 11.005 9.003 L 11.005 10.003 L 13.005 10.003 L 13.005 12.003 L 8.505 12.003 C 8.229 12.003 8.005 12.227 8.005 12.503 C 8.005 12.779 8.229 13.003 8.505 13.003 L 11.505 13.003 C 12.885 13.003 14.005 14.122 14.005 15.503 C 14.005 16.883 12.885 18.003 11.505 18.003 L 11.005 18.003 L 11.005 19.003 L 9.005 19.003 L 9.005 18.003 L 7.005 18.003 L 7.005 16.003 Z"),
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
        return _currencyLine!!
    }

private var _currencyLine: ImageVector? = null
