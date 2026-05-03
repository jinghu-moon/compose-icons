package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.RainyLine: ImageVector
    get() {
        if (_rainyLine != null) return _rainyLine!!
        _rainyLine = remixIcon(
            name = "RainyLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 16.000 18.000 L 16.000 16.000 L 17.000 16.000 C 19.209 16.000 21.000 14.209 21.000 12.000 C 21.000 9.791 19.209 8.000 17.000 8.000 C 16.206 8.000 15.465 8.232 14.843 8.631 C 14.224 5.977 11.843 4.000 9.000 4.000 C 5.686 4.000 3.000 6.686 3.000 10.000 C 3.000 12.973 5.162 15.441 8.000 15.917 L 8.000 17.938 C 4.054 17.446 1.000 14.080 1.000 10.000 C 1.000 5.582 4.582 2.000 9.000 2.000 C 11.997 2.000 14.609 3.648 15.979 6.087 C 16.311 6.030 16.652 6.000 17.000 6.000 C 20.314 6.000 23.000 8.686 23.000 12.000 C 23.000 15.314 20.314 18.000 17.000 18.000 L 16.000 18.000 ZM 10.232 18.732 L 12.000 16.965 L 13.768 18.732 C 14.744 19.708 14.744 21.292 13.768 22.268 C 12.792 23.244 11.208 23.244 10.232 22.268 C 9.256 21.292 9.256 19.708 10.232 18.732 Z"),
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
        return _rainyLine!!
    }

private var _rainyLine: ImageVector? = null
