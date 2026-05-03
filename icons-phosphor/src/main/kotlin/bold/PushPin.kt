package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PushPin: ImageVector
    get() {
        if (_pushPin != null) return _pushPin!!
        _pushPin = phosphorBoldIcon(
            name = "PushPin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 238.150 78.540 L 177.460 17.860 C 173.709 14.104 168.618 11.994 163.310 11.994 C 158.002 11.994 152.911 14.104 149.160 17.860 L 97.200 70.000 C 84.770 66.670 60.520 64.280 35.460 84.500 C 31.034 88.061 28.331 93.336 28.026 99.008 C 27.721 104.680 29.842 110.215 33.860 114.230 L 79.320 159.700 L 39.520 199.500 C 34.826 204.194 34.826 211.806 39.520 216.500 C 44.214 221.194 51.826 221.194 56.520 216.500 L 96.320 176.690 L 141.790 222.150 C 145.537 225.892 150.614 227.996 155.910 228.000 C 156.370 228.000 156.840 228.000 157.310 227.950 C 163.085 227.533 168.396 224.633 171.870 220.000 C 176.560 213.770 182.870 203.870 186.310 192.000 C 189.750 180.130 189.760 169.120 186.470 158.600 L 238.170 106.730 C 245.912 98.925 245.903 86.334 238.150 78.540 ZM 163.890 147.330 C 160.249 150.984 159.351 156.557 161.660 161.170 C 165.090 168.030 168.560 182.170 155.380 201.820 L 54.080 100.530 C 75.170 85.940 93.610 93.890 95.080 94.530 C 99.681 96.919 105.306 95.986 108.890 92.240 L 163.320 37.630 L 218.320 92.630 Z"),
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
        return _pushPin!!
    }

private var _pushPin: ImageVector? = null
