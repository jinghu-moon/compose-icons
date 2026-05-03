package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Bird: ImageVector
    get() {
        if (_bird != null) return _bird!!
        _bird = phosphorBoldIcon(
            name = "Bird",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 176.000 72.000 C 176.000 80.837 168.837 88.000 160.000 88.000 C 151.163 88.000 144.000 80.837 144.000 72.000 C 144.000 63.163 151.163 56.000 160.000 56.000 C 168.837 56.000 176.000 63.163 176.000 72.000 ZM 244.000 80.000 C 244.006 84.017 242.002 87.771 238.660 90.000 L 220.000 102.420 L 220.000 120.000 C 219.934 179.619 171.619 227.934 112.000 228.000 L 24.000 228.000 C 16.315 227.991 9.314 223.580 5.990 216.650 C 2.666 209.721 3.607 201.499 8.410 195.500 L 8.560 195.320 L 92.000 95.180 L 92.000 76.890 C 92.000 41.280 120.570 12.170 155.690 12.000 L 156.000 12.000 C 183.379 11.972 207.738 29.378 216.580 55.290 L 238.660 70.000 C 242.002 72.229 244.006 75.983 244.000 80.000 ZM 210.370 80.000 L 199.680 72.870 C 197.206 71.235 195.424 68.741 194.680 65.870 C 190.075 48.279 174.184 36.007 156.000 36.000 L 155.810 36.000 C 133.860 36.110 116.010 54.450 116.010 76.890 L 116.010 99.520 C 116.009 102.331 115.022 105.053 113.220 107.210 L 32.570 204.000 L 53.050 204.000 L 122.790 120.320 C 125.493 116.895 129.843 115.208 134.148 115.913 C 138.454 116.618 142.038 119.605 143.508 123.713 C 144.977 127.821 144.101 132.404 141.220 135.680 L 84.290 204.000 L 112.000 204.000 C 158.371 203.950 195.950 166.371 196.000 120.000 L 196.000 96.000 C 195.996 91.981 198.005 88.227 201.350 86.000 Z"),
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
        return _bird!!
    }

private var _bird: ImageVector? = null
