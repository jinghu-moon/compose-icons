package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.WindyLine: ImageVector
    get() {
        if (_windyLine != null) return _windyLine!!
        _windyLine = remixIcon(
            name = "WindyLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.500 17.000 L 4.000 17.000 L 4.000 15.000 L 10.500 15.000 C 12.433 15.000 14.000 16.567 14.000 18.500 C 14.000 20.433 12.433 22.000 10.500 22.000 C 9.000 22.000 7.720 21.056 7.222 19.729 L 9.095 19.027 C 9.308 19.595 9.857 20.000 10.500 20.000 C 11.328 20.000 12.000 19.328 12.000 18.500 C 12.000 17.672 11.328 17.000 10.500 17.000 ZM 5.000 11.000 L 18.500 11.000 C 20.433 11.000 22.000 12.567 22.000 14.500 C 22.000 16.433 20.433 18.000 18.500 18.000 C 17.000 18.000 15.720 17.056 15.222 15.729 L 17.095 15.027 C 17.308 15.595 17.857 16.000 18.500 16.000 C 19.328 16.000 20.000 15.328 20.000 14.500 C 20.000 13.672 19.328 13.000 18.500 13.000 L 5.000 13.000 C 3.343 13.000 2.000 11.657 2.000 10.000 C 2.000 8.343 3.343 7.000 5.000 7.000 L 13.500 7.000 C 14.328 7.000 15.000 6.328 15.000 5.500 C 15.000 4.672 14.328 4.000 13.500 4.000 C 12.857 4.000 12.308 4.405 12.095 4.973 L 10.222 4.271 C 10.720 2.944 12.000 2.000 13.500 2.000 C 15.433 2.000 17.000 3.567 17.000 5.500 C 17.000 7.433 15.433 9.000 13.500 9.000 L 5.000 9.000 C 4.448 9.000 4.000 9.448 4.000 10.000 C 4.000 10.552 4.448 11.000 5.000 11.000 Z"),
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
        return _windyLine!!
    }

private var _windyLine: ImageVector? = null
