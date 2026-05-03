package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.DiceFill: ImageVector
    get() {
        if (_diceFill != null) return _diceFill!!
        _diceFill = remixIcon(
            name = "DiceFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.998 1.580 C 11.618 1.221 12.382 1.221 13.002 1.580 L 20.502 5.922 C 21.120 6.280 21.500 6.939 21.500 7.653 L 21.500 16.347 C 21.500 17.061 21.120 17.720 20.502 18.078 L 13.002 22.420 C 12.382 22.779 11.618 22.779 10.998 22.420 L 3.498 18.078 C 2.880 17.720 2.500 17.061 2.500 16.347 L 2.500 7.653 C 2.500 6.939 2.880 6.280 3.498 5.922 L 10.998 1.580 ZM 5.251 8.092 C 4.917 7.899 4.500 8.140 4.500 8.525 L 4.500 15.194 C 4.500 15.908 4.880 16.567 5.498 16.925 L 11.250 20.254 C 11.583 20.448 12.000 20.207 12.000 19.822 L 12.000 13.153 C 12.000 12.439 11.620 11.780 11.002 11.422 L 5.251 8.092 ZM 15.768 5.517 C 15.290 5.241 14.514 5.241 14.036 5.517 C 13.558 5.793 13.558 6.241 14.036 6.517 C 14.514 6.793 15.290 6.793 15.768 6.517 C 16.246 6.241 16.246 5.793 15.768 5.517 ZM 9.968 5.517 C 9.490 5.241 8.714 5.241 8.236 5.517 C 7.758 5.793 7.758 6.241 8.236 6.517 C 8.714 6.793 9.490 6.793 9.968 6.517 C 10.447 6.241 10.447 5.793 9.968 5.517 ZM 16.993 15.845 C 17.590 15.500 18.075 14.660 18.075 13.970 C 18.075 13.280 17.590 13.000 16.993 13.345 C 16.395 13.690 15.910 14.530 15.910 15.220 C 15.910 15.911 16.395 16.190 16.993 15.845 ZM 6.366 12.200 C 6.844 12.476 7.232 12.253 7.232 11.700 C 7.232 11.148 6.844 10.476 6.366 10.200 C 5.888 9.924 5.500 10.148 5.500 10.700 C 5.500 11.253 5.888 11.924 6.366 12.200 ZM 10.695 17.698 C 10.695 18.250 10.307 18.474 9.829 18.198 C 9.351 17.922 8.963 17.250 8.963 16.698 C 8.963 16.146 9.351 15.922 9.829 16.198 C 10.307 16.474 10.695 17.146 10.695 17.698 ZM 7.232 15.699 C 7.232 16.252 6.844 16.476 6.366 16.199 C 5.888 15.923 5.500 15.252 5.500 14.699 C 5.500 14.147 5.888 13.923 6.366 14.199 C 6.844 14.476 7.232 15.147 7.232 15.699 ZM 10.695 13.700 C 10.695 14.252 10.307 14.476 9.829 14.200 C 9.350 13.924 8.963 13.252 8.963 12.700 C 8.963 12.148 9.350 11.924 9.829 12.200 C 10.307 12.476 10.695 13.148 10.695 13.700 Z"),
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
        return _diceFill!!
    }

private var _diceFill: ImageVector? = null
