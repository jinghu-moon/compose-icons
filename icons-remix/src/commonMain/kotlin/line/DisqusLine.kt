package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DisqusLine: ImageVector
    get() {
        if (_disqusLine != null) return _disqusLine!!
        _disqusLine = remixIcon(
            name = "DisqusLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.997 2.000 C 17.520 2.000 21.997 6.477 21.997 12.000 C 21.997 17.523 17.520 22.000 11.997 22.000 C 9.691 22.000 7.505 21.216 5.748 19.808 L 1.030 20.397 L 2.749 15.812 C 2.255 14.614 1.997 13.325 1.997 12.000 C 1.997 6.477 6.474 2.000 11.997 2.000 ZM 11.997 4.000 C 7.579 4.000 3.997 7.582 3.997 12.000 C 3.997 13.178 4.251 14.318 4.735 15.362 L 4.912 15.742 L 4.064 18.003 L 6.379 17.713 L 6.717 18.010 C 8.168 19.285 10.026 20.000 11.997 20.000 C 16.415 20.000 19.997 16.418 19.997 12.000 C 19.997 7.582 16.415 4.000 11.997 4.000 ZM 8.047 7.000 L 11.837 7.000 C 15.258 7.000 17.278 8.956 17.377 11.729 L 17.381 11.944 L 17.381 11.971 C 17.381 14.785 15.418 16.893 12.043 16.996 L 11.781 17.000 L 8.047 17.000 L 8.047 7.000 L 11.837 7.000 L 8.047 7.000 ZM 11.878 9.458 L 10.770 9.458 L 10.770 14.543 L 11.878 14.543 C 13.444 14.543 14.503 13.698 14.582 12.198 L 14.587 12.015 L 14.587 11.987 C 14.587 10.386 13.507 9.458 11.878 9.458 Z"),
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
        return _disqusLine!!
    }

private var _disqusLine: ImageVector? = null
