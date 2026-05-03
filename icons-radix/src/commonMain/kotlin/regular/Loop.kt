package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Loop: ImageVector
    get() {
        if (_loop != null) return _loop!!
        _loop = radixIcon(
            name = "Loop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 1.500 7.000 C 1.776 7.000 2.000 7.224 2.000 7.500 C 2.000 9.433 3.567 11.000 5.500 11.000 L 12.793 11.000 L 11.646 9.854 L 11.582 9.776 C 11.454 9.582 11.476 9.318 11.646 9.147 C 11.817 8.976 12.081 8.954 12.275 9.082 L 12.354 9.147 L 14.354 11.147 C 14.549 11.342 14.549 11.658 14.354 11.854 L 12.354 13.854 C 12.158 14.049 11.842 14.049 11.646 13.854 C 11.451 13.658 11.451 13.342 11.646 13.147 L 12.793 12.000 L 5.500 12.000 C 3.015 12.000 1.000 9.985 1.000 7.500 C 1.000 7.224 1.224 7.000 1.500 7.000 ZM 2.725 1.082 C 2.919 0.954 3.183 0.976 3.353 1.147 C 3.524 1.318 3.546 1.582 3.418 1.776 L 3.353 1.854 L 2.207 3.000 L 9.500 3.000 C 11.985 3.000 14.000 5.015 14.000 7.500 C 14.000 7.776 13.776 8.000 13.500 8.000 C 13.224 8.000 13.000 7.776 13.000 7.500 C 13.000 5.567 11.433 4.000 9.500 4.000 L 2.207 4.000 L 3.353 5.147 L 3.418 5.225 C 3.546 5.419 3.524 5.683 3.353 5.854 C 3.183 6.025 2.919 6.046 2.725 5.918 L 2.646 5.854 L 0.646 3.854 C 0.451 3.658 0.451 3.342 0.646 3.147 L 2.646 1.147 L 2.725 1.082 Z"),
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
        return _loop!!
    }

private var _loop: ImageVector? = null
