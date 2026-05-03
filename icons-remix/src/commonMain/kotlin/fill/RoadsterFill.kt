package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.RoadsterFill: ImageVector
    get() {
        if (_roadsterFill != null) return _roadsterFill!!
        _roadsterFill = remixIcon(
            name = "RoadsterFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 22.000 13.500 L 22.000 21.000 C 22.000 21.552 21.552 22.000 21.000 22.000 L 20.000 22.000 C 19.448 22.000 19.000 21.552 19.000 21.000 L 19.000 20.000 L 5.000 20.000 L 5.000 21.000 C 5.000 21.552 4.552 22.000 4.000 22.000 L 3.000 22.000 C 2.448 22.000 2.000 21.552 2.000 21.000 L 2.000 13.500 L 0.757 13.189 C 0.312 13.078 0.000 12.678 0.000 12.219 L 0.000 11.500 C 0.000 11.224 0.224 11.000 0.500 11.000 L 2.375 11.000 L 4.513 5.298 C 4.806 4.517 5.552 4.000 6.386 4.000 L 17.614 4.000 C 18.448 4.000 19.194 4.517 19.487 5.298 L 21.625 11.000 L 23.500 11.000 C 23.776 11.000 24.000 11.224 24.000 11.500 L 24.000 12.219 C 24.000 12.678 23.688 13.078 23.243 13.189 L 22.000 13.500 ZM 4.000 15.000 L 4.000 17.000 C 4.000 17.552 4.448 18.000 5.000 18.000 L 8.245 18.000 C 8.327 18.000 8.408 17.980 8.481 17.941 C 8.724 17.811 8.816 17.508 8.686 17.264 L 8.686 17.264 C 7.879 15.755 6.317 15.000 4.000 15.000 ZM 20.000 15.000 C 17.683 15.000 16.121 15.755 15.314 17.264 L 15.314 17.264 C 15.184 17.508 15.276 17.811 15.519 17.941 C 15.592 17.980 15.673 18.000 15.755 18.000 L 19.000 18.000 C 19.552 18.000 20.000 17.552 20.000 17.000 L 20.000 15.000 ZM 6.000 6.000 L 4.439 10.684 C 4.405 10.786 4.387 10.892 4.387 11.000 C 4.387 11.552 4.835 12.000 5.387 12.000 L 18.613 12.000 C 18.720 12.000 18.827 11.983 18.929 11.949 C 19.453 11.774 19.736 11.208 19.561 10.684 L 18.000 6.000 L 6.000 6.000 Z"),
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
        return _roadsterFill!!
    }

private var _roadsterFill: ImageVector? = null
