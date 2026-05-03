package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Phone: ImageVector
    get() {
        if (_phone != null) return _phone!!
        _phone = phosphorBoldIcon(
            name = "Phone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 154.800 L 176.910 133.690 L 176.730 133.610 C 170.510 130.929 163.355 131.588 157.730 135.360 C 157.342 135.620 156.968 135.900 156.610 136.200 L 134.300 155.200 C 121.300 148.150 107.870 134.830 100.810 121.990 L 119.870 99.330 C 120.176 98.964 120.460 98.580 120.720 98.180 C 124.392 92.577 125.015 85.509 122.380 79.350 C 122.349 79.292 122.322 79.232 122.300 79.170 L 101.200 32.000 C 97.644 23.900 89.202 19.086 80.420 20.150 C 50.391 24.095 27.953 49.713 28.000 80.000 C 28.000 161.610 94.390 228.000 176.000 228.000 C 206.287 228.047 231.905 205.609 235.850 175.580 C 236.914 166.798 232.100 158.356 224.000 154.800 ZM 176.000 204.000 C 107.551 203.917 52.083 148.449 52.000 80.000 C 51.953 62.929 63.809 48.134 80.480 44.460 L 99.300 86.460 L 80.140 109.280 C 79.830 109.649 79.543 110.036 79.280 110.440 C 75.439 116.309 74.953 123.762 78.000 130.080 C 87.420 149.360 106.830 168.640 126.310 178.080 C 132.671 181.096 140.149 180.545 146.000 176.630 C 146.387 176.369 146.757 176.085 147.110 175.780 L 169.540 156.710 L 211.540 175.520 C 207.866 192.191 193.071 204.047 176.000 204.000 Z"),
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
        return _phone!!
    }

private var _phone: ImageVector? = null
