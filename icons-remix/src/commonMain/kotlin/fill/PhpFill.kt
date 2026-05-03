package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PhpFill: ImageVector
    get() {
        if (_phpFill != null) return _phpFill!!
        _phpFill = remixIcon(
            name = "PhpFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.931 9.460 L 3.594 9.460 L 2.864 13.211 L 4.051 13.211 C 4.839 13.211 5.425 13.062 5.811 12.766 C 6.196 12.469 6.455 11.974 6.590 11.280 C 6.720 10.614 6.661 10.144 6.414 9.870 C 6.166 9.597 5.673 9.460 4.931 9.460 ZM 7.382 13.613 C 7.012 13.967 6.567 14.234 6.083 14.394 C 5.607 14.547 4.999 14.626 4.262 14.626 L 2.589 14.626 L 2.126 17.008 L 0.174 17.008 L 1.916 8.046 L 5.670 8.046 C 6.800 8.046 7.623 8.342 8.141 8.935 C 8.660 9.528 8.815 10.355 8.609 11.417 C 8.529 11.838 8.384 12.243 8.177 12.617 C 7.974 12.979 7.709 13.311 7.382 13.613 ZM 13.083 14.626 L 13.852 10.661 C 13.941 10.210 13.907 9.902 13.755 9.739 C 13.604 9.574 13.279 9.492 12.782 9.492 L 11.235 9.492 L 10.238 14.628 L 8.300 14.628 L 10.042 5.664 L 11.979 5.664 L 11.516 8.047 L 13.241 8.047 C 14.328 8.047 15.076 8.237 15.488 8.615 C 15.900 8.994 16.024 9.607 15.861 10.455 L 15.050 14.626 L 13.083 14.626 ZM 23.845 11.417 C 23.767 11.838 23.621 12.243 23.413 12.617 C 23.210 12.979 22.945 13.311 22.618 13.613 C 22.248 13.966 21.804 14.233 21.319 14.394 C 20.843 14.547 20.235 14.626 19.497 14.626 L 17.826 14.626 L 17.362 17.009 L 15.410 17.009 L 17.153 8.047 L 20.905 8.047 C 22.034 8.047 22.858 8.343 23.376 8.937 C 23.895 9.528 24.052 10.355 23.845 11.417 ZM 20.169 9.460 L 18.833 9.460 L 18.102 13.211 L 19.289 13.211 C 20.078 13.211 20.664 13.062 21.048 12.766 C 21.434 12.469 21.693 11.974 21.829 11.280 C 21.959 10.614 21.898 10.144 21.652 9.870 C 21.405 9.597 20.910 9.460 20.169 9.460 Z"),
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
        return _phpFill!!
    }

private var _phpFill: ImageVector? = null
