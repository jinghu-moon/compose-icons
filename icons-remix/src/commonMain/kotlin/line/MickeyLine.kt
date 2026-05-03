package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MickeyLine: ImageVector
    get() {
        if (_mickeyLine != null) return _mickeyLine!!
        _mickeyLine = remixIcon(
            name = "MickeyLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.617 10.913 C 2.555 10.503 1.000 8.683 1.000 6.500 C 1.000 4.015 3.015 2.000 5.500 2.000 C 7.903 2.000 9.866 3.883 9.993 6.254 C 10.635 6.088 11.307 6.000 12.000 6.000 C 12.693 6.000 13.365 6.088 14.007 6.254 C 14.134 3.883 16.097 2.000 18.500 2.000 C 20.985 2.000 23.000 4.015 23.000 6.500 C 23.000 8.683 21.445 10.503 19.383 10.913 C 19.780 11.863 20.000 12.906 20.000 14.000 C 20.000 18.418 16.418 22.000 12.000 22.000 C 7.582 22.000 4.000 18.418 4.000 14.000 C 4.000 12.906 4.220 11.863 4.617 10.913 ZM 3.000 6.500 C 3.000 7.881 4.119 9.000 5.500 9.000 C 5.590 9.000 5.679 8.995 5.766 8.986 C 6.366 8.241 7.097 7.606 7.924 7.115 C 7.974 6.918 8.000 6.712 8.000 6.500 C 8.000 5.119 6.881 4.000 5.500 4.000 C 4.119 4.000 3.000 5.119 3.000 6.500 ZM 18.234 8.986 C 18.322 8.995 18.410 9.000 18.500 9.000 C 19.881 9.000 21.000 7.881 21.000 6.500 C 21.000 5.119 19.881 4.000 18.500 4.000 C 17.119 4.000 16.000 5.119 16.000 6.500 C 16.000 6.712 16.026 6.918 16.076 7.115 C 16.903 7.606 17.634 8.241 18.234 8.986 ZM 6.000 14.000 C 6.000 17.314 8.686 20.000 12.000 20.000 C 15.314 20.000 18.000 17.314 18.000 14.000 C 18.000 10.686 15.314 8.000 12.000 8.000 C 8.686 8.000 6.000 10.686 6.000 14.000 Z"),
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
        return _mickeyLine!!
    }

private var _mickeyLine: ImageVector? = null
