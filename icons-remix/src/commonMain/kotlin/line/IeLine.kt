package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.IeLine: ImageVector
    get() {
        if (_ieLine != null) return _ieLine!!
        _ieLine = remixIcon(
            name = "IeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.160 10.000 C 17.336 7.670 15.113 6.000 12.501 6.000 C 9.888 6.000 7.666 7.670 6.842 10.000 L 18.160 10.000 ZM 6.584 13.000 C 7.060 15.838 9.528 18.000 12.501 18.000 C 14.698 18.000 16.619 16.819 17.665 15.057 L 20.968 15.057 C 20.961 15.078 20.953 15.099 20.945 15.120 C 19.677 18.553 16.375 21.000 12.501 21.000 C 11.108 21.000 9.790 20.684 8.613 20.119 C 5.869 21.610 3.500 21.919 2.191 20.611 C 0.847 19.269 1.563 15.759 3.504 12.237 C 4.194 10.984 5.040 9.730 6.002 8.572 C 6.362 8.139 6.737 7.721 7.128 7.320 C 6.853 7.375 5.247 8.171 3.716 10.035 C 3.774 9.775 3.843 9.520 3.922 9.270 C 5.079 5.634 8.482 3.000 12.501 3.000 C 12.731 3.000 12.959 3.009 13.184 3.026 C 16.279 1.623 19.158 1.299 20.376 2.515 C 21.501 3.638 21.438 5.510 20.501 7.757 C 20.492 7.778 20.483 7.800 20.474 7.821 C 21.130 9.070 21.501 10.492 21.501 12.000 C 21.501 12.338 21.482 12.672 21.446 13.000 L 18.418 13.000 L 6.584 13.000 ZM 8.006 19.799 C 6.180 18.744 4.759 17.067 4.034 15.057 C 2.873 17.339 2.574 19.247 3.565 20.237 C 4.378 21.049 6.003 20.861 8.003 19.801 L 8.006 19.799 ZM 20.173 7.292 C 20.178 7.281 20.183 7.270 20.188 7.258 C 20.938 5.636 21.001 4.264 20.313 3.452 C 19.444 2.585 17.773 2.702 15.791 3.620 C 17.619 4.339 19.156 5.639 20.173 7.292 Z"),
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
        return _ieLine!!
    }

private var _ieLine: ImageVector? = null
