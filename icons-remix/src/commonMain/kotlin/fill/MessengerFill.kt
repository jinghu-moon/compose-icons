package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MessengerFill: ImageVector
    get() {
        if (_messengerFill != null) return _messengerFill!!
        _messengerFill = remixIcon(
            name = "MessengerFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.001 2.000 C 17.635 2.000 22.001 6.127 22.001 11.700 C 22.001 17.274 17.635 21.400 12.001 21.400 C 11.023 21.402 10.050 21.273 9.106 21.015 C 8.929 20.967 8.740 20.981 8.572 21.055 L 6.587 21.931 C 6.344 22.039 6.063 22.018 5.838 21.876 C 5.612 21.734 5.473 21.490 5.464 21.223 L 5.410 19.444 C 5.403 19.226 5.305 19.020 5.141 18.875 C 3.196 17.135 2.001 14.616 2.001 11.700 C 2.001 6.127 6.367 2.000 12.001 2.000 ZM 5.996 14.536 C 5.714 14.984 6.264 15.488 6.685 15.168 L 9.840 12.774 C 10.054 12.612 10.349 12.612 10.563 12.774 L 12.899 14.524 C 13.235 14.775 13.660 14.875 14.072 14.799 C 14.484 14.723 14.845 14.478 15.068 14.123 L 18.006 9.464 C 18.288 9.016 17.738 8.512 17.317 8.832 L 14.161 11.226 C 13.948 11.388 13.653 11.388 13.439 11.226 L 11.102 9.476 C 10.767 9.225 10.342 9.125 9.930 9.201 C 9.518 9.277 9.157 9.522 8.933 9.877 L 5.996 14.536 Z"),
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
        return _messengerFill!!
    }

private var _messengerFill: ImageVector? = null
