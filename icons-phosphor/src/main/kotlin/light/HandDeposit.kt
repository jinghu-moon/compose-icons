package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HandDeposit: ImageVector
    get() {
        if (_handDeposit != null) return _handDeposit!!
        _handDeposit = phosphorLightIcon(
            name = "HandDeposit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 126.000 30.490 L 126.000 128.000 C 126.000 131.314 123.314 134.000 120.000 134.000 C 116.686 134.000 114.000 131.314 114.000 128.000 L 114.000 30.490 L 92.240 52.240 C 89.876 54.443 86.192 54.378 83.907 52.093 C 81.622 49.808 81.557 46.124 83.760 43.760 L 115.760 11.760 C 118.103 9.420 121.897 9.420 124.240 11.760 L 156.240 43.760 C 157.845 45.256 158.506 47.508 157.963 49.634 C 157.420 51.760 155.760 53.420 153.634 53.963 C 151.508 54.506 149.256 53.845 147.760 52.240 ZM 190.000 124.690 L 190.000 96.000 C 190.000 88.268 183.732 82.000 176.000 82.000 L 160.000 82.000 C 156.686 82.000 154.000 84.686 154.000 88.000 C 154.000 91.314 156.686 94.000 160.000 94.000 L 176.000 94.000 C 177.105 94.000 178.000 94.895 178.000 96.000 L 178.000 182.140 C 170.427 170.212 154.714 166.516 142.617 173.816 C 130.520 181.116 126.467 196.740 133.490 209.000 C 133.490 209.100 133.600 209.190 133.660 209.290 L 155.920 243.290 C 157.832 245.795 161.355 246.394 163.988 244.662 C 166.620 242.930 167.464 239.457 165.920 236.710 L 143.800 202.870 C 139.970 196.151 142.311 187.600 149.030 183.770 C 155.749 179.940 164.300 182.281 168.130 189.000 C 168.181 189.100 168.237 189.197 168.300 189.290 L 179.000 205.590 C 180.459 207.790 183.185 208.778 185.715 208.023 C 188.244 207.269 189.984 204.950 190.000 202.310 L 190.000 139.570 C 207.665 154.112 217.929 175.770 218.000 198.650 L 218.000 240.000 C 218.000 243.314 220.686 246.000 224.000 246.000 C 227.314 246.000 230.000 243.314 230.000 240.000 L 230.000 198.650 C 229.909 168.850 214.889 141.079 190.000 124.690 ZM 80.000 82.000 L 64.000 82.000 C 56.268 82.000 50.000 88.268 50.000 96.000 L 50.000 200.000 C 50.000 203.314 52.686 206.000 56.000 206.000 C 59.314 206.000 62.000 203.314 62.000 200.000 L 62.000 96.000 C 62.000 94.895 62.895 94.000 64.000 94.000 L 80.000 94.000 C 83.314 94.000 86.000 91.314 86.000 88.000 C 86.000 84.686 83.314 82.000 80.000 82.000 Z"),
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
        return _handDeposit!!
    }

private var _handDeposit: ImageVector? = null
