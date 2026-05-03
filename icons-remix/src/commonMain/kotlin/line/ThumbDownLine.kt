package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ThumbDownLine: ImageVector
    get() {
        if (_thumbDownLine != null) return _thumbDownLine!!
        _thumbDownLine = remixIcon(
            name = "ThumbDownLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.400 16.000 L 3.000 16.000 C 1.895 16.000 1.000 15.105 1.000 14.000 L 1.000 11.896 C 1.000 11.634 1.051 11.376 1.151 11.134 L 4.245 3.619 C 4.399 3.245 4.764 3.000 5.170 3.000 L 22.000 3.000 C 22.552 3.000 23.000 3.448 23.000 4.000 L 23.000 14.000 C 23.000 14.552 22.552 15.000 22.000 15.000 L 18.518 15.000 C 18.193 15.000 17.889 15.158 17.701 15.423 L 12.248 23.149 C 12.105 23.351 11.837 23.418 11.616 23.308 L 9.802 22.401 C 8.750 21.875 8.207 20.687 8.497 19.548 L 9.400 16.000 ZM 17.000 13.413 L 17.000 5.000 L 5.839 5.000 L 3.000 11.896 L 3.000 14.000 L 9.400 14.000 C 10.705 14.000 11.660 15.229 11.338 16.493 L 10.435 20.041 C 10.377 20.269 10.486 20.507 10.696 20.612 L 11.357 20.942 L 16.067 14.270 C 16.317 13.916 16.637 13.626 17.000 13.413 ZM 19.000 13.000 L 21.000 13.000 L 21.000 5.000 L 19.000 5.000 L 19.000 13.000 Z"),
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
        return _thumbDownLine!!
    }

private var _thumbDownLine: ImageVector? = null
