package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Reddit2Fill: ImageVector
    get() {
        if (_reddit2Fill != null) return _reddit2Fill!!
        _reddit2Fill = remixIcon(
            name = "Reddit2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.254 0.900 C 18.567 0.900 19.632 1.964 19.632 3.277 C 19.632 4.590 18.567 5.655 17.254 5.655 C 16.131 5.655 15.191 4.875 14.942 3.828 C 13.560 4.014 12.490 5.199 12.490 6.632 C 12.490 6.635 12.488 6.638 12.488 6.640 C 14.616 6.719 16.562 7.318 18.103 8.272 C 18.668 7.837 19.376 7.579 20.145 7.579 C 21.998 7.579 23.500 9.081 23.500 10.934 C 23.500 12.273 22.716 13.428 21.582 13.966 C 21.475 17.864 17.232 21.000 12.009 21.000 C 6.789 21.000 2.547 17.869 2.435 13.974 C 1.292 13.439 0.500 12.279 0.500 10.934 C 0.500 9.081 2.002 7.579 3.855 7.579 C 4.627 7.579 5.337 7.840 5.904 8.278 C 7.430 7.331 9.354 6.733 11.460 6.644 C 11.460 6.641 11.459 6.637 11.459 6.633 C 11.459 4.637 12.982 2.988 14.927 2.790 C 15.152 1.711 16.108 0.900 17.254 0.900 ZM 12.008 15.716 C 10.842 15.716 9.725 15.773 8.692 15.878 C 8.516 15.896 8.404 16.079 8.473 16.243 C 9.051 17.625 10.417 18.596 12.008 18.596 C 13.599 18.596 14.965 17.625 15.543 16.243 C 15.612 16.079 15.499 15.896 15.323 15.878 C 14.290 15.773 13.173 15.716 12.008 15.716 ZM 7.575 10.914 C 6.635 10.914 5.827 11.704 5.771 12.912 C 5.715 14.119 6.433 14.776 7.373 14.776 C 8.255 14.776 9.019 14.390 9.157 13.346 L 9.177 13.130 C 9.233 11.922 8.516 10.914 7.575 10.914 ZM 16.442 10.914 C 15.502 10.914 14.785 11.922 14.841 13.130 L 14.859 13.346 C 14.998 14.390 15.763 14.776 16.645 14.776 C 17.585 14.776 18.302 14.119 18.246 12.912 C 18.190 11.704 17.383 10.914 16.442 10.914 Z"),
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
        return _reddit2Fill!!
    }

private var _reddit2Fill: ImageVector? = null
