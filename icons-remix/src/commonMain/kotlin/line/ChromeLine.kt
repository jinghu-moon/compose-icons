package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ChromeLine: ImageVector
    get() {
        if (_chromeLine != null) return _chromeLine!!
        _chromeLine = remixIcon(
            name = "ChromeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.365 19.833 L 12.294 16.490 C 12.197 16.497 12.099 16.500 12.000 16.500 C 10.304 16.500 8.827 15.561 8.060 14.175 L 4.795 8.520 C 4.285 9.572 4.000 10.753 4.000 12.000 C 4.000 15.858 6.731 19.078 10.365 19.833 ZM 12.590 19.979 C 16.733 19.677 20.000 16.220 20.000 12.000 C 20.000 11.127 19.860 10.286 19.602 9.500 L 15.742 9.500 C 16.221 10.215 16.500 11.075 16.500 12.000 C 16.500 12.848 16.266 13.641 15.858 14.318 L 12.590 19.979 ZM 14.143 13.288 L 14.165 13.250 C 14.378 12.882 14.500 12.455 14.500 12.000 C 14.500 10.619 13.381 9.500 12.000 9.500 C 10.619 9.500 9.500 10.619 9.500 12.000 C 9.500 12.438 9.613 12.850 9.811 13.208 L 9.835 13.250 C 10.267 13.997 11.075 14.500 12.000 14.500 C 12.910 14.500 13.706 14.014 14.143 13.288 ZM 6.035 6.669 L 7.964 10.009 C 8.698 8.522 10.230 7.500 12.000 7.500 L 18.615 7.500 C 17.175 5.387 14.750 4.000 12.000 4.000 C 9.630 4.000 7.500 5.031 6.035 6.669 ZM 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 Z"),
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
        return _chromeLine!!
    }

private var _chromeLine: ImageVector? = null
