package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PersonSimpleSwim: ImageVector
    get() {
        if (_personSimpleSwim != null) return _personSimpleSwim!!
        _personSimpleSwim = phosphorThinIcon(
            name = "PersonSimpleSwim",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 176.000 100.000 C 191.464 100.000 204.000 87.464 204.000 72.000 C 204.000 56.536 191.464 44.000 176.000 44.000 C 160.536 44.000 148.000 56.536 148.000 72.000 C 148.000 87.464 160.536 100.000 176.000 100.000 ZM 176.000 52.000 C 187.046 52.000 196.000 60.954 196.000 72.000 C 196.000 83.046 187.046 92.000 176.000 92.000 C 164.954 92.000 156.000 83.046 156.000 72.000 C 156.000 60.954 164.954 52.000 176.000 52.000 ZM 219.080 187.840 C 220.488 189.541 220.250 192.061 218.550 193.470 C 203.560 205.900 188.900 212.000 173.930 212.000 C 171.885 212.001 169.842 211.887 167.810 211.660 C 152.810 210.010 139.210 202.660 126.090 195.520 C 100.570 181.660 76.470 168.520 42.550 196.700 C 40.844 198.038 38.383 197.774 37.000 196.104 C 35.617 194.434 35.817 191.966 37.450 190.540 C 54.450 176.420 71.070 170.470 88.190 172.350 C 103.190 174.000 116.790 181.350 129.910 188.490 C 155.430 202.350 179.530 215.430 213.450 187.310 C 215.151 185.902 217.671 186.140 219.080 187.840 ZM 40.000 84.000 L 64.240 84.000 C 81.330 83.965 98.087 88.721 112.610 97.730 L 78.190 132.160 C 64.560 133.160 51.190 139.160 37.450 150.540 C 35.817 151.966 35.617 154.434 37.000 156.104 C 38.383 157.774 40.844 158.038 42.550 156.700 C 76.470 128.570 100.550 141.700 126.090 155.520 C 139.210 162.640 152.780 170.010 167.810 171.660 C 169.842 171.887 171.885 172.001 173.930 172.000 C 188.930 172.000 203.560 165.900 218.550 153.470 C 219.694 152.572 220.261 151.125 220.031 149.689 C 219.800 148.253 218.809 147.055 217.441 146.561 C 216.073 146.067 214.545 146.353 213.450 147.310 C 205.330 154.040 197.770 158.410 190.620 160.970 L 135.000 105.290 C 116.276 86.462 90.793 75.914 64.240 76.000 L 40.000 76.000 C 37.791 76.000 36.000 77.791 36.000 80.000 C 36.000 82.209 37.791 84.000 40.000 84.000 ZM 181.660 163.320 C 162.890 166.390 146.660 157.610 129.910 148.490 C 117.080 141.490 103.820 134.340 89.180 132.490 L 119.340 102.330 C 122.854 104.970 126.179 107.854 129.290 110.960 Z"),
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
        return _personSimpleSwim!!
    }

private var _personSimpleSwim: ImageVector? = null
