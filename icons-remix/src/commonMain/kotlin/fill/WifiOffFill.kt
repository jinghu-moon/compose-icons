package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.WifiOffFill: ImageVector
    get() {
        if (_wifiOffFill != null) return _wifiOffFill!!
        _wifiOffFill = remixIcon(
            name = "WifiOffFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 18.000 C 12.714 18.000 13.370 18.250 13.886 18.666 L 12.000 21.000 L 10.115 18.666 C 10.630 18.250 11.286 18.000 12.000 18.000 ZM 2.808 1.393 L 20.485 19.071 L 19.071 20.485 L 15.389 16.804 L 15.142 17.111 C 14.284 16.416 13.191 16.000 12.000 16.000 C 10.810 16.000 9.717 16.416 8.859 17.110 L 6.974 14.776 C 8.250 13.744 9.849 13.097 11.596 13.010 L 9.823 11.238 C 8.293 11.577 6.894 12.268 5.717 13.220 L 3.831 10.887 C 4.899 10.023 6.108 9.324 7.416 8.831 L 5.885 7.299 C 4.691 7.833 3.579 8.518 2.575 9.330 L 0.689 6.997 C 1.604 6.257 2.592 5.606 3.641 5.055 L 1.393 2.808 L 2.808 1.393 ZM 16.084 11.869 L 12.217 8.002 L 12.000 8.000 C 15.095 8.000 17.937 9.081 20.169 10.887 L 18.284 13.220 C 17.616 12.681 16.878 12.225 16.084 11.869 ZM 12.000 3.000 C 16.285 3.000 20.220 4.497 23.311 6.997 L 21.425 9.330 C 18.850 7.247 15.571 6.000 12.000 6.000 C 11.428 6.000 10.864 6.032 10.309 6.094 L 7.725 3.511 C 9.095 3.177 10.527 3.000 12.000 3.000 Z"),
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
        return _wifiOffFill!!
    }

private var _wifiOffFill: ImageVector? = null
