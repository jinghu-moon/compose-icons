package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Sock: ImageVector
    get() {
        if (_sock != null) return _sock!!
        _sock = phosphorLightIcon(
            name = "Sock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 192.000 18.000 L 104.000 18.000 C 96.268 18.000 90.000 24.268 90.000 32.000 L 90.000 109.510 L 50.670 148.850 C 36.090 163.185 30.320 184.240 35.556 204.005 C 40.793 223.770 56.230 239.207 75.995 244.443 C 95.760 249.680 116.815 243.910 131.150 229.330 L 199.560 160.930 C 203.697 156.810 206.015 151.208 206.000 145.370 L 206.000 32.000 C 206.000 24.268 199.732 18.000 192.000 18.000 ZM 104.000 30.000 L 192.000 30.000 C 193.105 30.000 194.000 30.895 194.000 32.000 L 194.000 50.000 L 102.000 50.000 L 102.000 32.000 C 102.000 30.895 102.895 30.000 104.000 30.000 ZM 122.670 220.850 C 105.058 237.966 76.966 237.765 59.600 220.400 C 42.235 203.034 42.034 174.942 59.150 157.330 L 100.240 116.240 C 101.366 115.116 101.999 113.591 102.000 112.000 L 102.000 62.000 L 194.000 62.000 L 194.000 106.340 C 166.686 109.426 146.035 132.513 146.000 160.000 C 145.972 170.281 148.913 180.350 154.470 189.000 ZM 191.070 152.440 L 163.220 180.300 C 159.773 174.091 157.976 167.102 158.000 160.000 C 158.026 139.133 173.350 121.442 194.000 118.440 L 194.000 145.370 C 194.007 148.023 192.952 150.569 191.070 152.440 Z"),
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
        return _sock!!
    }

private var _sock: ImageVector? = null
