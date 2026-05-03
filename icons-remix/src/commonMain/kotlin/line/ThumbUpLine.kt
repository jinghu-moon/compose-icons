package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ThumbUpLine: ImageVector
    get() {
        if (_thumbUpLine != null) return _thumbUpLine!!
        _thumbUpLine = remixIcon(
            name = "ThumbUpLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.600 8.000 L 21.000 8.000 C 22.105 8.000 23.000 8.896 23.000 10.000 L 23.000 12.105 C 23.000 12.366 22.949 12.625 22.849 12.866 L 19.755 20.381 C 19.601 20.756 19.236 21.000 18.830 21.000 L 2.000 21.000 C 1.448 21.000 1.000 20.553 1.000 20.000 L 1.000 10.000 C 1.000 9.448 1.448 9.000 2.000 9.000 L 5.482 9.000 C 5.807 9.000 6.111 8.842 6.299 8.577 L 11.752 0.851 C 11.895 0.649 12.163 0.582 12.384 0.692 L 14.198 1.600 C 15.250 2.125 15.793 3.313 15.503 4.452 L 14.600 8.000 ZM 7.000 10.588 L 7.000 19.000 L 18.161 19.000 L 21.000 12.105 L 21.000 10.000 L 14.600 10.000 C 13.295 10.000 12.340 8.771 12.662 7.507 L 13.565 3.959 C 13.623 3.731 13.514 3.494 13.304 3.388 L 12.643 3.058 L 7.933 9.730 C 7.683 10.084 7.363 10.375 7.000 10.588 ZM 5.000 11.000 L 3.000 11.000 L 3.000 19.000 L 5.000 19.000 L 5.000 11.000 Z"),
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
        return _thumbUpLine!!
    }

private var _thumbUpLine: ImageVector? = null
