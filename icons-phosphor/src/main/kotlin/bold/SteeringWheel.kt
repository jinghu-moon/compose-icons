package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SteeringWheel: ImageVector
    get() {
        if (_steeringWheel != null) return _steeringWheel!!
        _steeringWheel = phosphorBoldIcon(
            name = "SteeringWheel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 144.000 144.000 C 144.000 152.837 136.837 160.000 128.000 160.000 C 119.163 160.000 112.000 152.837 112.000 144.000 C 112.000 135.163 119.163 128.000 128.000 128.000 C 136.837 128.000 144.000 135.163 144.000 144.000 ZM 236.000 128.000 C 236.000 187.647 187.647 236.000 128.000 236.000 C 68.353 236.000 20.000 187.647 20.000 128.000 C 20.000 68.353 68.353 20.000 128.000 20.000 C 187.619 20.066 235.934 68.381 236.000 128.000 ZM 165.550 156.000 L 207.180 156.000 C 207.970 153.790 208.670 151.530 209.270 149.240 C 164.147 104.936 91.853 104.936 46.730 149.240 Q 47.630 152.680 48.820 156.000 L 90.450 156.000 C 98.788 156.022 106.243 161.197 109.180 169.000 L 125.240 211.930 C 126.160 211.930 127.070 212.000 128.000 212.000 C 128.930 212.000 129.820 212.000 130.720 211.930 L 146.820 168.930 C 149.785 161.158 157.232 156.017 165.550 156.000 ZM 44.410 119.730 C 94.004 82.756 161.996 82.756 211.590 119.730 C 207.329 76.759 171.182 44.019 128.000 44.019 C 84.818 44.019 48.671 76.759 44.410 119.730 ZM 97.490 206.240 L 87.680 180.000 L 62.100 180.000 C 71.368 191.724 83.580 200.778 97.490 206.240 ZM 193.900 180.000 L 168.320 180.000 L 158.480 206.250 C 172.405 200.795 184.629 191.735 193.900 180.000 Z"),
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
        return _steeringWheel!!
    }

private var _steeringWheel: ImageVector? = null
