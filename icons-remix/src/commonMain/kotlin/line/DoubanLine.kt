package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DoubanLine: ImageVector
    get() {
        if (_doubanLine != null) return _doubanLine!!
        _doubanLine = remixIcon(
            name = "DoubanLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.274 15.000 L 5.000 15.000 L 5.000 7.000 L 19.000 7.000 L 19.000 15.000 L 17.376 15.000 L 16.077 19.000 L 21.000 19.000 L 21.000 21.000 L 3.000 21.000 L 3.000 19.000 L 7.612 19.000 L 6.800 16.500 L 8.702 15.882 L 9.715 19.000 L 13.974 19.000 L 15.274 15.000 ZM 3.500 3.000 L 20.500 3.000 L 20.500 5.000 L 3.500 5.000 L 3.500 3.000 ZM 7.000 9.000 L 7.000 13.000 L 17.000 13.000 L 17.000 9.000 L 7.000 9.000 Z"),
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
        return _doubanLine!!
    }

private var _doubanLine: ImageVector? = null
