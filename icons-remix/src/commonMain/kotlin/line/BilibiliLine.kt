package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BilibiliLine: ImageVector
    get() {
        if (_bilibiliLine != null) return _bilibiliLine!!
        _bilibiliLine = remixIcon(
            name = "BilibiliLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.172 2.757 L 10.414 5.999 L 13.585 5.999 L 16.828 2.757 C 17.219 2.367 17.852 2.367 18.243 2.757 C 18.633 3.148 18.633 3.781 18.243 4.172 L 16.414 5.999 L 18.500 6.000 C 20.433 6.000 22.000 7.567 22.000 9.500 L 22.000 17.500 C 22.000 19.433 20.433 21.000 18.500 21.000 L 5.500 21.000 C 3.567 21.000 2.000 19.433 2.000 17.500 L 2.000 9.500 C 2.000 7.567 3.567 6.000 5.500 6.000 L 7.585 5.999 L 5.757 4.172 C 5.367 3.781 5.367 3.148 5.757 2.757 C 6.148 2.367 6.781 2.367 7.172 2.757 ZM 18.500 8.000 L 5.500 8.000 C 4.720 8.000 4.080 8.595 4.007 9.356 L 4.000 9.500 L 4.000 17.500 C 4.000 18.280 4.595 18.920 5.356 18.993 L 5.500 19.000 L 18.500 19.000 C 19.280 19.000 19.920 18.405 19.993 17.645 L 20.000 17.500 L 20.000 9.500 C 20.000 8.672 19.328 8.000 18.500 8.000 ZM 8.000 11.000 C 8.552 11.000 9.000 11.448 9.000 12.000 L 9.000 14.000 C 9.000 14.552 8.552 15.000 8.000 15.000 C 7.448 15.000 7.000 14.552 7.000 14.000 L 7.000 12.000 C 7.000 11.448 7.448 11.000 8.000 11.000 ZM 16.000 11.000 C 16.552 11.000 17.000 11.448 17.000 12.000 L 17.000 14.000 C 17.000 14.552 16.552 15.000 16.000 15.000 C 15.448 15.000 15.000 14.552 15.000 14.000 L 15.000 12.000 C 15.000 11.448 15.448 11.000 16.000 11.000 Z"),
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
        return _bilibiliLine!!
    }

private var _bilibiliLine: ImageVector? = null
