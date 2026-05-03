package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.TakeawayLine: ImageVector
    get() {
        if (_takeawayLine != null) return _takeawayLine!!
        _takeawayLine = remixIcon(
            name = "TakeawayLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 16.000 1.000 C 16.552 1.000 17.000 1.448 17.000 2.000 L 17.000 2.999 L 22.000 3.000 L 22.000 9.000 L 19.980 8.999 L 22.747 16.595 C 22.910 17.032 23.000 17.505 23.000 17.999 C 23.000 20.208 21.209 21.999 19.000 21.999 C 17.137 21.999 15.571 20.725 15.127 19.001 L 10.874 19.001 C 10.429 20.726 8.864 22.000 7.000 22.000 C 5.055 22.000 3.434 20.612 3.075 18.772 C 2.436 18.439 2.000 17.770 2.000 17.000 L 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 L 10.000 3.000 C 10.552 3.000 11.000 3.448 11.000 4.000 L 11.000 12.000 C 11.000 12.513 11.386 12.936 11.883 12.993 L 12.000 13.000 L 14.000 13.000 C 14.513 13.000 14.936 12.614 14.993 12.117 L 15.000 12.000 L 15.000 3.000 L 12.000 3.000 L 12.000 1.000 L 16.000 1.000 ZM 7.000 16.000 C 5.895 16.000 5.000 16.895 5.000 18.000 C 5.000 19.105 5.895 20.000 7.000 20.000 C 8.105 20.000 9.000 19.105 9.000 18.000 C 9.000 16.895 8.105 16.000 7.000 16.000 ZM 19.000 15.999 C 17.895 15.999 17.000 16.894 17.000 17.999 C 17.000 19.104 17.895 19.999 19.000 19.999 C 20.105 19.999 21.000 19.104 21.000 17.999 C 21.000 16.894 20.105 15.999 19.000 15.999 ZM 17.852 8.999 L 17.000 8.999 L 17.000 12.000 C 17.000 13.657 15.657 15.000 14.000 15.000 L 12.000 15.000 C 10.694 15.000 9.583 14.166 9.171 13.001 L 4.000 13.000 L 4.000 15.354 C 4.733 14.524 5.805 14.000 7.000 14.000 C 8.864 14.000 10.430 15.275 10.874 17.000 L 15.126 17.000 C 15.569 15.274 17.136 13.999 19.000 13.999 C 19.237 13.999 19.470 14.020 19.696 14.059 L 17.852 8.999 ZM 9.000 8.000 L 4.000 8.000 L 4.000 11.000 L 9.000 11.000 L 9.000 8.000 ZM 20.000 5.000 L 17.000 5.000 L 17.000 7.000 L 20.000 7.000 L 20.000 5.000 ZM 9.000 5.000 L 4.000 5.000 L 4.000 6.000 L 9.000 6.000 L 9.000 5.000 Z"),
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
        return _takeawayLine!!
    }

private var _takeawayLine: ImageVector? = null
