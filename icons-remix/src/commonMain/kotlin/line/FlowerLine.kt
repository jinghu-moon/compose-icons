package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FlowerLine: ImageVector
    get() {
        if (_flowerLine != null) return _flowerLine!!
        _flowerLine = remixIcon(
            name = "FlowerLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.076 L 12.455 2.309 C 14.221 3.211 15.733 4.538 16.857 6.155 C 17.785 5.714 18.779 5.389 19.819 5.198 L 21.000 4.981 L 21.000 13.000 C 21.000 17.970 16.971 22.000 12.000 22.000 C 7.029 22.000 3.000 17.971 3.000 13.000 L 3.000 4.981 L 4.181 5.198 C 5.221 5.389 6.215 5.714 7.143 6.155 C 8.267 4.538 9.779 3.211 11.545 2.309 L 12.000 2.076 ZM 8.878 7.165 C 10.107 8.026 11.168 9.113 12.000 10.364 C 12.832 9.113 13.893 8.026 15.122 7.165 C 14.295 6.016 13.230 5.049 12.000 4.337 C 10.770 5.049 9.705 6.016 8.878 7.165 ZM 10.899 12.434 C 10.018 10.720 8.656 9.293 6.991 8.332 C 6.367 7.972 5.700 7.677 5.000 7.457 L 5.000 13.000 C 5.000 16.290 7.270 19.050 10.328 19.799 C 10.114 18.900 10.000 17.963 10.000 17.000 C 10.000 15.383 10.320 13.841 10.899 12.434 ZM 12.453 19.986 C 16.108 19.752 19.000 16.714 19.000 13.000 L 19.000 7.457 C 18.300 7.677 17.633 7.972 17.009 8.332 C 14.013 10.062 12.000 13.296 12.000 17.000 C 12.000 18.041 12.159 19.044 12.453 19.986 Z"),
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
        return _flowerLine!!
    }

private var _flowerLine: ImageVector? = null
