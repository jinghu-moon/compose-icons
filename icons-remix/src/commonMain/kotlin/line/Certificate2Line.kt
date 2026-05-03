package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Certificate2Line: ImageVector
    get() {
        if (_certificate2Line != null) return _certificate2Line!!
        _certificate2Line = remixIcon(
            name = "Certificate2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.000 12.000 C 21.209 12.000 23.000 13.791 23.000 16.000 C 23.000 17.263 22.414 18.388 21.500 19.121 L 21.500 23.500 L 19.000 22.000 L 16.500 23.500 L 16.500 19.121 C 15.586 18.388 15.000 17.263 15.000 16.000 C 15.000 13.791 16.791 12.000 19.000 12.000 ZM 20.000 2.000 C 20.552 2.000 21.000 2.448 21.000 3.000 L 21.000 10.000 L 19.000 10.000 L 19.000 4.000 L 5.000 4.000 L 5.000 20.000 L 13.000 20.000 L 13.000 22.000 L 4.000 22.000 C 3.448 22.000 3.000 21.552 3.000 21.000 L 3.000 3.000 C 3.000 2.448 3.448 2.000 4.000 2.000 L 20.000 2.000 ZM 19.000 14.000 C 17.895 14.000 17.000 14.895 17.000 16.000 C 17.000 17.105 17.895 18.000 19.000 18.000 C 20.105 18.000 21.000 17.105 21.000 16.000 C 21.000 14.895 20.105 14.000 19.000 14.000 ZM 13.000 15.000 L 8.000 15.000 L 8.000 13.000 L 13.000 13.000 L 13.000 15.000 ZM 16.000 11.000 L 8.000 11.000 L 8.000 9.000 L 16.000 9.000 L 16.000 11.000 Z"),
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
        return _certificate2Line!!
    }

private var _certificate2Line: ImageVector? = null
