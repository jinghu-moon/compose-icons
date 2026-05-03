package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BookMarkedFill: ImageVector
    get() {
        if (_bookMarkedFill != null) return _bookMarkedFill!!
        _bookMarkedFill = remixIcon(
            name = "BookMarkedFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.000 22.000 L 6.500 22.000 C 4.567 22.000 3.000 20.433 3.000 18.500 L 3.000 5.000 C 3.000 3.343 4.343 2.000 6.000 2.000 L 20.000 2.000 C 20.552 2.000 21.000 2.448 21.000 3.000 L 21.000 21.000 C 21.000 21.552 20.552 22.000 20.000 22.000 ZM 19.000 20.000 L 19.000 17.000 L 6.500 17.000 C 5.672 17.000 5.000 17.672 5.000 18.500 C 5.000 19.328 5.672 20.000 6.500 20.000 L 19.000 20.000 ZM 10.000 4.000 L 10.000 12.000 L 13.500 10.000 L 17.000 12.000 L 17.000 4.000 L 10.000 4.000 Z"),
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
        return _bookMarkedFill!!
    }

private var _bookMarkedFill: ImageVector? = null
