package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ChatCircleDots: ImageVector
    get() {
        if (_chatCircleDots != null) return _chatCircleDots!!
        _chatCircleDots = phosphorRegularIcon(
            name = "ChatCircleDots",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 140.000 128.000 C 140.000 134.627 134.627 140.000 128.000 140.000 C 121.373 140.000 116.000 134.627 116.000 128.000 C 116.000 121.373 121.373 116.000 128.000 116.000 C 134.627 116.000 140.000 121.373 140.000 128.000 ZM 84.000 116.000 C 77.373 116.000 72.000 121.373 72.000 128.000 C 72.000 134.627 77.373 140.000 84.000 140.000 C 90.627 140.000 96.000 134.627 96.000 128.000 C 96.000 121.373 90.627 116.000 84.000 116.000 ZM 172.000 116.000 C 165.373 116.000 160.000 121.373 160.000 128.000 C 160.000 134.627 165.373 140.000 172.000 140.000 C 178.627 140.000 184.000 134.627 184.000 128.000 C 184.000 121.373 178.627 116.000 172.000 116.000 ZM 232.000 128.000 C 232.008 164.523 212.857 198.373 181.547 217.178 C 150.237 235.983 111.358 236.986 79.120 219.820 L 45.070 231.170 C 39.320 233.088 32.980 231.591 28.695 227.305 C 24.409 223.020 22.912 216.680 24.830 210.930 L 36.180 176.880 C 15.859 138.673 21.320 91.875 49.893 59.375 C 78.466 26.874 124.179 15.463 164.674 30.723 C 205.169 45.984 231.982 84.725 232.000 128.000 ZM 216.000 128.000 C 215.990 91.003 192.840 57.964 158.069 45.322 C 123.299 32.680 84.335 43.136 60.565 71.487 C 36.796 99.838 33.297 140.028 51.810 172.060 C 52.957 174.045 53.197 176.426 52.470 178.600 L 40.000 216.000 L 77.400 203.530 C 78.215 203.252 79.069 203.110 79.930 203.110 C 81.335 203.112 82.715 203.485 83.930 204.190 C 111.158 219.944 144.725 219.965 171.974 204.246 C 199.222 188.526 216.007 159.457 216.000 128.000 Z"),
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
