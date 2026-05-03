package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ThreadsFill: ImageVector
    get() {
        if (_threadsFill != null) return _threadsFill!!
        _threadsFill = remixIcon(
            name = "ThreadsFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 16.705 11.108 C 16.543 8.121 14.911 6.411 12.171 6.394 C 10.519 6.384 9.138 7.084 8.292 8.367 L 9.799 9.400 C 10.433 8.439 11.434 8.240 12.159 8.247 C 13.062 8.253 13.743 8.515 14.183 9.027 C 14.504 9.399 14.718 9.914 14.825 10.563 C 14.025 10.427 13.159 10.385 12.234 10.439 C 9.629 10.589 7.954 12.108 8.067 14.219 C 8.124 15.290 8.657 16.212 9.569 16.814 C 10.340 17.323 11.333 17.571 12.364 17.515 C 13.727 17.440 14.796 16.920 15.542 15.970 C 16.108 15.248 16.466 14.312 16.624 13.134 C 17.274 13.526 17.755 14.041 18.021 14.661 C 18.473 15.715 18.499 17.447 17.086 18.859 C 15.848 20.096 14.360 20.631 12.111 20.647 C 9.616 20.629 7.729 19.829 6.503 18.269 C 5.354 16.809 4.760 14.700 4.738 12.000 C 4.760 9.300 5.354 7.191 6.503 5.731 C 7.729 4.171 9.616 3.371 12.111 3.353 C 14.624 3.372 16.543 4.175 17.817 5.742 C 18.441 6.511 18.912 7.477 19.223 8.604 L 20.989 8.133 C 20.612 6.746 20.021 5.551 19.215 4.560 C 17.582 2.551 15.182 1.521 12.105 1.500 C 9.034 1.521 6.673 2.555 5.086 4.571 C 3.675 6.366 2.946 8.877 2.922 12.007 C 2.946 15.137 3.675 17.634 5.086 19.429 C 6.673 21.445 9.046 22.479 12.117 22.500 C 14.847 22.481 16.771 21.766 18.357 20.183 C 20.431 18.110 20.368 15.513 19.685 13.918 C 19.160 12.694 18.114 11.713 16.705 11.108 ZM 12.267 15.665 C 11.125 15.729 9.939 15.217 9.880 14.119 C 9.837 13.305 10.460 12.397 12.337 12.288 C 13.259 12.235 14.114 12.298 14.870 12.463 C 14.654 15.165 13.385 15.604 12.267 15.665 Z"),
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
        return _threadsFill!!
    }

private var _threadsFill: ImageVector? = null
