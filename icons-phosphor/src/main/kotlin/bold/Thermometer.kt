package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Thermometer: ImageVector
    get() {
        if (_thermometer != null) return _thermometer!!
        _thermometer = phosphorBoldIcon(
            name = "Thermometer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 212.000 52.000 C 194.327 52.000 180.000 66.327 180.000 84.000 C 180.000 101.673 194.327 116.000 212.000 116.000 C 229.673 116.000 244.000 101.673 244.000 84.000 C 244.000 66.327 229.673 52.000 212.000 52.000 ZM 212.000 92.000 C 207.582 92.000 204.000 88.418 204.000 84.000 C 204.000 79.582 207.582 76.000 212.000 76.000 C 216.418 76.000 220.000 79.582 220.000 84.000 C 220.000 88.418 216.418 92.000 212.000 92.000 ZM 160.000 56.000 C 160.000 27.281 136.719 4.000 108.000 4.000 C 79.281 4.000 56.000 27.281 56.000 56.000 L 56.000 150.690 C 36.961 177.226 40.956 213.840 65.270 235.646 C 89.584 257.451 126.416 257.451 150.730 235.646 C 175.044 213.840 179.039 177.226 160.000 150.690 ZM 108.000 228.000 C 92.530 228.001 78.447 219.081 71.835 205.094 C 65.224 191.108 67.270 174.564 77.090 162.610 C 78.966 160.433 79.999 157.654 80.000 154.780 L 80.000 56.000 C 80.000 40.536 92.536 28.000 108.000 28.000 C 123.464 28.000 136.000 40.536 136.000 56.000 L 136.000 154.770 C 135.997 157.575 136.977 160.292 138.770 162.450 C 148.674 174.381 150.791 190.961 144.203 204.997 C 137.614 219.034 123.506 227.997 108.000 228.000 ZM 132.000 188.000 C 132.002 199.648 123.641 209.615 112.171 211.639 C 100.700 213.664 89.432 207.159 85.448 196.215 C 81.463 185.270 85.913 173.044 96.000 167.220 L 96.000 92.000 C 96.000 85.373 101.373 80.000 108.000 80.000 C 114.627 80.000 120.000 85.373 120.000 92.000 L 120.000 167.220 C 127.424 171.506 131.998 179.427 132.000 188.000 Z"),
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
        return _thermometer!!
    }

private var _thermometer: ImageVector? = null
