package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PersonSimpleSnowboard: ImageVector
    get() {
        if (_personSimpleSnowboard != null) return _personSimpleSnowboard!!
        _personSimpleSnowboard = phosphorThinIcon(
            name = "PersonSimpleSnowboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 164.000 76.000 C 177.255 76.000 188.000 65.255 188.000 52.000 C 188.000 38.745 177.255 28.000 164.000 28.000 C 150.745 28.000 140.000 38.745 140.000 52.000 C 140.000 65.255 150.745 76.000 164.000 76.000 ZM 164.000 36.000 C 172.837 36.000 180.000 43.163 180.000 52.000 C 180.000 60.837 172.837 68.000 164.000 68.000 C 155.163 68.000 148.000 60.837 148.000 52.000 C 148.000 43.163 155.163 36.000 164.000 36.000 ZM 217.130 116.160 L 81.130 76.160 C 79.009 75.536 76.784 76.749 76.160 78.870 C 75.536 80.991 76.749 83.216 78.870 83.840 L 124.930 97.380 L 86.770 154.630 L 39.230 140.850 C 28.002 137.564 16.236 144.002 12.950 155.230 C 9.664 166.458 16.102 178.224 27.330 181.510 L 27.330 181.510 L 184.770 227.140 C 186.719 227.709 188.739 227.999 190.770 228.000 C 195.376 227.994 199.856 226.488 203.530 223.710 C 208.869 219.736 212.007 213.466 211.990 206.810 C 211.939 197.389 205.704 189.121 196.660 186.480 L 140.510 170.210 L 163.310 136.210 C 164.024 135.149 164.187 133.811 163.750 132.610 C 163.311 131.411 162.327 130.493 161.100 130.140 L 120.540 118.400 L 133.000 99.750 L 214.900 123.840 C 215.258 123.944 215.628 123.997 216.000 124.000 C 217.993 124.005 219.685 122.543 219.969 120.571 C 220.253 118.599 219.043 116.718 217.130 116.160 ZM 204.000 206.810 C 204.018 210.948 202.064 214.847 198.740 217.310 C 195.389 219.848 191.033 220.646 187.000 219.460 L 29.550 173.820 C 23.923 172.180 20.040 167.041 20.000 161.180 C 19.982 157.042 21.936 153.143 25.260 150.680 C 28.611 148.142 32.969 147.348 37.000 148.540 L 194.440 194.170 C 200.073 195.803 203.962 200.945 204.000 206.810 ZM 153.630 136.320 L 132.460 167.870 L 94.830 157.000 L 115.830 125.410 Z"),
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
        return _personSimpleSnowboard!!
    }

private var _personSimpleSnowboard: ImageVector? = null
