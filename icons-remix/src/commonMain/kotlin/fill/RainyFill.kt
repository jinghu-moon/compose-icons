package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.RainyFill: ImageVector
    get() {
        if (_rainyFill != null) return _rainyFill!!
        _rainyFill = remixIcon(
            name = "RainyFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.860 18.000 L 12.707 14.847 C 12.317 14.457 11.683 14.457 11.293 14.847 L 8.181 17.959 C 4.148 17.549 1.000 14.142 1.000 10.000 C 1.000 5.582 4.582 2.000 9.000 2.000 C 11.997 2.000 14.609 3.648 15.979 6.087 C 16.311 6.030 16.652 6.000 17.000 6.000 C 20.314 6.000 23.000 8.686 23.000 12.000 C 23.000 15.314 20.314 18.000 17.000 18.000 L 15.860 18.000 ZM 10.232 18.732 L 12.000 16.965 L 13.768 18.732 C 14.744 19.708 14.744 21.292 13.768 22.268 C 12.792 23.244 11.208 23.244 10.232 22.268 C 9.256 21.292 9.256 19.708 10.232 18.732 Z"),
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
        return _rainyFill!!
    }

private var _rainyFill: ImageVector? = null
