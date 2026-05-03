package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.StackPlus: ImageVector
    get() {
        if (_stackPlus != null) return _stackPlus!!
        _stackPlus = phosphorDuotoneIcon(
            name = "StackPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 224.000 80.000 L 128.000 136.000 L 32.000 80.000 L 128.000 24.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 240.000 200.000 C 240.000 204.418 236.418 208.000 232.000 208.000 L 216.000 208.000 L 216.000 224.000 C 216.000 228.418 212.418 232.000 208.000 232.000 C 203.582 232.000 200.000 228.418 200.000 224.000 L 200.000 208.000 L 184.000 208.000 C 179.582 208.000 176.000 204.418 176.000 200.000 C 176.000 195.582 179.582 192.000 184.000 192.000 L 200.000 192.000 L 200.000 176.000 C 200.000 171.582 203.582 168.000 208.000 168.000 C 212.418 168.000 216.000 171.582 216.000 176.000 L 216.000 192.000 L 232.000 192.000 C 236.418 192.000 240.000 195.582 240.000 200.000 ZM 220.000 121.090 L 128.000 174.740 L 36.000 121.090 C 32.219 119.208 27.627 120.588 25.511 124.244 C 23.395 127.899 24.485 132.569 28.000 134.910 L 124.000 190.910 C 126.490 192.362 129.570 192.362 132.060 190.910 L 228.060 134.910 C 230.569 133.490 232.121 130.830 232.121 127.947 C 232.121 125.064 230.569 122.404 228.060 120.984 C 225.550 119.565 222.471 119.605 220.000 121.090 ZM 24.000 80.000 C 24.006 77.148 25.530 74.516 28.000 73.090 L 124.000 17.090 C 126.490 15.638 129.570 15.638 132.060 17.090 L 228.060 73.090 C 230.518 74.524 232.029 77.155 232.029 80.000 C 232.029 82.845 230.518 85.476 228.060 86.910 L 132.060 142.910 C 129.570 144.362 126.490 144.362 124.000 142.910 L 28.000 86.910 C 25.530 85.484 24.006 82.852 24.000 80.000 ZM 47.880 80.000 L 128.000 126.740 L 208.120 80.000 L 128.000 33.260 ZM 140.000 215.760 L 128.000 222.760 L 36.000 169.090 C 32.219 167.208 27.627 168.588 25.511 172.244 C 23.395 175.899 24.485 180.569 28.000 182.910 L 124.000 238.910 C 126.490 240.362 129.570 240.362 132.060 238.910 L 148.060 229.580 C 150.569 228.160 152.121 225.500 152.121 222.617 C 152.121 219.734 150.569 217.074 148.060 215.654 C 145.550 214.235 142.471 214.275 140.000 215.760 Z"),
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
        return _stackPlus!!
    }

private var _stackPlus: ImageVector? = null
