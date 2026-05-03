package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Video: ImageVector
    get() {
        if (_video != null) return _video!!
        _video = radixIcon(
            name = "Video",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.226 2.009 C 8.947 2.026 9.653 2.070 10.320 2.126 C 12.350 2.298 13.365 2.383 14.146 3.182 C 14.184 3.222 14.233 3.275 14.269 3.317 C 15.000 4.162 15.000 5.283 15.000 7.525 L 14.999 8.306 C 14.989 10.013 14.908 10.954 14.269 11.693 L 14.144 11.828 L 13.995 11.970 C 13.234 12.638 12.241 12.720 10.371 12.876 L 9.688 12.927 C 8.992 12.972 8.256 13.000 7.500 13.000 L 6.752 12.991 C 6.258 12.980 5.776 12.957 5.312 12.927 L 4.629 12.876 C 2.759 12.720 1.766 12.638 1.005 11.970 L 0.855 11.828 L 0.731 11.693 C 0.092 10.954 0.011 10.013 0.001 8.306 L 0.000 7.525 C 0.000 5.423 -0.000 4.306 0.602 3.479 L 0.730 3.317 L 0.854 3.182 C 1.537 2.483 2.400 2.330 3.965 2.188 L 4.680 2.126 C 5.569 2.051 6.527 2.000 7.500 2.000 L 8.226 2.009 ZM 7.500 3.000 C 6.561 3.000 5.632 3.049 4.765 3.122 C 3.721 3.210 3.045 3.270 2.528 3.392 C 2.117 3.489 1.864 3.614 1.656 3.798 L 1.569 3.881 C 1.545 3.906 1.509 3.944 1.486 3.971 C 1.287 4.201 1.157 4.489 1.082 5.033 C 1.002 5.616 1.000 6.377 1.000 7.525 C 1.000 8.660 1.002 9.410 1.082 9.985 C 1.156 10.521 1.286 10.807 1.487 11.039 L 1.570 11.129 L 1.658 11.212 C 1.868 11.398 2.117 11.521 2.519 11.616 C 3.025 11.736 3.686 11.794 4.712 11.880 L 5.377 11.929 C 6.054 11.973 6.768 12.000 7.500 12.000 C 8.476 12.000 9.420 11.952 10.288 11.880 C 11.314 11.794 11.975 11.736 12.481 11.616 C 12.940 11.507 13.201 11.363 13.430 11.129 L 13.513 11.039 L 13.585 10.948 C 13.745 10.731 13.853 10.453 13.918 9.985 C 13.998 9.410 14.000 8.660 14.000 7.525 C 14.000 6.377 13.998 5.616 13.918 5.033 C 13.853 4.557 13.744 4.277 13.585 4.061 L 13.514 3.971 L 13.431 3.881 C 13.205 3.650 12.942 3.503 12.472 3.392 C 11.955 3.270 11.279 3.210 10.235 3.122 C 9.368 3.049 8.439 3.000 7.500 3.000 ZM 5.250 5.383 C 5.250 5.202 5.435 5.081 5.601 5.153 L 10.428 7.271 C 10.627 7.359 10.627 7.641 10.428 7.729 L 5.601 9.847 C 5.435 9.919 5.250 9.798 5.250 9.617 L 5.250 5.383 Z"),
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
        return _video!!
    }

private var _video: ImageVector? = null
