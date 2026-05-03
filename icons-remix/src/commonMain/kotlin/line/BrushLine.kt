package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BrushLine: ImageVector
    get() {
        if (_brushLine != null) return _brushLine!!
        _brushLine = remixIcon(
            name = "BrushLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.457 9.675 L 15.314 9.533 C 14.666 8.908 13.855 8.434 12.924 8.184 C 10.017 7.405 7.225 9.053 6.432 12.014 C 6.389 12.174 6.366 12.354 6.328 12.805 C 6.174 14.675 5.734 16.070 4.529 17.484 C 6.788 18.373 9.466 18.999 11.502 18.999 C 13.970 18.999 16.164 17.339 16.813 14.920 C 17.331 12.987 16.751 11.018 15.457 9.675 ZM 13.289 6.213 L 18.228 2.371 C 18.626 2.062 19.192 2.097 19.549 2.454 L 22.543 5.448 C 22.900 5.804 22.935 6.371 22.625 6.769 L 18.785 11.707 C 19.078 12.895 19.084 14.172 18.744 15.438 C 17.846 18.790 14.814 20.999 11.502 20.999 C 8.000 20.999 3.500 19.497 1.000 17.997 C 4.980 14.997 4.047 13.186 4.500 11.497 C 5.558 7.547 9.342 5.239 13.289 6.213 ZM 16.701 8.092 C 16.767 8.155 16.832 8.220 16.895 8.285 L 18.030 9.420 L 20.505 6.238 L 18.759 4.492 L 15.577 6.967 L 16.701 8.092 Z"),
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
        return _brushLine!!
    }

private var _brushLine: ImageVector? = null
