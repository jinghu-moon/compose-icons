package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ChatCircleText: ImageVector
    get() {
        if (_chatCircleText != null) return _chatCircleText!!
        _chatCircleText = phosphorRegularIcon(
            name = "ChatCircleText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 168.000 112.000 C 168.000 116.418 164.418 120.000 160.000 120.000 L 96.000 120.000 C 91.582 120.000 88.000 116.418 88.000 112.000 C 88.000 107.582 91.582 104.000 96.000 104.000 L 160.000 104.000 C 164.418 104.000 168.000 107.582 168.000 112.000 ZM 160.000 136.000 L 96.000 136.000 C 91.582 136.000 88.000 139.582 88.000 144.000 C 88.000 148.418 91.582 152.000 96.000 152.000 L 160.000 152.000 C 164.418 152.000 168.000 148.418 168.000 144.000 C 168.000 139.582 164.418 136.000 160.000 136.000 ZM 232.000 128.000 C 232.008 164.523 212.857 198.373 181.547 217.178 C 150.237 235.983 111.358 236.986 79.120 219.820 L 45.070 231.170 C 39.320 233.088 32.980 231.591 28.695 227.305 C 24.409 223.020 22.912 216.680 24.830 210.930 L 36.180 176.880 C 15.859 138.673 21.320 91.875 49.893 59.375 C 78.466 26.874 124.179 15.463 164.674 30.723 C 205.169 45.984 231.982 84.725 232.000 128.000 ZM 216.000 128.000 C 215.990 91.003 192.840 57.964 158.069 45.322 C 123.299 32.680 84.335 43.136 60.565 71.487 C 36.796 99.838 33.297 140.028 51.810 172.060 C 52.957 174.045 53.197 176.426 52.470 178.600 L 40.000 216.000 L 77.400 203.530 C 78.215 203.252 79.069 203.110 79.930 203.110 C 81.335 203.112 82.715 203.485 83.930 204.190 C 111.158 219.944 144.725 219.965 171.974 204.246 C 199.222 188.526 216.007 159.457 216.000 128.000 Z"),
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
        return _chatCircleText!!
    }

private var _chatCircleText: ImageVector? = null
