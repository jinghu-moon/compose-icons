package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PersonArmsSpread: ImageVector
    get() {
        if (_personArmsSpread != null) return _personArmsSpread!!
        _personArmsSpread = phosphorLightIcon(
            name = "PersonArmsSpread",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 70.000 C 144.569 70.000 158.000 56.569 158.000 40.000 C 158.000 23.431 144.569 10.000 128.000 10.000 C 111.431 10.000 98.000 23.431 98.000 40.000 C 98.000 56.569 111.431 70.000 128.000 70.000 ZM 128.000 22.000 C 137.941 22.000 146.000 30.059 146.000 40.000 C 146.000 49.941 137.941 58.000 128.000 58.000 C 118.059 58.000 110.000 49.941 110.000 40.000 C 110.000 30.059 118.059 22.000 128.000 22.000 ZM 229.550 88.140 C 227.859 79.821 220.488 73.883 212.000 74.000 L 44.000 74.000 C 35.548 74.000 28.235 79.880 26.420 88.135 C 24.605 96.389 28.778 104.795 36.450 108.340 L 36.550 108.340 L 88.870 131.340 L 67.430 212.840 C 65.014 218.413 65.571 224.828 68.912 229.900 C 72.253 234.973 77.926 238.019 84.000 238.000 C 90.888 237.982 97.167 234.050 100.190 227.860 L 128.000 180.000 L 155.810 227.910 C 160.140 236.589 170.568 240.277 179.392 236.250 C 188.215 232.222 192.261 221.927 188.540 212.970 L 167.100 131.470 L 219.420 108.470 L 219.520 108.470 C 227.346 105.017 231.571 96.451 229.550 88.140 ZM 214.550 97.430 L 157.600 122.510 C 154.906 123.696 153.470 126.661 154.210 129.510 L 177.080 216.440 C 177.180 216.782 177.304 217.116 177.450 217.440 C 178.850 220.444 177.549 224.015 174.545 225.415 C 171.541 226.815 167.970 225.514 166.570 222.510 C 166.500 222.345 166.420 222.185 166.330 222.030 L 133.190 165.000 C 132.117 163.150 130.139 162.011 128.000 162.011 C 125.861 162.011 123.883 163.150 122.810 165.000 L 89.690 222.050 C 89.600 222.210 89.520 222.360 89.440 222.530 C 88.767 223.979 87.545 225.099 86.043 225.644 C 84.541 226.188 82.885 226.111 81.440 225.430 C 79.991 224.757 78.871 223.535 78.326 222.033 C 77.782 220.531 77.859 218.875 78.540 217.430 C 78.686 217.106 78.810 216.772 78.910 216.430 L 101.780 129.500 C 102.520 126.651 101.084 123.686 98.390 122.500 L 41.470 97.430 C 38.931 96.236 37.558 93.443 38.164 90.703 C 38.771 87.964 41.194 86.010 44.000 86.000 L 212.000 86.000 C 214.811 85.996 217.248 87.945 217.862 90.689 C 218.477 93.432 217.104 96.234 214.560 97.430 Z"),
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
        return _personArmsSpread!!
    }

private var _personArmsSpread: ImageVector? = null
