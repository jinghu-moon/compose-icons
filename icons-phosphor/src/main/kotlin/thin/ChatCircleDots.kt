package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChatCircleDots: ImageVector
    get() {
        if (_chatCircleDots != null) return _chatCircleDots!!
        _chatCircleDots = phosphorThinIcon(
            name = "ChatCircleDots",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 136.000 128.000 C 136.000 132.418 132.418 136.000 128.000 136.000 C 123.582 136.000 120.000 132.418 120.000 128.000 C 120.000 123.582 123.582 120.000 128.000 120.000 C 132.418 120.000 136.000 123.582 136.000 128.000 ZM 84.000 120.000 C 79.582 120.000 76.000 123.582 76.000 128.000 C 76.000 132.418 79.582 136.000 84.000 136.000 C 88.418 136.000 92.000 132.418 92.000 128.000 C 92.000 123.582 88.418 120.000 84.000 120.000 ZM 172.000 120.000 C 167.582 120.000 164.000 123.582 164.000 128.000 C 164.000 132.418 167.582 136.000 172.000 136.000 C 176.418 136.000 180.000 132.418 180.000 128.000 C 180.000 123.582 176.418 120.000 172.000 120.000 ZM 228.000 128.000 C 228.007 163.422 209.274 196.205 178.752 214.182 C 148.231 232.160 110.477 232.650 79.500 215.470 L 43.810 227.370 C 39.498 228.808 34.743 227.686 31.528 224.472 C 28.314 221.257 27.192 216.502 28.630 212.190 L 40.530 176.500 C 20.261 139.920 24.896 94.589 52.149 62.868 C 79.401 31.146 123.515 19.734 162.732 34.259 C 201.949 48.784 227.986 86.179 228.000 128.000 ZM 220.000 128.000 C 219.988 89.321 195.785 54.780 159.433 41.564 C 123.082 28.349 82.346 39.282 57.497 68.923 C 32.648 98.565 28.993 140.583 48.350 174.070 C 48.923 175.062 49.044 176.253 48.680 177.340 L 36.220 214.720 C 35.741 216.157 36.115 217.742 37.186 218.814 C 38.258 219.885 39.843 220.259 41.280 219.780 L 78.660 207.320 C 79.069 207.181 79.498 207.110 79.930 207.110 C 80.632 207.114 81.321 207.300 81.930 207.650 C 110.395 224.118 145.486 224.139 173.972 207.707 C 202.458 191.274 220.006 160.886 220.000 128.000 Z"),
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
        return _chatCircleDots!!
    }

private var _chatCircleDots: ImageVector? = null
