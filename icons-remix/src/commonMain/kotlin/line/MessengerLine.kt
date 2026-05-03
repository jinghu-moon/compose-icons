package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MessengerLine: ImageVector
    get() {
        if (_messengerLine != null) return _messengerLine!!
        _messengerLine = remixIcon(
            name = "MessengerLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.765 19.225 C 8.354 18.965 9.015 18.916 9.633 19.086 C 10.403 19.296 11.198 19.402 12.001 19.400 C 16.586 19.400 20.001 16.114 20.001 11.700 C 20.001 7.287 16.586 4.000 12.001 4.000 C 7.416 4.000 4.001 7.287 4.001 11.700 C 4.001 13.970 4.897 15.972 6.467 17.376 C 7.042 17.885 7.383 18.608 7.409 19.382 L 7.765 19.225 ZM 12.001 2.000 C 17.635 2.000 22.001 6.127 22.001 11.700 C 22.001 17.274 17.635 21.400 12.001 21.400 C 11.023 21.402 10.050 21.273 9.106 21.015 C 8.929 20.967 8.740 20.981 8.572 21.055 L 6.587 21.931 C 6.344 22.039 6.063 22.018 5.838 21.876 C 5.612 21.734 5.473 21.490 5.464 21.223 L 5.410 19.444 C 5.403 19.226 5.305 19.020 5.141 18.875 C 3.196 17.135 2.001 14.616 2.001 11.700 C 2.001 6.127 6.367 2.000 12.001 2.000 ZM 5.996 14.536 L 8.933 9.877 C 9.157 9.522 9.518 9.277 9.930 9.201 C 10.342 9.125 10.767 9.225 11.102 9.476 L 13.439 11.226 C 13.653 11.388 13.948 11.388 14.161 11.226 L 17.317 8.832 C 17.738 8.512 18.288 9.016 18.006 9.464 L 15.068 14.123 C 14.845 14.478 14.484 14.723 14.072 14.799 C 13.660 14.875 13.235 14.775 12.899 14.524 L 10.563 12.774 C 10.349 12.612 10.054 12.612 9.840 12.774 L 6.685 15.168 C 6.264 15.488 5.714 14.984 5.996 14.536 Z"),
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
        return _messengerLine!!
    }

private var _messengerLine: ImageVector? = null
