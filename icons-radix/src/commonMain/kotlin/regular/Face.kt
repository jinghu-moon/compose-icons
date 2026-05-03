package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Face: ImageVector
    get() {
        if (_face != null) return _face!!
        _face = radixIcon(
            name = "Face",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.499 0.877 C 11.157 0.877 14.122 3.842 14.122 7.499 C 14.122 11.157 11.157 14.122 7.499 14.122 C 3.842 14.122 0.877 11.156 0.877 7.499 C 0.877 3.842 3.842 0.877 7.499 0.877 ZM 7.499 1.826 C 4.367 1.827 1.827 4.367 1.826 7.499 C 1.826 10.632 4.366 13.171 7.499 13.172 C 10.632 13.172 13.172 10.632 13.172 7.499 C 13.172 4.366 10.632 1.826 7.499 1.826 ZM 9.962 9.214 C 10.120 8.987 10.432 8.932 10.658 9.090 C 10.885 9.248 10.940 9.560 10.782 9.786 C 10.060 10.821 8.860 11.500 7.500 11.500 C 6.225 11.500 5.089 10.903 4.358 9.976 L 4.217 9.786 L 4.168 9.697 C 4.076 9.484 4.143 9.228 4.341 9.090 C 4.539 8.952 4.802 8.977 4.971 9.137 L 5.037 9.214 L 5.143 9.356 C 5.693 10.054 6.545 10.500 7.500 10.500 C 8.519 10.500 9.419 9.992 9.962 9.214 ZM 5.375 5.100 C 5.858 5.100 6.250 5.492 6.250 5.975 C 6.250 6.458 5.858 6.850 5.375 6.850 C 4.892 6.850 4.500 6.458 4.500 5.975 C 4.500 5.492 4.892 5.100 5.375 5.100 ZM 9.625 5.100 C 10.108 5.100 10.500 5.492 10.500 5.975 C 10.500 6.458 10.108 6.850 9.625 6.850 C 9.142 6.850 8.750 6.458 8.750 5.975 C 8.750 5.492 9.142 5.100 9.625 5.100 Z"),
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
        return _face!!
    }

private var _face: ImageVector? = null
