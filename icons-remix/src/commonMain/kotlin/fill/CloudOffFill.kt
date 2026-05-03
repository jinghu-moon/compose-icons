package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CloudOffFill: ImageVector
    get() {
        if (_cloudOffFill != null) return _cloudOffFill!!
        _cloudOffFill = remixIcon(
            name = "CloudOffFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.515 2.101 L 22.607 21.192 L 21.192 22.607 L 19.178 20.592 C 18.503 20.856 17.768 21.000 17.000 21.000 L 7.000 21.000 C 3.686 21.000 1.000 18.314 1.000 15.000 C 1.000 12.385 2.673 10.160 5.008 9.339 C 5.003 9.226 5.000 9.114 5.000 9.000 C 5.000 8.222 5.127 7.474 5.361 6.775 L 2.101 3.515 L 3.515 2.101 ZM 17.000 9.000 C 17.698 9.000 18.369 9.119 18.992 9.339 C 21.326 10.160 23.000 12.385 23.000 15.000 C 23.000 16.088 22.710 17.109 22.204 17.989 L 14.011 9.796 C 14.891 9.290 15.912 9.000 17.000 9.000 ZM 12.000 2.000 C 15.242 2.000 17.969 4.204 18.765 7.195 C 18.197 7.068 17.607 7.000 17.000 7.000 C 15.357 7.000 13.830 7.495 12.559 8.345 L 7.694 3.481 C 8.882 2.553 10.376 2.000 12.000 2.000 Z"),
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
        return _cloudOffFill!!
    }

private var _cloudOffFill: ImageVector? = null
