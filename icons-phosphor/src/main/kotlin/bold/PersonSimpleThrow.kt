package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PersonSimpleThrow: ImageVector
    get() {
        if (_personSimpleThrow != null) return _personSimpleThrow!!
        _personSimpleThrow = phosphorBoldIcon(
            name = "PersonSimpleThrow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 92.000 C 147.882 92.000 164.000 75.882 164.000 56.000 C 164.000 36.118 147.882 20.000 128.000 20.000 C 108.118 20.000 92.000 36.118 92.000 56.000 C 92.000 75.882 108.118 92.000 128.000 92.000 ZM 128.000 44.000 C 134.627 44.000 140.000 49.373 140.000 56.000 C 140.000 62.627 134.627 68.000 128.000 68.000 C 121.373 68.000 116.000 62.627 116.000 56.000 C 116.000 49.373 121.373 44.000 128.000 44.000 ZM 44.000 96.000 C 44.000 84.954 52.954 76.000 64.000 76.000 C 75.046 76.000 84.000 84.954 84.000 96.000 C 84.000 107.046 75.046 116.000 64.000 116.000 C 52.954 116.000 44.000 107.046 44.000 96.000 ZM 228.000 113.600 C 228.016 118.223 225.374 122.444 221.209 124.451 C 217.044 126.458 212.096 125.893 208.490 123.000 C 208.490 123.000 187.490 107.520 155.150 123.280 C 154.810 128.030 154.150 134.220 153.020 141.280 L 183.680 166.830 C 187.469 169.991 188.936 175.148 187.380 179.830 L 171.380 227.830 C 170.107 232.000 166.671 235.151 162.407 236.061 C 158.143 236.971 153.721 235.496 150.856 232.209 C 147.992 228.922 147.136 224.340 148.620 220.240 L 162.000 180.000 L 146.560 167.140 C 144.922 171.987 143.012 176.738 140.840 181.370 C 126.200 212.370 101.500 233.300 67.420 243.520 C 66.310 243.847 65.157 244.008 64.000 244.000 C 58.037 244.011 52.971 239.642 52.105 233.743 C 51.239 227.844 54.836 222.203 60.550 220.500 C 98.390 209.150 121.320 181.790 128.960 139.060 C 104.960 152.600 85.850 156.060 72.500 156.060 C 65.175 156.014 57.908 154.747 51.000 152.310 C 45.166 149.496 42.618 142.560 45.242 136.639 C 47.867 130.718 54.717 127.947 60.720 130.380 C 61.150 130.550 86.140 139.910 129.220 110.620 C 183.930 73.440 223.480 104.240 223.480 104.240 C 226.330 106.512 227.993 109.955 228.000 113.600 Z"),
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
        return _personSimpleThrow!!
    }

private var _personSimpleThrow: ImageVector? = null
