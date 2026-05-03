package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.YuqueLine: ImageVector
    get() {
        if (_yuqueLine != null) return _yuqueLine!!
        _yuqueLine = remixIcon(
            name = "YuqueLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.505 3.043 C 11.669 2.759 11.972 2.583 12.300 2.583 C 13.847 2.583 15.390 2.632 16.937 2.737 C 19.446 2.908 20.638 4.328 21.117 5.168 C 21.713 5.259 22.505 5.255 22.688 5.974 C 22.829 6.526 22.471 6.807 22.134 7.122 C 21.651 7.573 21.001 8.298 21.180 9.010 C 21.236 9.232 21.339 9.447 21.496 9.775 L 21.497 9.778 C 21.816 10.445 22.182 11.288 22.240 12.893 C 22.396 17.234 18.644 19.789 14.988 19.972 C 12.577 21.788 8.643 22.998 2.431 21.930 C 2.036 21.862 1.673 21.595 1.486 21.221 C 1.382 21.015 1.326 20.761 1.365 20.486 C 1.405 20.211 1.531 19.975 1.696 19.787 C 4.924 16.111 8.331 12.540 11.350 8.688 C 11.876 8.017 12.311 7.409 12.501 7.041 C 12.809 6.121 12.491 5.596 11.875 4.577 C 11.593 4.110 11.186 3.599 11.505 3.043 ZM 13.494 8.886 C 14.368 8.891 15.345 9.135 16.379 9.761 C 18.503 11.049 18.713 13.757 18.004 15.918 C 17.840 16.418 17.572 17.016 17.168 17.645 C 19.104 16.848 20.487 15.161 20.407 12.959 C 20.361 11.679 20.091 11.087 19.844 10.570 C 19.835 10.550 19.825 10.530 19.815 10.509 C 19.682 10.233 19.504 9.863 19.402 9.456 C 19.131 8.376 19.577 7.417 20.016 6.778 C 19.836 6.667 19.697 6.494 19.629 6.285 C 19.629 6.285 19.629 6.286 19.628 6.284 C 19.616 6.253 19.449 5.853 19.050 5.467 C 18.642 5.074 17.955 4.644 16.813 4.566 C 15.850 4.501 14.887 4.458 13.923 4.435 C 14.375 5.314 14.681 6.377 14.212 7.703 C 14.061 8.129 13.752 8.522 13.494 8.886 ZM 12.662 10.831 C 11.943 11.033 11.448 11.460 11.284 11.646 C 8.567 14.703 5.403 18.335 3.708 20.273 C 9.157 21.020 12.309 19.782 14.086 18.351 C 15.381 17.308 16.011 16.112 16.262 15.347 C 16.697 14.024 16.799 12.160 15.428 11.329 C 14.275 10.630 13.340 10.640 12.662 10.831 Z"),
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
        return _yuqueLine!!
    }

private var _yuqueLine: ImageVector? = null
