package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.RadarFill: ImageVector
    get() {
        if (_radarFill != null) return _radarFill!!
        _radarFill = remixIcon(
            name = "RadarFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.368 4.398 L 10.884 10.433 L 12.616 11.433 L 16.101 5.398 C 20.270 8.170 22.406 12.477 20.660 15.500 C 18.800 18.722 13.472 18.855 8.750 16.129 C 4.029 13.403 1.480 8.722 3.340 5.500 C 5.085 2.477 9.883 2.173 14.368 4.398 ZM 15.884 1.773 L 17.616 2.773 L 16.116 5.371 L 14.384 4.371 L 15.884 1.773 ZM 6.732 20.000 L 17.000 20.000 L 17.000 22.000 L 5.018 22.000 C 4.940 22.001 4.862 21.994 4.785 21.977 C 4.770 21.973 4.756 21.970 4.741 21.966 C 4.659 21.944 4.578 21.911 4.500 21.866 C 4.471 21.849 4.443 21.831 4.416 21.812 C 4.302 21.729 4.205 21.623 4.134 21.500 C 4.063 21.377 4.019 21.240 4.005 21.100 C 4.004 21.092 4.004 21.085 4.003 21.078 C 3.988 20.883 4.029 20.682 4.134 20.500 L 6.384 16.603 L 8.116 17.603 L 6.732 20.000 Z"),
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
        return _radarFill!!
    }

private var _radarFill: ImageVector? = null
