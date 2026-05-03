package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MarkupLine: ImageVector
    get() {
        if (_markupLine != null) return _markupLine!!
        _markupLine = remixIcon(
            name = "MarkupLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.000 10.497 L 11.038 6.862 C 11.190 6.331 11.744 6.024 12.275 6.175 C 12.607 6.270 12.867 6.530 12.962 6.862 L 14.000 10.497 L 14.000 11.997 L 14.719 11.997 C 15.178 11.997 15.578 12.309 15.689 12.754 L 17.051 18.201 C 18.851 16.734 20.000 14.500 20.000 11.997 C 20.000 7.578 16.418 3.997 12.000 3.997 C 7.582 3.997 4.000 7.578 4.000 11.997 C 4.000 14.500 5.149 16.734 6.949 18.201 L 8.311 12.754 C 8.422 12.309 8.822 11.997 9.281 11.997 L 10.000 11.997 L 10.000 10.497 ZM 12.000 19.997 C 12.241 19.997 12.481 19.986 12.719 19.965 C 13.619 19.885 14.476 19.656 15.265 19.302 L 13.938 13.997 L 10.062 13.997 L 8.735 19.302 C 9.524 19.656 10.381 19.885 11.281 19.965 C 11.519 19.986 11.759 19.997 12.000 19.997 ZM 12.000 21.997 C 6.477 21.997 2.000 17.520 2.000 11.997 C 2.000 6.474 6.477 1.997 12.000 1.997 C 17.523 1.997 22.000 6.474 22.000 11.997 C 22.000 17.520 17.523 21.997 12.000 21.997 Z"),
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
        return _markupLine!!
    }

private var _markupLine: ImageVector? = null
