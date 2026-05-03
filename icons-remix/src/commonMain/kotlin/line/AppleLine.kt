package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.AppleLine: ImageVector
    get() {
        if (_appleLine != null) return _appleLine!!
        _appleLine = remixIcon(
            name = "AppleLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.778 8.208 C 15.305 8.171 14.797 8.284 14.020 8.581 C 14.085 8.556 13.278 8.872 13.051 8.951 C 12.549 9.126 12.136 9.222 11.673 9.222 C 11.215 9.222 10.792 9.130 10.308 8.967 C 10.152 8.914 9.996 8.856 9.803 8.781 C 9.720 8.749 9.420 8.629 9.354 8.604 C 8.706 8.350 8.342 8.254 8.039 8.262 C 6.886 8.276 5.796 8.942 5.162 10.044 C 3.870 12.288 4.586 16.343 6.475 19.075 C 7.480 20.519 8.031 21.035 8.252 21.028 C 8.474 21.018 8.638 20.971 9.036 20.803 C 9.115 20.769 9.115 20.769 9.202 20.732 C 10.208 20.303 10.912 20.114 11.973 20.114 C 12.994 20.114 13.676 20.300 14.642 20.716 C 14.730 20.754 14.730 20.754 14.810 20.788 C 15.207 20.959 15.351 20.996 15.602 20.990 C 15.959 20.985 16.400 20.573 17.379 19.136 C 17.647 18.745 17.884 18.333 18.090 17.917 C 17.957 17.808 17.826 17.692 17.698 17.569 C 16.409 16.341 15.611 14.684 15.590 12.639 C 15.576 11.019 16.106 9.615 16.999 8.458 C 16.629 8.314 16.222 8.238 15.778 8.208 ZM 15.933 6.214 C 16.641 6.262 18.669 6.478 19.989 8.410 C 19.881 8.470 17.565 9.814 17.589 12.622 C 17.625 15.982 20.529 17.098 20.565 17.110 C 20.541 17.194 20.097 18.706 19.029 20.266 C 18.105 21.622 17.145 22.966 15.633 22.990 C 14.145 23.026 13.665 22.114 11.973 22.114 C 10.269 22.114 9.741 22.966 8.337 23.026 C 6.873 23.074 5.769 21.562 4.833 20.218 C 2.925 17.458 1.473 12.442 3.429 9.046 C 4.401 7.354 6.129 6.286 8.013 6.262 C 9.441 6.226 10.797 7.222 11.673 7.222 C 12.537 7.222 14.085 6.070 15.933 6.214 ZM 14.793 4.390 C 14.013 5.326 12.741 6.058 11.505 5.962 C 11.337 4.690 11.961 3.358 12.681 2.530 C 13.485 1.594 14.829 0.898 15.945 0.850 C 16.089 2.146 15.573 3.454 14.793 4.390 Z"),
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
        return _appleLine!!
    }

private var _appleLine: ImageVector? = null
