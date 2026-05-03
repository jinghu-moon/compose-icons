package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Shuffle: ImageVector
    get() {
        if (_shuffle != null) return _shuffle!!
        _shuffle = radixIcon(
            name = "Shuffle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 8.090 8.128 C 8.585 8.793 9.053 9.398 9.565 9.890 C 10.289 10.585 11.047 11.000 12.000 11.000 L 12.793 11.000 L 11.646 9.854 L 11.582 9.776 C 11.454 9.582 11.476 9.318 11.646 9.147 C 11.817 8.976 12.081 8.954 12.275 9.082 L 12.354 9.147 L 14.354 11.147 C 14.549 11.342 14.549 11.658 14.354 11.854 L 12.354 13.854 C 12.158 14.049 11.842 14.049 11.646 13.854 C 11.451 13.658 11.451 13.342 11.646 13.147 L 12.793 12.000 L 12.000 12.000 C 10.704 12.000 9.711 11.416 8.872 10.611 C 8.372 10.130 7.910 9.550 7.458 8.951 C 7.647 8.714 7.828 8.480 8.000 8.250 C 8.031 8.209 8.060 8.168 8.090 8.128 ZM 11.646 1.147 C 11.817 0.976 12.081 0.954 12.275 1.082 L 12.354 1.147 L 14.354 3.147 L 14.418 3.225 C 14.546 3.419 14.524 3.683 14.354 3.854 L 12.354 5.854 C 12.158 6.049 11.842 6.049 11.646 5.854 C 11.451 5.658 11.451 5.342 11.646 5.147 L 12.793 4.000 L 12.000 4.000 C 11.047 4.000 10.289 4.416 9.565 5.111 C 8.823 5.824 8.171 6.773 7.400 7.800 C 5.892 9.812 4.010 12.000 0.500 12.000 C 0.224 12.000 0.000 11.776 0.000 11.500 C 0.000 11.224 0.224 11.000 0.500 11.000 C 3.490 11.000 5.108 9.189 6.600 7.200 C 7.329 6.228 8.053 5.177 8.872 4.390 C 9.711 3.585 10.704 3.000 12.000 3.000 L 12.793 3.000 L 11.646 1.854 L 11.582 1.776 C 11.454 1.582 11.476 1.318 11.646 1.147 ZM 0.500 3.000 C 3.352 3.000 5.129 4.446 6.505 6.068 C 6.332 6.302 6.164 6.532 6.000 6.750 C 5.964 6.799 5.927 6.846 5.891 6.894 C 4.572 5.294 3.026 4.000 0.500 4.000 C 0.224 4.000 0.000 3.776 0.000 3.500 C 0.000 3.224 0.224 3.000 0.500 3.000 Z"),
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
        return _shuffle!!
    }

private var _shuffle: ImageVector? = null
