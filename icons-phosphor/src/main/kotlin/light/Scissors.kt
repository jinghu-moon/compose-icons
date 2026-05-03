package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Scissors: ImageVector
    get() {
        if (_scissors != null) return _scissors!!
        _scissors = phosphorLightIcon(
            name = "Scissors",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 159.380 112.000 C 158.482 110.686 158.143 109.069 158.437 107.505 C 158.732 105.941 159.636 104.558 160.950 103.660 L 228.610 57.350 C 231.347 55.478 235.083 56.178 236.955 58.915 C 238.827 61.652 238.127 65.388 235.390 67.260 L 167.720 113.560 C 164.986 115.432 161.252 114.734 159.380 112.000 ZM 237.000 197.090 C 235.128 199.824 231.394 200.522 228.660 198.650 L 136.000 135.270 L 91.000 166.060 C 98.278 182.069 92.147 200.986 76.863 209.683 C 61.578 218.379 42.184 213.986 32.140 199.551 C 22.096 185.116 24.717 165.404 38.183 154.095 C 51.650 142.785 71.519 143.612 84.000 156.000 C 84.058 156.071 84.122 156.138 84.190 156.200 L 125.370 128.000 L 84.230 99.840 L 84.000 100.000 C 71.538 112.403 51.675 113.259 38.192 101.973 C 24.710 90.688 22.055 70.985 32.071 56.534 C 42.086 42.083 61.468 37.652 76.768 46.315 C 92.068 54.978 98.239 73.877 91.000 89.900 L 235.380 188.700 C 236.717 189.590 237.641 190.979 237.945 192.556 C 238.249 194.133 237.909 195.766 237.000 197.090 ZM 75.560 91.550 C 84.149 82.957 84.146 69.030 75.555 60.440 C 66.964 51.850 53.036 51.850 44.445 60.440 C 35.854 69.030 35.851 82.957 44.440 91.550 C 48.550 95.708 54.154 98.048 60.000 98.048 C 65.846 98.048 71.450 95.708 75.560 91.550 ZM 82.000 180.000 C 81.997 169.505 74.580 160.473 64.285 158.429 C 53.991 156.384 43.686 161.896 39.672 171.594 C 35.659 181.292 39.054 192.474 47.782 198.303 C 56.510 204.131 68.140 202.983 75.560 195.560 L 75.560 195.560 C 79.697 191.440 82.015 185.838 82.000 180.000 Z"),
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
        return _scissors!!
    }

private var _scissors: ImageVector? = null
