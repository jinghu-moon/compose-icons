package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PhonePlus: ImageVector
    get() {
        if (_phonePlus != null) return _phonePlus!!
        _phonePlus = phosphorBoldIcon(
            name = "PhonePlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 162.800 L 168.910 141.700 L 168.730 141.620 C 162.514 138.926 155.354 139.582 149.730 143.360 C 149.342 143.620 148.968 143.900 148.610 144.200 L 126.300 163.200 C 113.300 156.150 99.870 142.830 92.810 129.990 L 111.870 107.330 C 112.179 106.966 112.463 106.582 112.720 106.180 C 116.392 100.577 117.015 93.509 114.380 87.350 C 114.349 87.292 114.322 87.232 114.300 87.170 L 93.200 40.000 C 89.646 31.898 81.202 27.083 72.420 28.150 C 42.391 32.095 19.953 57.713 20.000 88.000 C 20.000 169.610 86.390 236.000 168.000 236.000 C 198.287 236.047 223.905 213.609 227.850 183.580 C 228.914 174.798 224.100 166.356 216.000 162.800 ZM 168.000 212.000 C 99.551 211.917 44.083 156.449 44.000 88.000 C 43.950 70.930 55.809 56.136 72.480 52.470 L 91.300 94.470 L 72.140 117.270 C 71.828 117.634 71.541 118.018 71.280 118.420 C 67.431 124.294 66.945 131.756 70.000 138.080 C 79.420 157.360 98.830 176.640 118.310 186.080 C 124.671 189.096 132.149 188.545 138.000 184.630 C 138.387 184.369 138.757 184.085 139.110 183.780 L 161.540 164.710 L 203.540 183.520 C 199.866 200.191 185.071 212.047 168.000 212.000 ZM 132.000 80.000 C 132.000 73.373 137.373 68.000 144.000 68.000 L 164.000 68.000 L 164.000 48.000 C 164.000 41.373 169.373 36.000 176.000 36.000 C 182.627 36.000 188.000 41.373 188.000 48.000 L 188.000 68.000 L 208.000 68.000 C 214.627 68.000 220.000 73.373 220.000 80.000 C 220.000 86.627 214.627 92.000 208.000 92.000 L 188.000 92.000 L 188.000 112.000 C 188.000 118.627 182.627 124.000 176.000 124.000 C 169.373 124.000 164.000 118.627 164.000 112.000 L 164.000 92.000 L 144.000 92.000 C 137.373 92.000 132.000 86.627 132.000 80.000 Z"),
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
        return _phonePlus!!
    }

private var _phonePlus: ImageVector? = null
