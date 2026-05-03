package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.EyeClosed: ImageVector
    get() {
        if (_eyeClosed != null) return _eyeClosed!!
        _eyeClosed = radixIcon(
            name = "EyeClosed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.583 12.587 C 5.511 12.853 5.237 13.011 4.971 12.940 C 4.704 12.869 4.545 12.594 4.616 12.328 L 5.583 12.587 ZM 10.383 12.328 C 10.454 12.594 10.296 12.869 10.029 12.940 C 9.763 13.011 9.488 12.853 9.417 12.587 L 10.383 12.328 ZM 14.137 6.155 C 14.298 5.986 14.559 5.948 14.764 6.076 C 14.969 6.204 15.050 6.456 14.969 6.674 L 14.924 6.764 C 14.484 7.467 13.962 8.105 13.369 8.662 L 14.571 9.864 L 14.635 9.942 C 14.764 10.136 14.742 10.400 14.571 10.571 C 14.400 10.742 14.136 10.764 13.942 10.635 L 13.864 10.571 L 12.599 9.306 C 11.803 9.901 10.908 10.360 9.932 10.649 L 10.383 12.328 L 9.899 12.457 L 9.417 12.587 L 8.958 10.878 C 8.486 10.958 8.000 11.000 7.500 11.000 C 6.999 11.000 6.512 10.956 6.040 10.876 L 5.583 12.587 L 5.099 12.457 L 4.616 12.328 L 5.065 10.649 C 4.090 10.360 3.194 9.902 2.398 9.307 L 1.136 10.571 C 0.940 10.766 0.624 10.766 0.429 10.571 C 0.233 10.376 0.233 10.059 0.429 9.864 L 1.630 8.662 C 1.104 8.168 0.633 7.610 0.227 7.000 L 0.076 6.764 L 0.031 6.674 C -0.050 6.456 0.030 6.204 0.235 6.076 C 0.440 5.948 0.702 5.986 0.862 6.155 L 0.924 6.235 L 1.201 6.651 C 2.639 8.687 4.867 10.000 7.500 10.000 C 10.308 10.000 12.656 8.506 14.076 6.235 L 14.137 6.155 Z"),
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
        return _eyeClosed!!
    }

private var _eyeClosed: ImageVector? = null
