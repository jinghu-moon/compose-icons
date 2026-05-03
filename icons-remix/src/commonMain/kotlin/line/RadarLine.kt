package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.RadarLine: ImageVector
    get() {
        if (_radarLine != null) return _radarLine!!
        _radarLine = remixIcon(
            name = "RadarLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.507 3.623 L 11.483 5.395 C 8.574 4.516 5.970 4.945 5.072 6.500 C 3.895 8.539 5.862 12.152 9.750 14.397 C 13.638 16.642 17.751 16.539 18.928 14.500 C 19.826 12.945 18.896 10.476 16.680 8.395 L 17.703 6.623 C 20.785 9.332 22.165 12.893 20.660 15.500 C 18.800 18.722 13.472 18.855 8.750 16.129 C 4.029 13.403 1.480 8.722 3.340 5.500 C 4.845 2.893 8.620 2.308 12.507 3.623 ZM 15.884 1.773 L 17.616 2.773 L 12.616 11.433 L 10.884 10.433 L 15.884 1.773 ZM 6.732 20.000 L 17.000 20.000 L 17.000 22.000 L 5.018 22.000 C 4.940 22.001 4.862 21.994 4.785 21.977 C 4.770 21.973 4.756 21.970 4.741 21.966 C 4.659 21.944 4.578 21.911 4.500 21.866 C 4.471 21.849 4.443 21.831 4.416 21.812 C 4.302 21.729 4.205 21.623 4.134 21.500 C 4.063 21.377 4.019 21.240 4.005 21.100 C 4.004 21.092 4.004 21.085 4.003 21.078 C 3.988 20.883 4.029 20.682 4.134 20.500 L 6.384 16.603 L 8.116 17.603 L 6.732 20.000 Z"),
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
        return _radarLine!!
    }

private var _radarLine: ImageVector? = null
