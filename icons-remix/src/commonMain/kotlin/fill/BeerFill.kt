package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BeerFill: ImageVector
    get() {
        if (_beerFill != null) return _beerFill!!
        _beerFill = remixIcon(
            name = "BeerFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.000 3.000 C 10.105 3.000 11.000 3.895 11.000 5.000 C 11.000 5.115 10.990 5.226 10.972 5.335 L 12.945 5.665 C 12.981 5.448 13.000 5.226 13.000 5.000 C 13.000 4.762 12.979 4.530 12.940 4.304 C 13.247 4.111 13.610 4.000 14.000 4.000 C 15.105 4.000 16.000 4.895 16.000 6.000 C 16.000 6.364 15.903 6.706 15.733 7.000 L 5.000 7.000 C 4.448 7.000 4.000 6.552 4.000 6.000 C 4.000 5.448 4.448 5.000 5.000 5.000 C 5.200 5.000 5.384 5.058 5.539 5.157 C 5.812 5.332 6.154 5.364 6.455 5.242 C 6.756 5.120 6.978 4.859 7.052 4.543 C 7.259 3.658 8.054 3.000 9.000 3.000 ZM 10.516 1.297 C 10.049 1.106 9.537 1.000 9.000 1.000 C 7.501 1.000 6.196 1.824 5.511 3.043 C 5.345 3.015 5.174 3.000 5.000 3.000 C 3.343 3.000 2.000 4.343 2.000 6.000 C 2.000 6.889 2.386 7.687 3.000 8.236 L 3.000 20.000 C 3.000 21.105 3.895 22.000 5.000 22.000 L 15.000 22.000 C 16.105 22.000 17.000 21.105 17.000 20.000 L 19.000 20.000 C 20.105 20.000 21.000 19.105 21.000 18.000 L 21.000 11.000 C 21.000 9.895 20.105 9.000 19.000 9.000 L 17.000 9.000 L 17.000 8.646 C 17.622 7.941 18.000 7.014 18.000 6.000 C 18.000 3.791 16.209 2.000 14.000 2.000 C 13.314 2.000 12.668 2.173 12.104 2.477 C 11.685 1.962 11.140 1.553 10.516 1.297 ZM 17.000 18.000 L 17.000 11.000 L 19.000 11.000 L 19.000 18.000 L 17.000 18.000 ZM 7.000 11.000 L 9.000 11.000 L 9.000 18.000 L 7.000 18.000 L 7.000 11.000 ZM 11.000 11.000 L 13.000 11.000 L 13.000 18.000 L 11.000 18.000 L 11.000 11.000 Z"),
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
        return _beerFill!!
    }

private var _beerFill: ImageVector? = null
