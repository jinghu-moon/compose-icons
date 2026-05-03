package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Bus2Line: ImageVector
    get() {
        if (_bus2Line != null) return _bus2Line!!
        _bus2Line = remixIcon(
            name = "Bus2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.000 20.000 L 7.000 20.000 L 7.000 21.000 C 7.000 21.552 6.552 22.000 6.000 22.000 L 4.000 22.000 C 3.448 22.000 3.000 21.552 3.000 21.000 L 3.000 12.000 L 2.000 12.000 L 2.000 8.000 L 3.000 8.000 L 3.000 5.000 C 3.000 3.895 3.895 3.000 5.000 3.000 L 19.000 3.000 C 20.105 3.000 21.000 3.895 21.000 5.000 L 21.000 8.000 L 22.000 8.000 L 22.000 12.000 L 21.000 12.000 L 21.000 21.000 C 21.000 21.552 20.552 22.000 20.000 22.000 L 18.000 22.000 C 17.448 22.000 17.000 21.552 17.000 21.000 L 17.000 20.000 ZM 5.000 5.000 L 5.000 11.000 L 19.000 11.000 L 19.000 5.000 L 5.000 5.000 ZM 19.000 13.000 L 5.000 13.000 L 5.000 18.000 L 19.000 18.000 L 19.000 13.000 ZM 7.500 17.000 C 6.672 17.000 6.000 16.328 6.000 15.500 C 6.000 14.672 6.672 14.000 7.500 14.000 C 8.328 14.000 9.000 14.672 9.000 15.500 C 9.000 16.328 8.328 17.000 7.500 17.000 ZM 16.500 17.000 C 15.672 17.000 15.000 16.328 15.000 15.500 C 15.000 14.672 15.672 14.000 16.500 14.000 C 17.328 14.000 18.000 14.672 18.000 15.500 C 18.000 16.328 17.328 17.000 16.500 17.000 Z"),
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
        return _bus2Line!!
    }

private var _bus2Line: ImageVector? = null
