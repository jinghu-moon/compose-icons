package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Axe: ImageVector
    get() {
        if (_axe != null) return _axe!!
        _axe = phosphorBoldIcon(
            name = "Axe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 254.930 96.430 C 252.485 89.195 246.133 83.984 238.560 83.000 C 224.656 81.169 211.172 76.953 198.700 70.540 L 202.620 66.620 C 215.118 54.122 215.118 33.858 202.620 21.360 C 190.122 8.862 169.858 8.862 157.360 21.360 L 150.670 28.050 C 147.202 23.400 141.885 20.484 136.100 20.060 C 130.314 19.636 124.629 21.745 120.520 25.840 L 81.840 64.520 C 77.742 68.629 75.630 74.317 76.054 80.105 C 76.479 85.893 79.396 91.212 84.050 94.680 L 9.360 169.380 C -3.138 181.875 -3.140 202.137 9.355 214.635 C 21.850 227.133 42.112 227.135 54.610 214.640 L 126.530 142.710 C 132.947 155.181 137.165 168.665 139.000 182.570 C 139.970 190.141 145.165 196.499 152.390 198.960 C 159.615 201.421 167.611 199.555 173.000 194.150 L 250.130 117.000 C 255.546 111.633 257.411 103.640 254.930 96.430 ZM 174.330 38.330 C 177.456 35.204 182.524 35.204 185.650 38.330 C 188.776 41.456 188.776 46.524 185.650 49.650 L 178.070 57.220 C 173.883 53.898 169.896 50.332 166.130 46.540 ZM 37.640 197.670 C 34.514 200.793 29.448 200.791 26.325 197.665 C 23.202 194.539 23.204 189.473 26.330 186.350 L 102.540 110.140 C 106.332 113.906 109.898 117.893 113.220 122.080 ZM 161.520 171.670 C 152.520 123.170 122.250 93.230 102.140 78.200 L 134.140 46.200 C 149.140 66.310 179.140 96.540 227.590 105.580 Z"),
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
        return _axe!!
    }

private var _axe: ImageVector? = null
