package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ThermometerSimple: ImageVector
    get() {
        if (_thermometerSimple != null) return _thermometerSimple!!
        _thermometerSimple = phosphorBoldIcon(
            name = "ThermometerSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 180.000 150.690 L 180.000 56.000 C 180.000 27.281 156.719 4.000 128.000 4.000 C 99.281 4.000 76.000 27.281 76.000 56.000 L 76.000 150.690 C 56.961 177.226 60.956 213.840 85.270 235.646 C 109.584 257.451 146.416 257.451 170.730 235.646 C 195.044 213.840 199.039 177.226 180.000 150.690 ZM 128.000 228.000 C 112.530 228.001 98.447 219.081 91.835 205.094 C 85.224 191.108 87.270 174.564 97.090 162.610 C 98.966 160.433 99.999 157.654 100.000 154.780 L 100.000 56.000 C 100.000 40.536 112.536 28.000 128.000 28.000 C 143.464 28.000 156.000 40.536 156.000 56.000 L 156.000 154.770 C 155.997 157.575 156.977 160.292 158.770 162.450 C 168.674 174.381 170.791 190.961 164.203 204.997 C 157.614 219.034 143.506 227.997 128.000 228.000 ZM 152.000 188.000 C 152.002 199.648 143.641 209.615 132.171 211.639 C 120.700 213.664 109.432 207.159 105.448 196.215 C 101.463 185.270 105.913 173.044 116.000 167.220 L 116.000 92.000 C 116.000 85.373 121.373 80.000 128.000 80.000 C 134.627 80.000 140.000 85.373 140.000 92.000 L 140.000 167.220 C 147.424 171.506 151.998 179.427 152.000 188.000 Z"),
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
        return _thermometerSimple!!
    }

private var _thermometerSimple: ImageVector? = null
