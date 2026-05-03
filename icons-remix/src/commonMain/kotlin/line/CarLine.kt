package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CarLine: ImageVector
    get() {
        if (_carLine != null) return _carLine!!
        _carLine = remixIcon(
            name = "CarLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.000 20.000 L 5.000 20.000 L 5.000 21.000 C 5.000 21.552 4.552 22.000 4.000 22.000 L 3.000 22.000 C 2.448 22.000 2.000 21.552 2.000 21.000 L 2.000 11.000 L 4.481 5.212 C 4.796 4.477 5.519 4.000 6.319 4.000 L 17.681 4.000 C 18.481 4.000 19.204 4.477 19.520 5.212 L 22.000 11.000 L 22.000 21.000 C 22.000 21.552 21.552 22.000 21.000 22.000 L 20.000 22.000 C 19.448 22.000 19.000 21.552 19.000 21.000 L 19.000 20.000 ZM 20.000 13.000 L 4.000 13.000 L 4.000 18.000 L 20.000 18.000 L 20.000 13.000 ZM 4.176 11.000 L 19.824 11.000 L 17.681 6.000 L 6.319 6.000 L 4.176 11.000 ZM 6.500 17.000 C 5.672 17.000 5.000 16.328 5.000 15.500 C 5.000 14.672 5.672 14.000 6.500 14.000 C 7.328 14.000 8.000 14.672 8.000 15.500 C 8.000 16.328 7.328 17.000 6.500 17.000 ZM 17.500 17.000 C 16.672 17.000 16.000 16.328 16.000 15.500 C 16.000 14.672 16.672 14.000 17.500 14.000 C 18.328 14.000 19.000 14.672 19.000 15.500 C 19.000 16.328 18.328 17.000 17.500 17.000 Z"),
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
        return _carLine!!
    }

private var _carLine: ImageVector? = null
