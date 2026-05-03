package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.StackMinus: ImageVector
    get() {
        if (_stackMinus != null) return _stackMinus!!
        _stackMinus = phosphorFillIcon(
            name = "StackMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 230.910 124.000 C 233.110 127.818 231.809 132.695 228.000 134.910 L 132.000 190.910 C 129.510 192.362 126.430 192.362 123.940 190.910 L 27.940 134.910 C 24.188 132.655 22.945 127.804 25.150 124.022 C 27.355 120.241 32.190 118.934 36.000 121.090 L 128.000 174.740 L 220.000 121.090 C 223.818 118.890 228.695 120.191 230.910 124.000 ZM 28.000 86.910 L 124.000 142.910 C 126.490 144.362 129.570 144.362 132.060 142.910 L 228.060 86.910 C 230.518 85.476 232.029 82.845 232.029 80.000 C 232.029 77.155 230.518 74.524 228.060 73.090 L 132.060 17.090 C 129.570 15.638 126.490 15.638 124.000 17.090 L 28.000 73.090 C 25.542 74.524 24.031 77.155 24.031 80.000 C 24.031 82.845 25.542 85.476 28.000 86.910 ZM 232.000 192.000 L 184.000 192.000 C 179.582 192.000 176.000 195.582 176.000 200.000 C 176.000 204.418 179.582 208.000 184.000 208.000 L 232.000 208.000 C 236.418 208.000 240.000 204.418 240.000 200.000 C 240.000 195.582 236.418 192.000 232.000 192.000 ZM 140.000 215.760 L 128.000 222.760 L 36.000 169.090 C 32.219 167.208 27.627 168.588 25.511 172.244 C 23.395 175.899 24.485 180.569 28.000 182.910 L 124.000 238.910 C 126.490 240.362 129.570 240.362 132.060 238.910 L 148.060 229.580 C 150.569 228.160 152.121 225.500 152.121 222.617 C 152.121 219.734 150.569 217.074 148.060 215.654 C 145.550 214.235 142.471 214.275 140.000 215.760 Z"),
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
        return _stackMinus!!
    }

private var _stackMinus: ImageVector? = null
