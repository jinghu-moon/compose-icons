package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Megaphone2Line: ImageVector
    get() {
        if (_megaphone2Line != null) return _megaphone2Line!!
        _megaphone2Line = remixIcon(
            name = "Megaphone2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.310 20.095 C 12.416 21.160 11.664 22.119 10.604 22.271 C 9.669 22.404 8.769 21.864 8.446 20.976 L 7.000 16.999 L 12.000 16.999 L 12.310 20.095 ZM 19.445 2.036 C 20.110 1.593 21.000 2.070 21.000 2.868 L 21.000 18.131 C 21.000 18.929 20.110 19.406 19.445 18.963 L 15.000 16.000 L 7.500 16.000 C 4.463 16.000 2.000 13.537 2.000 10.500 C 2.000 7.463 4.462 5.000 7.500 5.000 L 15.000 5.000 L 19.445 2.036 ZM 15.606 7.000 L 7.500 7.000 C 5.567 7.000 4.000 8.567 4.000 10.500 C 4.001 12.433 5.568 14.000 7.500 14.000 L 15.606 14.000 L 19.000 16.261 L 19.000 4.737 L 15.606 7.000 Z"),
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
        return _megaphone2Line!!
    }

private var _megaphone2Line: ImageVector? = null
