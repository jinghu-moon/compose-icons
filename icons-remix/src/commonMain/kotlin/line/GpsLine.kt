package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.GpsLine: ImageVector
    get() {
        if (_gpsLine != null) return _gpsLine!!
        _gpsLine = remixIcon(
            name = "GpsLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.132 20.737 C 4.070 19.028 2.000 15.755 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 15.755 19.930 19.028 16.868 20.737 L 15.972 18.946 C 18.379 17.566 20.000 14.972 20.000 12.000 C 20.000 7.582 16.418 4.000 12.000 4.000 C 7.582 4.000 4.000 7.582 4.000 12.000 C 4.000 14.972 5.621 17.566 8.028 18.946 L 7.132 20.737 ZM 8.924 17.153 C 7.173 16.105 6.000 14.189 6.000 12.000 C 6.000 8.686 8.686 6.000 12.000 6.000 C 15.314 6.000 18.000 8.686 18.000 12.000 C 18.000 14.189 16.827 16.105 15.076 17.153 L 14.177 15.356 C 15.274 14.643 16.000 13.406 16.000 12.000 C 16.000 9.791 14.209 8.000 12.000 8.000 C 9.791 8.000 8.000 9.791 8.000 12.000 C 8.000 13.406 8.726 14.643 9.823 15.356 L 8.924 17.153 ZM 12.000 16.000 L 15.000 22.000 L 9.000 22.000 L 12.000 16.000 Z"),
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
        return _gpsLine!!
    }

private var _gpsLine: ImageVector? = null
