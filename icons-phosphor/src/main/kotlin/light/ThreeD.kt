package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ThreeD: ImageVector
    get() {
        if (_threeD != null) return _threeD!!
        _threeD = phosphorLightIcon(
            name = "ThreeD",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 98.000 148.000 C 98.000 135.850 88.150 126.000 76.000 126.000 C 73.762 126.002 71.709 124.758 70.675 122.773 C 69.641 120.789 69.797 118.393 71.080 116.560 L 92.480 86.000 L 56.000 86.000 C 52.686 86.000 50.000 83.314 50.000 80.000 C 50.000 76.686 52.686 74.000 56.000 74.000 L 104.000 74.000 C 106.238 73.998 108.291 75.242 109.325 77.227 C 110.359 79.211 110.203 81.607 108.920 83.440 L 86.390 115.620 C 99.845 119.942 109.223 132.136 109.947 146.249 C 110.671 160.363 102.589 173.452 89.647 179.128 C 76.705 184.804 61.602 181.883 51.710 171.790 C 49.393 169.421 49.436 165.622 51.805 163.305 C 54.174 160.988 57.973 161.031 60.290 163.400 C 66.547 169.782 76.043 171.745 84.318 168.366 C 92.592 164.987 98.000 156.938 98.000 148.000 ZM 160.000 74.000 C 189.823 74.000 214.000 98.177 214.000 128.000 C 214.000 157.823 189.823 182.000 160.000 182.000 L 136.000 182.000 C 132.686 182.000 130.000 179.314 130.000 176.000 L 130.000 80.000 C 130.000 76.686 132.686 74.000 136.000 74.000 ZM 160.000 86.000 L 142.000 86.000 L 142.000 170.000 L 160.000 170.000 C 183.196 170.000 202.000 151.196 202.000 128.000 C 202.000 104.804 183.196 86.000 160.000 86.000 ZM 32.000 54.000 L 224.000 54.000 C 227.314 54.000 230.000 51.314 230.000 48.000 C 230.000 44.686 227.314 42.000 224.000 42.000 L 32.000 42.000 C 28.686 42.000 26.000 44.686 26.000 48.000 C 26.000 51.314 28.686 54.000 32.000 54.000 ZM 224.000 202.000 L 32.000 202.000 C 28.686 202.000 26.000 204.686 26.000 208.000 C 26.000 211.314 28.686 214.000 32.000 214.000 L 224.000 214.000 C 227.314 214.000 230.000 211.314 230.000 208.000 C 230.000 204.686 227.314 202.000 224.000 202.000 Z"),
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
        return _threeD!!
    }

private var _threeD: ImageVector? = null
