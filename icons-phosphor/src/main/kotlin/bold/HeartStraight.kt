package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HeartStraight: ImageVector
    get() {
        if (_heartStraight != null) return _heartStraight!!
        _heartStraight = phosphorBoldIcon(
            name = "HeartStraight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 225.840 54.130 C 201.666 30.027 162.566 29.969 138.320 54.000 L 128.000 63.580 L 117.680 54.000 C 93.435 29.815 54.175 29.865 29.990 54.110 C 5.805 78.355 5.855 117.615 30.100 141.800 L 119.450 232.450 C 121.705 234.740 124.786 236.030 128.000 236.030 C 131.214 236.030 134.295 234.740 136.550 232.450 L 225.840 141.860 C 237.473 130.232 244.009 114.458 244.009 98.010 C 244.009 81.562 237.473 65.788 225.840 54.160 ZM 208.840 124.920 L 128.000 206.900 L 47.130 124.850 C 32.343 110.001 32.367 85.984 47.186 71.166 C 62.004 56.347 86.021 56.323 100.870 71.110 C 100.970 71.210 101.070 71.310 101.180 71.400 L 119.820 88.760 C 124.428 93.053 131.572 93.053 136.180 88.760 L 154.820 71.400 C 154.930 71.310 155.030 71.210 155.130 71.110 C 169.989 56.287 194.052 56.316 208.875 71.175 C 223.698 86.034 223.669 110.097 208.810 124.920 Z"),
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
        return _heartStraight!!
    }

private var _heartStraight: ImageVector? = null
