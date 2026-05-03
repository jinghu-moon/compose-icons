package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FirefoxBrowserFill: ImageVector
    get() {
        if (_firefoxBrowserFill != null) return _firefoxBrowserFill!!
        _firefoxBrowserFill = remixIcon(
            name = "FirefoxBrowserFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.283 8.260 C 20.847 7.213 19.966 6.082 19.273 5.725 C 19.752 6.664 20.166 7.728 20.289 8.782 C 19.157 5.959 17.236 4.820 15.668 2.342 C 15.472 2.032 15.243 1.614 15.123 1.329 C 12.895 2.634 11.972 4.918 11.735 6.371 C 11.047 6.410 10.372 6.582 9.750 6.878 C 9.636 6.934 9.579 7.077 9.623 7.196 C 9.671 7.334 9.831 7.403 9.964 7.343 C 10.599 7.043 11.298 6.886 11.999 6.879 C 13.804 6.866 15.517 7.870 16.415 9.437 C 15.880 9.062 14.922 8.691 14.000 8.851 C 17.603 10.652 16.635 16.855 11.643 16.621 C 9.629 16.538 7.698 14.971 7.517 12.890 C 7.517 12.890 7.979 11.168 10.828 11.168 C 11.136 11.168 12.016 10.308 12.032 10.059 C 12.028 9.978 10.285 9.284 9.606 8.615 C 9.304 8.317 9.012 7.997 8.658 7.759 C 8.429 6.960 8.420 6.115 8.630 5.311 C 7.601 5.780 6.796 6.520 6.214 7.174 C 5.817 6.671 5.845 5.012 5.867 4.666 C 4.994 5.131 4.225 5.940 3.619 6.803 C 2.590 8.261 1.997 10.174 1.997 11.984 C 1.997 17.516 6.468 22.000 12.000 22.000 C 16.955 22.000 21.081 18.403 21.887 13.679 C 22.128 11.857 21.993 9.970 21.283 8.260 Z"),
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
        return _firefoxBrowserFill!!
    }

private var _firefoxBrowserFill: ImageVector? = null
