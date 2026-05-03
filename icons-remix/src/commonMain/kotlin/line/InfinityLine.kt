package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.InfinityLine: ImageVector
    get() {
        if (_infinityLine != null) return _infinityLine!!
        _infinityLine = remixIcon(
            name = "InfinityLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.000 12.000 C 3.000 10.067 4.567 8.500 6.500 8.500 C 7.703 8.500 8.520 8.934 9.199 9.613 C 9.925 10.340 10.485 11.332 11.126 12.486 L 11.160 12.546 C 11.760 13.628 12.443 14.857 13.387 15.801 C 14.395 16.809 15.703 17.500 17.500 17.500 C 20.538 17.500 23.000 15.038 23.000 12.000 C 23.000 8.962 20.538 6.500 17.500 6.500 C 15.839 6.500 14.351 7.236 13.342 8.399 C 13.789 9.054 14.157 9.706 14.464 10.257 C 15.068 9.207 16.201 8.500 17.500 8.500 C 19.433 8.500 21.000 10.067 21.000 12.000 C 21.000 13.933 19.433 15.500 17.500 15.500 C 16.296 15.500 15.480 15.066 14.801 14.387 C 14.075 13.660 13.515 12.668 12.874 11.514 L 12.840 11.454 C 12.240 10.372 11.557 9.143 10.613 8.199 C 9.605 7.191 8.297 6.500 6.500 6.500 C 3.462 6.500 1.000 8.962 1.000 12.000 C 1.000 15.038 3.462 17.500 6.500 17.500 C 8.161 17.500 9.649 16.764 10.658 15.601 C 10.211 14.946 9.843 14.294 9.536 13.743 C 8.932 14.793 7.799 15.500 6.500 15.500 C 4.567 15.500 3.000 13.933 3.000 12.000 Z"),
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
        return _infinityLine!!
    }

private var _infinityLine: ImageVector? = null
