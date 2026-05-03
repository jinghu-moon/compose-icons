package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ThumbUpFill: ImageVector
    get() {
        if (_thumbUpFill != null) return _thumbUpFill!!
        _thumbUpFill = remixIcon(
            name = "ThumbUpFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 2.000 9.000 L 5.000 9.000 L 5.000 21.000 L 2.000 21.000 C 1.448 21.000 1.000 20.552 1.000 20.000 L 1.000 10.000 C 1.000 9.448 1.448 9.000 2.000 9.000 ZM 7.293 7.707 L 13.693 1.307 C 13.869 1.131 14.148 1.111 14.347 1.260 L 15.200 1.900 C 15.684 2.263 15.903 2.883 15.753 3.470 L 14.600 8.000 L 21.000 8.000 C 22.105 8.000 23.000 8.895 23.000 10.000 L 23.000 12.104 C 23.000 12.366 22.949 12.624 22.849 12.866 L 19.755 20.381 C 19.601 20.755 19.236 21.000 18.830 21.000 L 8.000 21.000 C 7.448 21.000 7.000 20.552 7.000 20.000 L 7.000 8.414 C 7.000 8.149 7.105 7.895 7.293 7.707 Z"),
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
        return _thumbUpFill!!
    }

private var _thumbUpFill: ImageVector? = null
