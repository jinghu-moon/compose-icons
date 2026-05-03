package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MetaLogo: ImageVector
    get() {
        if (_metaLogo != null) return _metaLogo!!
        _metaLogo = phosphorFillIcon(
            name = "MetaLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 200.000 C 24.000 208.837 31.163 216.000 40.000 216.000 L 216.000 216.000 C 224.837 216.000 232.000 208.837 232.000 200.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 ZM 201.230 170.260 C 195.600 179.260 186.900 184.000 176.070 184.000 C 155.340 184.000 141.260 158.690 126.350 131.890 C 115.470 112.330 101.930 88.000 90.610 88.000 C 78.180 88.000 64.000 116.880 64.000 142.210 C 64.000 150.470 65.500 157.210 68.340 161.770 C 71.000 166.000 74.680 168.000 79.930 168.000 C 86.010 168.000 93.450 161.000 102.670 146.490 C 105.102 142.914 109.935 141.917 113.583 144.240 C 117.230 146.563 118.372 151.364 116.160 155.080 C 99.840 180.710 88.220 184.000 79.930 184.000 C 69.100 184.000 60.400 179.250 54.770 170.260 C 50.340 163.180 48.000 153.480 48.000 142.260 C 48.176 126.552 51.939 111.092 59.000 97.060 C 67.340 80.900 78.570 72.000 90.610 72.000 C 111.340 72.000 125.420 97.310 140.330 124.110 C 151.210 143.660 164.750 168.000 176.070 168.000 C 181.320 168.000 185.000 166.000 187.660 161.770 C 190.500 157.240 192.000 150.470 192.000 142.210 C 192.000 116.880 177.820 88.000 165.390 88.000 C 161.990 88.000 158.040 90.310 153.650 94.880 C 150.588 98.067 145.522 98.167 142.335 95.105 C 139.148 92.043 139.048 86.977 142.110 83.790 C 149.740 75.860 157.350 72.000 165.390 72.000 C 177.390 72.000 188.660 80.900 197.010 97.060 C 204.064 111.077 207.826 126.519 208.010 142.210 C 208.000 153.480 205.660 163.180 201.230 170.260 Z"),
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
        return _metaLogo!!
    }

private var _metaLogo: ImageVector? = null
