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
                pathData = parseSvgPathData("M7.132 20.737C4.07 19.028 2 15.755 2 12 2 6.477 6.477 2 12 2c5.523 0 10 4.477 10 10 0 3.755-2.07 7.028-5.132 8.737l-.896-1.791C18.379 17.566 20 14.972 20 12 20 7.582 16.418 4 12 4 7.582 4 4 7.582 4 12c0 2.972 1.621 5.566 4.028 6.946l-.896 1.791ZM8.924 17.153C7.173 16.105 6 14.189 6 12 6 8.686 8.686 6 12 6c3.314 0 6 2.686 6 6 0 2.189-1.173 4.105-2.924 5.153l-.898-1.797C15.274 14.643 16 13.406 16 12 16 9.791 14.209 8 12 8 9.791 8 8 9.791 8 12c0 1.406 .726 2.643 1.823 3.356l-.899 1.797ZM12 16l3 6h-6l3-6Z"),
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
