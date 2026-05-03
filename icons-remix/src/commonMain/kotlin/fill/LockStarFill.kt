package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.LockStarFill: ImageVector
    get() {
        if (_lockStarFill != null) return _lockStarFill!!
        _lockStarFill = remixIcon(
            name = "LockStarFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 1.000 C 8.686 1.000 6.000 3.686 6.000 7.000 L 6.000 8.000 L 4.000 8.000 C 3.448 8.000 3.000 8.448 3.000 9.000 L 3.000 21.000 C 3.000 21.552 3.448 22.000 4.000 22.000 L 13.044 22.000 C 12.695 21.239 12.500 20.392 12.500 19.500 C 12.500 16.186 15.186 13.500 18.500 13.500 C 19.392 13.500 20.239 13.695 21.000 14.044 L 21.000 9.000 C 21.000 8.448 20.552 8.000 20.000 8.000 L 18.000 8.000 L 18.000 7.000 C 18.000 3.686 15.314 1.000 12.000 1.000 ZM 16.000 8.000 L 8.000 8.000 L 8.000 7.000 C 8.000 4.791 9.791 3.000 12.000 3.000 C 14.209 3.000 16.000 4.791 16.000 7.000 L 16.000 8.000 ZM 21.145 23.141 L 20.640 20.195 L 22.780 18.109 L 19.823 17.680 L 18.500 15.000 L 17.177 17.680 L 14.220 18.109 L 16.360 20.195 L 15.855 23.141 L 18.500 21.750 L 21.145 23.141 Z"),
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
        return _lockStarFill!!
    }

private var _lockStarFill: ImageVector? = null
