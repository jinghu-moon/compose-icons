package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TestTube: ImageVector
    get() {
        if (_testTube != null) return _testTube!!
        _testTube = phosphorThinIcon(
            name = "TestTube",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 234.830 89.180 L 174.830 29.180 C 174.080 28.429 173.062 28.007 172.000 28.007 C 170.938 28.007 169.920 28.429 169.170 29.180 L 39.940 158.410 C 24.424 174.401 24.615 199.885 40.369 215.641 C 56.123 231.398 81.606 231.593 97.600 216.080 L 210.160 103.500 L 233.260 95.800 C 234.575 95.363 235.570 94.276 235.890 92.927 C 236.209 91.579 235.809 90.161 234.830 89.180 ZM 91.940 210.420 C 79.141 223.216 58.391 223.214 45.595 210.415 C 32.799 197.616 32.801 176.866 45.600 164.070 L 75.000 134.630 C 84.200 131.250 98.940 129.550 118.110 139.560 C 130.200 145.870 140.850 148.040 149.770 148.040 C 151.410 148.040 152.970 147.950 154.500 147.820 ZM 206.740 96.210 C 206.146 96.417 205.609 96.760 205.170 97.210 L 165.000 137.390 C 155.800 140.770 141.060 142.470 121.890 132.460 C 107.590 124.990 95.310 123.330 85.510 124.190 L 172.000 37.660 L 224.600 90.260 Z"),
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
        return _testTube!!
    }

private var _testTube: ImageVector? = null
