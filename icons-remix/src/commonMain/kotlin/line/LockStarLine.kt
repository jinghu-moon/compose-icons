package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.LockStarLine: ImageVector
    get() {
        if (_lockStarLine != null) return _lockStarLine!!
        _lockStarLine = remixIcon(
            name = "LockStarLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 6.000 7.000 C 6.000 3.686 8.686 1.000 12.000 1.000 C 15.314 1.000 18.000 3.686 18.000 7.000 L 18.000 8.000 L 19.500 8.000 C 20.328 8.000 21.000 8.672 21.000 9.500 L 21.000 13.000 L 19.000 13.000 L 19.000 10.000 L 5.000 10.000 L 5.000 20.000 L 13.000 20.000 L 13.000 22.000 L 4.500 22.000 C 3.672 22.000 3.000 21.328 3.000 20.500 L 3.000 9.500 C 3.000 8.672 3.672 8.000 4.500 8.000 L 6.000 8.000 L 6.000 7.000 ZM 16.000 7.000 C 16.000 4.791 14.209 3.000 12.000 3.000 C 9.791 3.000 8.000 4.791 8.000 7.000 L 8.000 8.000 L 16.000 8.000 L 16.000 7.000 ZM 20.640 20.195 L 21.145 23.141 L 18.500 21.750 L 15.855 23.141 L 16.360 20.195 L 14.220 18.109 L 17.177 17.680 L 18.500 15.000 L 19.823 17.680 L 22.780 18.109 L 20.640 20.195 Z"),
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
        return _lockStarLine!!
    }

private var _lockStarLine: ImageVector? = null
