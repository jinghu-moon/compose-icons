package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SkypeLine: ImageVector
    get() {
        if (_skypeLine != null) return _skypeLine!!
        _skypeLine = remixIcon(
            name = "SkypeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.005 18.423 C 13.429 18.358 13.862 18.430 14.242 18.629 C 14.703 18.872 15.215 19.000 15.751 19.000 C 17.546 19.000 19.001 17.545 19.001 15.750 C 19.001 15.214 18.873 14.702 18.631 14.241 C 18.431 13.861 18.359 13.428 18.424 13.004 C 18.475 12.675 18.501 12.339 18.501 12.000 C 18.501 8.410 15.591 5.500 12.001 5.500 C 11.662 5.500 11.326 5.526 10.997 5.577 C 10.573 5.642 10.140 5.570 9.760 5.370 C 9.299 5.128 8.787 5.000 8.251 5.000 C 6.456 5.000 5.001 6.455 5.001 8.250 C 5.001 8.786 5.129 9.298 5.371 9.759 C 5.571 10.139 5.643 10.572 5.578 10.996 C 5.527 11.325 5.501 11.661 5.501 12.000 C 5.501 15.590 8.411 18.500 12.001 18.500 C 12.340 18.500 12.675 18.474 13.005 18.423 ZM 12.001 20.500 C 7.307 20.500 3.501 16.694 3.501 12.000 C 3.501 11.554 3.535 11.117 3.601 10.690 C 3.218 9.961 3.001 9.131 3.001 8.250 C 3.001 5.351 5.351 3.000 8.251 3.000 C 9.132 3.000 9.962 3.217 10.691 3.600 C 11.118 3.534 11.556 3.500 12.001 3.500 C 16.695 3.500 20.501 7.306 20.501 12.000 C 20.501 12.446 20.467 12.883 20.401 13.310 C 20.784 14.039 21.001 14.869 21.001 15.750 C 21.001 18.649 18.650 21.000 15.751 21.000 C 14.870 21.000 14.040 20.783 13.311 20.400 C 12.884 20.466 12.446 20.500 12.001 20.500 ZM 12.054 16.999 C 9.252 16.999 8.001 15.621 8.001 14.587 C 8.001 14.054 8.392 13.685 8.929 13.685 C 10.129 13.685 9.816 15.410 12.054 15.410 C 13.197 15.410 13.830 14.786 13.830 14.149 C 13.830 13.765 13.642 13.341 12.887 13.153 L 10.396 12.530 C 8.391 12.026 8.027 10.938 8.027 9.918 C 8.027 7.797 10.019 7.000 11.891 7.000 C 13.612 7.000 15.646 7.956 15.646 9.228 C 15.646 9.773 15.167 10.091 14.635 10.091 C 13.612 10.091 13.800 8.673 11.735 8.673 C 10.712 8.673 10.139 9.135 10.139 9.799 C 10.139 10.462 10.942 10.675 11.641 10.834 L 13.477 11.243 C 15.491 11.695 16.001 12.876 16.001 13.989 C 16.001 15.713 14.677 17.000 12.016 17.000 L 12.054 16.999 Z"),
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
        return _skypeLine!!
    }

private var _skypeLine: ImageVector? = null
