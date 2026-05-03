package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Stack: ImageVector
    get() {
        if (_stack != null) return _stack!!
        _stack = phosphorRegularIcon(
            name = "Stack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 230.910 172.000 C 233.110 175.818 231.809 180.695 228.000 182.910 L 132.000 238.910 C 129.510 240.362 126.430 240.362 123.940 238.910 L 27.940 182.910 C 24.188 180.655 22.945 175.804 25.150 172.022 C 27.355 168.241 32.190 166.934 36.000 169.090 L 128.000 222.740 L 220.000 169.090 C 223.818 166.890 228.695 168.191 230.910 172.000 ZM 220.000 121.090 L 128.000 174.740 L 36.000 121.090 C 32.219 119.208 27.627 120.588 25.511 124.244 C 23.395 127.899 24.485 132.569 28.000 134.910 L 124.000 190.910 C 126.490 192.362 129.570 192.362 132.060 190.910 L 228.060 134.910 C 230.569 133.490 232.121 130.830 232.121 127.947 C 232.121 125.064 230.569 122.404 228.060 120.984 C 225.550 119.565 222.471 119.605 220.000 121.090 ZM 24.000 80.000 C 24.006 77.148 25.530 74.516 28.000 73.090 L 124.000 17.090 C 126.490 15.638 129.570 15.638 132.060 17.090 L 228.060 73.090 C 230.518 74.524 232.029 77.155 232.029 80.000 C 232.029 82.845 230.518 85.476 228.060 86.910 L 132.060 142.910 C 129.570 144.362 126.490 144.362 124.000 142.910 L 28.000 86.910 C 25.530 85.484 24.006 82.852 24.000 80.000 ZM 47.880 80.000 L 128.000 126.740 L 208.120 80.000 L 128.000 33.260 Z"),
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
        return _stack!!
    }

private var _stack: ImageVector? = null
