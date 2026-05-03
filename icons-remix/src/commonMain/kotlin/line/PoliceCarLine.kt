package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PoliceCarLine: ImageVector
    get() {
        if (_policeCarLine != null) return _policeCarLine!!
        _policeCarLine = remixIcon(
            name = "PoliceCarLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 13.000 L 4.000 18.000 L 20.000 18.000 L 20.000 13.000 L 4.000 13.000 ZM 5.618 11.000 L 18.382 11.000 C 18.537 11.000 18.690 10.964 18.829 10.894 C 19.323 10.647 19.523 10.047 19.276 9.553 L 18.000 7.000 L 6.000 7.000 L 4.724 9.553 C 4.654 9.692 4.618 9.845 4.618 10.000 C 4.618 10.552 5.066 11.000 5.618 11.000 ZM 22.000 13.500 L 22.000 21.000 C 22.000 21.552 21.552 22.000 21.000 22.000 L 20.000 22.000 C 19.448 22.000 19.000 21.552 19.000 21.000 L 19.000 20.000 L 5.000 20.000 L 5.000 21.000 C 5.000 21.552 4.552 22.000 4.000 22.000 L 3.000 22.000 C 2.448 22.000 2.000 21.552 2.000 21.000 L 2.000 13.500 L 0.757 13.189 C 0.312 13.078 0.000 12.678 0.000 12.219 L 0.000 11.500 C 0.000 11.224 0.224 11.000 0.500 11.000 L 2.000 11.000 L 4.447 6.106 C 4.786 5.428 5.479 5.000 6.236 5.000 L 8.000 5.000 L 8.000 3.000 L 11.000 3.000 L 11.000 5.000 L 13.000 5.000 L 13.000 3.000 L 16.000 3.000 L 16.000 5.000 L 17.764 5.000 C 18.521 5.000 19.214 5.428 19.553 6.106 L 22.000 11.000 L 23.500 11.000 C 23.776 11.000 24.000 11.224 24.000 11.500 L 24.000 12.219 C 24.000 12.678 23.688 13.078 23.243 13.189 L 22.000 13.500 ZM 5.000 14.000 C 7.317 14.000 8.879 14.755 9.686 16.264 L 9.686 16.264 C 9.816 16.508 9.724 16.811 9.481 16.941 C 9.408 16.980 9.327 17.000 9.245 17.000 L 6.000 17.000 C 5.448 17.000 5.000 16.552 5.000 16.000 L 5.000 14.000 ZM 19.000 14.000 L 19.000 16.000 C 19.000 16.552 18.552 17.000 18.000 17.000 L 14.755 17.000 C 14.673 17.000 14.592 16.980 14.519 16.941 C 14.276 16.811 14.184 16.508 14.314 16.264 L 14.314 16.264 C 15.121 14.755 16.683 14.000 19.000 14.000 Z"),
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
        return _policeCarLine!!
    }

private var _policeCarLine: ImageVector? = null
