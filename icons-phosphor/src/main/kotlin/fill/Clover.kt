package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Clover: ImageVector
    get() {
        if (_clover != null) return _clover!!
        _clover = phosphorFillIcon(
            name = "Clover",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 228.000 120.000 C 228.000 142.630 222.000 156.720 210.070 161.870 C 206.590 163.333 202.844 164.058 199.070 164.000 C 196.246 163.975 193.431 163.663 190.670 163.070 C 189.651 162.867 188.748 162.280 188.150 161.430 C 174.102 141.474 158.107 122.963 140.400 106.170 C 137.191 103.132 132.128 103.271 129.090 106.480 C 126.052 109.689 126.191 114.752 129.400 117.790 C 144.240 131.700 193.530 181.280 207.720 238.060 C 208.791 242.346 206.185 246.688 201.900 247.760 C 201.278 247.915 200.641 247.995 200.000 248.000 C 196.333 247.995 193.139 245.497 192.250 241.940 C 188.130 225.470 180.600 209.460 171.790 194.850 C 171.508 197.333 170.868 199.761 169.890 202.060 C 164.720 214.000 150.630 220.000 128.000 220.000 C 105.370 220.000 91.280 214.000 86.120 202.060 C 80.670 189.480 85.730 171.240 101.120 147.850 C 101.800 146.850 102.480 145.850 103.120 144.850 L 100.120 146.850 C 82.840 158.270 68.350 164.000 56.890 164.000 C 53.116 164.058 49.370 163.333 45.890 161.870 C 34.000 156.720 28.000 142.630 28.000 120.000 C 28.000 97.370 34.000 83.280 45.930 78.120 C 58.520 72.670 76.760 77.730 100.150 93.120 L 103.150 95.120 Q 102.150 93.620 101.150 92.120 C 85.740 68.730 80.680 50.490 86.150 37.900 C 91.280 26.000 105.370 20.000 128.000 20.000 C 150.630 20.000 164.720 26.000 169.880 37.930 C 175.330 50.520 170.270 68.760 154.880 92.150 Q 153.880 93.680 152.880 95.150 L 155.880 93.150 C 179.270 77.740 197.510 72.680 210.100 78.150 C 222.000 83.280 228.000 97.370 228.000 120.000 Z"),
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
        return _clover!!
    }

private var _clover: ImageVector? = null
