package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Stack: ImageVector
    get() {
        if (_stack != null) return _stack!!
        _stack = phosphorFillIcon(
            name = "Stack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 220.000 169.090 L 128.000 222.740 L 36.000 169.090 C 32.219 167.208 27.627 168.588 25.511 172.244 C 23.395 175.899 24.485 180.569 28.000 182.910 L 124.000 238.910 C 126.490 240.362 129.570 240.362 132.060 238.910 L 228.060 182.910 C 230.569 181.490 232.121 178.830 232.121 175.947 C 232.121 173.064 230.569 170.404 228.060 168.984 C 225.550 167.565 222.471 167.605 220.000 169.090 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 220.000 121.090 L 128.000 174.740 L 36.000 121.090 C 32.219 119.208 27.627 120.588 25.511 124.244 C 23.395 127.899 24.485 132.569 28.000 134.910 L 124.000 190.910 C 126.490 192.362 129.570 192.362 132.060 190.910 L 228.060 134.910 C 230.569 133.490 232.121 130.830 232.121 127.947 C 232.121 125.064 230.569 122.404 228.060 120.984 C 225.550 119.565 222.471 119.605 220.000 121.090 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 28.000 86.910 L 124.000 142.910 C 126.490 144.362 129.570 144.362 132.060 142.910 L 228.060 86.910 C 230.518 85.476 232.029 82.845 232.029 80.000 C 232.029 77.155 230.518 74.524 228.060 73.090 L 132.060 17.090 C 129.570 15.638 126.490 15.638 124.000 17.090 L 28.000 73.090 C 25.542 74.524 24.031 77.155 24.031 80.000 C 24.031 82.845 25.542 85.476 28.000 86.910 Z"),
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
        return _stack!!
    }

private var _stack: ImageVector? = null
