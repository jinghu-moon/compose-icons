package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PoliceCarFill: ImageVector
    get() {
        if (_policeCarFill != null) return _policeCarFill!!
        _policeCarFill = remixIcon(
            name = "PoliceCarFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 22.000 13.500 L 22.000 21.000 C 22.000 21.552 21.552 22.000 21.000 22.000 L 20.000 22.000 C 19.448 22.000 19.000 21.552 19.000 21.000 L 19.000 20.000 L 5.000 20.000 L 5.000 21.000 C 5.000 21.552 4.552 22.000 4.000 22.000 L 3.000 22.000 C 2.448 22.000 2.000 21.552 2.000 21.000 L 2.000 13.500 L 0.757 13.189 C 0.312 13.078 0.000 12.678 0.000 12.219 L 0.000 11.500 C 0.000 11.224 0.224 11.000 0.500 11.000 L 2.429 11.000 L 4.481 6.212 C 4.796 5.477 5.519 5.000 6.319 5.000 L 8.000 5.000 L 8.000 3.000 L 11.000 3.000 L 11.000 5.000 L 13.000 5.000 L 13.000 3.000 L 16.000 3.000 L 16.000 5.000 L 17.681 5.000 C 18.481 5.000 19.204 5.477 19.520 6.212 L 21.571 11.000 L 23.500 11.000 C 23.776 11.000 24.000 11.224 24.000 11.500 L 24.000 12.219 C 24.000 12.678 23.688 13.078 23.243 13.189 L 22.000 13.500 ZM 4.000 15.000 L 4.000 17.000 C 4.000 17.552 4.448 18.000 5.000 18.000 L 8.245 18.000 C 8.327 18.000 8.408 17.980 8.481 17.941 C 8.724 17.811 8.816 17.508 8.686 17.264 L 8.686 17.264 C 7.879 15.755 6.317 15.000 4.000 15.000 ZM 20.000 15.000 C 17.683 15.000 16.121 15.755 15.314 17.264 L 15.314 17.264 C 15.184 17.508 15.276 17.811 15.519 17.941 C 15.592 17.980 15.673 18.000 15.755 18.000 L 19.000 18.000 C 19.552 18.000 20.000 17.552 20.000 17.000 L 20.000 15.000 ZM 6.000 7.000 L 4.549 10.629 C 4.501 10.747 4.477 10.873 4.477 11.000 C 4.477 11.552 4.925 12.000 5.477 12.000 L 18.523 12.000 C 18.650 12.000 18.776 11.976 18.894 11.929 C 19.407 11.723 19.657 11.141 19.451 10.629 L 18.000 7.000 L 6.000 7.000 Z"),
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
        return _policeCarFill!!
    }

private var _policeCarFill: ImageVector? = null
