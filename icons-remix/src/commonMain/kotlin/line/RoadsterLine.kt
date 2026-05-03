package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.RoadsterLine: ImageVector
    get() {
        if (_roadsterLine != null) return _roadsterLine!!
        _roadsterLine = remixIcon(
            name = "RoadsterLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.000 20.000 L 5.000 20.000 L 5.000 21.000 C 5.000 21.552 4.552 22.000 4.000 22.000 L 3.000 22.000 C 2.448 22.000 2.000 21.552 2.000 21.000 L 2.000 13.500 L 0.757 13.189 C 0.312 13.078 0.000 12.678 0.000 12.219 L 0.000 11.500 C 0.000 11.224 0.224 11.000 0.500 11.000 L 2.000 11.000 L 4.481 5.212 C 4.796 4.477 5.519 4.000 6.319 4.000 L 17.681 4.000 C 18.481 4.000 19.204 4.477 19.520 5.212 L 22.000 11.000 L 23.500 11.000 C 23.776 11.000 24.000 11.224 24.000 11.500 L 24.000 12.219 C 24.000 12.678 23.688 13.078 23.243 13.189 L 22.000 13.500 L 22.000 21.000 C 22.000 21.552 21.552 22.000 21.000 22.000 L 20.000 22.000 C 19.448 22.000 19.000 21.552 19.000 21.000 L 19.000 20.000 ZM 20.000 18.000 L 20.000 13.000 L 4.000 13.000 L 4.000 18.000 L 20.000 18.000 ZM 5.477 11.000 L 18.523 11.000 C 18.650 11.000 18.776 10.976 18.894 10.929 C 19.407 10.723 19.657 10.141 19.451 9.629 L 18.000 6.000 L 6.000 6.000 L 4.549 9.629 C 4.501 9.747 4.477 9.873 4.477 10.000 C 4.477 10.552 4.925 11.000 5.477 11.000 ZM 5.000 14.000 C 7.317 14.000 8.879 14.755 9.686 16.264 L 9.686 16.264 C 9.816 16.508 9.724 16.811 9.481 16.941 C 9.408 16.980 9.327 17.000 9.245 17.000 L 6.000 17.000 C 5.448 17.000 5.000 16.552 5.000 16.000 L 5.000 14.000 ZM 19.000 14.000 L 19.000 16.000 C 19.000 16.552 18.552 17.000 18.000 17.000 L 14.755 17.000 C 14.673 17.000 14.592 16.980 14.519 16.941 C 14.276 16.811 14.184 16.508 14.314 16.264 L 14.314 16.264 C 15.121 14.755 16.683 14.000 19.000 14.000 Z"),
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
        return _roadsterLine!!
    }

private var _roadsterLine: ImageVector? = null
