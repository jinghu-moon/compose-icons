package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BrushFill: ImageVector
    get() {
        if (_brushFill != null) return _brushFill!!
        _brushFill = remixIcon(
            name = "BrushFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.289 6.213 L 18.228 2.371 C 18.626 2.062 19.192 2.097 19.549 2.454 L 22.543 5.448 C 22.900 5.804 22.935 6.371 22.625 6.769 L 18.785 11.707 C 19.078 12.895 19.084 14.172 18.744 15.438 C 17.846 18.790 14.814 20.999 11.502 20.999 C 8.000 20.999 3.500 19.497 1.000 17.997 C 4.980 14.997 4.047 13.186 4.500 11.497 C 5.558 7.547 9.342 5.239 13.289 6.213 ZM 16.701 8.092 C 16.767 8.155 16.832 8.220 16.895 8.285 L 18.030 9.420 L 20.505 6.238 L 18.759 4.492 L 15.577 6.967 L 16.701 8.092 Z"),
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
        return _brushFill!!
    }

private var _brushFill: ImageVector? = null
