package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.VkLine: ImageVector
    get() {
        if (_vkLine != null) return _vkLine!!
        _vkLine = remixIcon(
            name = "VkLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.827 5.828 C 5.483 6.177 5.256 6.667 5.131 7.599 C 5.002 8.563 5.000 9.841 5.000 11.680 L 5.000 12.320 C 5.000 14.156 5.002 15.433 5.131 16.397 C 5.256 17.329 5.483 17.822 5.828 18.174 C 6.177 18.517 6.667 18.744 7.599 18.869 C 8.563 18.998 9.841 19.000 11.680 19.000 L 12.320 19.000 C 14.156 19.000 15.433 18.998 16.398 18.869 C 17.329 18.744 17.822 18.517 18.174 18.172 C 18.517 17.823 18.744 17.333 18.869 16.401 C 18.998 15.437 19.000 14.159 19.000 12.320 L 19.000 11.680 C 19.000 9.844 18.998 8.567 18.869 7.603 C 18.744 6.671 18.517 6.178 18.172 5.826 C 17.823 5.483 17.333 5.256 16.402 5.131 C 15.437 5.002 14.159 5.000 12.320 5.000 L 11.680 5.000 C 9.844 5.000 8.567 5.002 7.603 5.131 C 6.671 5.256 6.179 5.483 5.827 5.828 ZM 11.680 3.000 L 12.320 3.000 C 13.765 3.000 15.232 2.957 16.667 3.149 C 17.823 3.304 18.802 3.635 19.584 4.410 L 19.592 4.418 C 20.365 5.202 20.697 6.181 20.851 7.337 C 21.043 8.771 21.000 10.237 21.000 11.680 L 21.000 12.320 C 21.000 13.764 21.044 15.231 20.851 16.667 C 20.697 17.823 20.365 18.802 19.591 19.584 L 19.582 19.592 C 18.799 20.365 17.820 20.696 16.663 20.851 C 15.229 21.043 13.763 21.000 12.320 21.000 L 11.680 21.000 C 10.236 21.000 8.769 21.043 7.334 20.851 C 6.177 20.696 5.198 20.365 4.417 19.590 L 4.408 19.582 C 3.636 18.799 3.304 17.819 3.149 16.663 C 2.957 15.229 3.000 13.763 3.000 12.320 L 3.000 11.680 C 3.000 10.236 2.957 8.769 3.149 7.333 C 3.304 6.177 3.636 5.198 4.410 4.416 L 4.418 4.408 C 5.202 3.635 6.181 3.304 7.338 3.149 C 8.772 2.957 10.237 3.000 11.680 3.000 ZM 6.036 8.478 C 6.132 13.158 8.472 15.966 12.576 15.966 L 12.582 15.966 L 12.816 15.966 L 12.816 13.290 C 14.322 13.440 15.462 14.544 15.918 15.966 L 18.048 15.966 C 17.830 15.158 17.443 14.406 16.912 13.758 C 16.382 13.111 15.720 12.583 14.970 12.210 C 15.642 11.801 16.222 11.258 16.674 10.615 C 17.126 9.972 17.441 9.242 17.598 8.472 L 15.666 8.472 C 15.246 9.960 13.998 11.310 12.816 11.436 L 12.816 8.478 L 10.878 8.478 L 10.878 13.662 C 9.678 13.362 8.166 11.910 8.100 8.478 L 6.036 8.478 Z"),
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
        return _vkLine!!
    }

private var _vkLine: ImageVector? = null
