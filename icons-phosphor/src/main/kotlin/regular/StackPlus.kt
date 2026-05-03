package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.StackPlus: ImageVector
    get() {
        if (_stackPlus != null) return _stackPlus!!
        _stackPlus = phosphorRegularIcon(
            name = "StackPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 230.910 124.000 C 233.110 127.818 231.809 132.695 228.000 134.910 L 132.000 190.910 C 129.510 192.362 126.430 192.362 123.940 190.910 L 27.940 134.910 C 24.188 132.655 22.945 127.804 25.150 124.022 C 27.355 120.241 32.190 118.934 36.000 121.090 L 128.000 174.740 L 220.000 121.090 C 223.818 118.890 228.695 120.191 230.910 124.000 ZM 24.000 80.000 C 24.006 77.148 25.530 74.516 28.000 73.090 L 124.000 17.090 C 126.490 15.638 129.570 15.638 132.060 17.090 L 228.060 73.090 C 230.518 74.524 232.029 77.155 232.029 80.000 C 232.029 82.845 230.518 85.476 228.060 86.910 L 132.060 142.910 C 129.570 144.362 126.490 144.362 124.000 142.910 L 28.000 86.910 C 25.530 85.484 24.006 82.852 24.000 80.000 ZM 47.880 80.000 L 128.000 126.740 L 208.120 80.000 L 128.000 33.260 ZM 232.000 192.000 L 216.000 192.000 L 216.000 176.000 C 216.000 171.582 212.418 168.000 208.000 168.000 C 203.582 168.000 200.000 171.582 200.000 176.000 L 200.000 192.000 L 184.000 192.000 C 179.582 192.000 176.000 195.582 176.000 200.000 C 176.000 204.418 179.582 208.000 184.000 208.000 L 200.000 208.000 L 200.000 224.000 C 200.000 228.418 203.582 232.000 208.000 232.000 C 212.418 232.000 216.000 228.418 216.000 224.000 L 216.000 208.000 L 232.000 208.000 C 236.418 208.000 240.000 204.418 240.000 200.000 C 240.000 195.582 236.418 192.000 232.000 192.000 ZM 140.000 215.760 L 128.000 222.760 L 36.000 169.090 C 32.219 167.208 27.627 168.588 25.511 172.244 C 23.395 175.899 24.485 180.569 28.000 182.910 L 124.000 238.910 C 126.490 240.362 129.570 240.362 132.060 238.910 L 148.060 229.580 C 150.569 228.160 152.121 225.500 152.121 222.617 C 152.121 219.734 150.569 217.074 148.060 215.654 C 145.550 214.235 142.471 214.275 140.000 215.760 Z"),
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
        return _stackPlus!!
    }

private var _stackPlus: ImageVector? = null
