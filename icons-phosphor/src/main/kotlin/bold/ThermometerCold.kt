package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ThermometerCold: ImageVector
    get() {
        if (_thermometerCold != null) return _thermometerCold!!
        _thermometerCold = phosphorBoldIcon(
            name = "ThermometerCold",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 160.000 56.000 C 160.000 27.281 136.719 4.000 108.000 4.000 C 79.281 4.000 56.000 27.281 56.000 56.000 L 56.000 150.690 C 36.961 177.226 40.956 213.840 65.270 235.646 C 89.584 257.451 126.416 257.451 150.730 235.646 C 175.044 213.840 179.039 177.226 160.000 150.690 ZM 108.000 228.000 C 92.530 228.001 78.447 219.081 71.835 205.094 C 65.224 191.108 67.270 174.564 77.090 162.610 C 78.966 160.433 79.999 157.654 80.000 154.780 L 80.000 56.000 C 80.000 40.536 92.536 28.000 108.000 28.000 C 123.464 28.000 136.000 40.536 136.000 56.000 L 136.000 154.770 C 135.997 157.575 136.977 160.292 138.770 162.450 C 148.674 174.381 150.791 190.961 144.203 204.997 C 137.614 219.034 123.506 227.997 108.000 228.000 ZM 246.140 81.520 L 231.420 86.310 L 240.520 98.830 C 244.416 104.193 243.228 111.699 237.865 115.595 C 232.502 119.491 224.996 118.303 221.100 112.940 L 212.000 100.420 L 202.900 112.940 C 199.004 118.303 191.498 119.491 186.135 115.595 C 180.772 111.699 179.584 104.193 183.480 98.830 L 192.580 86.310 L 177.860 81.520 C 173.685 80.275 170.512 76.866 169.571 72.612 C 168.630 68.358 170.069 63.929 173.329 61.039 C 176.590 58.150 181.160 57.254 185.270 58.700 L 200.000 63.480 L 200.000 48.000 C 200.000 41.373 205.373 36.000 212.000 36.000 C 218.627 36.000 224.000 41.373 224.000 48.000 L 224.000 63.480 L 238.730 58.700 C 242.840 57.254 247.410 58.150 250.671 61.039 C 253.931 63.929 255.370 68.358 254.429 72.612 C 253.488 76.866 250.315 80.275 246.140 81.520 ZM 132.000 188.000 C 132.002 199.648 123.641 209.615 112.171 211.639 C 100.700 213.664 89.432 207.159 85.448 196.215 C 81.463 185.270 85.913 173.044 96.000 167.220 L 96.000 132.000 C 96.000 125.373 101.373 120.000 108.000 120.000 C 114.627 120.000 120.000 125.373 120.000 132.000 L 120.000 167.220 C 127.424 171.506 131.998 179.427 132.000 188.000 Z"),
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
        return _thermometerCold!!
    }

private var _thermometerCold: ImageVector? = null
