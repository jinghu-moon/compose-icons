package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HandWithdraw: ImageVector
    get() {
        if (_handWithdraw != null) return _handWithdraw!!
        _handWithdraw = phosphorLightIcon(
            name = "HandWithdraw",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 230.000 198.650 L 230.000 240.000 C 230.000 243.314 227.314 246.000 224.000 246.000 C 220.686 246.000 218.000 243.314 218.000 240.000 L 218.000 198.650 C 217.929 175.770 207.665 154.112 190.000 139.570 L 190.000 202.310 C 189.984 204.950 188.244 207.269 185.715 208.023 C 183.185 208.778 180.459 207.790 179.000 205.590 L 168.320 189.290 C 168.257 189.197 168.201 189.100 168.150 189.000 C 164.320 182.281 155.769 179.940 149.050 183.770 C 142.331 187.600 139.990 196.151 143.820 202.870 L 166.000 236.710 C 167.544 239.457 166.700 242.930 164.068 244.662 C 161.435 246.394 157.912 245.795 156.000 243.290 L 133.740 209.290 C 133.680 209.190 133.620 209.100 133.570 209.000 C 127.108 196.815 131.285 181.704 143.089 174.569 C 154.892 167.433 170.213 170.756 178.000 182.140 L 178.000 64.000 C 178.000 62.895 177.105 62.000 176.000 62.000 L 160.000 62.000 C 156.686 62.000 154.000 59.314 154.000 56.000 C 154.000 52.686 156.686 50.000 160.000 50.000 L 176.000 50.000 C 183.732 50.000 190.000 56.268 190.000 64.000 L 190.000 124.690 C 214.889 141.079 229.909 168.850 230.000 198.650 ZM 86.000 56.000 C 86.000 52.686 83.314 50.000 80.000 50.000 L 64.000 50.000 C 56.268 50.000 50.000 56.268 50.000 64.000 L 50.000 200.000 C 50.000 203.314 52.686 206.000 56.000 206.000 C 59.314 206.000 62.000 203.314 62.000 200.000 L 62.000 64.000 C 62.000 62.895 62.895 62.000 64.000 62.000 L 80.000 62.000 C 83.314 62.000 86.000 59.314 86.000 56.000 ZM 156.240 99.760 C 153.897 97.420 150.103 97.420 147.760 99.760 L 126.000 121.510 L 126.000 16.000 C 126.000 12.686 123.314 10.000 120.000 10.000 C 116.686 10.000 114.000 12.686 114.000 16.000 L 114.000 121.510 L 92.240 99.760 C 89.876 97.557 86.192 97.622 83.907 99.907 C 81.622 102.192 81.557 105.876 83.760 108.240 L 115.760 140.240 C 118.103 142.580 121.897 142.580 124.240 140.240 L 156.240 108.240 C 158.580 105.897 158.580 102.103 156.240 99.760 Z"),
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
        return _handWithdraw!!
    }

private var _handWithdraw: ImageVector? = null
