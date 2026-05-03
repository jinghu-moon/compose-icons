package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.TeamLine: ImageVector
    get() {
        if (_teamLine != null) return _teamLine!!
        _teamLine = remixIcon(
            name = "TeamLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 11.000 C 14.761 11.000 17.000 13.239 17.000 16.000 L 17.000 22.000 L 15.000 22.000 L 15.000 16.000 C 15.000 14.402 13.751 13.096 12.176 13.005 L 12.000 13.000 C 10.402 13.000 9.096 14.249 9.005 15.824 L 9.000 16.000 L 9.000 22.000 L 7.000 22.000 L 7.000 16.000 C 7.000 13.239 9.239 11.000 12.000 11.000 ZM 5.500 14.000 C 5.779 14.000 6.050 14.033 6.310 14.094 C 6.142 14.594 6.039 15.122 6.009 15.669 L 6.000 16.000 L 6.001 16.086 C 5.888 16.046 5.768 16.019 5.644 16.007 L 5.500 16.000 C 4.720 16.000 4.080 16.595 4.007 17.355 L 4.000 17.500 L 4.000 22.000 L 2.000 22.000 L 2.000 17.500 C 2.000 15.567 3.567 14.000 5.500 14.000 ZM 18.500 14.000 C 20.433 14.000 22.000 15.567 22.000 17.500 L 22.000 22.000 L 20.000 22.000 L 20.000 17.500 C 20.000 16.720 19.405 16.080 18.645 16.007 L 18.500 16.000 C 18.325 16.000 18.157 16.030 18.000 16.085 L 18.000 16.000 C 18.000 15.334 17.892 14.694 17.691 14.096 C 17.950 14.033 18.221 14.000 18.500 14.000 ZM 5.500 8.000 C 6.881 8.000 8.000 9.119 8.000 10.500 C 8.000 11.881 6.881 13.000 5.500 13.000 C 4.119 13.000 3.000 11.881 3.000 10.500 C 3.000 9.119 4.119 8.000 5.500 8.000 ZM 18.500 8.000 C 19.881 8.000 21.000 9.119 21.000 10.500 C 21.000 11.881 19.881 13.000 18.500 13.000 C 17.119 13.000 16.000 11.881 16.000 10.500 C 16.000 9.119 17.119 8.000 18.500 8.000 ZM 5.500 10.000 C 5.224 10.000 5.000 10.224 5.000 10.500 C 5.000 10.776 5.224 11.000 5.500 11.000 C 5.776 11.000 6.000 10.776 6.000 10.500 C 6.000 10.224 5.776 10.000 5.500 10.000 ZM 18.500 10.000 C 18.224 10.000 18.000 10.224 18.000 10.500 C 18.000 10.776 18.224 11.000 18.500 11.000 C 18.776 11.000 19.000 10.776 19.000 10.500 C 19.000 10.224 18.776 10.000 18.500 10.000 ZM 12.000 2.000 C 14.209 2.000 16.000 3.791 16.000 6.000 C 16.000 8.209 14.209 10.000 12.000 10.000 C 9.791 10.000 8.000 8.209 8.000 6.000 C 8.000 3.791 9.791 2.000 12.000 2.000 ZM 12.000 4.000 C 10.895 4.000 10.000 4.895 10.000 6.000 C 10.000 7.105 10.895 8.000 12.000 8.000 C 13.105 8.000 14.000 7.105 14.000 6.000 C 14.000 4.895 13.105 4.000 12.000 4.000 Z"),
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
        return _teamLine!!
    }

private var _teamLine: ImageVector? = null
