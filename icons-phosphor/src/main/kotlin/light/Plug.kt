package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Plug: ImageVector
    get() {
        if (_plug != null) return _plug!!
        _plug = phosphorLightIcon(
            name = "Plug",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 236.240 67.760 C 233.897 65.420 230.103 65.420 227.760 67.760 L 192.000 103.510 L 152.490 64.000 L 188.240 28.240 C 190.443 25.876 190.378 22.192 188.093 19.907 C 185.808 17.622 182.124 17.557 179.760 19.760 L 144.000 55.510 L 116.240 27.760 C 114.744 26.155 112.492 25.494 110.366 26.037 C 108.240 26.580 106.580 28.240 106.037 30.366 C 105.494 32.492 106.155 34.744 107.760 36.240 L 115.510 44.000 L 61.130 98.380 C 54.001 105.507 49.995 115.174 49.995 125.255 C 49.995 135.336 54.001 145.003 61.130 152.130 L 78.260 169.250 L 27.760 219.760 C 26.155 221.256 25.494 223.508 26.037 225.634 C 26.580 227.760 28.240 229.420 30.366 229.963 C 32.492 230.506 34.744 229.845 36.240 228.240 L 86.750 177.740 L 103.880 194.870 C 118.720 209.710 142.780 209.710 157.620 194.870 L 212.000 140.490 L 219.760 148.240 C 222.124 150.443 225.808 150.378 228.093 148.093 C 230.378 145.808 230.443 142.124 228.240 139.760 L 200.490 112.000 L 236.240 76.240 C 238.580 73.897 238.580 70.103 236.240 67.760 ZM 149.130 186.380 C 144.254 191.256 137.641 193.995 130.745 193.995 C 123.849 193.995 117.236 191.256 112.360 186.380 L 69.620 143.640 C 64.744 138.764 62.005 132.151 62.005 125.255 C 62.005 118.359 64.744 111.746 69.620 106.870 L 124.000 52.490 L 203.510 132.000 Z"),
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
        return _plug!!
    }

private var _plug: ImageVector? = null
