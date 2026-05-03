package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.WifiOffLine: ImageVector
    get() {
        if (_wifiOffLine != null) return _wifiOffLine!!
        _wifiOffLine = remixIcon(
            name = "WifiOffLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 18.000 C 12.714 18.000 13.370 18.250 13.886 18.667 L 12.000 21.000 L 10.115 18.667 C 10.630 18.250 11.286 18.000 12.000 18.000 ZM 2.808 1.393 L 20.485 19.071 L 19.071 20.485 L 13.891 15.304 C 13.297 15.107 12.661 15.000 12.000 15.000 C 10.572 15.000 9.260 15.499 8.230 16.332 L 6.974 14.776 C 8.250 13.744 9.849 13.097 11.596 13.010 L 9.000 10.414 C 7.553 10.823 6.227 11.522 5.088 12.443 L 3.831 10.887 C 4.899 10.023 6.108 9.324 7.416 8.831 L 5.132 6.545 C 3.989 7.089 2.921 7.765 1.947 8.552 L 0.689 6.997 C 1.604 6.257 2.592 5.606 3.641 5.055 L 1.393 2.808 L 2.808 1.393 ZM 14.500 10.285 L 12.217 8.002 L 12.000 8.000 C 15.095 8.000 17.937 9.081 20.169 10.887 L 18.912 12.443 C 17.644 11.417 16.143 10.667 14.500 10.285 ZM 12.000 3.000 C 16.285 3.000 20.220 4.497 23.311 6.997 L 22.053 8.552 C 19.306 6.331 15.809 5.000 12.000 5.000 C 11.122 5.000 10.260 5.071 9.421 5.207 L 7.725 3.511 C 9.095 3.177 10.527 3.000 12.000 3.000 Z"),
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
        return _wifiOffLine!!
    }

private var _wifiOffLine: ImageVector? = null
