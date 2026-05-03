package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.WordpressFill: ImageVector
    get() {
        if (_wordpressFill != null) return _wordpressFill!!
        _wordpressFill = remixIcon(
            name = "WordpressFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.323 12.000 C 3.323 15.439 5.323 18.400 8.215 19.808 L 4.077 8.469 C 3.580 9.580 3.323 10.783 3.323 12.000 ZM 12.000 20.677 C 13.008 20.677 13.977 20.500 14.885 20.185 L 14.823 20.069 L 12.154 12.762 L 9.554 20.323 C 10.323 20.554 11.146 20.677 12.000 20.677 ZM 13.192 7.931 L 16.331 17.261 L 17.200 14.369 C 17.569 13.169 17.854 12.308 17.854 11.561 C 17.854 10.485 17.469 9.746 17.146 9.177 C 16.700 8.454 16.292 7.846 16.292 7.138 C 16.292 6.338 16.892 5.600 17.754 5.600 L 17.861 5.600 C 16.263 4.132 14.170 3.319 12.000 3.323 C 10.563 3.323 9.148 3.680 7.883 4.362 C 6.619 5.044 5.543 6.030 4.754 7.231 L 5.308 7.246 C 6.215 7.246 7.615 7.131 7.615 7.131 C 8.092 7.108 8.146 7.792 7.677 7.846 C 7.677 7.846 7.208 7.908 6.677 7.931 L 9.846 17.331 L 11.746 11.639 L 10.392 7.931 C 10.089 7.914 9.786 7.888 9.485 7.854 C 9.015 7.823 9.069 7.108 9.538 7.131 C 9.538 7.131 10.969 7.246 11.823 7.246 C 12.731 7.246 14.131 7.131 14.131 7.131 C 14.600 7.108 14.661 7.792 14.192 7.846 C 14.192 7.846 13.723 7.900 13.192 7.931 ZM 16.361 19.500 C 17.674 18.737 18.764 17.642 19.521 16.326 C 20.278 15.010 20.677 13.518 20.677 12.000 C 20.677 10.492 20.292 9.077 19.615 7.838 C 19.753 9.201 19.547 10.576 19.015 11.839 L 16.361 19.500 ZM 12.000 22.000 C 9.348 22.000 6.804 20.946 4.929 19.071 C 3.054 17.196 2.000 14.652 2.000 12.000 C 2.000 9.348 3.054 6.804 4.929 4.929 C 6.804 3.054 9.348 2.000 12.000 2.000 C 14.652 2.000 17.196 3.054 19.071 4.929 C 20.946 6.804 22.000 9.348 22.000 12.000 C 22.000 14.652 20.946 17.196 19.071 19.071 C 17.196 20.946 14.652 22.000 12.000 22.000 Z"),
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
        return _wordpressFill!!
    }

private var _wordpressFill: ImageVector? = null
